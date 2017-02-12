package com.owaot.overwatch;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OverwatchParser {
  private static final Logger logger = LoggerFactory.getLogger(OverwatchParser.class);

  public static final String OW_URL_FMT = "https://playoverwatch.com/en-us/career/%s/%s/%s";
  public static final String TIMS_GAMER_TAG = "liquidswords-11931";
  public static final String ANDREWS_GAMER_TAG = "Atothendrew-1548";
  public static final String PLAYER_LEVEL_JQUERY = ".player-level";
  public static final String COMP_RANK_JQUERY = ".competitive-rank div";
  public static final String GAMES_WON_JQUERY = "section.career-stats-section div.card-stat-block";

  public static int getPlayerLevel(Document doc){
    Element level = doc.select(PLAYER_LEVEL_JQUERY).first().child(0);
    return (level == null) ? 0 : Integer.parseInt(level.html());
  }

  public static int getCompetitiveRank(Document doc){
    Element rank = doc.select(COMP_RANK_JQUERY).first();
    return (rank == null) ? 0 : Integer.parseInt(rank.html());
  }

  public static int getQuickPlayGamesWon(Document doc){
    Element tableDiv = doc.select(GAMES_WON_JQUERY).get(6);
    Element gamesWon = tableDiv.select("table.data-table tr").get(1).child(1);
    return (gamesWon == null) ? 0 : Integer.parseInt(gamesWon.html());
  }
}
