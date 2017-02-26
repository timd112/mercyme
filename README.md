Another Overwatch Stats Scraper
-------------------------------
Just some basic stuff right now.  
* Contains code to parse out player level, competive ranking, and total quick play wins

There's one main method to query your user (Note: only pc platform and US region right now):
```
java -cp overwatch-common-0.1-SNAPSHOT.jar com.owaot.overwatch.Main liquidswords-11931

22:19:04.099 [main] INFO com.owaot.overwatch.Main - Retrieving data from: https://playoverwatch.com/en-us/career/pc/us/liquidswords-11931
22:19:05.987 [main] INFO com.owaot.overwatch.Main - Player Level: 49
22:19:06.003 [main] INFO com.owaot.overwatch.Main - Competitive Ranking: 1494
22:19:06.007 [main] INFO com.owaot.overwatch.Main - Quick play total wins: 113
```

REST Interface
--------------
Currently supported path: */v1/users/{platform}/{region}/{gamerTag}*

```$sh
> curl http://localhost:8080/v1/users/pc/us/liquidswords-11931

{
    "gamerTag": "liquidswords-11931",
    "region": "US",
    "platform": "PC",
    "level": 88,
    "skillRating": 1458,
    "quickPlayWins": 248
}

```
