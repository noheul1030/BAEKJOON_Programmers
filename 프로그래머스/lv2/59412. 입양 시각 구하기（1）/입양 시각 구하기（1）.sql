select to_number(to_char(datetime,'fmhh24')) hour, count(*) count 
from animal_outs
where to_number(to_char(datetime,'fmhh24')) >= 9 and to_number(to_char(datetime,'fmhh24')) <= 19
group by to_number(to_char(datetime,'fmhh24'))
order by to_number(to_char(datetime,'fmhh24'))