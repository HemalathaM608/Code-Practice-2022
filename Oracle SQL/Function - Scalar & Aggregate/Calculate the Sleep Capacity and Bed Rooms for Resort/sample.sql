select distinct resortid, sum(bedroomcount) as TOTALROOM,
sum(sleepcapacity) as CAPACITY 
from cabin
group by resortid
having sum(bedroomcount)>=60 and sum(sleepcapacity)>=100
order by resortid;
