# Write your MySQL query statement below
select Customers.name as Customers 
from Customers 
left join Orders on Customers.id = Orders.customerId
where orders.customerId is null

