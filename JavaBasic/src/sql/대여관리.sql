
-- #########  실제 SQL 문장을 확인하고 그 중에서 ? 로 지정하고 자바에서 실행하자


-- 비디오 대여
INSERT INTO videorent
( RENTNO, VIDEONO, CUSTTEL, RENTDATE )
VALUES( seq_videorent_rentno.nextval, 4, '02-222-2222', sysdate);

-- 비디오 반납
UPDATE videorent 
SET   returndate=sysdate
WHERE videono=4 AND returndate IS NULL;

-- 미납목록 검색
SELECT 
		vr.VIDEONO videono
		, m.MOVIETITLE movietitle
		, vr.CUSTTEL   custtel 
		, c.CUSTNAME   custname 
		, vr.RENTDATE+3  return_expected_date
		, '미납'			isreturned
FROM 	videorent vr INNER JOIN video v 
ON		vr.VIDEONO = v.VIDEONO 
		INNER JOIN movie m 
ON		v.MOVIENO = m.MOVIENO
		INNER JOIN customer c 
ON		vr.CUSTTEL = c.CUSTTEL
WHERE 	vr.RETURNDATE IS NULL;

