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
                  tohoSINMACanvas.kaiwa2 = "What's going on. Isn't it";
                  // 一応もう春よ？
                  tohoSINMACanvas.kaiwa3 = "supposed to be spring already?";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  // もしかして・・・。
                  tohoSINMACanvas.kaiwa1 = "Perhaps...";
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
                  tohoSINMACanvas.kaiwa3 = "going to the demon realm?";
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
               tohoSINMACanvas.kaiwa2 = "Don't ignore me~!";
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
                  tohoSINMACanvas.kaiwa1 = "もうすぐ魔界入り口よ。";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  // どうも〜。
                  tohoSINMACanvas.kaiwa1 = "どうも〜。";
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
                  tohoSINMACanvas.kaiwa1 = "清く正しく射命丸です〜。";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  // あら、文じゃない。
                  tohoSINMACanvas.kaiwa1 = "あら、文じゃない。";
                  // 何か用かしら？
                  tohoSINMACanvas.kaiwa2 = "何か用かしら？";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
                  // 『密着！博麗の巫女と
                  tohoSINMACanvas.kaiwa1 = "『密着！博麗の巫女と";
                  // 妖怪の賢者の魔界侵略大戦争』
                  tohoSINMACanvas.kaiwa2 = "妖怪の賢者の魔界侵略大戦争』";
                  // 大スクープ間違いなしです！
                  tohoSINMACanvas.kaiwa3 = "大スクープ間違いなしです！";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
                  // というわけで、嫌でも
                  tohoSINMACanvas.kaiwa1 = "というわけで、嫌でも";
                  // お供させていただきます！
                  tohoSINMACanvas.kaiwa2 = "お供させていただきます！";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  // 別に侵略とかそういう
                  tohoSINMACanvas.kaiwa1 = "別に侵略とかそういう";
                  // わけじゃないんだけど…
                  tohoSINMACanvas.kaiwa2 = "わけじゃないんだけど…";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  // 似たようなもんじゃない？
                  tohoSINMACanvas.kaiwa1 = "似たようなもんじゃない？";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  // ともかく、あんたを連れては
                  tohoSINMACanvas.kaiwa1 = "ともかく、あんたを連れては";
                  // 行けないわ。
                  tohoSINMACanvas.kaiwa2 = "行けないわ。";
                  // 面倒な連れは１人で十分よ。
                  tohoSINMACanvas.kaiwa3 = "面倒な連れは１人で十分よ。";
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
                  tohoSINMACanvas.kaiwa1 = "よし、ここらに入り口が";
                  tohoSINMACanvas.kaiwa2 = "あったはずだぜ。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.kaiwa1 = "ないじゃない。";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.kaiwa1 = "まぁ見てなって。";
                  tohoSINMACanvas.kaiwa2 = "いくぜっ！";
                  tohoSINMACanvas.kaiwa3 = "アルティメットスパーク！";
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
                  tohoSINMACanvas.kaiwa1 = "けほけほ、いきなりなんなの？";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.kaiwa1 = "ん〜、まだ安定性に難があるが、";
                  tohoSINMACanvas.kaiwa2 = "まぁ、目的は果たせたぜ。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.kaiwa1 = "ごほごほ、まったく";
                  tohoSINMACanvas.kaiwa2 = "なんなんですかもう〜";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.kaiwa1 = "ん、河童か？";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "河童ちゃうわ。";
                  tohoSINMACanvas.kaiwa2 = "毎度おなじみブン屋の射命丸";
                  tohoSINMACanvas.kaiwa3 = "です。";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "光を利用したステルス装置";
                  tohoSINMACanvas.kaiwa2 = "…かしら？";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 10) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "ええ、たった今壊れましたが。";
                  tohoSINMACanvas.kaiwa2 = "おや、パチュリーさんですよね、";
                  tohoSINMACanvas.kaiwa3 = "外出とは珍しい。";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 11) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "外出したかったわけじゃないわ。";
                  tohoSINMACanvas.kaiwa2 = "まったくもう。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 12) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "取材は後にしてくれ、";
                  tohoSINMACanvas.kaiwa2 = "いま忙しいんだ。。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 13) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "いえいえ、お時間は";
                  tohoSINMACanvas.kaiwa2 = "取らせません。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 14 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
               tohoSINMACanvas.kaiwa1 = "この装置の代金を";
               tohoSINMACanvas.kaiwa2 = "素直に払っていただけたらの";
               tohoSINMACanvas.kaiwa3 = "話ですが！！";
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
                  tohoSINMACanvas.kaiwa1 = "あやや、負けてしまいました。";
                  tohoSINMACanvas.kaiwa2 = "仕方がないです、取材は";
                  tohoSINMACanvas.kaiwa3 = "断念します。";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "終わったかしら？";
                  tohoSINMACanvas.kaiwa2 = "それじゃ、行くわよ霊夢。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "やけに諦めがいいのが気になる";
                  tohoSINMACanvas.kaiwa2 = "けど…まあいいか。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "・・・・・。";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "ふっふっふ、これしきで";
                  tohoSINMACanvas.kaiwa2 = "諦める天狗じゃありませんよ。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "この河童式光学迷彩を装備して、";
                  tohoSINMACanvas.kaiwa2 = "背後から忍び寄る影となり…って";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
               tohoSINMACanvas.kaiwa1 = "あれ、進めない？？";
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
                  tohoSINMACanvas.kaiwa1 = "はぁ、今日は散々な目に";
                  tohoSINMACanvas.kaiwa2 = "会いました…カメラも不調に";
                  tohoSINMACanvas.kaiwa3 = "なってしまいましたし。";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "悪いな、代金はツケで頼む。";
                  tohoSINMACanvas.kaiwa2 = "さて、気を取り直して";
                  tohoSINMACanvas.kaiwa3 = "魔界へＧＯだな！";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "魔界入口なら、巫女に";
                  tohoSINMACanvas.kaiwa2 = "簡易結界を張られてしまったので";
                  tohoSINMACanvas.kaiwa3 = "しばらく入れませんよ？";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "そうなのか？でも、そこに";
                  tohoSINMACanvas.kaiwa2 = "新しい入口が開通したから、";
                  tohoSINMACanvas.kaiwa3 = "問題ないぜ。";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "なんと！";
                  tohoSINMACanvas.kaiwa2 = "それなら戦わないでおけば…";
                  tohoSINMACanvas.kaiwa3 = "ああスクープが逃げていく…";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "自業自得だぜ。";
                  tohoSINMACanvas.kaiwa2 = "さあ、いよいよ魔界だな！";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 6, 1, 0);
               tohoSINMACanvas.kaiwa1 = "ほんとに行くのね…。";
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
                  tohoSINMACanvas.kaiwa1 = "動くと撃つ！";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "間違えた。";
                  tohoSINMACanvas.kaiwa2 = "とにかく撃つだ。今すぐ撃つ。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "あんたねえ…いきなり現れて";
                  tohoSINMACanvas.kaiwa2 = "なんなのよ？。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "で、なんで貴方が魔界に";
                  tohoSINMACanvas.kaiwa2 = "いるのかしら？";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "そこに魔界があるからさ、";
                  tohoSINMACanvas.kaiwa2 = "という理由でいいか？";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "……………………。";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "……………………。";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "…魔理沙に理由を求めるのが";
                  tohoSINMACanvas.kaiwa2 = "間違っていたわ。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "…話は終わったかしら？";
                  tohoSINMACanvas.kaiwa2 = "私たちは、そろそろ失礼";
                  tohoSINMACanvas.kaiwa3 = "するわ。";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
               tohoSINMACanvas.kaiwa1 = "ちょっと待った！";
               tohoSINMACanvas.kaiwa2 = "出会ったからには";
               tohoSINMACanvas.kaiwa3 = "バトルだぜ！";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.kaiwa1 = "おやっ？霊夢がいるぜ？";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.kaiwa1 = "ようやく追いついたという";
                  tohoSINMACanvas.kaiwa2 = "わけね。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "あら？魔理沙に…パチュリー？";
                  tohoSINMACanvas.kaiwa2 = "珍しいわね。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "普段屋敷から出てこないあんたが";
                  tohoSINMACanvas.kaiwa2 = "よりにもよって魔界にいるなんて。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "いやまぁ、その。";
                  tohoSINMACanvas.kaiwa2 = "成り行きというのは恐ろしい";
                  tohoSINMACanvas.kaiwa3 = "と思っているわ。";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "なんとなく状況が分かった";
                  tohoSINMACanvas.kaiwa2 = "ような気がするわ。";
                  tohoSINMACanvas.kaiwa3 = "要するに・・・";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "魔理沙が悪いのね";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "ひどい言い草だぜ。";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "とにかくここは危険だわ。";
                  tohoSINMACanvas.kaiwa2 = "早く引き返しなさい！！";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "そうはいかないぜ。";
                  tohoSINMACanvas.kaiwa2 = "ここの魔法を私のものに";
                  tohoSINMACanvas.kaiwa3 = "するまでは、な。";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 10 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
               tohoSINMACanvas.kaiwa1 = "やる気なのね？";
               tohoSINMACanvas.kaiwa2 = "いくわよ！";
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
                  tohoSINMACanvas.kaiwa1 = "２対１は反則だぜ。";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "大丈夫、このスキマ妖怪は";
                  tohoSINMACanvas.kaiwa2 = "全然仕事してないから。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "あら、貴方の背後をしっかり";
                  tohoSINMACanvas.kaiwa2 = "守るという仕事をしていたわよ？";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "それって、私を盾にして";
                  tohoSINMACanvas.kaiwa2 = "いるだけじゃない？";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "なにのことか";
                  tohoSINMACanvas.kaiwa2 = "分からないわ？";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
               tohoSINMACanvas.kaiwa1 = "あぁ、足の引っ張り合いを。";
               tohoSINMACanvas.kaiwa2 = "している奴らに負けるとはな、";
               tohoSINMACanvas.kaiwa3 = "泣けるぜ…。";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.kaiwa1 = "さよなら霊夢、お前のことは";
                  tohoSINMACanvas.kaiwa2 = "おおよそ忘れないぜ…。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "…。";
                  tohoSINMACanvas.kaiwa2 = "そもそもなんで魔界に";
                  tohoSINMACanvas.kaiwa3 = "いるのよ？";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "魔界で新たな魔法をゲットする";
                  tohoSINMACanvas.kaiwa2 = "探求の旅だぜ。";
                  tohoSINMACanvas.kaiwa3 = "わくわく。";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "はぁ、もういろいろと疲れたから";
                  tohoSINMACanvas.kaiwa2 = "帰るわ。パチュリー、ちょっと";
                  tohoSINMACanvas.kaiwa3 = "伝言頼まれてくれる？";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "何かしら？";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "この先の神殿の主に、";
                  tohoSINMACanvas.kaiwa2 = "『 結界どうにかしろへっぽこ";
                  tohoSINMACanvas.kaiwa3 = "管理者！！";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "あと、そこの白黒魔女は";
                  tohoSINMACanvas.kaiwa2 = "泥棒だから退治しろ。』";
                  tohoSINMACanvas.kaiwa3 = "って伝えといて。";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "色々と酷い会話だぜ…。";
                  tohoSINMACanvas.kaiwa2 = "でも神殿と聞いたら";
                  tohoSINMACanvas.kaiwa3 = "行かざるを得ないぜ。";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "シーフとしての血が";
                  tohoSINMACanvas.kaiwa2 = "騒ぐのかしら？";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "失礼だな、";
                  tohoSINMACanvas.kaiwa2 = "トレジャーハンターと";
                  tohoSINMACanvas.kaiwa3 = "呼んでくれ。";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 10 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
               tohoSINMACanvas.kaiwa1 = "付き合ってられないわ…。";
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
                  tohoSINMACanvas.kaiwa1 = "待ちなさい！";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "ここから先は行かせないわ！";
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
                  tohoSINMACanvas.kaiwa1 = "あら、アリスじゃない？";
                  tohoSINMACanvas.kaiwa2 = "何であなたがここに…。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "私は魔界人よ、ここに";
                  tohoSINMACanvas.kaiwa2 = "いることがそんなに不自然";
                  tohoSINMACanvas.kaiwa3 = "かしら？";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "アリス、私たちはこの先の神殿の";
                  tohoSINMACanvas.kaiwa2 = "主に用があるの。おとなしく";
                  tohoSINMACanvas.kaiwa3 = "そこをどいてくれるかしら？。";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "私が引くと思って？。";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "どうやら素直に通して。";
                  tohoSINMACanvas.kaiwa2 = "くれそうにないようね…。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "それなら、強引にでも";
                  tohoSINMACanvas.kaiwa2 = "行かせてもらうわ！";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
               tohoSINMACanvas.kaiwa1 = "させない！";
               tohoSINMACanvas.kaiwa2 = "";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.kaiwa1 = "ちょっと！";
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
                  tohoSINMACanvas.kaiwa1 = "なんで魔理沙がここにいるのよ？";
                  tohoSINMACanvas.kaiwa2 = "それにパチュリーまで…。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "そんなアリスはなんでここ";
                  tohoSINMACanvas.kaiwa2 = "にいるんだ？";
                  tohoSINMACanvas.kaiwa3 = "あれか、里帰りか？";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "私はここで侵入者に備えて。";
                  tohoSINMACanvas.kaiwa2 = "いるのよ";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "魔理沙、完全に行動が";
                  tohoSINMACanvas.kaiwa2 = "読まれているわよ。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "何の話か分からないぜ？";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "";
                  tohoSINMACanvas.kaiwa2 = "しらばっくれても無駄よっ！";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "…とは言っても、、貴方を。";
                  tohoSINMACanvas.kaiwa2 = "待ち構えていたのではないけど。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "そうか、なら私は先に";
                  tohoSINMACanvas.kaiwa2 = "行かせてもらうぜ。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "いやいや、ここで会ったが";
                  tohoSINMACanvas.kaiwa2 = "百年目。日ごろのツケを払って";
                  tohoSINMACanvas.kaiwa3 = "もらうわ！";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 10 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
               tohoSINMACanvas.kaiwa1 = "どちらかというと魔理沙より";
               tohoSINMACanvas.kaiwa2 = "アリスに味方したい気分なん";
               tohoSINMACanvas.kaiwa3 = "だけどなぁ…";
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
                  tohoSINMACanvas.kaiwa1 = "すみません。";
                  tohoSINMACanvas.kaiwa2 = "私じゃ止められません";
                  tohoSINMACanvas.kaiwa3 = "でした…";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "この先にいるのね？";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
               tohoSINMACanvas.kaiwa1 = "昔と同じならね。";
               tohoSINMACanvas.kaiwa2 = "まあ、アリスも待ち構えてたし、";
               tohoSINMACanvas.kaiwa3 = "正解だと思うけど。";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.kaiwa1 = "さて、この先には何があるのか";
                  tohoSINMACanvas.kaiwa2 = "楽しみだな。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "そういえば貴方、誰を";
                  tohoSINMACanvas.kaiwa2 = "待ち構えていたの？。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "…博麗の巫女よ。";
                  tohoSINMACanvas.kaiwa2 = "結界消滅の異変でここにくると";
                  tohoSINMACanvas.kaiwa3 = "思っていたのだけど…。";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "よかったなアリス。霊夢なら";
                  tohoSINMACanvas.kaiwa2 = "既に私が撃退しておいたぜ。";
                  tohoSINMACanvas.kaiwa3 = "ツケは帳消しだな。";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "ええっ！それってほんとなの？";
                  tohoSINMACanvas.kaiwa2 = "…どさくさに紛れようとしてる";
                  tohoSINMACanvas.kaiwa3 = "けど、ツケは消えないわよ？";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "ちぇー。";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 5, 1, 1);
               tohoSINMACanvas.kaiwa1 = "仕方がないわね…くれぐれも";
               tohoSINMACanvas.kaiwa2 = "あの方に失礼のないように";
               tohoSINMACanvas.kaiwa3 = "お願いね。";
               tohokaiwa.effectflag = 1;
            }
         }
      } else if (dialogueId == 10) {
         if (tohoSINMACanvas.peoplebomkind % 2 == 0) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.kaiwa1 = "いるんでしょ？";
                  tohoSINMACanvas.kaiwa2 = "出てきなさい！";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.kaiwa1 = "呼びましたか？";
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
                  tohoSINMACanvas.kaiwa1 = "まったく、騒がしい方ですね。";
                  tohoSINMACanvas.kaiwa2 = "いつぞやの巫女と…幻想郷の。";
                  tohoSINMACanvas.kaiwa3 = "賢者ですか。";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "あら、私をご存知？";
                  tohoSINMACanvas.kaiwa2 = "うれしいわ。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "用件の予想はついています。";
                  tohoSINMACanvas.kaiwa2 = "きっと結界の話でしょう。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "それなら話は早いわ、";
                  tohoSINMACanvas.kaiwa2 = "さっさとどうにかしてよね！";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "お断りします。";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "なっ…！";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "どういう意味かしら？";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "幻想郷は閉じられた世界。";
                  tohoSINMACanvas.kaiwa2 = "他の世界との交流を断ち、";
                  tohoSINMACanvas.kaiwa3 = "自己完結した世界を";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 10) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "創りだそうとしている";
                  tohoSINMACanvas.kaiwa2 = "かのようだった…今";
                  tohoSINMACanvas.kaiwa3 = "までは。";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 11) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "最近、外の神々を新たに";
                  tohoSINMACanvas.kaiwa2 = "受け入れたそうですね。";
                  tohoSINMACanvas.kaiwa3 = "変化を拒むなら、幻想郷の";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 12) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "結界を管理する貴方が";
                  tohoSINMACanvas.kaiwa2 = "通すわけないでしょうに。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 13) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "〜♪";
                  tohoSINMACanvas.kaiwa2 = "さて、なんのことかしら？";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 14) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "それでは、なぜ我々魔界人は";
                  tohoSINMACanvas.kaiwa2 = "幻想郷に行ってはならないのか？";
                  tohoSINMACanvas.kaiwa3 = "もはや拒む理由は無い筈です。";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 15) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "それでも拒むというなら、";
                  tohoSINMACanvas.kaiwa2 = "力づくでかかってきなさい！";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 16) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "…よく分からないけど、これ";
                  tohoSINMACanvas.kaiwa2 = "以上住民が増えるといろいろ";
                  tohoSINMACanvas.kaiwa3 = "面倒なのよ！";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 17 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 1, -1, 1);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
               tohoSINMACanvas.kaiwa1 = "ふふ、いくわよ。";
               tohoSINMACanvas.kaiwa2 = "";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.kaiwa1 = "たのも〜";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "あら…？";
                  tohoSINMACanvas.kaiwa2 = "貴方は確かアリスの友人の…";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
                  tohokaiwa.effectNEXT = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "魔理沙だぜ。";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "その監視役のパチュリーです。";
                  tohoSINMACanvas.kaiwa2 = "貴方は魔界神様ですね。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "そうですそうです。";
                  tohoSINMACanvas.kaiwa2 = "私が魔界の神、しんき様です";
                  tohoSINMACanvas.kaiwa3 = "えっへん。";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "魔界神とか言うから、";
                  tohoSINMACanvas.kaiwa2 = "もっとキツイやつかと";
                  tohoSINMACanvas.kaiwa3 = "思ってたぜ。";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "映姫みたいな。";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "私に従うなら世界の半分を";
                  tohoSINMACanvas.kaiwa2 = "やろう…みたいな感じかしら。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "そうそう、そんなかんじ。";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "…で、いったい何のようです？";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 10) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "ああ、そうだ。";
                  tohoSINMACanvas.kaiwa2 = "えっと、博麗霊夢からの";
                  tohoSINMACanvas.kaiwa3 = "伝言なんだが、";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 11) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "『 結界どうにかしろへっぽこ";
                  tohoSINMACanvas.kaiwa2 = "管理者！！";
                  tohoSINMACanvas.kaiwa3 = "あと、そこの白黒魔女は";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 12) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "泥棒だから退治しろ。』";
                  tohoSINMACanvas.kaiwa2 = "とのことだぜ。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 13) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "………。";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 14) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "………。";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 15) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "馬鹿だわ…チルノを超えた";
                  tohoSINMACanvas.kaiwa2 = "馬鹿がここにいるわ…。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 16 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 3, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
               tohoSINMACanvas.kaiwa1 = "よし、不届き者は抹殺";
               tohoSINMACanvas.kaiwa2 = "しなくてはね！";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         }
      } else if (dialogueId == 11) {
         if (tohoSINMACanvas.peoplebomkind % 2 == 0) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.kaiwa1 = "一体私の神社に何が起こってる";
                  tohoSINMACanvas.kaiwa2 = "のよ！";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.kaiwa1 = "ふふふ…久しぶりだねぇ？霊夢";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "博麗神社の守護神、魅魔様の";
                  tohoSINMACanvas.kaiwa2 = "お帰りよ。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "ぶっ！でたっ！";
                  tohoSINMACanvas.kaiwa2 = "またややこしいのが魔界から…";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "とにかく！私の神社の御神体は";
                  tohoSINMACanvas.kaiwa2 = "あんたじゃないわよ。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "そもそも、あんたを祀って何の";
                  tohoSINMACanvas.kaiwa2 = "利益があるのよ？";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "そーねぇ、意外と御利益ある";
                  tohoSINMACanvas.kaiwa2 = "かもよ？いまどき実体の無い神様";
                  tohoSINMACanvas.kaiwa3 = "だと信仰集まらないし、";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "私が神社の守護神になれば、";
                  tohoSINMACanvas.kaiwa2 = "信仰も取り戻せると思うけどねぇ";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "あんたみたいな悪霊が憑いてる";
                  tohoSINMACanvas.kaiwa2 = "って噂がたてば、なおさら人が";
                  tohoSINMACanvas.kaiwa3 = "来なくなるのよ！";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "そもそも、この神社に参拝客が";
                  tohoSINMACanvas.kaiwa2 = "いるのかい？";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 10) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "ぐっ…とにかく、あんたには";
                  tohoSINMACanvas.kaiwa2 = "出て行ってもらうわ。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 11) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "そうかい。ということは、";
                  tohoSINMACanvas.kaiwa2 = "肉体言語で説得するしかない";
                  tohoSINMACanvas.kaiwa3 = "ようだねぇ？";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 12) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "あんたに肉体なんてないじゃない";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 13 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
               tohoSINMACanvas.kaiwa1 = "いや、まぁ、その。";
               tohoSINMACanvas.kaiwa2 = "";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.kaiwa1 = "ん？なんか神社がいつもと違うぜ";
                  tohoSINMACanvas.kaiwa2 = "超特急で帰ってきたから、まだ";
                  tohoSINMACanvas.kaiwa3 = "霊夢も起きてる筈なんだが…。";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.kaiwa1 = "ほう、しばらく見ないうちに";
                  tohoSINMACanvas.kaiwa2 = "ずいぶんと成長しているようじゃ";
                  tohoSINMACanvas.kaiwa3 = "ないか。";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.kaiwa1 = "そ、その声は！";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "久しぶりだねぇ、魔理沙。";
                  tohoSINMACanvas.kaiwa2 = "元気にしていたかい？";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
                  tohokaiwa.effectNEXT = 1;
               }
            } else if (speechId == 4) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "魅魔師匠じゃないか！";
                  tohoSINMACanvas.kaiwa2 = "一体今まで何してたんだぜ？";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 5) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "ふふ、秘密だ。まぁ、今はここの";
                  tohoSINMACanvas.kaiwa2 = "守護神をしているけどな。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 6) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "？？？";
                  tohoSINMACanvas.kaiwa2 = "…どういうことなんだ？";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 7) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "さっき霊夢を説得したんだ。";
                  tohoSINMACanvas.kaiwa2 = "まあ、当然の結果だな。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 8) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "さすがは師匠！しびれるぜ！";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 9) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "さて、話も終わったし、師匠が";
                  tohoSINMACanvas.kaiwa2 = "弟子にすることは一つだな。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 10) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "望むところだ。私の成長を";
                  tohoSINMACanvas.kaiwa2 = "見せつけてあげるぜ！";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 11 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
               tohoSINMACanvas.kaiwa1 = "さあ、始めようではないか！";
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
                  tohoSINMACanvas.kaiwa1 = "久しぶりで腕が鈍ったかねぇ？";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "はいはい、言い訳はいいから";
                  tohoSINMACanvas.kaiwa2 = "さっさと出て行ってくれる？";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "仕方ないねぇ、愛弟子の様子でも";
                  tohoSINMACanvas.kaiwa2 = "見に行くことにするわ。";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
               tohoSINMACanvas.kaiwa1 = "もう来ないでね〜。";
               tohoSINMACanvas.kaiwa2 = "";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "やった、師匠に勝ったぜ！";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "まさか、これほどとは…。";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "うふふふふ。";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "よくぞ私を破った！これで君も";
                  tohoSINMACanvas.kaiwa2 = "博麗神社の守護神だ！";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
               tohoSINMACanvas.kaiwa1 = "いつのまにやら";
               tohoSINMACanvas.kaiwa2 = "神になっちゃったぜ？";
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
                  tohoSINMACanvas.kaiwa1 = "おどろけ〜";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
                  tohokaiwa.effectNEXT = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "…。";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "無視するな〜！";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 3) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "…邪魔。";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 4 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 0, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 7, 1, 1);
               tohoSINMACanvas.kaiwa1 = "…こ、怖くなんてないんだから！";
               tohoSINMACanvas.kaiwa2 = "";
               tohoSINMACanvas.kaiwa3 = "";
               tohokaiwa.effectflag = 1;
            }
         } else if (tohoSINMACanvas.peoplebomkind % 2 == 1) {
            if (speechId == 0) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 1);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 0);
                  tohoSINMACanvas.kaiwa1 = "よう、調子はどうだ？";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectNEXT = 1;
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 1) {
               if (tohokaiwa.effectflag == 0) {
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
                  tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
                  tohoSINMACanvas.kaiwa1 = "絶好調よ！今日は大収穫だったわ";
                  tohoSINMACanvas.kaiwa2 = "";
                  tohoSINMACanvas.kaiwa3 = "";
                  tohokaiwa.effectflag = 1;
               }
            } else if (speechId == 2 && tohokaiwa.effectflag == 0) {
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 2, -1, 0);
               tohoSINMACanvas.effectIn(1000.0F, 0.0F, 11, 8, 1, 1);
               tohoSINMACanvas.kaiwa1 = "という訳で…ついでにあなたも";
               tohoSINMACanvas.kaiwa2 = "おどろけ〜！";
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
