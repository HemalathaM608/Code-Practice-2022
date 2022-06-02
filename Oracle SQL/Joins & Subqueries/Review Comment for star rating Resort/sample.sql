select r.resortid, ra.comments from Resort r join review ra
on r.resortid=ra.resortid where r.starRating > 4.2
order by 1;
