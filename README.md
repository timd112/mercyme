Another Overwatch Stats Scraper
-------------------------------
Just some basic stuff right now.  
* Contains code to parse out player level and competitive ranking.  

There's one main method to query your user (Note: only pc platform and US region right now):
```
java -cp overwatch-common-0.1-SNAPSHOT.jar com.nomercydojo.overwatch.Main liquidswords-11931
 01:44:35.361 [main] INFO com.nomercydojo.overwatch.Main - Retrieving data from: https://playoverwatch.com/en-us/career/pc/us/liquidswords-11931
 01:44:37.201 [main] INFO com.nomercydojo.overwatch.Main - Player Level: 31
 01:44:37.218 [main] INFO com.nomercydojo.overwatch.Main - Competitive Ranking: 1587
```
