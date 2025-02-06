# Write your MySQL query statement below
# 트랜잭션으로 접속하지 않은 고객의 접속 횟수
select v.customer_id, count(v.customer_id) count_no_trans
from Visits v
left join Transactions t
on (v.visit_id = t.visit_id)
where t.transaction_id is null
group by v.customer_id;