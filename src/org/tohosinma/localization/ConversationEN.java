package org.tohosinma.localization;

import org.tohosinma.decompiled.tohoSINMACanvas;
import org.tohosinma.decompiled.tohokaiwa;

public class ConversationEN implements Conversation {

    public void getkaiwa(int dialogueId, int speechId) {
      if (dialogueId == 0) {
         if (tohoSINMACanvas.peoplebomkind % 2 == 0) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  // あー寒いわねー。
                  tohoSINMACanvas.kaiwa1 = "Brrr, it's so cold.";
                  // どうなっているのかしら、
                  tohoSINMACanvas.kaiwa2 = "What's going on, isn't it";
                  // 一応もう春よ？
                  tohoSINMACanvas.kaiwa3 = "supposed to be spring already?";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  // もしかして・・・。
                  tohoSINMACanvas.kaiwa1 = "Maybe...";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 4, 1, 1);
                  // あたいをよんだ？
                  tohoSINMACanvas.kaiwa1 = "Did you call me?";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 4, 1, 0);
                  // あ、元凶がきた。
                  tohoSINMACanvas.kaiwa1 = "Ah, here comes the culprit.";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 4, 1, 0);
                  // お呼びでないわね。
                  tohoSINMACanvas.kaiwa1 = "I'm afraid no one called you."; // I suppose I'm not wanted here.。
                  // 速やかに帰ってくれないかしら？
                  tohoSINMACanvas.kaiwa2 = "Would you kindly leave immediately?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 4, 1, 1);
                  // ひどい！！
                  tohoSINMACanvas.kaiwa1 = "How rude!!";
                  // あんたなんか、さいきょーの
                  tohoSINMACanvas.kaiwa2 = "I am the strongest";
                  // あたいがたおしてやるんだから！
                  tohoSINMACanvas.kaiwa3 = "and I'll knock you down!";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 4, 1, 0);
                  // 私たちは急いでいるの、
                  tohoSINMACanvas.kaiwa1 = "We're in a hurry,";
                  // 靈夢、目の前の
                  tohoSINMACanvas.kaiwa2 = "Reimu, defeat the idiot";
                  // 馬鹿を倒しなさい。
                  tohoSINMACanvas.kaiwa3 = "in front of us.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 4, 1, 0);
               // わたしは急いでないんだけど…
               tohoSINMACanvas.kaiwa1 = "I'm not in a hurry, though...";
               tohoSINMACanvas.kaiwa2 = "";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  // ああ、寒い。
                  tohoSINMACanvas.kaiwa1 = "Ah, it's cold.";
                  // 残暑…じゃないな、なんて
                  tohoSINMACanvas.kaiwa2 = "Late summer heat... nah, that";
                  // いうんだ？
                  tohoSINMACanvas.kaiwa3 = "wasn't it. What do you call it?";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  // 残x？
                  tohoSINMACanvas.kaiwa1 = "Is it leftover cold?";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  // 余寒（よかん）よ。
                  tohoSINMACanvas.kaiwa1 = "The lingering cold.";
                  // そんなことより本当に
                  tohoSINMACanvas.kaiwa2 = "But seriously, are you really";
                  // 行くつもりなの、魔界に？
                  tohoSINMACanvas.kaiwa3 = "going to the Demon Realm?";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  // 素敵な魔法に出会えそうな
                  tohoSINMACanvas.kaiwa1 = "I've got a feeling I'm about to";
                  // 予感がするぜ。
                  tohoSINMACanvas.kaiwa2 = "encounter some wonderful magic.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  // 嫌な予感しか
                  tohoSINMACanvas.kaiwa1 = "Nothing but a bad feeling.";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  // わたしは、
                  tohoSINMACanvas.kaiwa1 = "I...";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 4, 1, 1);
                  // 誰かが遊んでくれそうな
                  tohoSINMACanvas.kaiwa1 = "I had a feeling someone";
                  // 予感がしたんだけど？
                  tohoSINMACanvas.kaiwa2 = "might want to play with me?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 4, 1, 0);
                  // 嫌な予感がさっそく
                  tohoSINMACanvas.kaiwa1 = "My bad feeling came true";
                  // あたったわ、寒さの
                  tohoSINMACanvas.kaiwa2 = "right away, this guy";
                  // 原因はこいつね。
                  tohoSINMACanvas.kaiwa3 = "is to blame for the cold.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 4, 1, 0);
                  // いい予感がさっそく
                  tohoSINMACanvas.kaiwa1 = "My hunch was right";
                  // あたったぜ、こいつを
                  tohoSINMACanvas.kaiwa2 = "I'll knock this guy down";
                  // 倒せば寒くなくなるぜ。
                  tohoSINMACanvas.kaiwa3 = "to warm things up."; // Take it down and the cold'll go away.
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 4, 1, 1);
               // 思う存分、よかんを
               tohoSINMACanvas.kaiwa1 = "Go ahead, and let us play";
               // 楽しんでいけばいいよ！
               tohoSINMACanvas.kaiwa2 = "to our heart's content！";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         }
      } else if (dialogueId == 1) {
         if (tohoSINMACanvas.peoplebomkind % 2 == 0) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  // あいつ、なんか前より
                  tohoSINMACanvas.kaiwa1 = "That guy seems stronger";
                  // 強くなってる気が…
                  tohoSINMACanvas.kaiwa2 = "than before...";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  // 強い力を持ってしまった
                  tohoSINMACanvas.kaiwa1 = "A fairy who has gained such power";
                  // 妖精はもはや妖精にあらず
                  tohoSINMACanvas.kaiwa2 = "is no longer a fairy.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
               // あの子が妖精でなくなる
               tohoSINMACanvas.kaiwa1 = "The day that child ceases to be";
               // 日も近い…のかも
               tohoSINMACanvas.kaiwa2 = "a fairy may be drawing near...";
               // しれないわね
               tohoSINMACanvas.kaiwa3 = "perhaps.";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 4, 1, 1);
                  // ちくしょ〜
                  tohoSINMACanvas.kaiwa1 = "Damn it〜";
                  // おぼえてろ〜。
                  tohoSINMACanvas.kaiwa2 = "I'll remember this!";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
               // ああそうだ、
               tohoSINMACanvas.kaiwa1 = "Ah, that's right,";
               // 今度は残暑のときに
               tohoSINMACanvas.kaiwa2 = "next time, during the summer heat";
               // 来てくれると助かるぜ。
               tohoSINMACanvas.kaiwa3 = "it'd be great if you could come over."; // It'd be great if you could come over。
               tohokaiwa.effectflag = 1;
            }
         }
      } else if (dialogueId == 2) {
         if (tohoSINMACanvas.peoplebomkind % 2 == 0) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  // ちょっと待ってよ〜
                  tohoSINMACanvas.kaiwa1 = "Hey wait a minute!";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  // そんなに急いで
                  tohoSINMACanvas.kaiwa1 = "Why such a rush?";
                  // 何処に行く〜？
                  tohoSINMACanvas.kaiwa2 = "Where are you going〜？";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // あら、いつぞやの
                  tohoSINMACanvas.kaiwa1 = "Oh, isn't that the umbrella ghost";
                  // 化け傘じゃない。
                  tohoSINMACanvas.kaiwa2 = "from the other day?";
                  // 何か用かしら？
                  tohoSINMACanvas.kaiwa3 = "What do you want？";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // 生憎だけど、お遊びに
                  tohoSINMACanvas.kaiwa1 = "Unfortunately, I don't have time";
                  // 付き合ってる暇は
                  tohoSINMACanvas.kaiwa2 = "for playing around.";
                  // ないわよ。
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  // ぐすん。
                  tohoSINMACanvas.kaiwa1 = "Sniff.";
                  // 同属にすら構って
                  tohoSINMACanvas.kaiwa2 = "Not even my own kind";
                  // もらえない…。
                  tohoSINMACanvas.kaiwa3 = "wants to play with me...";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  // でも、あちき負けない！
                  tohoSINMACanvas.kaiwa1 = "But I won't lose!";
                  // 意地でも驚いてもらうよ！
                  tohoSINMACanvas.kaiwa2 = "I'll do whatever it takes";
                  tohoSINMACanvas.kaiwa3 = "to scare you!";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // 懲りないわね。
                  tohoSINMACanvas.kaiwa1 = "You never learn, do you?";
                  // まったく、この
                  tohoSINMACanvas.kaiwa2 = "Seriously, at a time";
                  // めんどくさい時に…。
                  tohoSINMACanvas.kaiwa3 = "like this...";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // あら、妖怪退治が
                  tohoSINMACanvas.kaiwa1 = "Oh, yokai extermination";
                  // 仕事じゃなかったの？
                  tohoSINMACanvas.kaiwa2 = "Isn't this your job?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // …まず、あんたから
                  tohoSINMACanvas.kaiwa1 = "...Well,";
                  // 退治しようかしら？
                  tohoSINMACanvas.kaiwa2 = "how about starting with you?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
               // こら、そこ！
               tohoSINMACanvas.kaiwa1 = "Hey, you there!";
               // 無視するな〜！
               tohoSINMACanvas.kaiwa2 = "Don't ignore me〜!";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  // ばぁ！
                  tohoSINMACanvas.kaiwa1 = "Boo!";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  // どう、おどろいた？
                  tohoSINMACanvas.kaiwa1 = "How about that? Scared?";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // 全然。
                  tohoSINMACanvas.kaiwa1 = "Not at all.";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  // しくしく…。
                  tohoSINMACanvas.kaiwa1 = "Sob... sob...";
                  // 不意打ち作戦も。
                  tohoSINMACanvas.kaiwa2 = "A surprise attack strategy.";
                  // 失敗ね。
                  tohoSINMACanvas.kaiwa3 = "It was a failure.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  // どうすれば驚いて
                  tohoSINMACanvas.kaiwa1 = "Why aren't you scared";
                  // くれるのかしら？
                  tohoSINMACanvas.kaiwa2 = "can you tell me that？";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // 化け傘に驚くような
                  tohoSINMACanvas.kaiwa1 = "No one would get scared";
                  // 人間はおらんよ。
                  tohoSINMACanvas.kaiwa2 = "of a ghost with an umbrella.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // 唐傘お化け…人を
                  tohoSINMACanvas.kaiwa1 = "Umbrella ghost...";
                  // 驚かすことを生きがいに
                  tohoSINMACanvas.kaiwa2 = "Making a living out of scaring people.";
                  // している、
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // 無害な妖怪ね。
                  tohoSINMACanvas.kaiwa1 = "A harmless yokai, I see.";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  // 素直に驚いて
                  tohoSINMACanvas.kaiwa1 = "If that wasn't enough";
                  // くれないなら…
                  tohoSINMACanvas.kaiwa2 = "to frighten you...";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
               // 力ずくで
               tohoSINMACanvas.kaiwa1 = "I shall scare you";
               // 驚いてもらうわよ！
               tohoSINMACanvas.kaiwa2 = "by using force!";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         }
      } else if (dialogueId == 3) {
         if (tohoSINMACanvas.peoplebomkind % 2 == 0) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  // うーらーめーしーやー。
                  tohoSINMACanvas.kaiwa1 = "Uーraーmeーshiーya...";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // そんな満身創痍な状態で言われ
                  tohoSINMACanvas.kaiwa1 = "Even in such a battered state";
                  // ても…。
                  tohoSINMACanvas.kaiwa2 = "you're still trying...";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  // どうしてみんな驚いてくれないの
                  tohoSINMACanvas.kaiwa1 = "Why isn't anyone";
                  // かな？
                  tohoSINMACanvas.kaiwa2 = "scared?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // 自分自身を鏡で見ながら
                  tohoSINMACanvas.kaiwa1 = "Look at yourself in the mirror";
                  // 考えなさい。
                  tohoSINMACanvas.kaiwa2 = "and think.";
                  // さあ霊夢、行くわよ。
                  tohoSINMACanvas.kaiwa3 = "Come on, Reimu, let's go.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
               // ああ人間も妖怪もみんな
               tohoSINMACanvas.kaiwa1 = "Ah, both humans and yokai";
               // 無情だわ、しくしく…。
               tohoSINMACanvas.kaiwa2 = "are all so heartless, sob sob...";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  // 負けました〜。
                  tohoSINMACanvas.kaiwa1 = "I lost〜.";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // 勝ったぜ。戦利品として、
                  tohoSINMACanvas.kaiwa1 = "I won. I'll take these geta";
                  // この下駄をもらっていこう。
                  tohoSINMACanvas.kaiwa2 = "as my spoils of war.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  // それはだめぇ〜！
                  tohoSINMACanvas.kaiwa1 = "That's no fair〜!";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // はぁ、なんで私はついて
                  tohoSINMACanvas.kaiwa1 = "Sigh, why did I even bother";
                  // 来てしまったのかしら…。
                  tohoSINMACanvas.kaiwa2 = "to come along...";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // 元気出せよパチュリー、
                  tohoSINMACanvas.kaiwa1 = "Cheer up, Patchouli,";
                  // この下駄あげるから。
                  tohoSINMACanvas.kaiwa2 = "I'll give you these geta.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
               // いらないわよ！
               tohoSINMACanvas.kaiwa1 = "I don't want them!";
               tohoSINMACanvas.kaiwa2 = "";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         }
      } else if (dialogueId == 4) {
         if (tohoSINMACanvas.peoplebomkind % 2 == 0) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  // もうすぐ魔界入り口よ。
                  tohoSINMACanvas.kaiwa1 = "We're almost at the entrance to the";
                  tohoSINMACanvas.kaiwa2 = "Demon Realm.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  // どうも〜。
                  tohoSINMACanvas.kaiwa1 = "Hey there〜";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
                  // 清く正しく射命丸です〜。
                  tohoSINMACanvas.kaiwa1 = "I'm Shameimaru,";
                  tohoSINMACanvas.kaiwa2 = "pure and righteous〜";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  // あら、文じゃない。
                  tohoSINMACanvas.kaiwa1 = "Oh, not that reporter."; // ?
                  // 何か用かしら？
                  tohoSINMACanvas.kaiwa2 = "What do you want？";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
                  // 『密着！博麗の巫女と
                  tohoSINMACanvas.kaiwa1 = "『Close-Up! Hakurei Shrine";
                  // 妖怪の賢者の魔界侵略大戦争』
                  tohoSINMACanvas.kaiwa2 = "Maiden and the Yokai Sage ";
                  // 大スクープ間違いなしです！
                  tohoSINMACanvas.kaiwa3 = "invade the Demon Realm』";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
                  // というわけで、嫌でも
                  tohoSINMACanvas.kaiwa1 = "This is definitely a major scoop!";
                  // お供させていただきます！
                  tohoSINMACanvas.kaiwa2 = "So, whether you like it or not,";
                  tohoSINMACanvas.kaiwa3 = "I'll be tagging along!";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  // 別に侵略とかそういう
                  tohoSINMACanvas.kaiwa1 = "It's not like it's an invasion";
                  // わけじゃないんだけど…
                  tohoSINMACanvas.kaiwa2 = "or anything like that...";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  // 似たようなもんじゃない？
                  tohoSINMACanvas.kaiwa1 = "It's pretty much the same thing,"; // ???
                  tohoSINMACanvas.kaiwa2 = "isn't it?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  // ともかく、あんたを連れては
                  tohoSINMACanvas.kaiwa1 = "Anyway, I can't take you with me";
                  // 行けないわ。
                  tohoSINMACanvas.kaiwa2 = "One troublesome companion";
                  // 面倒な連れは１人で十分よ。
                  tohoSINMACanvas.kaiwa3 = "is enough.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
               tohoSINMACanvas.kaiwa1 = "";
               tohoSINMACanvas.kaiwa2 = "       ？";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  // よし、ここらに入り口が
                  tohoSINMACanvas.kaiwa1 = "Alright, the entrance";
                  // あったはずだぜ。
                  tohoSINMACanvas.kaiwa2 = "should be around here.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  // ないじゃない。
                  tohoSINMACanvas.kaiwa1 = "There's nothing here.";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  // まぁ見てなって。
                  tohoSINMACanvas.kaiwa1 = "Just you wait and see.";
                  // いくぜっ！
                  tohoSINMACanvas.kaiwa2 = "Here I go!";
                  // アルティメットスパーク！
                  tohoSINMACanvas.kaiwa3 = "『Ultimate Spark!』";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = "";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  // けほけほ、いきなりなんなの？
                  tohoSINMACanvas.kaiwa1 = "Cough cough, what is this";
                  tohoSINMACanvas.kaiwa2 = "all of a sudden?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  // ん〜、まだ安定性に難があるが、
                  tohoSINMACanvas.kaiwa1 = "Hmm〜, it's still a bit unstable,";
                  // まぁ、目的は果たせたぜ。
                  tohoSINMACanvas.kaiwa2 = "but hey, it got the job done.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  // ごほごほ、まったく
                  tohoSINMACanvas.kaiwa1 = "Cough cough, really now";
                  // なんなんですかもう〜
                  tohoSINMACanvas.kaiwa2 = "what is this nonsense〜";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  // ん、河童か？
                  tohoSINMACanvas.kaiwa1 = "Hmm, a kappa?";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
                  // 河童ちゃうわ。
                  tohoSINMACanvas.kaiwa1 = "It's no kappa.";
                  // 毎度おなじみブン屋の射命丸
                  tohoSINMACanvas.kaiwa2 = "It's your favourite resident reporter,";
                  // です。
                  tohoSINMACanvas.kaiwa3 = "Shameimaru.";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  // 光を利用したステルス装置
                  tohoSINMACanvas.kaiwa1 = "A stealth device using light...";
                  // …かしら？
                  tohoSINMACanvas.kaiwa2 = "I wonder?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 10) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
                  // ええ、たった今壊れましたが。
                  tohoSINMACanvas.kaiwa1 = "Yes, it just broke.";
                  // おや、パチュリーさんですよね、
                  tohoSINMACanvas.kaiwa2 = "Oh, it's you, Miss Patchouli.";
                  // 外出とは珍しい。
                  tohoSINMACanvas.kaiwa3 = "Going out? That's unusual.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 11) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  // 外出したかったわけじゃないわ。
                  tohoSINMACanvas.kaiwa1 = "It's not like I wanted to go out.";
                  // まったくもう。
                  tohoSINMACanvas.kaiwa2 = "Honestly.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 12) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  // 取材は後にしてくれ、
                  tohoSINMACanvas.kaiwa1 = "Leave the interview for later,";
                  // いま忙しいんだ。。
                  tohoSINMACanvas.kaiwa2 = "I'm busy right now...";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 13) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
                  // いえいえ、お時間は
                  tohoSINMACanvas.kaiwa1 = "No, no,";
                  // 取らせません。
                  tohoSINMACanvas.kaiwa2 = "I won't take up your time.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 14 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
               // この装置の代金を
               tohoSINMACanvas.kaiwa1 = "That is, assuming you're willing";
               // 素直に払っていただけたらの
               tohoSINMACanvas.kaiwa2 = "to pay for the repair of this device";
               // 話ですが！！
               tohoSINMACanvas.kaiwa3 = "without any fuss!!";
               tohokaiwa.effectflag = 1;
            }
         }
      } else if (dialogueId == 5) {
         if (tohoSINMACanvas.peoplebomkind % 2 == 0) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
                  // あやや、負けてしまいました。
                  tohoSINMACanvas.kaiwa1 = "Oh dear, I've lost. Well, there's";
                  // 仕方がないです、取材は
                  tohoSINMACanvas.kaiwa2 = "nothing I can do about it,";
                  // 断念します。
                  tohoSINMACanvas.kaiwa3 = "I'll have to give up on the interview.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  // 終わったかしら？
                  tohoSINMACanvas.kaiwa1 = "Are we done?";
                  // それじゃ、行くわよ霊夢。
                  tohoSINMACanvas.kaiwa2 = "Alright then, let's go, Reimu.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  // やけに諦めがいいのが気になる
                  tohoSINMACanvas.kaiwa1 = "I'm a bit concerned about how easily";
                  // けど…まあいいか。
                  tohoSINMACanvas.kaiwa2 = "you give up... but whatever.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "...";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
                  // ふっふっふ、これしきで
                  tohoSINMACanvas.kaiwa1 = "Heh heh heh, I'm not the kind";
                  // 諦める天狗じゃありませんよ。
                  tohoSINMACanvas.kaiwa2 = "of tengu who gives up";
                  tohoSINMACanvas.kaiwa3 = "at the first sign of trouble.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
                  // この河童式光学迷彩を装備して、
                  tohoSINMACanvas.kaiwa1 = "Equipped with this kappa-style";
                  // 背後から忍び寄る影となり…って
                  tohoSINMACanvas.kaiwa2 = "optical camouflage, I'll become";
                  tohoSINMACanvas.kaiwa3 = "a shadow creeping up from behind...";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
               // あれ、進めない？？
               tohoSINMACanvas.kaiwa1 = "Huh, it stopped working??";
               tohoSINMACanvas.kaiwa2 = "";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
                  // はぁ、今日は散々な目に
                  tohoSINMACanvas.kaiwa1 = "Ugh, today was just awful... ";
                  // 会いました…カメラも不調に
                  tohoSINMACanvas.kaiwa2 = "My camera's acting up too.";
                  // なってしまいましたし。
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  // 悪いな、代金はツケで頼む。
                  tohoSINMACanvas.kaiwa1 = "Sorry about that, I'll put it on my tab.";
                  // さて、気を取り直して
                  tohoSINMACanvas.kaiwa2 = "Now, let's get back on track.";
                  // 魔界へＧＯだな！
                  tohoSINMACanvas.kaiwa3 = "Off to the Demon Realm we go!";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
                  // 魔界入口なら、巫女に
                  tohoSINMACanvas.kaiwa1 = "If it is the door to the Demon Realm,";
                  // 簡易結界を張られてしまったので
                  tohoSINMACanvas.kaiwa2 = "the shrine maiden set up a barrier,";
                  // しばらく入れませんよ？
                  tohoSINMACanvas.kaiwa3 = "so you won't be able to enter, right?";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  // そうなのか？でも、そこに
                  tohoSINMACanvas.kaiwa1 = "Is that so?";
                  // 新しい入口が開通したから、
                  tohoSINMACanvas.kaiwa2 = "But a new entrance opened up here,";
                  // 問題ないぜ。
                  tohoSINMACanvas.kaiwa3 = "so it's no problem.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
                  // なんと！
                  tohoSINMACanvas.kaiwa1 = "What?!";
                  // それなら戦わないでおけば…
                  tohoSINMACanvas.kaiwa2 = "I shouldn't have fought then...";
                  // ああスクープが逃げていく…
                  tohoSINMACanvas.kaiwa3 = "Oh no, the scoop is slipping away...";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  // 自業自得だぜ。
                  tohoSINMACanvas.kaiwa1 = "It serves you right.";
                  // さあ、いよいよ魔界だな！
                  tohoSINMACanvas.kaiwa2 = "Well, it's finally time";
                  tohoSINMACanvas.kaiwa3 = "for the Demon Realm!";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
               // ほんとに行くのね…。
               tohoSINMACanvas.kaiwa1 = "So you're really going...";
               tohoSINMACanvas.kaiwa2 = "";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         }
      } else if (dialogueId == 6) {
         if (tohoSINMACanvas.peoplebomkind % 2 == 0) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  // 動くと撃つ！
                  tohoSINMACanvas.kaiwa1 = "Move, and I'll shoot!";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // 間違えた。
                  tohoSINMACanvas.kaiwa1 = "Nevermind that.";
                  // とにかく撃つだ。今すぐ撃つ。
                  tohoSINMACanvas.kaiwa2 = "I'm just going to shoot.";
                  tohoSINMACanvas.kaiwa3 = "I'm going to shoot now.";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // あんたねえ…いきなり現れて
                  tohoSINMACanvas.kaiwa1 = "Hey, you...";
                  // なんなのよ？。
                  tohoSINMACanvas.kaiwa2 = "What the heck are you doing";
                  tohoSINMACanvas.kaiwa3 = "just showing up like this?";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // で、なんで貴方が魔界に
                  tohoSINMACanvas.kaiwa1 = "So, why on earth are you";
                  // いるのかしら？
                  tohoSINMACanvas.kaiwa2 = "in the Demon Realm?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // そこに魔界があるからさ、
                  tohoSINMACanvas.kaiwa1 = "Because there's a demon world here.";
                  // という理由でいいか？
                  tohoSINMACanvas.kaiwa2 = "Is that an okay reason?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // ……………………。
                  tohoSINMACanvas.kaiwa1 = "...";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // ……………………。
                  tohoSINMACanvas.kaiwa1 = "...";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // …魔理沙に理由を求めるのが
                  tohoSINMACanvas.kaiwa1 = "...It was wrong to ask Marisa";
                  // 間違っていたわ。
                  tohoSINMACanvas.kaiwa2 = "for a reason.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // …話は終わったかしら？
                  tohoSINMACanvas.kaiwa1 = "...Is that all?";
                  // 私たちは、そろそろ失礼
                  tohoSINMACanvas.kaiwa2 = "We'll be taking our leave now.";
                  // するわ。
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
               // ちょっと待った！
               tohoSINMACanvas.kaiwa1 = "Wait a minute!";
               // 出会ったからには
               tohoSINMACanvas.kaiwa2 = "Now that we've met,";
               // バトルだぜ！
               tohoSINMACanvas.kaiwa3 = "it's time for a battle!";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  // おやっ？霊夢がいるぜ？
                  tohoSINMACanvas.kaiwa1 = "Huh? Reimu's here?"; // ?
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  // ようやく追いついたという
                  tohoSINMACanvas.kaiwa1 = "So you've finally";
                  // わけね。
                  tohoSINMACanvas.kaiwa2 = "caught up.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  // あら？魔理沙に…パチュリー？
                  tohoSINMACanvas.kaiwa1 = "Oh? Marisa and... Patchouli?";
                  // 珍しいわね。
                  tohoSINMACanvas.kaiwa2 = "That's rare.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  // 普段屋敷から出てこないあんたが
                  tohoSINMACanvas.kaiwa1 = "You don't usually leave the mansion,";
                  // よりにもよって魔界にいるなんて。
                  tohoSINMACanvas.kaiwa2 = "so why would you be";
                  tohoSINMACanvas.kaiwa3 = "in the Demon Realm of all places?";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // いやまぁ、その。
                  tohoSINMACanvas.kaiwa1 = "Well, you know.";
                  // 成り行きというのは恐ろしい
                  tohoSINMACanvas.kaiwa2 = "I find the way things turn out";
                  // と思っているわ。
                  tohoSINMACanvas.kaiwa3 = "to be quite frightening.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  // なんとなく状況が分かった
                  tohoSINMACanvas.kaiwa1 = "I think I sort of get";
                  // ような気がするわ。
                  tohoSINMACanvas.kaiwa2 = "the situation now. ";
                  // 要するに・・・
                  tohoSINMACanvas.kaiwa3 = "Basically...";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  // 魔理沙が悪いのね
                  tohoSINMACanvas.kaiwa1 = "Marisa is the one at fault,";
                  tohoSINMACanvas.kaiwa2 = "isn't she?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // ひどい言い草だぜ。
                  tohoSINMACanvas.kaiwa1 = "That's a pretty harsh thing";
                  tohoSINMACanvas.kaiwa2 = "to say.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  // とにかくここは危険だわ。
                  tohoSINMACanvas.kaiwa1 = "Anyway, this place is dangerous.";
                  // 早く引き返しなさい！！
                  tohoSINMACanvas.kaiwa2 = "Turn back quickly!!";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // そうはいかないぜ。
                  tohoSINMACanvas.kaiwa1 = "No way that's gonna happen.";
                  // ここの魔法を私のものに
                  tohoSINMACanvas.kaiwa2 = "Not until I make this magic";
                  // するまでは、な。
                  tohoSINMACanvas.kaiwa3 = "my own.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 10 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
               // やる気なのね？
               tohoSINMACanvas.kaiwa1 = "You're up for it, huh?";
               // いくわよ！
               tohoSINMACanvas.kaiwa2 = "Okay, let's go!";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         }
      } else if (dialogueId == 7) {
         if (tohoSINMACanvas.peoplebomkind % 2 == 0) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  // ２対１は反則だぜ。
                  tohoSINMACanvas.kaiwa1 = "Two against one is cheating, man.";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // 大丈夫、このスキマ妖怪は
                  tohoSINMACanvas.kaiwa1 = "It's okay, this gap yokai";
                  // 全然仕事してないから。
                  tohoSINMACanvas.kaiwa2 = "isn't doing any work at all.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // あら、貴方の背後をしっかり
                  tohoSINMACanvas.kaiwa1 = "Oh, I was doing my job";
                  // 守るという仕事をしていたわよ？
                  tohoSINMACanvas.kaiwa2 = "of watching your back, you know?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // それって、私を盾にして
                  tohoSINMACanvas.kaiwa1 = "Isn't that just using me";
                  // いるだけじゃない？
                  tohoSINMACanvas.kaiwa2 = "as a shield?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // なにのことか
                  tohoSINMACanvas.kaiwa1 = "I don't know";
                  // 分からないわ？
                  tohoSINMACanvas.kaiwa2 = "what you're talking about?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
               // あぁ、足の引っ張り合いを。
               tohoSINMACanvas.kaiwa1 = "Ah, trying to trip each other up.";
               // している奴らに負けるとはな、
               tohoSINMACanvas.kaiwa2 = "Losing to those guys,";
               // 泣けるぜ…。
               tohoSINMACanvas.kaiwa3 = "it's enough to make you cry...";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  // さよなら霊夢、お前のことは
                  tohoSINMACanvas.kaiwa1 = "Farewell Reimu";
                  // おおよそ忘れないぜ…。
                  tohoSINMACanvas.kaiwa2 = "I will never forget about you...";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  // …。
                  tohoSINMACanvas.kaiwa1 = "...Why the hell";
                  // そもそもなんで魔界に
                  tohoSINMACanvas.kaiwa2 = "are you in the Demon Realm";
                  // いるのよ？
                  tohoSINMACanvas.kaiwa3 = "in the first place?";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // 魔界で新たな魔法をゲットする
                  tohoSINMACanvas.kaiwa1 = "It's a quest to get new magic";
                  // 探求の旅だぜ。
                  tohoSINMACanvas.kaiwa2 = "in the demon realm.";
                  // わくわく。
                  tohoSINMACanvas.kaiwa3 = "I'm so excited!";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  // はぁ、もういろいろと疲れたから
                  tohoSINMACanvas.kaiwa1 = "Ugh, I'm just so tired of everything.";
                  // 帰るわ。パチュリー、ちょっと
                  tohoSINMACanvas.kaiwa2 = "I'm going home. Patchouli, could you";
                  // 伝言頼まれてくれる？
                  tohoSINMACanvas.kaiwa3 = "pass on a message for me?";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // 何かしら？
                  tohoSINMACanvas.kaiwa1 = "What is it?";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  // この先の神殿の主に、
                  tohoSINMACanvas.kaiwa1 = "To the master of the temple ahead,";
                  // 『 結界どうにかしろへっぽこ
                  tohoSINMACanvas.kaiwa2 = "『 Do something about the barrier,";
                  // 管理者！！
                  tohoSINMACanvas.kaiwa3 = " you lousy warden!!";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  // あと、そこの白黒魔女は
                  tohoSINMACanvas.kaiwa1 = "Also, that black-and-white witch";
                  // 泥棒だから退治しろ。』
                  tohoSINMACanvas.kaiwa2 = "is a thief, so get rid of her.";
                  // って伝えといて。
                  tohoSINMACanvas.kaiwa3 = "Tell them that for me.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // 色々と酷い会話だぜ…。
                  tohoSINMACanvas.kaiwa1 = "Man, what a messed up conversation...";
                  // でも神殿と聞いたら
                  tohoSINMACanvas.kaiwa2 = "But when I hear the word \"temple\",";
                  // 行かざるを得ないぜ。
                  tohoSINMACanvas.kaiwa3 = "I have no choice but to go.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // シーフとしての血が
                  tohoSINMACanvas.kaiwa1 = "Is it the thieving blood"; // ?
                  // 騒ぐのかしら？
                  tohoSINMACanvas.kaiwa2 = "stirring within you?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // 失礼だな、
                  tohoSINMACanvas.kaiwa1 = "That's rude,";
                  // トレジャーハンターと
                  tohoSINMACanvas.kaiwa2 = "I prefer to be called";
                  // 呼んでくれ。
                  tohoSINMACanvas.kaiwa3 = "『Treasure Hunter.』";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 10 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
               // 付き合ってられないわ…。
               tohoSINMACanvas.kaiwa1 = "I can't stand any more of this...";
               tohoSINMACanvas.kaiwa2 = "";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         }
      } else if (dialogueId == 8) {
         if (tohoSINMACanvas.peoplebomkind % 2 == 0) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  // 待ちなさい！
                  tohoSINMACanvas.kaiwa1 = "Wait!";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // ここから先は行かせないわ！
                  tohoSINMACanvas.kaiwa1 = "You're not going any further!";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // あら、アリスじゃない？
                  tohoSINMACanvas.kaiwa1 = "Oh, isn't that Alice?";
                  // 何であなたがここに…。
                  tohoSINMACanvas.kaiwa2 = "What are you doing here?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // 私は魔界人よ、ここに
                  tohoSINMACanvas.kaiwa1 = "I'm from the demon world, you know.";
                  // いることがそんなに不自然
                  tohoSINMACanvas.kaiwa2 = "Is it really that strange for me";
                  // かしら？
                  tohoSINMACanvas.kaiwa3 = "to be here?";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // アリス、私たちはこの先の神殿の
                  tohoSINMACanvas.kaiwa1 = "Alice, we have business";
                  // 主に用があるの。おとなしく
                  tohoSINMACanvas.kaiwa2 = "with the Lord of the Temple ahead.";
                  // そこをどいてくれるかしら？。
                  tohoSINMACanvas.kaiwa3 = "Could you plese step aside?"; // ?
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // 私が引くと思って？。
                  tohoSINMACanvas.kaiwa1 = "You thought I'd back down?";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // どうやら素直に通して。
                  tohoSINMACanvas.kaiwa1 = "And I hoped she'd let us pass.";
                  // くれそうにないようね…。
                  tohoSINMACanvas.kaiwa2 = "Looks like it's not going to happen..."; // ???
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // それなら、強引にでも
                  tohoSINMACanvas.kaiwa1 = "Then I'll just have to force";
                  // 行かせてもらうわ！
                  tohoSINMACanvas.kaiwa2 = "my way through!";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
               // させない！
               tohoSINMACanvas.kaiwa1 = "I won't allow it!";
               tohoSINMACanvas.kaiwa2 = "";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.kaiwa1 = "Hey!";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  // なんで魔理沙がここにいるのよ？
                  tohoSINMACanvas.kaiwa1 = "Why the heck is Marisa here?";
                  // それにパチュリーまで…。
                  tohoSINMACanvas.kaiwa2 = "And even Patchouli...";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // そんなアリスはなんでここ
                  tohoSINMACanvas.kaiwa1 = "Why the heck is Alice here?";
                  // にいるんだ？
                  tohoSINMACanvas.kaiwa2 = "Is she visiting her hometown?";
                  // あれか、里帰りか？
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  // 私はここで侵入者に備えて。
                  tohoSINMACanvas.kaiwa1 = "I stand guard here in case";
                  // いるのよ
                  tohoSINMACanvas.kaiwa2 = "of intruders";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // 魔理沙、完全に行動が
                  tohoSINMACanvas.kaiwa1 = "Marisa, you're so predictable.";
                  // 読まれているわよ。
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // 何の話か分からないぜ？
                  tohoSINMACanvas.kaiwa1 = "What the heck are you";
                  tohoSINMACanvas.kaiwa2 = "talking about?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "Don't play innocent.";
                  // しらばっくれても無駄よっ！
                  tohoSINMACanvas.kaiwa2 = "It's useless!"; // There's no point in denying it!
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  // …とは言っても、、貴方を。
                  tohoSINMACanvas.kaiwa1 = "...That said, I wasn't";
                  // 待ち構えていたのではないけど。
                  tohoSINMACanvas.kaiwa2 = "waiting for you.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // そうか、なら私は先に
                  tohoSINMACanvas.kaiwa1 = "I see. Well then,";
                  // 行かせてもらうぜ。
                  tohoSINMACanvas.kaiwa2 = "I'll be heading out.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  // いやいや、ここで会ったが
                  tohoSINMACanvas.kaiwa1 = "But well, it's great coincidence";
                  // 百年目。日ごろのツケを払って
                  tohoSINMACanvas.kaiwa2 = "to run into you here. I'll make you pay";
                  // もらうわ！
                  tohoSINMACanvas.kaiwa3 = "for what you've done!"; // ?
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 10 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
               // どちらかというと魔理沙より
               tohoSINMACanvas.kaiwa1 = "I feel like I'd rather side";
               // アリスに味方したい気分なん
               tohoSINMACanvas.kaiwa2 = "with Alice than Marisa,";
               // だけどなぁ…
               tohoSINMACanvas.kaiwa3 = "if I'm being honest...";
               tohokaiwa.effectflag = 1;
            }
         }
      } else if (dialogueId == 9) {
         if (tohoSINMACanvas.peoplebomkind % 2 == 0) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  // すみません。
                  tohoSINMACanvas.kaiwa1 = "I'm sorry.";
                  // 私じゃ止められません
                  tohoSINMACanvas.kaiwa2 = "I couldn't stop them...";
                  // でした…
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // この先にいるのね？
                  tohoSINMACanvas.kaiwa1 = "She's up ahead, right?"; // ???
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
               // 昔と同じならね。
               tohoSINMACanvas.kaiwa1 = "If it's the same as before, then yeah.";
               // まあ、アリスも待ち構えてたし、
               tohoSINMACanvas.kaiwa2 = "Well, Alice was waiting for me too,";
               // 正解だと思うけど。
               tohoSINMACanvas.kaiwa3 = "so I guess that's the right call."; // ?
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  // さて、この先には何があるのか
                  tohoSINMACanvas.kaiwa1 = "Well, I'm excited to see";
                  // 楽しみだな。
                  tohoSINMACanvas.kaiwa2 = "what lies ahead.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // そういえば貴方、誰を
                  tohoSINMACanvas.kaiwa1 = "By the way, who were you ";
                  // 待ち構えていたの？。
                  tohoSINMACanvas.kaiwa2 = "waiting for?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  // …博麗の巫女よ。
                  tohoSINMACanvas.kaiwa1 = "...Hakurei Shrine maiden.";
                  // 結界消滅の異変でここにくると
                  tohoSINMACanvas.kaiwa2 = "I thought you'd come here because of";
                  // 思っていたのだけど…。
                  tohoSINMACanvas.kaiwa3 = "the barrier's disappearance...";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // よかったなアリス。霊夢なら
                  tohoSINMACanvas.kaiwa1 = "Good for you, Alice.";
                  // 既に私が撃退しておいたぜ。
                  tohoSINMACanvas.kaiwa2 = "I already took care of Reimu for you.";
                  // ツケは帳消しだな。
                  tohoSINMACanvas.kaiwa3 = "That evens things out.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  // ええっ！それってほんとなの？
                  tohoSINMACanvas.kaiwa1 = "What?! Is that really true?";
                  // …どさくさに紛れようとしてる
                  tohoSINMACanvas.kaiwa2 = "...You're trying to take advantage";
                  // けど、ツケは消えないわよ？
                  tohoSINMACanvas.kaiwa3 = "of the situation, but the debt won't go away."; // ???
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  // ちぇー。
                  tohoSINMACanvas.kaiwa1 = "Damn it.";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
               // 仕方がないわね…くれぐれも
               tohoSINMACanvas.kaiwa1 = "I suppose there's no helping it...";
               // あの方に失礼のないように
               tohoSINMACanvas.kaiwa2 = "Please be careful not to be rude";
               // お願いね。
               tohoSINMACanvas.kaiwa3 = "to that person in any way.";
               tohokaiwa.effectflag = 1;
            }
         }
      } else if (dialogueId == 10) {
         if (tohoSINMACanvas.peoplebomkind % 2 == 0) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  // いるんでしょ？
                  tohoSINMACanvas.kaiwa1 = "You're here, right?";
                  // 出てきなさい！
                  tohoSINMACanvas.kaiwa2 = "Come out!";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  // 呼びましたか？
                  tohoSINMACanvas.kaiwa1 = "Did you call me?";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // まったく、騒がしい方ですね。
                  tohoSINMACanvas.kaiwa1 = "Good grief, you sure are noisy.";
                  // いつぞやの巫女と…幻想郷の。
                  tohoSINMACanvas.kaiwa2 = "The shrine maiden from back then...";
                  // 賢者ですか。
                  tohoSINMACanvas.kaiwa3 = "and the Sage of Gensokyo.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // あら、私をご存知？
                  tohoSINMACanvas.kaiwa1 = "Oh, you recognize me?";
                  // うれしいわ。
                  tohoSINMACanvas.kaiwa2 = "I'm glad.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // 用件の予想はついています。
                  tohoSINMACanvas.kaiwa1 = "I know what you're here for.";
                  // きっと結界の話でしょう。
                  tohoSINMACanvas.kaiwa2 = "It must be about the barrier.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // それなら話は早いわ、
                  tohoSINMACanvas.kaiwa1 = "Well then, let's get this";
                  // さっさとどうにかしてよね！
                  tohoSINMACanvas.kaiwa2 = "over with. Hurry up";
                  tohoSINMACanvas.kaiwa3 = "and do something about it!";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // お断りします。
                  tohoSINMACanvas.kaiwa1 = "I refuse.";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // なっ…！
                  tohoSINMACanvas.kaiwa1 = "What...?!";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // どういう意味かしら？
                  tohoSINMACanvas.kaiwa1 = "What do you mean?";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // 幻想郷は閉じられた世界。
                  tohoSINMACanvas.kaiwa1 = "Gensokyo, a closed world.";
                  // 他の世界との交流を断ち、
                  tohoSINMACanvas.kaiwa2 = "By severing ties with other worlds,";
                  // 自己完結した世界を
                  tohoSINMACanvas.kaiwa3 = "a self-contained realm can be constructed."; // ?
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 10) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // 創りだそうとしている
                  tohoSINMACanvas.kaiwa1 = "It seemed as if it was something"; // ?
                  // かのようだった…今
                  tohoSINMACanvas.kaiwa2 = "you were trying to create...";
                  // までは。
                  tohoSINMACanvas.kaiwa3 = "Until now.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 11) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // 最近、外の神々を新たに
                  tohoSINMACanvas.kaiwa1 = "I hear you've recently accepted";
                  // 受け入れたそうですね。
                  tohoSINMACanvas.kaiwa2 = "some new gods from outside.";
                  // 変化を拒むなら、幻想郷の
                  tohoSINMACanvas.kaiwa3 = "If you refused to change,";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 12) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // 結界を管理する貴方が
                  tohoSINMACanvas.kaiwa1 = "there's no way you'd let me through";
                  // 通すわけないでしょうに。
                  tohoSINMACanvas.kaiwa2 = "- since you're the one who manages"; // ?
                  tohoSINMACanvas.kaiwa3 = "Gensokyo's barrier.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 13) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // 〜♪
                  tohoSINMACanvas.kaiwa1 = "〜♪";
                  // さて、なんのことかしら？
                  tohoSINMACanvas.kaiwa2 = "Oh? Whatever could you mean";
                  tohoSINMACanvas.kaiwa3 = "by that?";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 14) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // それでは、なぜ我々魔界人は
                  tohoSINMACanvas.kaiwa1 = "Then why can't we, dwellers of the";
                  // 幻想郷に行ってはならないのか？
                  tohoSINMACanvas.kaiwa2 = "Demon Realm, go to Gensokyo? There should";
                  // もはや拒む理由は無い筈です。
                  tohoSINMACanvas.kaiwa3 = "be no reason to reject us anymore.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 15) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // それでも拒むというなら、
                  tohoSINMACanvas.kaiwa1 = "If you still refuse,";
                  // 力づくでかかってきなさい！
                  tohoSINMACanvas.kaiwa2 = "then come at me with all your might!";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 16) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // …よく分からないけど、これ
                  tohoSINMACanvas.kaiwa1 = "...I don't really get it,";
                  // 以上住民が増えるといろいろ
                  tohoSINMACanvas.kaiwa2 = "but if this many more people move in,";
                  // 面倒なのよ！
                  tohoSINMACanvas.kaiwa3 = "it will cause a lot of trouble!";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 17 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
               // ふふ、いくわよ。
               tohoSINMACanvas.kaiwa1 = "Heh heh, here we go.";
               tohoSINMACanvas.kaiwa2 = "";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  // たのも〜
                  tohoSINMACanvas.kaiwa1 = "Hey there〜";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  // あら…？
                  tohoSINMACanvas.kaiwa1 = "Oh...?";
                  // 貴方は確かアリスの友人の…
                  tohoSINMACanvas.kaiwa2 = "You're Alice's friend, aren't you...?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
                  tohokaiwa.effectNEXT = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // 魔理沙だぜ。
                  tohoSINMACanvas.kaiwa1 = "Name's Marisa.";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // その監視役のパチュリーです。
                  tohoSINMACanvas.kaiwa1 = "I'm Patchouli, the supervisor.";
                  // 貴方は魔界神様ですね。
                  tohoSINMACanvas.kaiwa2 = "You're the god of the Demon Realm,";
                  tohoSINMACanvas.kaiwa3 = "aren't you?";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  // そうですそうです。
                  tohoSINMACanvas.kaiwa1 = "Yes, that's right.";
                  // 私が魔界の神、しんき様です
                  tohoSINMACanvas.kaiwa2 = "I am Shinki, the god of the";
                  // えっへん。
                  tohoSINMACanvas.kaiwa3 = "Demon Realm. Heh.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // 魔界神とか言うから、
                  tohoSINMACanvas.kaiwa1 = "You don't look very tough";
                  // もっとキツイやつかと
                  tohoSINMACanvas.kaiwa2 = "for someone who calls themself";
                  // 思ってたぜ。
                  tohoSINMACanvas.kaiwa3 = "the Demon Realm god.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // 映姫みたいな。
                  tohoSINMACanvas.kaiwa1 = "Just like Eiki.";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // 私に従うなら世界の半分を
                  tohoSINMACanvas.kaiwa1 = "Follow me, and I'll give you ";
                  // やろう…みたいな感じかしら。
                  tohoSINMACanvas.kaiwa2 = "half the world... or something";
                  tohoSINMACanvas.kaiwa3 = "along these lines.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // そうそう、そんなかんじ。
                  tohoSINMACanvas.kaiwa1 = "Yeah, yeah, that's about right.";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  // …で、いったい何のようです？
                  tohoSINMACanvas.kaiwa1 = "...So, why exactly are you here?";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 10) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // ああ、そうだ。
                  tohoSINMACanvas.kaiwa1 = "Oh, right.";
                  // えっと、博麗霊夢からの
                  tohoSINMACanvas.kaiwa2 = "Um, this is a message";
                  // 伝言なんだが、
                  tohoSINMACanvas.kaiwa3 = "from Reimu Hakurei:";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 11) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // 『 結界どうにかしろへっぽこ
                  tohoSINMACanvas.kaiwa1 = "『 Fix this barrier already,";
                  // 管理者！！
                  tohoSINMACanvas.kaiwa2 = "you lousy warden!!";
                  // あと、そこの白黒魔女は
                  tohoSINMACanvas.kaiwa3 = "Also, that black-and-white witch";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 12) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // 泥棒だから退治しろ。』
                  tohoSINMACanvas.kaiwa1 = "over there is a thief,";
                  // とのことだぜ。
                  tohoSINMACanvas.kaiwa2 = "so get rid of her.』";
                  tohoSINMACanvas.kaiwa3 = "That's what they said.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 13) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // ………。
                  tohoSINMACanvas.kaiwa1 = "...";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 14) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  // ………。
                  tohoSINMACanvas.kaiwa1 = "...";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 15) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // 馬鹿だわ…チルノを超えた
                  tohoSINMACanvas.kaiwa1 = "What an idiot... It's hard to believe";
                  // 馬鹿がここにいるわ…。
                  tohoSINMACanvas.kaiwa2 = "there's someone even more stupid";
                  tohoSINMACanvas.kaiwa3 = "than Cirno...";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 16 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
               // よし、不届き者は抹殺
               tohoSINMACanvas.kaiwa1 = "Alright then, time to get rid";
               // しなくてはね！
               tohoSINMACanvas.kaiwa2 = "of the pest!";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         }
      } else if (dialogueId == 11) {
         if (tohoSINMACanvas.peoplebomkind % 2 == 0) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  // 一体私の神社に何が起こってる
                  tohoSINMACanvas.kaiwa1 = "What on earth happended";
                  // のよ！
                  tohoSINMACanvas.kaiwa2 = "to my shrine!?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  // ふふふ…久しぶりだねぇ？霊夢
                  tohoSINMACanvas.kaiwa1 = "Heh heh heh... ";
                  tohoSINMACanvas.kaiwa2 = "Long time no see, eh? Reimu.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // 博麗神社の守護神、魅魔様の
                  tohoSINMACanvas.kaiwa1 = "The guardian deity";
                  // お帰りよ。
                  tohoSINMACanvas.kaiwa2 = "of the Hakurei Shrine,";
                  tohoSINMACanvas.kaiwa3 = "Lady Mima, has returned.";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // ぶっ！でたっ！
                  tohoSINMACanvas.kaiwa1 = "Bam! There it is!";
                  // またややこしいのが魔界から…
                  tohoSINMACanvas.kaiwa2 = "Another troublemaker";
                  tohoSINMACanvas.kaiwa3 = "from the Demon Realm...";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // とにかく！私の神社の御神体は
                  tohoSINMACanvas.kaiwa1 = "First and foremost!";
                  // あんたじゃないわよ。
                  tohoSINMACanvas.kaiwa2 = "You're not the deity of my shrine."; // ?
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // そもそも、あんたを祀って何の
                  tohoSINMACanvas.kaiwa1 = "What good is it";
                  // 利益があるのよ？
                  tohoSINMACanvas.kaiwa2 = "to worship you anyway?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // そーねぇ、意外と御利益ある
                  tohoSINMACanvas.kaiwa1 = "Well, it might actually be beneficial";
                  // かもよ？いまどき実体の無い神様
                  tohoSINMACanvas.kaiwa2 = "to you. These days, people won't worship";
                  // だと信仰集まらないし、
                  tohoSINMACanvas.kaiwa3 = "a god without a physical form.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // 私が神社の守護神になれば、
                  tohoSINMACanvas.kaiwa1 = "If I became the guardian deity";
                  // 信仰も取り戻せると思うけどねぇ
                  tohoSINMACanvas.kaiwa2 = "of the shrine, I think we could";
                  tohoSINMACanvas.kaiwa3 = "regain their faith.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // あんたみたいな悪霊が憑いてる
                  tohoSINMACanvas.kaiwa1 = "If word gets out that a demon";
                  // って噂がたてば、なおさら人が
                  tohoSINMACanvas.kaiwa2 = "like you possessed this place,";
                  // 来なくなるのよ！
                  tohoSINMACanvas.kaiwa3 = "people will stay away even more!";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // そもそも、この神社に参拝客が
                  tohoSINMACanvas.kaiwa1 = "Does anyone visit this shrine";
                  // いるのかい？
                  tohoSINMACanvas.kaiwa2 = "to begin with?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 10) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // ぐっ…とにかく、あんたには
                  tohoSINMACanvas.kaiwa1 = "Ugh... Anyway, I want you";
                  // 出て行ってもらうわ。
                  tohoSINMACanvas.kaiwa2 = "to get out of here.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 11) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // そうかい。ということは、
                  tohoSINMACanvas.kaiwa1 = "I see. So it seems the only way";
                  // 肉体言語で説得するしかない
                  tohoSINMACanvas.kaiwa2 = "to persuade you is through";
                  // ようだねぇ？
                  tohoSINMACanvas.kaiwa3 = "physical means, huh?";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 12) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // あんたに肉体なんてないじゃない
                  tohoSINMACanvas.kaiwa1 = "Says someone who doesn't even have"; // You don't even have a body, you know?
                  tohoSINMACanvas.kaiwa2 = "a physical body.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 13 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
               // いや、まぁ、その。
               tohoSINMACanvas.kaiwa1 = "Well, well, here I am.";
               tohoSINMACanvas.kaiwa2 = "";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  // ん？なんか神社がいつもと違うぜ
                  tohoSINMACanvas.kaiwa1 = "Huh? Something's off about ";
                  // 超特急で帰ってきたから、まだ
                  tohoSINMACanvas.kaiwa2 = "the shrine today. I rushed back here,";
                  // 霊夢も起きてる筈なんだが…。
                  tohoSINMACanvas.kaiwa3 = "so Reimu should still be awake...";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  // ほう、しばらく見ないうちに
                  tohoSINMACanvas.kaiwa1 = "Well, it seems you've grown ";
                  // ずいぶんと成長しているようじゃ
                  tohoSINMACanvas.kaiwa2 = "quite a bit since the last time";
                  // ないか。
                  tohoSINMACanvas.kaiwa3 = "I saw you.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  // そ、その声は！
                  tohoSINMACanvas.kaiwa1 = "Th-that voice!";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  // 久しぶりだねぇ、魔理沙。
                  tohoSINMACanvas.kaiwa1 = "Long time no see, Marisa.";
                  // 元気にしていたかい？
                  tohoSINMACanvas.kaiwa2 = "How have you been?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
                  tohokaiwa.effectNEXT = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // 魅魔師匠じゃないか！
                  tohoSINMACanvas.kaiwa1 = "It's Mima-sama!";
                  // 一体今まで何してたんだぜ？
                  tohoSINMACanvas.kaiwa2 = "Where the hell have you been";
                  tohoSINMACanvas.kaiwa3 = "all this time?";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  // ふふ、秘密だ。まぁ、今はここの
                  tohoSINMACanvas.kaiwa1 = "Hehe, it's a secret.";
                  // 守護神をしているけどな。
                  tohoSINMACanvas.kaiwa2 = "Well, I am the guardian deity";
                  tohoSINMACanvas.kaiwa3 = "here now.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // ？？？
                  tohoSINMACanvas.kaiwa1 = "? ? ?";
                  // …どういうことなんだ？
                  tohoSINMACanvas.kaiwa2 = "What the heck is going on?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  // さっき霊夢を説得したんだ。
                  tohoSINMACanvas.kaiwa1 = "I just convinced Reimu.";
                  // まあ、当然の結果だな。
                  tohoSINMACanvas.kaiwa2 = "Oh well, it's only natural.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // さすがは師匠！しびれるぜ！
                  tohoSINMACanvas.kaiwa1 = "That's awesome!";
                  tohoSINMACanvas.kaiwa2 = "You're the best, Master!";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  // さて、話も終わったし、師匠が
                  tohoSINMACanvas.kaiwa1 = "Well, now that we've finished talking,";
                  // 弟子にすることは一つだな。
                  tohoSINMACanvas.kaiwa2 = "there's only one thing a master can do ";
                  tohoSINMACanvas.kaiwa3 = "for his disciple.";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 10) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // 望むところだ。私の成長を
                  tohoSINMACanvas.kaiwa1 = "Just what I wanted.";
                  // 見せつけてあげるぜ！
                  tohoSINMACanvas.kaiwa2 = "I'll show you how much I've grown!";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 11 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
               // さあ、始めようではないか！
               tohoSINMACanvas.kaiwa1 = "Well then, let's get started!";
               tohoSINMACanvas.kaiwa2 = "";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         }
      } else if (dialogueId == 12) {
         if (tohoSINMACanvas.peoplebomkind % 2 == 0) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // 久しぶりで腕が鈍ったかねぇ？
                  tohoSINMACanvas.kaiwa1 = "Has it been so long";
                  tohoSINMACanvas.kaiwa2 = "that my skills have gotten rusty?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // はいはい、言い訳はいいから
                  tohoSINMACanvas.kaiwa1 = "Alright, alright, no excuses,";
                  // さっさと出て行ってくれる？
                  tohoSINMACanvas.kaiwa2 = "can you just get out of here?";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // 仕方ないねぇ、愛弟子の様子でも
                  tohoSINMACanvas.kaiwa1 = "Well, I suppose I'll go check";
                  // 見に行くことにするわ。
                  tohoSINMACanvas.kaiwa2 = "on my beloved disciple.";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
               // もう来ないでね〜。
               tohoSINMACanvas.kaiwa1 = "Please don't come back anymore.";
               tohoSINMACanvas.kaiwa2 = "";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // やった、師匠に勝ったぜ！
                  tohoSINMACanvas.kaiwa1 = "Yes! I beat my master!";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  // まさか、これほどとは…。
                  tohoSINMACanvas.kaiwa1 = "I never thought it would be";
                  tohoSINMACanvas.kaiwa2 = "this bad...";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // うふふふふ。
                  tohoSINMACanvas.kaiwa1 = "Hehehehe.";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  // よくぞ私を破った！これで君も
                  tohoSINMACanvas.kaiwa1 = "Well done, you beat me!";
                  // 博麗神社の守護神だ！
                  tohoSINMACanvas.kaiwa2 = "Now you too are a guardian deity";
                  tohoSINMACanvas.kaiwa3 = "of Hakurei Shrine!";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
               // いつのまにやら
               tohoSINMACanvas.kaiwa1 = "When did I become a god,";
               // 神になっちゃったぜ？
               tohoSINMACanvas.kaiwa2 = "I wonder?";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         }
      } else if (dialogueId == 13) {
         if (tohoSINMACanvas.peoplebomkind % 2 == 0) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // おどろけ〜
                  tohoSINMACanvas.kaiwa1 = "Boo!";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
                  tohokaiwa.effectNEXT = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // …。
                  tohoSINMACanvas.kaiwa1 = "...";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  // 無視するな〜！
                  tohoSINMACanvas.kaiwa1 = "Don't ignore me〜!";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  // …邪魔。
                  tohoSINMACanvas.kaiwa1 = "...Out of my way.";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
               // …こ、怖くなんてないんだから！
               tohoSINMACanvas.kaiwa1 = "...I-I'm not scared at all!";
               tohoSINMACanvas.kaiwa2 = "";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  // よう、調子はどうだ？
                  tohoSINMACanvas.kaiwa1 = "Yo, how's it going?";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  // 絶好調よ！今日は大収穫だったわ
                  tohoSINMACanvas.kaiwa1 = "Couldn't be better!";
                  tohoSINMACanvas.kaiwa2 = "Today was a huge success!";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
               // という訳で…ついでにあなたも
               tohoSINMACanvas.kaiwa1 = "So while I'm at it... boo!";
               // おどろけ〜！
               tohoSINMACanvas.kaiwa2 = "You'll be scared too〜!";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         }
      }
   }

   public void getedkaiwa(int continues, int speechId) {
      if (continues == 0) {
         if (tohoSINMACanvas.peoplebomkind % 2 == 0) {
            if (speechId == 0) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = "  それから・・・";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = "  紫  「ようするに、そういうことなの";
                  tohoSINMACanvas.kaiwa2 = "        よ。」";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = " 霊夢 「ふぅん…幻想郷の立場ねぇ…。」";
                  tohoSINMACanvas.kaiwa2 = "        ";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = "  紫  「幻想郷は閉じた世界。";
                  tohoSINMACanvas.kaiwa2 = "        もし、その根底が覆るほど多くの";
                  tohoSINMACanvas.kaiwa3 = "        人が流れ込んできたとしたら？」";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = "  紫  「･･･話しすぎたかしらね？";
                  tohoSINMACanvas.kaiwa2 = "        まぁ、それじゃぁ私は帰るわね。」";
                  tohoSINMACanvas.kaiwa3 = "        ";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = "  しゅん･･･";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = " 霊夢 「はぁ、疲れたわね。";
                  tohoSINMACanvas.kaiwa2 = "        早く神社に帰って寝たいわ〜。」";
                  tohoSINMACanvas.kaiwa3 = "        ";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = " 霊夢 「ん…？ただならぬ気配を感じる";
                  tohoSINMACanvas.kaiwa2 = "        わね。」";
                  tohoSINMACanvas.kaiwa3 = "        ";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = " 霊夢 「場所は…私の神社じゃないの！」";
                  tohoSINMACanvas.kaiwa2 = "        ";
                  tohoSINMACanvas.kaiwa3 = "        ";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = "  彼女の苦難はまだ終わらない";
                  tohoSINMACanvas.kaiwa2 = "  To Be Continued …";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 10 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.kaiwa1 = "  【ＧＯＯＤ  ＥＮＤ１】";
               tohoSINMACanvas.kaiwa2 = "流石だね！しかし挑戦はまだ続きます…";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = " 神綺 「ふぅん、なかなかやるじゃない。」";
                  tohoSINMACanvas.kaiwa2 = "        ";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = "魔理沙「その姿でいわれても威厳のかけら";
                  tohoSINMACanvas.kaiwa2 = "        もないぜ。」";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = " 神綺 「ぐぅ。仕方ないわね。」";
                  tohoSINMACanvas.kaiwa2 = "        ";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = "パチェ「で、結界の話なのだけど…。」";
                  tohoSINMACanvas.kaiwa2 = "       ";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = " 神綺 「申し訳ないけど、あの結界を私　";
                  tohoSINMACanvas.kaiwa2 = "        たち魔界人が張ることはできない";
                  tohoSINMACanvas.kaiwa3 = "        から、」";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = " 神綺 「巫女本人がいないとどうしようも";
                  tohoSINMACanvas.kaiwa2 = "        ないのよ。」";
                  tohoSINMACanvas.kaiwa3 = "        ";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = "パチェ「では、せめて行き来を自重するよ";
                  tohoSINMACanvas.kaiwa2 = "        うに言ってはもらえないでしょう";
                  tohoSINMACanvas.kaiwa3 = "         か？」";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = " 神綺 「そうね、それなら問題ないわ。」";
                  tohoSINMACanvas.kaiwa2 = "        ";
                  tohoSINMACanvas.kaiwa3 = "        ";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = "魔理沙「よし、これにて";
                  tohoSINMACanvas.kaiwa2 = "        ミッションコンプリートだな！」";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = "  ・・・。";
                  tohoSINMACanvas.kaiwa2 = "        ";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 10) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = "パチェ「それじゃ、私はここで。」";
                  tohoSINMACanvas.kaiwa2 = "        ";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 11) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = "魔理沙「わざわざ付き合ってくれて";
                  tohoSINMACanvas.kaiwa2 = "        感謝だぜ。」";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 12) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = "魔理沙「そうだな、こんどプレゼントでも";
                  tohoSINMACanvas.kaiwa2 = "        やるよ。」";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 13) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = "パチェ「あ、え、いえ、別にそんなに";
                  tohoSINMACanvas.kaiwa2 = "        大したことじゃないしかまわない";
                  tohoSINMACanvas.kaiwa3 = "        わよ。」";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 14) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = "パチェ「きにしないでというかべつに…。」";
                  tohoSINMACanvas.kaiwa2 = "        ";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 15) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = "魔理沙「…何をテンパってるんだ？";
                  tohoSINMACanvas.kaiwa2 = "        そうだな〜新開発、体がメタル化";
                  tohoSINMACanvas.kaiwa3 = "        するきのこでも…」";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 16) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = "パチェ「いらないわよ！」";
                  tohoSINMACanvas.kaiwa2 = "        ";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 17) {
               if  (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.kaiwa1 = "  そんなこんなでパチュリーと別れ、";
                  tohoSINMACanvas.kaiwa2 = "  一人神社へと向かう魔理沙であった";
                  tohoSINMACanvas.kaiwa3 = "  のだが…？";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 18 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.kaiwa1 = "  【ＨＡＰＰＹ  ＥＮＤ】";
               tohoSINMACanvas.kaiwa2 = "流石だね！神社で魔理沙の見たものとは…？";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         }
      } else if (tohoSINMACanvas.peoplebomkind % 2 == 0) {
         if (speechId == 0) {
            if  (tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.kaiwa1 = "  それから・・・";
               tohoSINMACanvas.kaiwa2 = "";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (speechId == 1) {
            if  (tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.kaiwa1 = " 霊夢 「魔界からどんどん人が来ている";
               tohoSINMACanvas.kaiwa2 = "        わ…。」";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (speechId == 2) {
            if  (tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.kaiwa1 = " 霊夢 「しかもやりたい放題じゃない！";
               tohoSINMACanvas.kaiwa2 = "        あの魔界神はどんな教育をしてる";
               tohoSINMACanvas.kaiwa3 = "        のよ！」";
               tohokaiwa.effectflag = 1;
            }
         } else if (speechId == 3) {
            if  (tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.kaiwa1 = "  紫  「それは、貴方の力不足が原因じゃ";
               tohoSINMACanvas.kaiwa2 = "        なくて？」";
               tohoSINMACanvas.kaiwa3 = "        ";
               tohokaiwa.effectflag = 1;
            }
         } else if (speechId == 4) {
            if  (tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.kaiwa1 = " 霊夢 「ぐっ。だ、だから今修行してる";
               tohoSINMACanvas.kaiwa2 = "        じゃない！」";
               tohoSINMACanvas.kaiwa3 = "        ";
               tohokaiwa.effectflag = 1;
            }
         } else if (speechId == 5) {
            if  (tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.kaiwa1 = "  紫  「はいはい、手遅れにならないよう";
               tohoSINMACanvas.kaiwa2 = "        頑張るのよ。」";
               tohoSINMACanvas.kaiwa3 = "        ";
               tohokaiwa.effectflag = 1;
            }
         } else if (speechId == 6) {
            if  (tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.kaiwa1 = " 霊夢 「あんたは何でそう他人事なのよ…」";
               tohoSINMACanvas.kaiwa2 = "        ";
               tohoSINMACanvas.kaiwa3 = "        ";
               tohokaiwa.effectflag = 1;
            }
         } else if (speechId == 7) {
            if  (tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.kaiwa1 = "  霊夢の修行の日々が始まったので";
               tohoSINMACanvas.kaiwa2 = "  あった…。";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (speechId == 8 && tohokaiwa.effectflag == 0) {
            tohoSINMACanvas.kaiwa1 = "  【ＢＡＤ  ＥＮＤ】";
            tohoSINMACanvas.kaiwa2 = "  ノーコンで魔界神をやっつけよう！";
            tohoSINMACanvas.kaiwa3 = "";
            tohokaiwa.effectflag = 1;
         }
      } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
         if (speechId == 0) {
            if  (tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.kaiwa1 = "魔理沙「まずい、ズラかるぜ！」";
               tohoSINMACanvas.kaiwa2 = "        ";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (speechId == 1) {
            if  (tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.kaiwa1 = "パチェ「私は悪くないのに〜！」";
               tohoSINMACanvas.kaiwa2 = "        ";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (speechId == 2) {
            if  (tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.kaiwa1 = " 神綺 「悪は去った。私の大勝利ね！」";
               tohoSINMACanvas.kaiwa2 = "        ";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (speechId == 3) {
            if  (tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.kaiwa1 = " 神綺 「…あれ、なんか忘れてるような」";
               tohoSINMACanvas.kaiwa2 = "        …まぁ、いいわよね。」";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (speechId == 4) {
            if  (tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.kaiwa1 = "  見事盗賊を撃退し、";
               tohoSINMACanvas.kaiwa2 = "  魔界の平和は守られた。      ";
               tohoSINMACanvas.kaiwa3 = "        ";
               tohokaiwa.effectflag = 1;
            }
         } else if (speechId == 5) {
            if  (tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.kaiwa2 = "  ありがとう、僕らのたくましい魔界神！";
               tohoSINMACanvas.kaiwa1 = "        ";
               tohoSINMACanvas.kaiwa3 = "        ";
               tohokaiwa.effectflag = 1;
            }
         } else if (speechId == 6 && tohokaiwa.effectflag == 0) {
            tohoSINMACanvas.kaiwa1 = "  【ＭＡＫＡＩ  ＥＮＤ】";
            tohoSINMACanvas.kaiwa2 = "  ざんねん！！  まりさの  ぼうけんは";
            tohoSINMACanvas.kaiwa3 = "  ここでおわってしまった！";
            tohokaiwa.effectflag = 1;
         }
      }
   }
}
