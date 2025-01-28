select a.id 
from weather as a
join weather as b
where dateDiff(a.recordDate, b.recordDate) = 1
and a.temperature > b.temperature

