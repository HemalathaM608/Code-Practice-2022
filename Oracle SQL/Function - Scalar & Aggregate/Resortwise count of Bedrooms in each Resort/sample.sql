select distinct resortid, sum(bedroomcount) as TOTALCOUNT from cabin group by resortid order by resortid;
