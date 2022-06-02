select r.resortname, r.townname
from resort r left join cabin c
on r.resortid = c.resortid
where c.bedroomcount = (select min(bedroomcount) from cabin)
order by 1;
