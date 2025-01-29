# Write your MySQL query statement below
select Employee.name, Bonus.bonus
from employee
left join bonus
on Employee.empid = Bonus.empid
where Bonus.bonus < 1000 OR Bonus IS NULL