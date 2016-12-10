package com.nomercydojo.overwatch;

import com.google.common.base.Strings;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String ... args) {
    String gamerTag = (args.length == 0 || Strings.isNullOrEmpty(args[0])) ? OverwatchParser.TIMS_GAMER_TAG : args[0];
    String url = String.format(OverwatchParser.OW_URL_FMT, Platform.PC.getName(), Region.US.getName(), gamerTag);
    logger.info("Retrieving data from: " + url);
    try {
      Document doc = Jsoup.connect(url).get();
      logger.info("Player Level: " + OverwatchParser.getPlayerLevel(doc));
      logger.info("Competitive Ranking: " + OverwatchParser.getCompetitiveRank(doc));
    } catch (Exception e) {
      logger.error("Failed to fetch data", e);
    }
  }
}
