select to_number(to_char(datetime,'fmhh24')) hour, count(*) count 
from animal_outs
group by to_number(to_char(datetime,'fmhh24'))
having to_number(to_char(datetime,'fmhh24')) BETWEEN 9 AND 19
order by hour