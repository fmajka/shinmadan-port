package org.tohosinma.decompiled;

import org.tohosinma.localization.Conversation;

public class tohokaiwa {
   public static int effectflag;
   public static int effectNEXT;
   public static Conversation conversation;

   public static void getkaiwa(int dialogueId, int speechId) {
      conversation.getkaiwa(dialogueId, speechId);
   }

   public static void getedkaiwa(int continues, int speechId) {
      conversation.getedkaiwa(continues, speechId);
   }
}
