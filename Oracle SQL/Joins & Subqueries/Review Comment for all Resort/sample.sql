select r.resortname, g.name, ra.comments from resort r join review ra
on  r.resortid=ra.resortid join guest g
on g.guestid = ra.guestid
order by r.resortid;
