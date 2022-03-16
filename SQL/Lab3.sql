use StudentManagement

--1. List the students in the IT department.
select * from student s where s.did = 'IT'
--2. List the faculties were established for more than 20 years.
select * from department d where year(GETDATE()) - d.year >= 20
--3. List the courses that belong to the “IT” department and have credits >= 5.
select * from courses c where c.did = 'IT' and c.credit >= 5
--4. List the previous courses of the course with the code “DBS”.
select c.precid from condition c where c.cid = 'DBS'
--5. List the student ID, name, Course Id, Course name, score of students in “IT” department
select s.sid, s.name, c.cid, c.cname, r.score from student s, courses c, results r
where s.sid = r.sid and c.cid = r.cid and s.did = 'IT'
-- 6. Display all student IDs in the student table; course id, student's course score.
--    If the student has no score, the course id and score columns are null (Hint: using … join).
select s.sid, c.cid, r.score 
from student s cross join
	 courses c left join
	 results r
	 on r.sid = s.sid and r.cid = c.cid
select * from courses
-- 7. List the courses that do not have previous courses.
select cid from courses c where c.cid not in (select distinct cid from condition) 
-- 8. Show the number of students in each Department.
select d.did, count(s.sid) from department d left join student s on d.did = s.did
group by d.did order by count(s.sid) desc
-- 9. Show the number of courses in each Department.
select d.did, count(c.cid) from department d left join courses c on d.did = c.did
group by d.did order by count(c.cid) desc
-- 10. List departments that have more than 10 students.
select d.did, count(s.sid) as 'counting' from department d left join student s on d.did = s.did
group by d.did having count(s.sid) >= 10
-- 11. List courses that have more than 10 student choose to learn.
select d.did, count(c.cid) from department d left join courses c on d.did = c.did
group by d.did having count(c.cid) >= 10
-- 12. List Students’ id, name, average.
select r.sid, s.name, avg(r.score) as 'avg' from results r, student s where s.sid = r.sid
group by r.sid, s.name
-- 13. Show the highest average.
select max(avg_score) from (select avg(score) as avg_score from results group by sid) as maxScore
select top 1 avg(score) from results group by sid order by avg(score) desc
-- 14. Show the lowest average of the students.
select min(avg_score) from (select avg(score) as avg_score from results group by sid) as minScore
select top 1 avg(score) from results group by sid order by avg(score) asc