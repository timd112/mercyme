package com.owaot.overwatch;

import com.google.common.base.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String ... args) {
    String gamerTag = (args.length == 0 || Strings.isNullOrEmpty(args[0])) ? OverwatchParser.TIMS_GAMER_TAG : args[0];
    logger.info(OverwatchParser.getQuickUserInfo(Platform.PC, Region.US, gamerTag).toString());
  }
}
