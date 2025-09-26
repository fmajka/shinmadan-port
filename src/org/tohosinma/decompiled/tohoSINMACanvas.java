package org.tohosinma.decompiled;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Random;
import javax.microedition.io.Connector;

import com.nttdocomo.ui.AudioPresenter;
import com.nttdocomo.ui.Canvas;
import com.nttdocomo.ui.Font;
import com.nttdocomo.ui.Graphics;
import com.nttdocomo.ui.IApplication;
import com.nttdocomo.ui.Image;
import com.nttdocomo.ui.MediaImage;
import com.nttdocomo.ui.MediaListener;
import com.nttdocomo.ui.MediaManager;
import com.nttdocomo.ui.MediaPresenter;
import com.nttdocomo.ui.MediaSound;
import com.nttdocomo.ui.PhoneSystem;
import com.nttdocomo.ui.util3d.FastMath;

public class tohoSINMACanvas extends Canvas implements MediaListener {
   static int saiflag;
   int byougamode;
   int keisan = 36;
   int byougatime;
   int volume;
   int sevolume;
   AudioPresenter player;
   AudioPresenter[] seplayer = new AudioPresenter[10];
   // ImageEncode ec = new ImageEncode();
   static final int S_PLAY = 0;
   static final int S_GAMEOVER = 1;
   int scene = 0;
   int init = 0;
   int keyEvent = -999;
   int[] stageopen = new int[7];
   int[] stageopenH = new int[7];
   int titlekara = 0;
   int shotkey;
   int speedkey;
   int bomkey = 4;
   float Fps;
   int FpsTime_i = 0;
   int[] FpsTime = new int[2];
   float[] sin = new float[3600];
   float[] cos = new float[3600];
   int qx = 0;
   int qy = 0;
   int stagetime = 0;
   int stagetime2 = 0;
   int stagemen = 0;
   int stagelevel = 0;
   int titleflag;
   int konnte;
   int edflag;
   int stagepractice;
   float stageY = 0.0F;
   float stageXmove = 0.0F;
   float stageYmove = 0.0F;
   int musictop = 0;
   int musicnum = 0;
   int playmusic = 0;
   int migi = 190;
   int keyState = 0;
   Graphics g = this.getGraphics();
   Random rand = new Random();
   Image[] image = new Image[30];
   Image[] bgimg = new Image[4];
   Image[] flameimg = new Image[5];
   Image[] eimg = new Image[10];
   Image[] standimg = new Image[10];
   Image[] titleimg = new Image[20];
   Image[] LoadingImg = new Image[2];
   int aa;
   int cyc;
   int cyc2;
   int peoplescore;
   int peopledenpaflag;
   int peoplezannki;
   int peoplemuteki;
   int power_view;
   int peopleX;
   int peopleY;
   int peoplemove;
   int peoplenonshot;
   int peoplepoint;
   public static int peoplebomkind;
   int magic;
   int peopleslow;
   int peoplepower;
   int peoplehosi;
   int peoplekasuri;
   int peopleshotting;
   int[] peoplehighscore = new int[4];
   int[] peoplehighscore1 = new int[4];
   int[] peoplehighscore2 = new int[4];
   int[] peoplehighscore3 = new int[4];
   int e_max = 70;
   int e_see_max = 5;
   int[] emode = new int[this.e_max];
   float[] eX = new float[this.e_max];
   float[] eY = new float[this.e_max];
   float[] eXmove = new float[this.e_max];
   float[] eYmove = new float[this.e_max];
   int[] etime = new int[this.e_max];
   int[] emuteki = new int[this.e_max];
   int[] esuruu = new int[this.e_max];
   int[] eholdnumber = new int[this.e_max];
   int[] eholdnumber2 = new int[this.e_max];
   int[] eholdnumber3 = new int[this.e_max];
   float[] ehnum = new float[this.e_max];
   int[] emuki = new int[this.e_max];
   int[] eitem = new int[this.e_max];
   float[] etairyoku = new float[this.e_max];
   int[] edoing = new int[this.e_max];
   int[] eboss = new int[this.e_max];
   int[] eshape = new int[this.e_max];
   int[] eeffected = new int[this.e_max];
   float danmakukaku;
   int tm_max = 10;
   int[] tmmode = new int[this.tm_max];
   int[] tmiro = new int[this.tm_max];
   float[] tmX = new float[this.tm_max];
   float[] tmY = new float[this.tm_max];
   int tama_max = 600;
   int tama_see_max;
   int[] tamamode = new int[this.tama_max];
   int[] tamakasuri = new int[this.tama_max];
   int[] tamatime = new int[this.tama_max];
   float[] tamaX = new float[this.tama_max];
   float[] tamaY = new float[this.tama_max];
   float[] tamaspeed = new float[this.tama_max];
   float[] tamakakudo = new float[this.tama_max];
   float[] tamarange = new float[this.tama_max];
   float[] tamaXmove = new float[this.tama_max];
   float[] tamaYmove = new float[this.tama_max];
   int[] tamaholdnumber0 = new int[this.tama_max];
   int[] tamaholdnumber1 = new int[this.tama_max];
   int[] tamaholdnumber2 = new int[this.tama_max];
   int[] tamaholdnumber3 = new int[this.tama_max];
   int[] tamairo = new int[this.tama_max];
   int[] tamapicnum = new int[this.tama_max];
   int[] tamashape = new int[this.tama_max];
   int[] tamaatari = new int[this.tama_max];
   int[] tamakesuna = new int[this.tama_max];
   int[] tamaseehit = new int[this.tama_max];
   float kyori;
   static int effect_max = 800;
   static int effect_see_max = 5;
   static int[] effectmode = new int[effect_max];
   static int[] effecttime = new int[effect_max];
   static float[] effectX = new float[effect_max];
   static float[] effectY = new float[effect_max];
   static float[] effectspeed = new float[effect_max];
   static float[] effectkakudo = new float[effect_max];
   static float[] effectXmove = new float[effect_max];
   static float[] effectYmove = new float[effect_max];
   static int[] effectholdnumber0 = new int[effect_max];
   static int[] effectholdnumber1 = new int[effect_max];
   static int[] effectholdnumber2 = new int[effect_max];
   static String kaiwaname;
   public static String kaiwa1 = "";
   public static String kaiwa2 = "";
   public static String kaiwa3 = "";
   int bullet_max = 60;
   int[] bulletmode = new int[this.bullet_max];
   int[] bullettime = new int[this.bullet_max];
   int[] bulletkille = new int[this.bullet_max];
   int[] bulletseehit = new int[this.bullet_max];
   float[] bulletX = new float[this.bullet_max];
   float[] bulletY = new float[this.bullet_max];
   float[] bulletspeed = new float[this.bullet_max];
   float[] bulletkakudo = new float[this.bullet_max];
   float[] bulletXmove = new float[this.bullet_max];
   float[] bulletYmove = new float[this.bullet_max];
   int[] omballX = new int[4];
   int[] omballY = new int[4];
   int[] omballkakudo = new int[4];
   int[] omballkyori = new int[4];
   int[] omballkyori_k = new int[4];
   float bosstairyoku;
   float bosstairyoku_k;
   int bossnum;
   int bossmahoujinn;
   int bossmode;
   int bossspel;
   int bosshosi;
   int bosshide;
   String spelname;
   String bossname;
   int bosstimelim;
   int spelbonus;
   int haneflag;
   int bossnokori;
   int laser_max = 100;
   int[] lasermode = new int[this.laser_max];
   int[] lasertime = new int[this.laser_max];
   int[] laserendtime = new int[this.laser_max];
   float[] laserX = new float[this.laser_max];
   float[] laserY = new float[this.laser_max];
   float[] laserXmove = new float[this.laser_max];
   float[] laserYmove = new float[this.laser_max];
   float[] laserspeed = new float[this.laser_max];
   float[] laserkakudo = new float[this.laser_max];
   float[] laserholdnumber0 = new float[this.laser_max];
   float[] laserholdnumber1 = new float[this.laser_max];
   float[] laserholdnumber2 = new float[this.laser_max];
   float[] laserholdnumber3 = new float[this.laser_max];
   float[] laserhaba = new float[this.laser_max];
   float[] laserhaba_k = new float[this.laser_max];
   float[] laserdrawholdnumber0 = new float[this.laser_max];
   float[] laserdrawholdnumber1 = new float[this.laser_max];
   float[] laserdrawholdnumber2 = new float[this.laser_max];
   float[] laserdrawholdnumber3 = new float[this.laser_max];
   float[] lasernagasa = new float[this.laser_max];
   float[] laserhabaspeed = new float[this.laser_max];
   int[] drawX = new int[8];
   int[] drawY = new int[8];
   int item_max = 600;
   int item_see_max;
   float[] itemX = new float[this.item_max];
   float[] itemY = new float[this.item_max];
   float[] itemXmove = new float[this.item_max];
   float[] itemYmove = new float[this.item_max];
   int[] itemmode = new int[this.item_max];
   int[] itemtime = new int[this.item_max];
   int[] itemkaishuu = new int[this.item_max];
   int bom_max = 20;
   float[] bomX = new float[this.bom_max];
   float[] bomY = new float[this.bom_max];
   float[] bomXmove = new float[this.bom_max];
   float[] bomYmove = new float[this.bom_max];
   int[] bommode = new int[this.bom_max];
   int[] bomtime = new int[this.bom_max];
   int[] bomiro = new int[this.bom_max];
   int[] bomseehit = new int[this.bom_max];
   float[] bomkakudo = new float[this.bom_max];
   float[] bomholdnumber0 = new float[this.bom_max];
   float[] bomholdnumber1 = new float[this.bom_max];
   float[] bomholdnumber2 = new float[this.bom_max];
   float[] bomhaba = new float[this.bom_max];
   float[] bomspeed = new float[this.bom_max];
   int titlemode;
   int gamemode;

   public void mediaAction(MediaPresenter var1, int var2, int var3) {
      if (var1 == this.player && var2 == 3) {
         this.player.play();
      }
   }

   void sh(float var1, float var2, int var3, float var4, float var5, int var6, int var7, int var8, int var9, int var10) {
      int var11;
      for (var11 = 0; var11 < this.tama_see_max; var11++) {
         if (this.tamamode[var11] == 0) {
            this.tamatime[var11] = 0;
            this.tamamode[var11] = var3;
            this.tamaX[var11] = var1;
            this.tamaY[var11] = var2;
            this.tamaXmove[var11] = 0.0F;
            this.tamaYmove[var11] = 0.0F;
            this.tamaspeed[var11] = var4;
            this.tamakakudo[var11] = var5;
            this.tamashape[var11] = var9;
            this.tamaholdnumber0[var11] = var6;
            this.tamaholdnumber1[var11] = var7;
            this.tamaholdnumber2[var11] = var8;
            this.tamakasuri[var11] = 0;
            this.tamairo[var11] = var10;
            this.tamaatari[var11] = 5;
            this.tamakesuna[var11] = 0;
            if (this.tamashape[var11] == 0) {
               this.tamaatari[var11] = 2;
            }

            if (this.tamashape[var11] == 1) {
               this.tamaatari[var11] = 2;
            }

            if (this.tamashape[var11] == 2) {
               this.tamaatari[var11] = 3;
            }

            if (this.tamashape[var11] == 3) {
               this.tamaatari[var11] = 3;
            }

            if (this.tamashape[var11] == 4) {
               this.tamaatari[var11] = 5;
            }

            if (this.tamashape[var11] == 5) {
               this.tamaatari[var11] = 7;
            }

            if (this.tamashape[var11] == 6) {
               this.tamaatari[var11] = 11;
            }

            if (this.tamashape[var11] == 7) {
               this.tamaatari[var11] = 11;
            }

            if (this.tamashape[var11] == 8) {
               this.tamaatari[var11] = 3;
            }

            if (this.tamashape[var11] == 13) {
               this.tamaatari[var11] = 5;
            }

            if (this.tamashape[var11] == 9) {
               this.tamaatari[var11] = 1;
               this.tamakesuna[var11] = 1;
            }

            if (this.tamashape[var11] == 10) {
               this.tamaatari[var11] = 1;
               this.tamakesuna[var11] = 1;
            }

            if (this.tamashape[var11] == 12) {
               this.tamaatari[var11] = 15;
            }

            var11 = -999;
            break;
         }
      }

      if (var11 != -999) {
         for (int var12 = this.tama_see_max; var12 < this.tama_max; var12++) {
            if (this.tamamode[var12] == 0) {
               this.tamatime[var12] = 0;
               this.tamamode[var12] = var3;
               this.tamaX[var12] = var1;
               this.tamaY[var12] = var2;
               this.tamaXmove[var12] = 0.0F;
               this.tamaYmove[var12] = 0.0F;
               this.tamaspeed[var12] = var4;
               this.tamakakudo[var12] = var5;
               this.tamashape[var12] = var9;
               this.tamaholdnumber0[var12] = var6;
               this.tamaholdnumber1[var12] = var7;
               this.tamaholdnumber2[var12] = var8;
               this.tamakasuri[var12] = 0;
               this.tamairo[var12] = var10;
               this.tamaatari[var12] = 5;
               this.tamakesuna[var12] = 0;
               if (this.tamashape[var12] == 0) {
                  this.tamaatari[var12] = 2;
               }

               if (this.tamashape[var12] == 1) {
                  this.tamaatari[var12] = 2;
               }

               if (this.tamashape[var12] == 2) {
                  this.tamaatari[var12] = 3;
               }

               if (this.tamashape[var12] == 3) {
                  this.tamaatari[var12] = 3;
               }

               if (this.tamashape[var12] == 4) {
                  this.tamaatari[var12] = 5;
               }

               if (this.tamashape[var12] == 5) {
                  this.tamaatari[var12] = 7;
               }

               if (this.tamashape[var12] == 6) {
                  this.tamaatari[var12] = 11;
               }

               if (this.tamashape[var12] == 7) {
                  this.tamaatari[var12] = 11;
               }

               if (this.tamashape[var12] == 8) {
                  this.tamaatari[var12] = 3;
               }

               if (this.tamashape[var12] == 13) {
                  this.tamaatari[var12] = 5;
               }

               if (this.tamashape[var12] == 9) {
                  this.tamaatari[var12] = 1;
                  this.tamakesuna[var12] = 1;
               }

               if (this.tamashape[var12] == 10) {
                  this.tamaatari[var12] = 1;
                  this.tamakesuna[var12] = 1;
               }

               if (this.tamashape[var12] == 12) {
                  this.tamaatari[var12] = 15;
               }

               this.tama_see_max = var12 + 1;
               break;
            }
         }
      }
   }

   void sh(float var1, float var2, float var3, int var4, float var5, float var6, int var7, int var8, int var9, int var10, int var11) {
      int var12;
      for (var12 = 0; var12 < this.tama_see_max; var12++) {
         if (this.tamamode[var12] == 0) {
            this.tamatime[var12] = 0;
            this.tamamode[var12] = var4;
            this.tamaX[var12] = var2 + var1 * this.cos[(int)((var6 * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaY[var12] = var3 + var1 * this.sin[(int)((var6 * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaXmove[var12] = 0.0F;
            this.tamaYmove[var12] = 0.0F;
            this.tamaspeed[var12] = var5;
            this.tamakakudo[var12] = var6;
            this.tamashape[var12] = var10;
            this.tamaholdnumber0[var12] = var7;
            this.tamaholdnumber1[var12] = var8;
            this.tamaholdnumber2[var12] = var9;
            this.tamakasuri[var12] = 0;
            this.tamairo[var12] = var11;
            this.tamaatari[var12] = 5;
            this.tamakesuna[var12] = 0;
            if (this.tamashape[var12] == 0) {
               this.tamaatari[var12] = 2;
            }

            if (this.tamashape[var12] == 1) {
               this.tamaatari[var12] = 2;
            }

            if (this.tamashape[var12] == 2) {
               this.tamaatari[var12] = 3;
            }

            if (this.tamashape[var12] == 3) {
               this.tamaatari[var12] = 3;
            }

            if (this.tamashape[var12] == 4) {
               this.tamaatari[var12] = 5;
            }

            if (this.tamashape[var12] == 5) {
               this.tamaatari[var12] = 7;
            }

            if (this.tamashape[var12] == 6) {
               this.tamaatari[var12] = 11;
            }

            if (this.tamashape[var12] == 7) {
               this.tamaatari[var12] = 11;
            }

            if (this.tamashape[var12] == 8) {
               this.tamaatari[var12] = 3;
            }

            if (this.tamashape[var12] == 9) {
               this.tamaatari[var12] = 1;
               this.tamakesuna[var12] = 1;
            }

            if (this.tamashape[var12] == 10) {
               this.tamaatari[var12] = 1;
               this.tamakesuna[var12] = 1;
            }

            if (this.tamashape[var12] == 12) {
               this.tamaatari[var12] = 15;
            }

            var12 = -999;
            break;
         }
      }

      if (var12 != -999) {
         for (int var13 = this.tama_see_max; var13 < this.tama_max; var13++) {
            if (this.tamamode[var13] == 0) {
               this.tamatime[var13] = 0;
               this.tamamode[var13] = var4;
               this.tamaX[var13] = var2 + var1 * this.cos[(int)((var6 * 10.0F + 3.6E7F) % 3600.0F)];
               this.tamaY[var13] = var3 + var1 * this.sin[(int)((var6 * 10.0F + 3.6E7F) % 3600.0F)];
               this.tamaXmove[var13] = 0.0F;
               this.tamaYmove[var13] = 0.0F;
               this.tamaspeed[var13] = var5;
               this.tamakakudo[var13] = var6;
               this.tamashape[var13] = var10;
               this.tamaholdnumber0[var13] = var7;
               this.tamaholdnumber1[var13] = var8;
               this.tamaholdnumber2[var13] = var9;
               this.tamakasuri[var13] = 0;
               this.tamairo[var13] = var11;
               this.tamaatari[var13] = 5;
               this.tamakesuna[var13] = 0;
               if (this.tamashape[var13] == 0) {
                  this.tamaatari[var13] = 2;
               }

               if (this.tamashape[var13] == 1) {
                  this.tamaatari[var13] = 2;
               }

               if (this.tamashape[var13] == 2) {
                  this.tamaatari[var13] = 3;
               }

               if (this.tamashape[var13] == 3) {
                  this.tamaatari[var13] = 3;
               }

               if (this.tamashape[var13] == 4) {
                  this.tamaatari[var13] = 5;
               }

               if (this.tamashape[var13] == 5) {
                  this.tamaatari[var13] = 7;
               }

               if (this.tamashape[var13] == 6) {
                  this.tamaatari[var13] = 11;
               }

               if (this.tamashape[var13] == 7) {
                  this.tamaatari[var13] = 11;
               }

               if (this.tamashape[var13] == 8) {
                  this.tamaatari[var13] = 3;
               }

               if (this.tamashape[var13] == 9) {
                  this.tamaatari[var13] = 1;
                  this.tamakesuna[var13] = 1;
               }

               if (this.tamashape[var13] == 10) {
                  this.tamaatari[var13] = 1;
                  this.tamakesuna[var13] = 1;
               }

               if (this.tamashape[var13] == 12) {
                  this.tamaatari[var13] = 15;
               }

               this.tama_see_max = var13 + 1;
               break;
            }
         }
      }
   }

   void bomIn(float var1, float var2, int var3, float var4, int var5, int var6, int var7, int var8) {
      for (int var9 = 0; var9 < this.bom_max; var9++) {
         if (this.bommode[var9] == 0) {
            this.bomtime[var9] = 0;
            this.bommode[var9] = var3;
            this.bomX[var9] = var1;
            this.bomY[var9] = var2;
            this.bomXmove[var9] = 0.0F;
            this.bomYmove[var9] = 0.0F;
            this.bomseehit[var9] = 0;
            this.bomkakudo[var9] = var4;
            this.bomholdnumber0[var9] = var5;
            this.bomholdnumber1[var9] = var6;
            this.bomholdnumber2[var9] = var7;
            this.bomiro[var9] = var8;
            this.bomhaba[var9] = 1.0F;
            break;
         }
      }
   }

   void bulletIn(int var1, int var2, int var3, int var4) {
      for (int var5 = 0; var5 < this.bullet_max; var5++) {
         if (this.bulletmode[var5] == 0) {
            this.bullettime[var5] = 0;
            this.bulletmode[var5] = var3;
            this.bulletX[var5] = var1;
            this.bulletY[var5] = var2;
            this.bulletseehit[var5] = 0;
            this.bulletkille[var5] = 0;
            this.bulletkakudo[var5] = var4;
            if (var3 == 1) {
               this.bulletXmove[var5] = 0.0F;
               this.bulletYmove[var5] = -10.0F;
            }

            if (var3 == 2) {
               this.bulletXmove[var5] = 0.0F;
               this.bulletYmove[var5] = -15.0F;
            }

            if (var3 == 3) {
               this.bulletXmove[var5] = 0.0F;
               this.bulletYmove[var5] = -15.0F;
            }

            if (var3 == 4) {
               this.bulletXmove[var5] = 0.0F;
               this.bulletYmove[var5] = -12.0F;
            }
            break;
         }
      }
   }

   void eIn(int var1, int var2, int var3, int var4, int var5) {
      int var6;
      for (var6 = 0; var6 < this.e_max; var6++) {
         if (this.emode[var6] == 0) {
            this.etime[var6] = 0;
            this.emode[var6] = var3;
            this.eX[var6] = var1;
            this.eY[var6] = var2;
            this.eXmove[var6] = 0.0F;
            this.eYmove[var6] = 0.0F;
            this.emuki[var6] = var4;
            this.eitem[var6] = var5;
            this.eholdnumber[var6] = 0;
            this.eholdnumber2[var6] = 0;
            this.eholdnumber3[var6] = 0;
            this.eboss[var6] = 0;
            this.edoing[var6] = 0;
            this.emuteki[var6] = 0;
            this.esuruu[var6] = 0;
            this.eshape[var6] = 0;
            var6 = -999;
            break;
         }
      }

      if (var6 != -999) {
         for (int var7 = this.e_see_max; var7 < this.e_max; var7++) {
            if (this.emode[var7] == 0) {
               this.etime[var7] = 0;
               this.emode[var7] = var3;
               this.eX[var7] = var1;
               this.eY[var7] = var2;
               this.eXmove[var7] = 0.0F;
               this.eYmove[var7] = 0.0F;
               this.emuki[var7] = var4;
               this.eitem[var7] = var5;
               this.eholdnumber[var7] = 0;
               this.eholdnumber2[var7] = 0;
               this.eholdnumber3[var7] = 0;
               this.eboss[var7] = 0;
               this.edoing[var7] = 0;
               this.emuteki[var7] = 0;
               this.esuruu[var7] = 0;
               this.eshape[var7] = 0;
               this.e_see_max = var7 + 1;
               break;
            }
         }
      }
   }

   public static void effectIn(float var0, float var1, int var2, int var3, int var4, int var5) {
      int var6;
      for (var6 = 0; var6 < effect_see_max; var6++) {
         if (effectmode[var6] == 0) {
            effecttime[var6] = 0;
            effectmode[var6] = var2;
            effectX[var6] = var0;
            effectY[var6] = var1;
            effectXmove[var6] = 0.0F;
            effectYmove[var6] = 0.0F;
            effectholdnumber0[var6] = var3;
            effectholdnumber1[var6] = var4;
            effectholdnumber2[var6] = var5;
            var6 = -999;
            break;
         }
      }

      if (var6 != -999) {
         for (int var7 = effect_see_max; var7 < effect_max; var7++) {
            if (effectmode[var7] == 0) {
               effecttime[var7] = 0;
               effectmode[var7] = var2;
               effectX[var7] = var0;
               effectY[var7] = var1;
               effectXmove[var7] = 0.0F;
               effectYmove[var7] = 0.0F;
               effectholdnumber0[var7] = var3;
               effectholdnumber1[var7] = var4;
               effectholdnumber2[var7] = var5;
               effect_see_max = var7 + 1;
               break;
            }
         }
      }
   }

   void laserIn(float var1, float var2, int var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      for (int var11 = 0; var11 < this.laser_max; var11++) {
         if (this.lasermode[var11] == 0) {
            this.lasernagasa[var11] = 0.0F;
            this.lasertime[var11] = 0;
            this.lasermode[var11] = var3;
            this.laserX[var11] = var1;
            this.laserY[var11] = var2;
            this.laserXmove[var11] = 0.0F;
            this.laserYmove[var11] = 0.0F;
            this.laserspeed[var11] = var4;
            this.laserkakudo[var11] = var5;
            this.laserhaba_k[var11] = var6;
            this.laserendtime[var11] = var7;
            this.laserholdnumber0[var11] = var8;
            this.laserholdnumber1[var11] = var9;
            this.laserholdnumber2[var11] = var10;
            break;
         }
      }
   }

   void itemIn(float var1, float var2, int var3, int var4) {
      int var5;
      for (var5 = 0; var5 < this.item_see_max; var5++) {
         if (this.itemmode[var5] == 0) {
            this.itemtime[var5] = 0;
            this.itemmode[var5] = var3;
            this.itemX[var5] = var1;
            this.itemY[var5] = var2;
            this.itemXmove[var5] = 0.0F;
            this.itemYmove[var5] = -4.0F;
            if (var3 == 22) {
               this.itemYmove[var5] = -7.0F;
            }

            this.itemkaishuu[var5] = var4;
            var5 = -999;
            break;
         }
      }

      if (var5 != -999) {
         for (int var6 = this.item_see_max; var6 < this.item_max; var6++) {
            if (this.itemmode[var6] == 0) {
               this.itemtime[var6] = 0;
               this.itemmode[var6] = var3;
               this.itemX[var6] = var1;
               this.itemY[var6] = var2;
               this.itemXmove[var6] = 0.0F;
               this.itemYmove[var6] = -4.0F;
               if (var3 == 22) {
                  this.itemYmove[var6] = -7.0F;
               }

               this.itemkaishuu[var6] = var4;
               this.item_see_max = var6 + 1;
               break;
            }
         }
      }
   }

   void tama_seedown() {
      for (this.cyc = this.tama_max - 1; this.cyc > 1; this.cyc--) {
         if (this.tamamode[this.cyc] != 0) {
            this.tama_see_max = this.cyc + 1;
            break;
         }
      }
   }

   void e_seedown() {
      for (this.cyc = this.e_max - 1; this.cyc > 1; this.cyc--) {
         if (this.emode[this.cyc] != 0) {
            this.e_see_max = this.cyc + 1;
            break;
         }
      }
   }

   void effect_seedown() {
      for (this.cyc = effect_max - 1; this.cyc > 1; this.cyc--) {
         if (effectmode[this.cyc] != 0) {
            effect_see_max = this.cyc + 1;
            break;
         }
      }
   }

   void item_seedown() {
      for (this.cyc = this.item_max - 1; this.cyc > 1; this.cyc--) {
         if (this.itemmode[this.cyc] != 0) {
            this.item_see_max = this.cyc + 1;
            break;
         }
      }
   }

   void getPICNUM(int var1) {
      this.tamarange[var1] = (this.tamarange[var1] + 720000.0F + 9.0F) % 360.0F;
      if (this.tamarange[var1] < 180.0F) {
         this.tamapicnum[var1] = (int)(this.tamarange[var1] / 18.0F);
      } else {
         this.tamapicnum[var1] = 21 - (int)((this.tamarange[var1] - 180.0F) / 18.0F);
      }
   }

   void makecolor(int var1) {
      if (this.laserholdnumber2[var1] == 0.0F) {
         this.g.setColor(Graphics.getColorOfRGB(236, 252, 236));
      }

      if (this.laserholdnumber2[var1] == 1.0F) {
         this.g.setColor(Graphics.getColorOfRGB(206, 236, 255));
      }

      if (this.laserholdnumber2[var1] == 2.0F) {
         this.g.setColor(Graphics.getColorOfRGB(255, 0, 0));
      }

      if (this.laserholdnumber2[var1] == 3.0F) {
         this.g.setColor(Graphics.getColorOfRGB(255, 255, 235));
      }

      if (this.laserholdnumber2[var1] == 4.0F) {
         this.g.setColor(Graphics.getColorOfRGB(255, 235, 255));
      }

      if (this.laserholdnumber2[var1] == 5.0F) {
         this.g.setColor(Graphics.getColorOfRGB(230, 255, 255));
      }
   }

   void makecolor2(int var1) {
      if (this.laserholdnumber2[var1] == 0.0F) {
         this.g.setColor(Graphics.getColorOfRGB(0, 255, 0));
      }

      if (this.laserholdnumber2[var1] == 1.0F) {
         this.g.setColor(Graphics.getColorOfRGB(0, 0, 255));
      }

      if (this.laserholdnumber2[var1] == 2.0F) {
         this.g.setColor(Graphics.getColorOfRGB(255, 0, 0));
      }

      if (this.laserholdnumber2[var1] == 3.0F) {
         this.g.setColor(Graphics.getColorOfRGB(255, 255, 0));
      }

      if (this.laserholdnumber2[var1] == 4.0F) {
         this.g.setColor(Graphics.getColorOfRGB(220, 20, 255));
      }

      if (this.laserholdnumber2[var1] == 5.0F) {
         this.g.setColor(Graphics.getColorOfRGB(100, 255, 255));
      }
   }

   void see_hit_laser(int var1) {
      float var2 = this.peopleX;
      float var3 = this.peopleY;
      var2 -= this.laserX[var1];
      var3 -= this.laserY[var1];
      float var4 = 360.0F - this.laserkakudo[var1];
      float var5 = var2 * this.cos[(int)((var4 * 10.0F + 3.6E7F) % 3600.0F)] - var3 * this.sin[(int)((var4 * 10.0F + 3.6E7F) % 3600.0F)];
      float var6 = var2 * this.sin[(int)((var4 * 10.0F + 3.6E7F) % 3600.0F)] + var3 * this.cos[(int)((var4 * 10.0F + 3.6E7F) % 3600.0F)];
      if (Math.abs(var6) < this.laserhaba[var1] - 1.0F && var5 > 0.0F && var5 < this.lasernagasa[var1] && this.peoplemuteki == 0) {
         effectIn(this.peopleX, this.peopleY, 14, 0, 0, 0);
         this.peoplemuteki = 1;
      }

      if (Math.abs(var6) < this.laserhaba[var1] + 4.0F && var5 > 0.0F && var5 < this.lasernagasa[var1]) {
         effectIn(this.peopleX, this.peopleY, 24, 0, 0, 0);
         if (this.peoplekasuri < 100000) {
            this.peoplekasuri++;
         }

         this.peoplepoint++;
      }
   }

   void getemove(int var1, int var2, int var3) {
      float var4 = (this.rand.nextInt() >>> 1) % 60 - 30;
      if (this.peopleX < this.eX[var1]) {
         var4 += 180.0F;
      }

      if (this.eX[var1] + var3 * var2 * Math.cos(var4 * 3.1415 / 180.0) < 10.0
         || this.eX[var1] + var3 * var2 * Math.cos(var4 * 3.1415 / 180.0) > 190.0
         || this.eY[var1] + var3 * var2 * Math.sin(var4 * 3.1415 / 180.0) < 10.0
         || this.eY[var1] + var3 * var2 * Math.sin(var4 * 3.1415 / 180.0) > 100.0) {
         var4 += 90.0F;
         if (this.eX[var1] + var3 * var2 * Math.cos(var4 * 3.1415 / 180.0) < 10.0
            || this.eX[var1] + var3 * var2 * Math.cos(var4 * 3.1415 / 180.0) > 190.0
            || this.eY[var1] + var3 * var2 * Math.sin(var4 * 3.1415 / 180.0) < 10.0
            || this.eY[var1] + var3 * var2 * Math.sin(var4 * 3.1415 / 180.0) > 100.0) {
            var4 += 90.0F;
            if (this.eX[var1] + var3 * var2 * Math.cos(var4 * 3.1415 / 180.0) < 10.0
               || this.eX[var1] + var3 * var2 * Math.cos(var4 * 3.1415 / 180.0) > 190.0
               || this.eY[var1] + var3 * var2 * Math.sin(var4 * 3.1415 / 180.0) < 10.0
               || this.eY[var1] + var3 * var2 * Math.sin(var4 * 3.1415 / 180.0) > 100.0) {
               var4 += 90.0F;
               if (this.eX[var1] + var3 * var2 * Math.cos(var4 * 3.1415 / 180.0) < 10.0
                  || this.eX[var1] + var3 * var2 * Math.cos(var4 * 3.1415 / 180.0) > 190.0
                  || this.eY[var1] + var3 * var2 * Math.sin(var4 * 3.1415 / 180.0) < 10.0
                  || this.eY[var1] + var3 * var2 * Math.sin(var4 * 3.1415 / 180.0) > 100.0) {
                  var3 = 0;
               }
            }
         }
      }

      this.eXmove[var1] = (float)(var3 * Math.cos(var4 * 3.1415 / 180.0));
      this.eYmove[var1] = (float)(var3 * Math.sin(var4 * 3.1415 / 180.0));
   }

   void getemove2(int var1, int var2, int var3) {
      float var4 = (this.rand.nextInt() >>> 1) % 360;
      if (this.eX[var1] + var3 * var2 * Math.cos(var4 * 3.1415 / 180.0) < 10.0
         || this.eX[var1] + var3 * var2 * Math.cos(var4 * 3.1415 / 180.0) > 190.0
         || this.eY[var1] + var3 * var2 * Math.sin(var4 * 3.1415 / 180.0) < 10.0
         || this.eY[var1] + var3 * var2 * Math.sin(var4 * 3.1415 / 180.0) > 230.0) {
         var4 += 90.0F;
         if (this.eX[var1] + var3 * var2 * Math.cos(var4 * 3.1415 / 180.0) < 10.0
            || this.eX[var1] + var3 * var2 * Math.cos(var4 * 3.1415 / 180.0) > 190.0
            || this.eY[var1] + var3 * var2 * Math.sin(var4 * 3.1415 / 180.0) < 10.0
            || this.eY[var1] + var3 * var2 * Math.sin(var4 * 3.1415 / 180.0) > 230.0) {
            var4 += 90.0F;
            if (this.eX[var1] + var3 * var2 * Math.cos(var4 * 3.1415 / 180.0) < 10.0
               || this.eX[var1] + var3 * var2 * Math.cos(var4 * 3.1415 / 180.0) > 190.0
               || this.eY[var1] + var3 * var2 * Math.sin(var4 * 3.1415 / 180.0) < 10.0
               || this.eY[var1] + var3 * var2 * Math.sin(var4 * 3.1415 / 180.0) > 230.0) {
               var4 += 90.0F;
               if (this.eX[var1] + var3 * var2 * Math.cos(var4 * 3.1415 / 180.0) < 10.0
                  || this.eX[var1] + var3 * var2 * Math.cos(var4 * 3.1415 / 180.0) > 190.0
                  || this.eY[var1] + var3 * var2 * Math.sin(var4 * 3.1415 / 180.0) < 10.0
                  || this.eY[var1] + var3 * var2 * Math.sin(var4 * 3.1415 / 180.0) > 230.0) {
                  var3 = 0;
               }
            }
         }
      }

      this.eXmove[var1] = (float)(var3 * Math.cos(var4 * 3.1415 / 180.0));
      this.eYmove[var1] = (float)(var3 * Math.sin(var4 * 3.1415 / 180.0));
   }

   float getkakudo(float var1, float var2, float var3, float var4) {
      float var5 = var3 - var1;
      float var6 = var4 - var2;
      float var7 = FastMath.atan2(var5, var6);
      // DoJa-specific fix, no longer needed
      // if (var6 < 0.0F) {
      //    var7 += 180.0F;
      // }
      return var7;
   }

   void makefirst() {
      this.qx = 0;
      this.qy = 0;
      this.omballkyori_k[0] = 0;
      this.omballkyori[0] = 0;
      this.peopledenpaflag = 0;
      this.peoplescore = 0;
      this.peopleX = 95;
      this.peopleY = 220;
      peoplebomkind = 0;
      this.peoplemuteki = 0;
      this.peoplepower = 0;
      this.peopleslow = 0;
      this.peoplezannki = 2;
      this.peoplenonshot = 0;
      this.peoplehosi = 0;
      this.peoplekasuri = 0;
      this.konnte = 0;
      if (this.stagelevel == 0) {
         this.peoplepoint = 1000;
      }

      if (this.stagelevel == 1) {
         this.peoplepoint = 2000;
      }

      this.keisan = 34;
      this.stagemen = 0;
      this.stagetime = 0;
      this.stagetime2 = 0;
      this.scene = this.init;
      this.init = -1;
      this.keyEvent = -999;
      this.magic = -1;
      this.titlemode = 0;

      for (int var1 = 0; var1 < this.e_max; var1++) {
         this.emode[var1] = 0;
      }

      for (int var2 = 0; var2 < this.e_max; var2++) {
         this.emuteki[var2] = 0;
      }

      for (int var3 = 0; var3 < this.e_max; var3++) {
         this.esuruu[var3] = 0;
      }

      for (int var4 = 0; var4 < effect_max; var4++) {
         effectmode[var4] = 0;
      }

      for (int var5 = 0; var5 < this.tama_max; var5++) {
         this.tamamode[var5] = 0;
      }

      for (int var6 = 0; var6 < this.laser_max; var6++) {
         this.lasermode[var6] = 0;
      }

      for (int var7 = 0; var7 < this.bullet_max; var7++) {
         this.bulletmode[var7] = 0;
      }

      for (int var8 = 0; var8 < this.bom_max; var8++) {
         this.bommode[var8] = 0;
      }

      for (int var9 = 0; var9 < this.item_max; var9++) {
         this.itemmode[var9] = 0;
      }

      this.bossmode = 0;
      this.bossspel = 0;
      this.bosshide = 0;
      this.bossnokori = 0;

      for (this.aa = 0; this.aa < 10; this.aa++) {
         this.tmmode[this.aa] = 0;
      }

      kaiwa1 = "";
      kaiwa2 = "";
      kaiwa3 = "";
      kaiwaname = "";
   }

   void makekaiwanext(int var1) {
      this.cyc = 0;
      if (effectholdnumber2[var1] == 0 && peoplebomkind % 2 == 0 && effectholdnumber0[var1] == 8) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 0 && peoplebomkind % 2 == 1 && effectholdnumber0[var1] == 10) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 1 && peoplebomkind % 2 == 0 && effectholdnumber0[var1] == 3) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 1 && peoplebomkind % 2 == 1 && effectholdnumber0[var1] == 2) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 2 && peoplebomkind % 2 == 0 && effectholdnumber0[var1] == 10) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 2 && peoplebomkind % 2 == 1 && effectholdnumber0[var1] == 10) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 3 && peoplebomkind % 2 == 0 && effectholdnumber0[var1] == 5) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 3 && peoplebomkind % 2 == 1 && effectholdnumber0[var1] == 6) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 4 && peoplebomkind % 2 == 0 && effectholdnumber0[var1] == 10) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 4 && peoplebomkind % 2 == 1 && effectholdnumber0[var1] == 15) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 5 && peoplebomkind % 2 == 0 && effectholdnumber0[var1] == 7) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 5 && peoplebomkind % 2 == 1 && effectholdnumber0[var1] == 7) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 6 && peoplebomkind % 2 == 0 && effectholdnumber0[var1] == 10) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 6 && peoplebomkind % 2 == 1 && effectholdnumber0[var1] == 11) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 7 && peoplebomkind % 2 == 0 && effectholdnumber0[var1] == 6) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 7 && peoplebomkind % 2 == 1 && effectholdnumber0[var1] == 11) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 8 && peoplebomkind % 2 == 0 && effectholdnumber0[var1] == 9) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 8 && peoplebomkind % 2 == 1 && effectholdnumber0[var1] == 11) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 9 && peoplebomkind % 2 == 0 && effectholdnumber0[var1] == 3) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 9 && peoplebomkind % 2 == 1 && effectholdnumber0[var1] == 7) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 10 && peoplebomkind % 2 == 0 && effectholdnumber0[var1] == 18) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 10 && peoplebomkind % 2 == 1 && effectholdnumber0[var1] == 17) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 11 && peoplebomkind % 2 == 0 && effectholdnumber0[var1] == 14) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 11 && peoplebomkind % 2 == 1 && effectholdnumber0[var1] == 12) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 12 && peoplebomkind % 2 == 0 && effectholdnumber0[var1] == 4) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 12 && peoplebomkind % 2 == 1 && effectholdnumber0[var1] == 5) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 13 && peoplebomkind % 2 == 0 && effectholdnumber0[var1] == 5) {
         this.cyc = 1;
      }

      if (effectholdnumber2[var1] == 13 && peoplebomkind % 2 == 1 && effectholdnumber0[var1] == 3) {
         this.cyc = 1;
      }

      if (this.cyc == 1) {
         this.etime[this.bossnum] = 0;
         this.edoing[this.bossnum]++;
         effectholdnumber1[var1] = 2;
         effecttime[var1] = 0;
         this.peoplemuteki = 0;
         this.peoplenonshot = 0;
         if (effectholdnumber2[var1] % 2 == 1 && effectholdnumber2[var1] != 11 && effectholdnumber2[var1] != 13) {
            effectIn(0.0F, 0.0F, 20, 0, 0, 0);
         }

         if (effectholdnumber2[var1] == 12) {
            this.stagetime = 85000;
         }
      }
   }

   void loadingkasa() {
      this.cyc++;
      if (this.cyc % 36 < 18) {
         this.g.drawImage(this.LoadingImg[1], 210, 200, this.cyc % 36 * 30, 0, 30, 30);
      } else {
         this.g.drawImage(this.LoadingImg[1], 210, 200, (35 - this.cyc % 36) * 30, 30, 30, 30);
      }

      this.g.setFont(Font.getFont(1879048448));
      this.drawBold("少女祈祷中･･･", 100, 220, Graphics.getColorOfRGB(this.cyc % 72 * 1, this.cyc % 72 * 3, this.cyc % 72 * 1), Graphics.getColorOfRGB(55, 55, 255));

      try {
         Thread.sleep(10L);
      } catch (Exception var2) {
      }
   }

   void exe() {
      int var1 = 0;
      long var2 = 0L;
      PhoneSystem.setAttribute(0, 1);

      try {
         MediaImage var4 = MediaManager.getImage("resource:///load0.JPG");
         var4.use();
         this.LoadingImg[0] = var4.getImage();
      } catch (Exception var95) {
      }

      try {
         MediaImage var131 = MediaManager.getImage("resource:///omball.gif");
         var131.use();
         this.LoadingImg[1] = var131.getImage();
      } catch (Exception var94) {
      }

      this.g.drawImage(this.LoadingImg[0], 0, 0);

      try {
         Thread.sleep(1000L);
      } catch (Exception var93) {
      }

      this.g.setColor(Graphics.getColorOfRGB(0, 0, 0, 180));
      this.g.fillRect(0, 200, 240, 30);
      DataInputStream var132 = null;

      try {
         var132 = Connector.openDataInputStream("scratchpad:///0;pos=0");
         var1 = var132.read();
      } catch (Exception var91) {
      } finally {
         try {
            if (var132 != null) {
               var132.close();
            }
         } catch (Exception var88) {
         }
      }

      if (var1 == 0) {
         this.bomkey = 4;
         this.shotkey = 0;
         this.speedkey = 1;
         this.volume = 100;
         this.sevolume = 80;
         this.byougamode = 1;
         this.save();
         DataOutputStream var5 = null;

         try {
            var5 = Connector.openDataOutputStream("scratchpad:///0;pos=0");
            var5.write(1);
         } catch (Exception var89) {
         } finally {
            try {
               if (var5 != null) {
                  var5.close();
               }
            } catch (Exception var87) {
            }
         }
      } else {
         this.load();
      }

      this.gazouload();
      this.player.play();

      while (true) {
         if (this.init >= 0) {
            this.makefirst();
         }

         if (saiflag == 1) {
            this.player.play();
            saiflag = 0;
            if (this.gamemode == 1) {
               this.gamemode = 2;
            }
         }

         if (this.FpsTime_i == 0) {
            this.FpsTime[0] = (int)System.currentTimeMillis();
         }

         if (this.FpsTime_i == 49) {
            this.FpsTime[1] = (int)System.currentTimeMillis();
            this.Fps = 1000.0F / ((this.FpsTime[1] - this.FpsTime[0]) / 50.0F);
            this.FpsTime_i = 0;
         } else {
            this.FpsTime_i++;
         }

         this.byougatime++;
         if (this.byougatime % this.byougamode == 0) {
            this.g.lock();
            int var133 = 0;
            int var6 = 0;
            int var7 = 0;
            byte var8 = 0;
            if (this.gamemode == 1 || this.gamemode == 2 || this.gamemode == 3) {
               if (this.qx != 0 || this.qy != 0) {
                  this.g.setColor(Graphics.getColorOfRGB(0, 0, 0));
                  this.g.fillRect(0, 0, 200, 240);
               }

               if (this.stagetime > 1) {
                  if (this.stagemen != 0 && this.stagemen != 10) {
                     if (this.stagemen != 1 && this.stagemen != 11) {
                        if (this.stagemen == 2) {
                           if (this.bossspel == 1) {
                              this.g.drawImage(this.bgimg[1], this.qx, -(this.stagetime2 % 30) * 2 + this.qy);
                              this.g.drawImage(this.bgimg[1], this.qx, 60 - this.stagetime2 % 30 * 2 + this.qy);
                              this.g.drawImage(this.bgimg[1], this.qx, 120 - this.stagetime2 % 30 * 2 + this.qy);
                              this.g.drawImage(this.bgimg[1], this.qx, 180 - this.stagetime2 % 30 * 2 + this.qy);
                              this.g.drawImage(this.bgimg[1], this.qx, 240 - this.stagetime2 % 30 * 2 + this.qy);
                           } else {
                              for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                                 var6 = (int)((this.stageY + this.cyc * 60 + 900.0F + this.qy) % 300.0F) - 60;
                                 this.g.drawImage(this.bgimg[2], this.qx, var6);
                              }

                              for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                                 var6 = (int)((this.stageY * 2.0F + this.cyc * 60 + 900.0F + this.qy) % 300.0F) - 60;
                                 this.g.drawImage(this.bgimg[0], this.qx, var6);
                              }

                              for (int var120 = 0; var120 < effect_see_max; var120++) {
                                 var133 = (int)effectX[var120];
                                 var6 = (int)effectY[var120];
                                 if (effectmode[var120] == 15) {
                                    effectkakudo[var120] = (effectkakudo[var120] + 7200.0F) % 360.0F;
                                    if (effectkakudo[var120] < 180.0F) {
                                       effectholdnumber2[var120] = (int)(effectkakudo[var120] / 18.0F);
                                       this.g.drawImage(this.image[11], var133 - 15, var6 - 15, effectholdnumber2[var120] * 30, 0, 30, 30);
                                    } else {
                                       effectholdnumber2[var120] = 10 - (int)((effectkakudo[var120] - 180.0F) / 18.0F);
                                       this.g.drawImage(this.image[11], var133 - 15, var6 - 15, effectholdnumber2[var120] * 30, 30, 30, 30);
                                    }
                                 }
                              }
                           }
                        } else if (this.stagemen == 3) {
                           if (this.bossspel == 1) {
                              this.g.drawImage(this.bgimg[1], this.qx, -(this.stagetime2 % 30) * 2 + this.qy);
                              this.g.drawImage(this.bgimg[1], this.qx, 60 - this.stagetime2 % 30 * 2 + this.qy);
                              this.g.drawImage(this.bgimg[1], this.qx, 120 - this.stagetime2 % 30 * 2 + this.qy);
                              this.g.drawImage(this.bgimg[1], this.qx, 180 - this.stagetime2 % 30 * 2 + this.qy);
                              this.g.drawImage(this.bgimg[1], this.qx, 240 - this.stagetime2 % 30 * 2 + this.qy);
                           } else {
                              for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                                 var6 = (int)((this.stageY + this.cyc * 60 + 900.0F + this.qy) % 300.0F) - 60;
                                 this.g.drawImage(this.bgimg[2], this.qx, var6);
                              }

                              for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                                 var6 = (int)((this.stageY * 2.0F + this.cyc * 60 + 900.0F + this.qx) % 300.0F) - 60;
                                 this.g.drawImage(this.bgimg[0], this.qx, var6);
                              }
                           }
                        } else if (this.stagemen != 4) {
                           if (this.stagemen == 5) {
                              if (this.bossspel == 1) {
                                 this.g.drawImage(this.bgimg[1], this.qx, this.qy);
                              } else {
                                 this.g.drawImage(this.bgimg[0], this.qx, this.qy);
                                 if (this.stagetime < 20150) {
                                    this.g.setColor(Graphics.getColorOfRGB(0, 0, 0, 200));
                                    this.g.fillRect(0, 0, 200, 240);
                                 } else if (this.stagetime < 20250) {
                                    this.g.setColor(Graphics.getColorOfRGB(0, 0, 0, 2 * (20250 - this.stagetime)));
                                    this.g.fillRect(0, 0, 200, 240);
                                 }
                              }
                           } else if (this.stagemen == 6) {
                              if (this.bossspel == 1) {
                                 if (this.stagetime < 22000) {
                                    this.g.drawImage(this.bgimg[1], this.qx, -(this.stagetime2 % 30) * 2 + this.qy);
                                    this.g.drawImage(this.bgimg[1], this.qx, 60 - this.stagetime2 % 30 * 2 + this.qy);
                                    this.g.drawImage(this.bgimg[1], this.qx, 120 - this.stagetime2 % 30 * 2 + this.qy);
                                    this.g.drawImage(this.bgimg[1], this.qx, 180 - this.stagetime2 % 30 * 2 + this.qy);
                                    this.g.drawImage(this.bgimg[1], this.qx, 240 - this.stagetime2 % 30 * 2 + this.qy);
                                    this.g.drawImage(this.bgimg[3], this.qx, this.qy);
                                 } else if (this.stagetime > 22000) {
                                    this.g.drawImage(this.bgimg[1], this.qx, this.qy);
                                 }
                              } else {
                                 for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                                    var6 = (int)((this.stageY + this.cyc * 60 + 900.0F + this.qy) % 300.0F) - 60;
                                    this.g.drawImage(this.bgimg[0], this.qx - 5, var6);
                                 }
                              }
                           }
                        } else if (this.bossspel == 1) {
                           this.g.drawImage(this.bgimg[1], this.qx, -(this.stagetime2 % 30) * 2 + this.qy);
                           this.g.drawImage(this.bgimg[1], this.qx, 60 - this.stagetime2 % 30 * 2 + this.qy);
                           this.g.drawImage(this.bgimg[1], this.qx, 120 - this.stagetime2 % 30 * 2 + this.qy);
                           this.g.drawImage(this.bgimg[1], this.qx, 180 - this.stagetime2 % 30 * 2 + this.qy);
                           this.g.drawImage(this.bgimg[1], this.qx, 240 - this.stagetime2 % 30 * 2 + this.qy);
                        } else {
                           for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                              var6 = (int)((this.stageY + this.cyc * 240 + 900.0F + this.qy) % 480.0F) - 240;
                              this.g.drawImage(this.bgimg[0], this.qx, var6);
                           }

                           if (this.stagetime < 21600) {
                              this.g.setColor(Graphics.getColorOfRGB(0, 0, 0, 200));
                              this.g.fillRect(0, 0, 200, 240);
                           } else if (this.stagetime < 21700) {
                              this.g.setColor(Graphics.getColorOfRGB(0, 0, 0, 2 * (21700 - this.stagetime)));
                              this.g.fillRect(0, 0, 200, 240);
                           }
                        }
                     } else if (this.bossspel == 1) {
                        this.g.drawImage(this.bgimg[1], this.qx, -(this.stagetime2 % 30) * 2 + this.qy);
                        this.g.drawImage(this.bgimg[1], this.qx, 60 - this.stagetime2 % 30 * 2 + this.qy);
                        this.g.drawImage(this.bgimg[1], this.qx, 120 - this.stagetime2 % 30 * 2 + this.qy);
                        this.g.drawImage(this.bgimg[1], this.qx, 180 - this.stagetime2 % 30 * 2 + this.qy);
                        this.g.drawImage(this.bgimg[1], this.qx, 240 - this.stagetime2 % 30 * 2 + this.qy);
                        this.g.drawImage(this.bgimg[3], this.qx, this.qy);
                     } else {
                        for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                           var6 = (int)((this.stageY + this.cyc * 60 + 900.0F + this.qy) % 300.0F) - 60;
                           this.g.drawImage(this.bgimg[2], this.qx, var6);
                        }

                        for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                           var6 = (int)((this.stageY * 2.0F + this.cyc * 60 + 900.0F + this.qx) % 300.0F) - 60;
                           this.g.drawImage(this.bgimg[0], this.qx, var6);
                        }
                     }
                  } else if (this.bossspel == 1) {
                     this.g.drawImage(this.bgimg[1], this.qx, this.qy - this.stagetime2 % 60);
                     this.g.drawImage(this.bgimg[1], this.qx, this.qy + 60 - this.stagetime2 % 60);
                     this.g.drawImage(this.bgimg[1], this.qx, this.qy + 120 - this.stagetime2 % 60);
                     this.g.drawImage(this.bgimg[1], this.qx, this.qy + 180 - this.stagetime2 % 60);
                     this.g.drawImage(this.bgimg[1], this.qx, this.qy + 240 - this.stagetime2 % 60);
                  } else {
                     for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                        var6 = (int)((this.stageY + this.cyc * 60 + 900.0F + this.qy) % 300.0F) - 60;
                        this.g.drawImage(this.bgimg[0], this.qx, var6);
                     }

                     for (int var119 = 0; var119 < effect_see_max; var119++) {
                        var133 = (int)effectX[var119];
                        var6 = (int)effectY[var119];
                        if (effectmode[var119] == 15) {
                           effectkakudo[var119] = (effectkakudo[var119] + 7200.0F) % 360.0F;
                           if (effectkakudo[var119] < 180.0F) {
                              effectholdnumber2[var119] = (int)(effectkakudo[var119] / 18.0F);
                              this.g.drawImage(this.image[11], var133 - 15, var6 - 15, effectholdnumber2[var119] * 30, 0, 30, 30);
                           } else {
                              effectholdnumber2[var119] = 10 - (int)((effectkakudo[var119] - 180.0F) / 18.0F);
                              this.g.drawImage(this.image[11], var133 - 15, var6 - 15, effectholdnumber2[var119] * 30, 30, 30, 30);
                           }
                        }
                     }
                  }
               }

               for (int var121 = 0; var121 < effect_see_max; var121++) {
                  if (effectmode[var121] == 19) {
                     if (effectholdnumber0[var121] == 0) {
                        this.g.setColor(Graphics.getColorOfRGB(255, 255, 255, effectholdnumber1[var121]));
                     }

                     if (effectholdnumber0[var121] == 1
                        || effectholdnumber0[var121] == 2
                        || effectholdnumber0[var121] == 3
                        || effectholdnumber0[var121] == 4
                        || effectholdnumber0[var121] == 5) {
                        this.g.setColor(Graphics.getColorOfRGB(0, 0, 0, effectholdnumber1[var121]));
                     }

                     this.g.fillRect(0, 0, 200, 240);
                  } else if (effectmode[var121] == 9) {
                     if (effectholdnumber0[var121] <= 3) {
                        this.standimg[effectholdnumber0[var121]].setAlpha(215);
                        this.g.drawImage(this.standimg[effectholdnumber0[var121]], (int)(effectX[var121] - 120.0F), (int)(effectY[var121] - 120.0F));
                     } else {
                        this.standimg[4].setAlpha(235);
                        this.g.drawImage(this.standimg[4], (int)(effectX[var121] - 120.0F), (int)(effectY[var121] - 120.0F));
                     }
                  } else if (effectmode[var121] == 25) {
                     this.g
                        .drawScaledImage(
                           this.image[19],
                           (int)(this.qx + this.eX[this.bossnum] - effectholdnumber0[var121] * 0.5),
                           (int)(this.qy + this.eY[this.bossnum] - effectholdnumber1[var121] * 0.5 + 5.0 * Math.sin(this.stagetime2 * 4 * 3.1415 / 180.0)),
                           effectholdnumber0[var121],
                           effectholdnumber1[var121],
                           0,
                           0,
                           200,
                           100
                        );
                  } else if (effectmode[var121] == 27) {
                     this.image[22].setAlpha(effectholdnumber0[var121]);
                     this.g.drawImage(this.image[22], -effecttime[var121], 0);
                  }
               }

               if (this.qx != 0 || this.qy != 0) {
                  if (this.qy > 0) {
                     this.g.setColor(Graphics.getColorOfRGB(0, 0, 0));
                     this.g.fillRect(0, 0, 200, this.qy);
                  }

                  if (this.qy < 0) {
                     this.g.setColor(Graphics.getColorOfRGB(0, 0, 0));
                     this.g.fillRect(0, 240 - this.qy, 200, -this.qy);
                  }
               }

               for (this.aa = 0; this.aa < this.bom_max; this.aa++) {
                  if (this.bommode[this.aa] != 0) {
                     var133 = (int)this.bomX[this.aa] + this.qx;
                     var6 = (int)this.bomY[this.aa] + this.qy;
                     if (this.bommode[this.aa] == 2) {
                        for (this.cyc = -3; this.cyc < 0; this.cyc++) {
                           this.g
                              .drawScaledImage(
                                 this.image[8],
                                 (int)(var133 - this.bomhaba[this.aa] * (0.9 - this.cyc * 0.2)),
                                 var6 - 240 - this.cyc * 5,
                                 (int)(this.bomhaba[this.aa] * 2.0F * (0.9 - this.cyc * 0.2)),
                                 240,
                                 0,
                                 0,
                                 120,
                                 240
                              );
                        }
                     }

                     if (this.bommode[this.aa] == 3) {
                        this.g.drawImage(this.image[16], var133 - 50, var6);
                     }

                     if (this.bommode[this.aa] == 5) {
                        this.image[24].setAlpha(255 - this.bomtime[this.aa] * 5);
                        this.g
                           .drawScaledImage(
                              this.image[24],
                              (int)(var133 - this.bomholdnumber0[this.aa]),
                              (int)(var6 - this.bomholdnumber0[this.aa]),
                              (int)(this.bomholdnumber0[this.aa] * 2.0F),
                              (int)(this.bomholdnumber0[this.aa] * 2.0F),
                              0,
                              0,
                              100,
                              100
                           );
                     }
                  }
               }

               for (int var122 = 0; var122 < this.e_max; var122++) {
                  if (this.emode[var122] != 0) {
                     var133 = (int)this.eX[var122] + this.qx;
                     var6 = (int)this.eY[var122] + this.qy;
                     if (this.emode[var122] == 1000 || this.emode[var122] == 1001 || this.emode[var122] == 1002) {
                        for (this.aa = 0; this.aa < effect_see_max; this.aa++) {
                           if (effectmode[this.aa] == 30) {
                              this.drawmahoujinn(var133, var6, this.aa);
                           }
                        }
                     }

                     if (this.eeffected[var122] == 1 && this.etime[var122] < 31) {
                        this.g.setColor(Graphics.getColorOfRGB(255, 0, 255, this.etime[var122] * 8));
                        this.g
                           .fillRect(
                              var133 - (41 - this.etime[var122]),
                              var6 - (41 - this.etime[var122]),
                              (41 - this.etime[var122]) * 2,
                              (41 - this.etime[var122]) * 2
                           );
                     } else if (this.emode[var122] != 1000 && this.emode[var122] != 1001 && this.emode[var122] != 1002) {
                        if (this.emode[var122] < 1000) {
                           if (this.stagetime2 % 8 < 2) {
                              var7 = 0;
                           } else if (this.stagetime2 % 8 < 4) {
                              var7 = 1;
                           } else if (this.stagetime2 % 8 < 6) {
                              var7 = 2;
                           } else if (this.stagetime2 % 8 < 8) {
                              var7 = 3;
                           }

                           if (this.eXmove[var122] < 0.0F) {
                              var8 = 2;
                           } else if (this.eXmove[var122] > 0.0F) {
                              var8 = 1;
                           } else {
                              var8 = 0;
                           }

                           if (this.eshape[var122] == 0) {
                              if (this.stagemen < 3 || this.stagemen == 6) {
                                 this.g.drawImage(this.image[1], var133 - 12, var6 - 12, var7 * 24, 72 * ((this.eitem[var122] - 1) % 3) + var8 * 24, 24, 24);
                              }

                              if (this.stagemen > 2 && this.stagemen != 6) {
                                 this.g
                                    .drawImage(this.image[1], var133 - 12, var6 - 12, 96 + var7 * 24, 72 * ((this.eitem[var122] - 1) % 3) + var8 * 24, 24, 24);
                              }
                           }

                           if (this.eshape[var122] == 1) {
                              this.g.drawImage(this.image[1], var133 - 7, var6 - 7, 15 * ((this.eitem[var122] - 1) % 3), 216, 15, 15);

                              for (int var9 = 0; var9 < 5; var9++) {
                                 if (this.eitem[var122] % 3 == 1) {
                                    this.g.setColor(Graphics.getColorOfRGB(0, 255, 255));
                                 }

                                 if (this.eitem[var122] % 3 == 2) {
                                    this.g.setColor(Graphics.getColorOfRGB(255, 0, 255));
                                 }

                                 if (this.eitem[var122] % 3 == 2) {
                                    this.g.setColor(Graphics.getColorOfRGB(0, 255, 0));
                                 }

                                 this.g
                                    .drawArc(
                                       var133 + (int)(12.0 * Math.cos((this.stagetime2 % 36 * 10 + var9 * 72) * 3.1415 / 180.0)) - 3,
                                       var6 + (int)(12.0 * Math.sin((this.stagetime2 % 36 * 10 + var9 * 72) * 3.1415 / 180.0)) - 3,
                                       6,
                                       6,
                                       0,
                                       360
                                    );
                                 this.g
                                    .drawArc(
                                       var133 + (int)(12.0 * Math.cos((this.stagetime2 % 36 * 10 + var9 * 72) * 3.1415 / 180.0)) - 2,
                                       var6 + (int)(12.0 * Math.sin((this.stagetime2 % 36 * 10 + var9 * 72) * 3.1415 / 180.0)) - 2,
                                       4,
                                       4,
                                       0,
                                       360
                                    );
                                 this.g
                                    .drawArc(
                                       var133 + (int)(9.0 * Math.cos((-(this.stagetime2 % 18) * 20 + var9 * 72) * 3.1415 / 180.0)) - 2,
                                       var6 + (int)(9.0 * Math.sin((-(this.stagetime2 % 18) * 20 + var9 * 72) * 3.1415 / 180.0)) - 2,
                                       4,
                                       4,
                                       0,
                                       360
                                    );
                              }
                           }

                           if (this.eshape[var122] == 3) {
                              if (this.stagemen < 3 || this.stagemen == 6) {
                                 this.g.drawImage(this.image[2], var133 - 20, var6 - 20, var7 * 40, var8 * 40, 40, 40);
                              }

                              if (this.stagemen > 2 && this.stagemen != 6) {
                                 this.g.drawImage(this.image[2], var133 - 20, var6 - 20, var7 * 40, 120 + var8 * 40, 40, 40);
                              }
                           }

                           if (this.eshape[var122] == 2) {
                              var7 = this.etime[var122] * 18 % 360;
                              if (var7 < 180) {
                                 var7 /= 18;
                                 this.g.drawImage(this.image[10], var133 - 15, var6 - 15, var7 * 30, 0, 30, 30);
                              } else {
                                 var7 = 10 - (var7 - 180) / 18;
                                 this.g.drawImage(this.image[10], var133 - 15, var6 - 15, var7 * 30, 30, 30, 30);
                              }
                           }
                        }
                     } else {
                        if (this.stagetime2 % 12 < 3) {
                           var7 = 0;
                        } else if (this.stagetime2 % 12 < 6) {
                           var7 = 1;
                        } else if (this.stagetime2 % 12 < 9) {
                           var7 = 2;
                        } else if (this.stagetime2 % 12 < 12) {
                           var7 = 3;
                        }

                        if (this.eXmove[var122] < 0.0F) {
                           var7 = 5;
                        } else if (this.eXmove[var122] > 0.0F) {
                           var7 = 4;
                        }

                        if (this.stagemen == 0 || this.stagemen == 10) {
                           if (this.emode[var122] == 1000 || this.emode[var122] == 1001) {
                              this.g.drawImage(this.eimg[0], var133 - 20, var6 - 20, var7 * 40, 0, 40, 40);
                           }
                        } else if (this.stagemen == 1) {
                           if (this.emode[var122] == 1000 || this.emode[var122] == 1001) {
                              this.g.drawImage(this.eimg[1], var133 - 20, var6 - 20, var7 * 40, 0, 40, 40);
                           }
                        } else if (this.stagemen == 2) {
                           if (this.emode[var122] == 1000 || this.emode[var122] == 1001) {
                              this.g.drawImage(this.eimg[2], var133 - 20, var6 - 20, var7 * 40, 0, 40, 40);
                           }
                        } else if (this.stagemen == 3) {
                           if (this.emode[var122] == 1001) {
                              this.g.drawImage(this.eimg[4], var133 - 20, var6 - 20, var7 * 40, 0, 40, 40);
                           }

                           if (this.emode[var122] == 1002) {
                              this.g.drawImage(this.eimg[5], var133 - 20, var6 - 20, var7 * 40, 0, 40, 40);
                           }
                        } else if (this.stagemen == 4) {
                           if (this.emode[var122] == 1000) {
                              this.g.drawImage(this.eimg[6], var133 - 20, var6 - 20, var7 * 40, 0, 40, 40);
                           }

                           if (this.emode[var122] == 1001) {
                              this.g.drawImage(this.eimg[6], var133 - 20, var6 - 20, var7 * 40, 0, 40, 40);
                           }
                        } else if (this.stagemen == 5) {
                           if (this.emode[var122] == 1000) {
                              this.g.drawImage(this.eimg[6], var133 - 20, var6 - 20, var7 * 40, 0, 40, 40);
                           }

                           if (this.emode[var122] == 1001) {
                              this.g.drawImage(this.eimg[7], var133 - 20, var6 - 20, var7 * 40, 0, 40, 40);
                           }
                        } else if (this.stagemen == 6) {
                           if (this.emode[var122] == 1000) {
                              this.g.drawImage(this.eimg[1], var133 - 20, var6 - 20, var7 * 40, 0, 40, 40);
                           }

                           if (this.emode[var122] == 1001) {
                              if (this.bosshide == 0) {
                                 this.g.drawImage(this.eimg[8], var133 - 20, var6 - 20, var7 * 40, 0, 40, 40);
                              }

                              if (this.bosshide == 2) {
                                 this.g.drawImage(this.eimg[8], var133 - 20, var6 - 20, var7 * 40, 0, 40, 40);
                              }
                           }
                        }
                     }
                  }
               }

               if (this.tmmode[0] == 3) {
                  this.g.setColor(Graphics.getColorOfRGB(120, 255, 255));

                  for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                     this.g.drawLine((int)this.tmX[this.cyc], (int)this.tmY[this.cyc], (int)this.tmX[(this.cyc + 1) % 4], (int)this.tmY[(this.cyc + 1) % 4]);
                  }

                  this.g.setColor(Graphics.getColorOfRGB(0, 50, 255));

                  for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                     this.g.drawLine((int)this.tmX[this.cyc], (int)this.tmY[this.cyc], (int)this.tmX[this.cyc + 2], (int)this.tmY[this.cyc + 2]);
                  }
               }

               for (this.aa = 0; this.aa < this.tm_max; this.aa++) {
                  if (this.tmmode[this.aa] != 0) {
                     var133 = (int)this.tmX[this.aa] + this.qx;
                     var6 = (int)this.tmY[this.aa] + this.qy;
                     if (this.tmmode[this.aa] == 1) {
                        this.drawmahoujinnE(var133, var6);
                     } else if (this.tmmode[this.aa] == 2) {
                        this.drawmahoujinnE(var133, var6);
                     } else if (this.tmmode[this.aa] == 3) {
                        this.g.drawImage(this.image[23], var133 - 10, var6 - 10, this.tmiro[this.aa] * 20, 0, 20, 20);
                     } else if (this.tmmode[this.aa] == 4) {
                        var7 = this.etime[this.bossnum] * 18 % 360;
                        if (var7 < 180) {
                           var7 /= 18;
                           this.g.drawImage(this.image[9], var133 - 12, var6 - 12, var7 * 25, 0, 25, 25);
                        } else {
                           var7 = 10 - (var7 - 180) / 18;
                           this.g.drawImage(this.image[9], var133 - 12, var6 - 12, var7 * 25, 25, 25, 25);
                        }
                     }
                  }
               }

               this.image[13].setAlpha(255);

               for (int var123 = 0; var123 < this.item_see_max; var123++) {
                  if (this.itemmode[var123] != 0) {
                     var133 = (int)this.itemX[var123] + this.qx;
                     var6 = (int)this.itemY[var123] + this.qy;
                     if (this.itemmode[var123] == 1) {
                        if (this.itemtime[var123] < 12) {
                           this.g.drawImage(this.image[13], var133 - 8, var6 - 8, this.itemtime[var123] * 16, 0, 16, 16);
                        } else {
                           this.g.drawImage(this.image[13], var133 - 8, var6 - 8, 0, 0, 16, 16);
                        }

                        if (this.itemY[var123] < 0.0F) {
                           this.g.drawImage(this.image[13], var133 - 8, 8, 200, 0, 12, 8);
                        }
                     } else if (this.itemmode[var123] == 11) {
                        if (this.itemtime[var123] < 12) {
                           this.g.drawImage(this.image[13], var133 - 8, var6 - 8, this.itemtime[var123] * 16, 32, 16, 16);
                        } else {
                           this.g.drawImage(this.image[13], var133 - 8, var6 - 8, 0, 32, 16, 16);
                        }

                        if (this.itemY[var123] < 0.0F) {
                           this.g.drawImage(this.image[13], var133 - 8, 8, 224, 0, 12, 8);
                        }
                     } else if (this.itemmode[var123] == 2) {
                        if (this.itemtime[var123] < 12) {
                           this.g.drawImage(this.image[13], var133 - 8, var6 - 8, this.itemtime[var123] * 16, 16, 16, 16);
                        } else {
                           this.g.drawImage(this.image[13], var133 - 8, var6 - 8, 0, 16, 16, 16);
                        }

                        if (this.itemY[var123] < 0.0F) {
                           this.g.drawImage(this.image[13], var133 - 8, 8, 212, 0, 12, 8);
                        }
                     } else if (this.itemmode[var123] == 22) {
                        if (this.itemtime[var123] < 12) {
                           this.g.drawImage(this.image[13], var133 - 16, var6 - 16, this.itemtime[var123] * 32, 48, 32, 32);
                        } else {
                           this.g.drawImage(this.image[13], var133 - 16, var6 - 16, 0, 48, 32, 32);
                        }

                        if (this.itemY[var123] < 0.0F) {
                           this.g.drawImage(this.image[13], var133 - 8, 8, 212, 0, 12, 8);
                        }
                     } else if (this.itemmode[var123] == 3) {
                        this.g.drawImage(this.image[13], var133 - 4, var6 - 4, 192, 0, 8, 8);
                     } else if (this.itemmode[var123] == 99) {
                        if (this.itemtime[var123] < 12) {
                           this.g.drawImage(this.image[13], var133 - 16, var6 - 16, this.itemtime[var123] * 32, 80, 32, 32);
                        } else {
                           this.g.drawImage(this.image[13], var133 - 16, var6 - 16, 0, 80, 32, 32);
                        }
                     }
                  }
               }

               this.image[0].setAlpha(120);

               for (int var124 = 0; var124 < this.bullet_max; var124++) {
                  if (this.bulletmode[var124] != 0) {
                     var133 = (int)this.bulletX[var124] + this.qx;
                     var6 = (int)this.bulletY[var124] + this.qy;
                     if (this.bulletmode[var124] == 1) {
                        if (peoplebomkind % 2 == 0) {
                           this.g.drawImage(this.image[0], var133 - 2, var6 - 25, 0, 0, 5, 40);
                        }

                        if (peoplebomkind % 2 == 1) {
                           this.g.drawImage(this.image[0], var133 - 2, var6 - 10, 10, 0, 5, 20);
                        }
                     } else if (this.bulletmode[var124] == 2) {
                        this.g.drawImage(this.image[0], var133 - 2, var6 - 25, 5, 0, 5, 40);
                     } else if (this.bulletmode[var124] == 3) {
                        this.g.drawImage(this.image[0], var133 - 5, var6 - 25, 0, 50, 10, 40);
                     } else if (this.bulletmode[var124] == 4) {
                        this.g.drawImage(this.image[0], var133 - 7, var6 - 7, 25, 15 * (this.bullettime[var124] % 10), 15, 15);
                     }
                  }
               }

               this.cyc2 = this.peoplepower / 100;

               for (int var125 = 0; var125 < this.cyc2; var125++) {
                  if (peoplebomkind == 1 && this.peoplenonshot == 0 && this.peopleshotting == 0) {
                     this.g.setColor(Graphics.getColorOfRGB(120, 255, 255, 120));
                     this.g.fillRect(this.omballX[var125] - 1 + this.qx, this.omballY[var125] - 240 + this.qy, 3, 240);
                  }

                  this.image[0].setAlpha(255);
                  if (peoplebomkind == 0) {
                     this.g
                        .drawImage(
                           this.image[0],
                           this.omballX[var125] - 7 + this.qx,
                           this.omballY[var125] - 7 + this.qy,
                           40,
                           (this.stagetime + var125 * 2) % 8 * 15,
                           15,
                           15
                        );
                  }

                  if (peoplebomkind == 2) {
                     this.g.drawImage(this.image[0], this.omballX[var125] - 7 + this.qx, this.omballY[var125] - 7 + this.qy, 40, var125 * 30, 15, 15);
                  }

                  if (peoplebomkind % 2 == 1) {
                     this.g.drawImage(this.image[0], this.omballX[var125] - 5 + this.qx, this.omballY[var125] - 5 + this.qy, 42, 120, 11, 11);
                  }
               }

               if (peoplebomkind % 2 == 0) {
                  var6 = 0;
               }

               if (peoplebomkind % 2 == 1) {
                  var6 = 50;
               }

               if (this.stagetime2 % 8 < 2) {
                  var133 = 0;
               } else if (this.stagetime2 % 8 < 4) {
                  var133 = 22;
               } else if (this.stagetime2 % 8 < 6) {
                  var133 = 44;
               } else if (this.stagetime2 % 8 < 8) {
                  var133 = 66;
               }

               if ((65536 & this.keyState) != 0) {
                  var133 = 110;
               }

               if ((262144 & this.keyState) != 0) {
                  var133 = 88;
               }

               if (this.peoplemuteki != 1 && this.peoplemuteki != 3) {
                  this.g.drawImage(this.image[12], this.peopleX - 11 + this.qx, this.peopleY - 12 + this.qy, var133, var6, 22, 25);
               } else {
                  if (this.stagetime % 2 == 0) {
                     this.g.drawImage(this.image[12], this.peopleX - 11 + this.qx, this.peopleY - 12 + this.qy, var133, var6 + 25, 22, 25);
                  }

                  if (this.stagetime % 2 == 1) {
                     this.g.drawImage(this.image[12], this.peopleX - 11 + this.qx, this.peopleY - 12 + this.qy, var133, var6, 22, 25);
                  }
               }

               if (this.peopleslow != 0) {
                  this.drawmahoujinnP(this.peopleX, this.peopleY);
               }

               for (this.aa = 0; this.aa < this.laser_max; this.aa++) {
                  boolean var13 = false;
                  int var14 = (int)(this.lasernagasa[this.aa] / 4.0F);
                  if (this.lasermode[this.aa] != 0) {
                     this.drawX[1] = (int)(
                        this.laserX[this.aa]
                           + var14 * Math.cos(this.laserkakudo[this.aa] * 3.141592 / 180.0)
                           + this.laserhaba[this.aa] * Math.cos((90.0F - this.laserkakudo[this.aa]) * 3.1415 / 180.0)
                     );
                     this.drawY[1] = (int)(
                        this.laserY[this.aa]
                           + var14 * Math.sin(this.laserkakudo[this.aa] * 3.141592 / 180.0)
                           - this.laserhaba[this.aa] * Math.sin((90.0F - this.laserkakudo[this.aa]) * 3.1415 / 180.0)
                     );
                     this.drawX[2] = (int)(this.drawX[1] + (this.lasernagasa[this.aa] - 2 * var14) * Math.cos(this.laserkakudo[this.aa] * 3.1415 / 180.0));
                     this.drawY[2] = (int)(this.drawY[1] + (this.lasernagasa[this.aa] - 2 * var14) * Math.sin(this.laserkakudo[this.aa] * 3.1415 / 180.0));
                     this.drawX[3] = (int)(this.laserX[this.aa] + this.lasernagasa[this.aa] * Math.cos(this.laserkakudo[this.aa] * 3.1415 / 180.0));
                     this.drawY[3] = (int)(this.laserY[this.aa] + this.lasernagasa[this.aa] * Math.sin(this.laserkakudo[this.aa] * 3.1415 / 180.0));
                     this.drawX[5] = (int)(
                        this.laserX[this.aa]
                           + var14 * Math.cos(this.laserkakudo[this.aa] * 3.141592 / 180.0)
                           - this.laserhaba[this.aa] * Math.cos((90.0F - this.laserkakudo[this.aa]) * 3.1415 / 180.0)
                     );
                     this.drawY[5] = (int)(
                        this.laserY[this.aa]
                           + var14 * Math.sin(this.laserkakudo[this.aa] * 3.141592 / 180.0)
                           + this.laserhaba[this.aa] * Math.sin((90.0F - this.laserkakudo[this.aa]) * 3.1415 / 180.0)
                     );
                     this.drawX[4] = (int)(this.drawX[5] + (this.lasernagasa[this.aa] - 2 * var14) * Math.cos(this.laserkakudo[this.aa] * 3.1415 / 180.0));
                     this.drawY[4] = (int)(this.drawY[5] + (this.lasernagasa[this.aa] - 2 * var14) * Math.sin(this.laserkakudo[this.aa] * 3.1415 / 180.0));
                     this.drawX[6] = (int)this.laserX[this.aa];
                     this.drawY[6] = (int)this.laserY[this.aa];
                     int[] var15 = new int[]{this.drawX[6], this.drawX[5], this.drawX[4], this.drawX[3], this.drawX[2], this.drawX[1]};
                     int[] var16 = new int[]{this.drawY[6], this.drawY[5], this.drawY[4], this.drawY[3], this.drawY[2], this.drawY[1]};
                     this.makecolor(this.aa);
                     this.g.fillPolygon(var15, var16, 6);
                     this.makecolor2(this.aa);
                     this.g.drawPolyline(var15, var16, 6);
                     if (this.lasermode[this.aa] != 1 && this.lasermode[this.aa] != 2) {
                        if (this.lasermode[this.aa] == 3 || this.lasermode[this.aa] == 5) {
                           if (this.stagetime2 % 2 == 0) {
                              this.image[6].setAlpha(50);
                           }

                           if (this.stagetime2 % 2 == 1) {
                              this.image[6].setAlpha(100);
                           }

                           this.g
                              .drawScaledImage(
                                 this.image[6],
                                 (int)(this.laserX[this.aa] - 10.0F),
                                 (int)(this.laserY[this.aa] - 10.0F),
                                 20,
                                 20,
                                 20 * (int)this.laserholdnumber2[this.aa],
                                 215,
                                 20,
                                 20
                              );
                           this.image[6].setAlpha(100);
                           this.g
                              .drawScaledImage(
                                 this.image[6],
                                 (int)(this.laserX[this.aa] - 5.0F),
                                 (int)(this.laserY[this.aa] - 5.0F),
                                 10,
                                 10,
                                 20 * (int)this.laserholdnumber2[this.aa],
                                 215,
                                 20,
                                 20
                              );
                        }
                     } else if (this.laserendtime[this.aa] > this.lasernagasa[this.aa]) {
                        if (this.stagetime2 % 2 == 0) {
                           this.image[6].setAlpha(50);
                        }

                        if (this.stagetime2 % 2 == 1) {
                           this.image[6].setAlpha(100);
                        }

                        this.g
                           .drawScaledImage(
                              this.image[6],
                              (int)(this.laserX[this.aa] - 10.0F),
                              (int)(this.laserY[this.aa] - 10.0F),
                              20,
                              20,
                              20 * (int)this.laserholdnumber2[this.aa],
                              215,
                              20,
                              20
                           );
                        this.image[6].setAlpha(100);
                        this.g
                           .drawScaledImage(
                              this.image[6],
                              (int)(this.laserX[this.aa] - 5.0F),
                              (int)(this.laserY[this.aa] - 5.0F),
                              10,
                              10,
                              20 * (int)this.laserholdnumber2[this.aa],
                              215,
                              20,
                              20
                           );
                     }
                  }
               }

               for (int var126 = 0; var126 < this.tama_max; var126++) {
                  if (this.tamamode[var126] != 0) {
                     var133 = (int)this.tamaX[var126] + this.qx;
                     var6 = (int)this.tamaY[var126] + this.qy;
                     this.image[5].setAlpha(255);
                     this.image[6].setAlpha(255);
                     if (this.tamatime[var126] < 6) {
                        if (this.tamashape[var126] == 1 || this.tamashape[var126] == 0 || this.tamashape[var126] == 2 || this.tamashape[var126] == 3) {
                           this.image[6].setAlpha(10 + this.tamatime[var126] * 20);
                           this.g
                              .drawScaledImage(
                                 this.image[6],
                                 var133 - 25 + this.tamatime[var126] * 4,
                                 var6 - 25 + this.tamatime[var126] * 4,
                                 51 - this.tamatime[var126] * 8,
                                 51 - this.tamatime[var126] * 8,
                                 20 * (this.tamairo[var126] % 6),
                                 215,
                                 20,
                                 20
                              );
                        } else if (this.tamashape[var126] == 5 || this.tamashape[var126] == 7 || this.tamashape[var126] == 8) {
                           this.image[6].setAlpha(10 + this.tamatime[var126] * 20);
                           this.g
                              .drawScaledImage(
                                 this.image[6],
                                 var133 - 40 + this.tamatime[var126] * 4,
                                 var6 - 40 + this.tamatime[var126] * 4,
                                 71 - this.tamatime[var126] * 8,
                                 71 - this.tamatime[var126] * 8,
                                 20 * (this.tamairo[var126] % 6),
                                 215,
                                 20,
                                 20
                              );
                        } else if (this.tamashape[var126] == 6) {
                           this.image[5].setAlpha(10 + this.tamatime[var126] * 15);
                           this.g
                              .drawScaledImage(
                                 this.image[5],
                                 var133 - 40 + this.tamatime[var126] * 4,
                                 var6 - 40 + this.tamatime[var126] * 4,
                                 81 - this.tamatime[var126] * 8,
                                 81 - this.tamatime[var126] * 8,
                                 this.tamairo[var126] * 32,
                                 24,
                                 32,
                                 32
                              );
                        }
                     } else if (this.tamashape[var126] == 0) {
                        if (var133 > -15 && var133 < this.migi + 15 && var6 > -15 && var6 < 255) {
                           this.g.drawImage(this.image[6], var133 - 6, var6 - 6, this.tamairo[var126] * 13, 0, 13, 13);
                        }
                     } else if (this.tamashape[var126] == 1) {
                        if (var133 > -5 && var133 < this.migi + 5 && var6 > -5 && var6 < 245) {
                           this.g.drawImage(this.image[6], var133 - 8, var6 - 8, this.tamapicnum[var126] * 16, 117 + 16 * this.tamairo[var126], 16, 16);
                        }
                     } else if (this.tamashape[var126] == 2) {
                        if (var133 > -5 && var133 < this.migi + 5 && var6 > -5 && var6 < 245) {
                           if (this.tamairo[var126] < 6) {
                              this.g.drawImage(this.image[6], var133 - 8, var6 - 8, this.tamapicnum[var126] * 17, 15 + 17 * (this.tamairo[var126] % 6), 17, 17);
                           }

                           if (this.tamairo[var126] > 5) {
                              this.g
                                 .drawImage(this.image[6], var133 - 8, var6 - 8, this.tamapicnum[var126] * 17, 435 + 17 * (this.tamairo[var126] % 6), 17, 17);
                           }
                        }
                     } else if (this.tamashape[var126] == 3) {
                        if (var133 > -5 && var133 < this.migi + 5 && var6 > -5 && var6 < 245) {
                           this.g.drawImage(this.image[6], var133 - 9, var6 - 9, this.tamapicnum[var126] * 18, 265 + 18 * this.tamairo[var126], 18, 18);
                        }
                     } else if (this.tamashape[var126] != 4) {
                        if (this.tamashape[var126] == 5) {
                           this.g.drawImage(this.image[5], var133 - 12, var6 - 12, this.tamairo[var126] * 24, 0, 24, 24);
                        } else if (this.tamashape[var126] == 6) {
                           this.g.drawImage(this.image[5], var133 - 16, var6 - 16, this.tamairo[var126] * 32, 24, 32, 32);
                        } else if (this.tamashape[var126] == 7) {
                           this.tamarange[var126] = this.tamatime[var126] * 18 % 360;
                           if (this.tamarange[var126] < 180.0F) {
                              var7 = (int)(this.tamarange[var126] / 18.0F);
                              this.g.drawImage(this.image[10], var133 - 15, var6 - 15, var7 * 30, 0, 30, 30);
                           } else {
                              var7 = 10 - (int)((this.tamarange[var126] - 180.0F) / 18.0F);
                              this.g.drawImage(this.image[10], var133 - 15, var6 - 15, var7 * 30, 30, 30, 30);
                           }
                        } else if (this.tamashape[var126] == 8) {
                           this.g
                              .drawImage(this.image[5], var133 - 10, var6 - 10, (this.tamatime[var126] + 1) % 4 * 20, 90 + this.tamairo[var126] * 20, 20, 20);
                        } else if (this.tamashape[var126] == 10) {
                           this.g
                              .drawScaledImage(
                                 this.image[20], this.qx, var6 - this.tamaholdnumber0[var126], 240, 2 * this.tamaholdnumber0[var126], 240 - var133, 0, 240, 120
                              );
                        } else if (this.tamashape[var126] == 11) {
                           this.g
                              .drawScaledImage(
                                 this.image[21], var133 - this.tamaholdnumber0[var126], this.qy, 2 * this.tamaholdnumber0[var126], 240, 0, 240 - var6, 120, 240
                              );
                        } else if (this.tamashape[var126] == 12) {
                           this.g.drawImage(this.image[14], var133 - 20, var6 - 20, this.tamairo[var126] * 40, 40, 40, 40);
                        } else if (this.tamashape[var126] == 13) {
                           this.image[0].setAlpha(255);
                           this.g.drawImage(this.image[0], var133 - 7, var6 - 7, 40, this.stagetime % 8 * 15, 15, 15);
                        }
                     }

                     if (this.tamashape[var126] == 9) {
                        this.image[14].setAlpha(240);
                        this.g
                           .drawScaledImage(
                              this.image[14],
                              var133 - this.tamaholdnumber0[var126],
                              var6 - this.tamaholdnumber0[var126],
                              2 * this.tamaholdnumber0[var126],
                              2 * this.tamaholdnumber0[var126],
                              40 * this.tamairo[var126],
                              0,
                              40,
                              40
                           );
                     }
                  }
               }

               for (this.aa = 0; this.aa < this.bom_max; this.aa++) {
                  if (this.bommode[this.aa] != 0) {
                     var133 = (int)this.bomX[this.aa];
                     var6 = (int)this.bomY[this.aa];
                     if (this.bommode[this.aa] == 1) {
                        this.g.drawImage(this.image[5], var133 - 15, var6 - 15, 30 * (this.aa % 4), 60, 30, 30);
                     } else if (this.bommode[this.aa] == 4) {
                        this.g
                           .drawImage(
                              this.image[18],
                              var133 - 15 + (this.rand.nextInt() >>> 1) % (this.bomtime[this.aa] + 1) / 15 - this.bomtime[this.aa] / 15,
                              var6 - 15 + (this.rand.nextInt() >>> 1) % (this.bomtime[this.aa] + 1) / 15 - this.bomtime[this.aa] / 15,
                              30 * (this.aa % 5),
                              0,
                              30,
                              30
                           );
                     }
                  }
               }

               for (int var127 = 0; var127 < effect_see_max; var127++) {
                  if (effectmode[var127] != 0) {
                     this.effectdraw(var127);
                  }
               }

               if (this.peopleslow != 0) {
                  this.g.setColor(Graphics.getColorOfRGB(230, 230, 255));
                  this.g.fillArc(this.peopleX - 3, this.peopleY - 3, 6, 6, 0, 360);
                  this.g.setColor(Graphics.getColorOfRGB(0, 0, 255));
                  this.g.drawArc(this.peopleX - 3, this.peopleY - 3, 6, 6, 0, 360);
               }

               for (int var128 = 0; var128 < effect_see_max; var128++) {
                  var133 = (int)effectX[var128];
                  var6 = (int)effectY[var128];
                  if (effectmode[var128] == 11) {
                     if (effectholdnumber2[var128] != 0) {
                        if (effectholdnumber0[var128] <= 3) {
                           this.standimg[effectholdnumber0[var128]].setAlpha(255);
                           this.g.drawImage(this.standimg[effectholdnumber0[var128]], var133 - 120, var6 - 120);
                        } else {
                           this.standimg[4].setAlpha(255);
                           this.g.drawImage(this.standimg[4], var133 - 120, var6 - 120);
                        }
                     }
                  } else if (effectmode[var128] == 13) {
                     if (effectholdnumber0[var128] != 0) {
                        this.g.setFont(Font.getFont(1879048448));
                        this.drawBold(" GET SPELL CARD BONUS", 11, 50, Graphics.getColorOfRGB(55, 55, 205), Graphics.getColorOfRGB(55, 205, 155));
                        this.g.setFont(Font.getFont(1879048448));
                        this.drawBold(
                           " << " + this.formatNum(effectholdnumber0[var128], 7) + " >> ",
                           40,
                           70,
                           Graphics.getColorOfRGB(125, 125, 225),
                           Graphics.getColorOfRGB(125, 225, 175)
                        );
                     } else {
                        this.g.setFont(Font.getFont(1879049216));
                        this.drawBold("Spell bonus failed …", 40, 50, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
                     }
                  }
               }

               for (int var129 = 0; var129 < effect_see_max; var129++) {
                  if (effectmode[var129] == 10) {
                     if (effectholdnumber1[var129] == 0) {
                        this.g.setColor(Graphics.getColorOfRGB(0, 0, 20, 180));
                        this.g.fillRect(0, 160, 200, effecttime[var129] * 2);
                     } else if (effectholdnumber1[var129] == 1) {
                        this.g.setColor(Graphics.getColorOfRGB(0, 0, 20, 180));
                        this.g.fillRect(0, 160, 200, 60);
                        this.g.setFont(Font.getFont(1879049216));
                        this.drawBold(kaiwa1, 5, 180, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
                        this.drawBold(kaiwa2, 5, 195, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
                        this.drawBold(kaiwa3, 5, 210, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
                     } else if (effectholdnumber1[var129] == 2) {
                        this.g.setColor(Graphics.getColorOfRGB(0, 0, 20, 180));
                        this.g.fillRect(0, 160, 200, 61 - effecttime[var129] * 3);
                     }
                  }
               }

               if (this.bossmode != 0) {
                  if (this.bosstairyoku_k != 0.0F) {
                     if (this.bossspel == 0) {
                        this.g.setColor(Graphics.getColorOfRGB(255, 180, 180));
                        this.g.fillRect(3, 10, 42 + (int)(this.bosstairyoku * 140.0F / this.bosstairyoku_k), 2);
                        this.g.setColor(Graphics.getColorOfRGB(225, 120, 120));
                        this.g.fillRect(3, 12, 42 + (int)(this.bosstairyoku * 140.0F / this.bosstairyoku_k), 1);
                        this.g.setColor(Graphics.getColorOfRGB(255, 50, 50));
                        this.g.fillRect(3, 10, 42, 2);
                        this.g.setColor(Graphics.getColorOfRGB(185, 0, 0));
                        this.g.fillRect(3, 12, 42, 1);
                        this.g.setFont(Font.getFont(1879049216));
                        if (this.bossnokori > -1) {
                           this.drawBold(
                              "☆×" + this.formatNum(this.bossnokori, 2), 2, 40, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255)
                           );
                        }
                     }

                     if (this.bossspel == 1) {
                        this.g.setFont(Font.getFont(1879049216));
                        if (this.bossnokori > -1) {
                           this.drawBold(
                              "☆×" + this.formatNum(this.bossnokori, 2), 2, 40, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255)
                           );
                        }

                        this.g.setColor(Graphics.getColorOfRGB(255, 50, 50));
                        this.g.fillRect(3, 10, 3 + (int)(this.bosstairyoku * 40.0F / this.bosstairyoku_k), 2);
                        this.g.setColor(Graphics.getColorOfRGB(185, 0, 0));
                        this.g.fillRect(3, 12, 3 + (int)(this.bosstairyoku * 40.0F / this.bosstairyoku_k), 1);
                     }

                     if (this.bossspel == 2) {
                        this.g.setColor(Graphics.getColorOfRGB(255, 180, 180));
                        this.g.fillRect(3, 10, 5 + (int)(this.bosstairyoku * 180.0F / this.bosstairyoku_k), 4);
                     }
                  }

                  this.g.setFont(Font.getFont(1879049216));
                  this.power_view = (this.bosstimelim + 1) / 30;
                  this.drawBold(" " + this.formatNum(this.power_view, 2), 157, 40, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
                  this.power_view = (this.bosstimelim + 1) / 3 % 10;
                  this.drawBold("." + this.formatNum(this.power_view, 1), 173, 40, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
               }

               if (this.peopleX > 50) {
                  for (this.cyc = 0; this.cyc < this.peoplehosi; this.cyc++) {
                     this.drawBold("☆", 5 + this.cyc * 8, 230, Graphics.getColorOfRGB(255, 255, 255), Graphics.getColorOfRGB(170, 0, 255));
                  }
               }

               this.g.drawImage(this.flameimg[0], 0, 0);
               this.g.setFont(Font.getFont(1879049216));
               boolean var130 = false;
               this.aa = -10;
               this.drawBold("HiScore", 192, 25 + this.aa, Graphics.getColorOfRGB(55, 55, 155), Graphics.getColorOfRGB(185, 255, 205));
               if (this.peoplehighscore[peoplebomkind] > this.peoplescore) {
                  this.drawBold(
                     this.formatNum(this.peoplehighscore[peoplebomkind], 8),
                     192,
                     36 + this.aa,
                     Graphics.getColorOfRGB(55, 55, 155),
                     Graphics.getColorOfRGB(185, 255, 205)
                  );
               } else if (this.peoplehighscore[peoplebomkind] <= this.peoplescore) {
                  this.drawBold(
                     this.formatNum(this.peoplescore, 8), 192, 36 + this.aa, Graphics.getColorOfRGB(55, 55, 155), Graphics.getColorOfRGB(185, 255, 205)
                  );
               }

               this.drawBold("SCORE", 192, 47 + this.aa, Graphics.getColorOfRGB(55, 55, 155), Graphics.getColorOfRGB(205, 255, 205));
               this.drawBold(this.formatNum(this.peoplescore, 8), 192, 58 + this.aa, Graphics.getColorOfRGB(55, 55, 155), Graphics.getColorOfRGB(235, 255, 235));
               this.drawBold("People", 192, 69 + this.aa, Graphics.getColorOfRGB(55, 55, 155), Graphics.getColorOfRGB(205, 255, 205));
               if (this.peoplezannki < 8) {
                  for (this.cyc = 0; this.cyc < this.peoplezannki; this.cyc++) {
                     this.drawBold("★", 192 + this.cyc * 6, 80 + this.aa, Graphics.getColorOfRGB(55, 55, 155), Graphics.getColorOfRGB(235, 255, 235));
                  }
               } else {
                  this.drawBold("★×" + this.peoplezannki, 197, 81 + this.aa, Graphics.getColorOfRGB(55, 55, 155), Graphics.getColorOfRGB(235, 255, 235));
               }

               this.drawBold("Power", 192, 92 + this.aa, Graphics.getColorOfRGB(55, 55, 155), Graphics.getColorOfRGB(235, 255, 235));
               this.g.setFont(Font.getFont(1879048448));
               this.drawBold(
                  " " + this.formatNum(this.peoplepower / 100, 1),
                  190,
                  105 + this.aa,
                  Graphics.getColorOfRGB(55, 55, 155),
                  Graphics.getColorOfRGB(205, 255, 205)
               );
               this.g.setFont(Font.getFont(1879049216));
               this.drawBold(
                  "." + this.formatNum(this.peoplepower % 100, 2),
                  205,
                  105 + this.aa,
                  Graphics.getColorOfRGB(55, 55, 155),
                  Graphics.getColorOfRGB(205, 255, 205)
               );
               this.drawBold("Graze", 192, 116 + this.aa, Graphics.getColorOfRGB(55, 55, 155), Graphics.getColorOfRGB(185, 255, 205));
               this.drawBold(
                  " " + this.formatNum(this.peoplekasuri, 5), 192, 127 + this.aa, Graphics.getColorOfRGB(55, 55, 155), Graphics.getColorOfRGB(185, 255, 205)
               );
               this.drawBold(this.formatNum(this.peoplepoint, 5), 210, 240, Graphics.getColorOfRGB(55, 55, 155), Graphics.getColorOfRGB(235, 255, 235));
               if (this.bossmode != 0) {
                  if (!(this.eX[this.bossnum] > this.peopleX + 10) && !(this.eX[this.bossnum] < this.peopleX - 10)) {
                     this.g.setColor(Graphics.getColorOfRGB(255, 0, 0, 120));
                     this.g.fillRect((int)this.eX[this.bossnum] - 10, 236, 20, 4);
                  } else {
                     this.g.setColor(Graphics.getColorOfRGB(255, 0, 0, 180));
                     this.g.fillRect((int)this.eX[this.bossnum] - 10, 236, 20, 4);
                     this.g.fillRect((int)this.eX[this.bossnum] - 5, 236, 10, 4);
                  }
               }

               if (this.stagemen == 5 && this.stagepractice == 0 && this.stagetime > 80240) {
                  this.g.setColor(Graphics.getColorOfRGB(255, 255, 255, (this.stagetime - 80240) * 4));
                  this.g.fillRect(0, 0, 240, 240);
               }
            }

            if (this.gamemode != 1) {
               if (this.gamemode == 0) {
                  this.titledraw();
               }

               if (this.gamemode == 2) {
                  this.pausedraw();
               }

               if (this.gamemode == 3) {
                  this.gameoverdraw();
               }

               if (this.gamemode == 4) {
                  this.eddraw();
               }

               if (this.gamemode == 5) {
                  this.sfdraw();
               }
            }

            this.g.unlock(true);
         }

         if (this.gamemode == 0) {
            this.stagetime++;
            this.stagetime2++;
            this.titleeffectmove();
            if (this.keyEvent == 22) {
               IApplication.getCurrentApp().launch(1, new String[]{"http://womohide.turubeotoshi.com/"});
            }

            if (this.stagetime == 1 || this.stagetime == 141) {
               this.setSoftLabel(0, "戻る");
               this.setSoftLabel(1, "ｻｲﾄ");
            }

            if (this.stagetime < 80) {
               for (this.cyc = 0; this.cyc < 7; this.cyc++) {
                  if (this.stagetime == 30 + this.cyc * 4) {
                     effectIn(900.0F, 0.0F, 3, this.cyc, 0, 0);
                  }
               }

               if (this.stagetime == 30) {
                  effectIn(900.0F, 0.0F, 5, 0, 0, 0);
               }
            } else if (this.titlemode == 0) {
               if (this.titleflag == 0) {
                  if (this.keyEvent == 20) {
                     effectIn(900.0F, 80.0F, 6, 0, 0, 0);
                     effectIn(900.0F, 150.0F, 6, 0, 0, 1);
                     this.titlemode = 1;
                     this.stagepractice = 0;
                  }
               } else if (this.titleflag == 1) {
                  if (this.stageopenH[6] == 1 && this.keyEvent == 20) {
                     effectIn(900.0F, 120.0F, 6, 0, 0, 2);
                     this.titlemode = 1;
                     this.stagepractice = 2;
                  }
               } else if (this.titleflag == 2) {
                  if (this.keyEvent == 20) {
                     effectIn(900.0F, 80.0F, 6, 0, 0, 0);
                     effectIn(900.0F, 150.0F, 6, 0, 0, 1);
                     this.titlemode = 1;
                     this.stagepractice = 1;
                  }
               } else if (this.titleflag == 3) {
                  if (this.keyEvent == 20) {
                     this.titlemode = 6;
                     this.titleflag = 0;
                  }
               } else if (this.titleflag == 4) {
                  if (this.keyEvent == 20) {
                     this.musicnum = 0;
                     this.musictop = 0;
                     this.playmusic = 0;
                     this.titlemode = 4;
                  }
               } else if (this.titleflag == 5) {
                  if (this.keyEvent == 20) {
                     this.titlemode = 5;
                     this.titleflag = 0;
                  }
               } else if (this.titleflag == 6 && this.keyEvent == 20) {
                  IApplication.getCurrentApp().terminate();
               }

               if (this.keyEvent == 17) {
                  this.titleflag--;
                  if (this.titleflag == -1) {
                     this.titleflag = 6;
                  }
               }

               if (this.keyEvent == 19) {
                  this.titleflag++;
                  if (this.titleflag == 7) {
                     this.titleflag = 0;
                  }
               }
            } else if (this.titlemode == 1) {
               if (this.keyEvent == 16 || this.keyEvent == 17 || this.keyEvent == 18 || this.keyEvent == 19) {
                  if (this.stagelevel == 0) {
                     this.stagelevel = 1;
                  } else if (this.stagelevel == 1) {
                     this.stagelevel = 0;
                  }
               }

               if (this.keyEvent == 20) {
                  this.titlemode = 2;
               }

               if (this.keyEvent == 21) {
                  for (this.cyc = 0; this.cyc < 7; this.cyc++) {
                     effectIn(900.0F, 0.0F, 3, this.cyc, 0, 0);
                  }

                  effectIn(900.0F, 0.0F, 5, 0, 0, 0);
                  this.titlemode = 0;
               }
            } else if (this.titlemode == 2) {
               if (this.keyEvent == 16 || this.keyEvent == 17 || this.keyEvent == 18 || this.keyEvent == 19) {
                  if (peoplebomkind == 0 || peoplebomkind == 2) {
                     peoplebomkind = 1;
                  } else if (peoplebomkind == 1 || peoplebomkind == 3) {
                     peoplebomkind = 0;
                  }
               }

               if (this.keyEvent == 20) {
                  this.titlemode = 22;
               }

               if (this.keyEvent == 21) {
                  if (this.stagepractice == 0 || this.stagepractice == 1) {
                     effectIn(900.0F, 80.0F, 6, 0, 0, 0);
                     effectIn(900.0F, 150.0F, 6, 0, 0, 1);
                  } else if (this.stagepractice == 2) {
                     effectIn(900.0F, 120.0F, 6, 0, 0, 2);
                  } else if (this.stagepractice == 3) {
                     effectIn(900.0F, 120.0F, 6, 0, 0, 3);
                  }

                  this.titlemode = 1;
               }
            } else if (this.titlemode == 22) {
               if (this.keyEvent == 16 || this.keyEvent == 17 || this.keyEvent == 18 || this.keyEvent == 19) {
                  if (peoplebomkind == 0) {
                     peoplebomkind = 2;
                  } else if (peoplebomkind == 1) {
                     peoplebomkind = 3;
                  } else if (peoplebomkind == 2) {
                     peoplebomkind = 0;
                  } else if (peoplebomkind == 3) {
                     peoplebomkind = 1;
                  }
               }

               if (this.keyEvent == 20) {
                  if (this.stagepractice == 0) {
                     this.setSoftLabel(0, "休憩");
                     this.setSoftLabel(1, "休憩");
                     effectIn(0.0F, 0.0F, 1, 0, 0, 0);
                  } else if (this.stagepractice == 1) {
                     this.titlemode = 3;
                  } else if (this.stagepractice == 2) {
                     this.setSoftLabel(0, "休憩");
                     this.setSoftLabel(1, "休憩");
                     effectIn(0.0F, 0.0F, 1, 1, 0, 0);
                  } else if (this.stagepractice == 3) {
                     this.titleflag = 0;
                     this.titlemode = 7;
                  }
               }

               if (this.keyEvent == 21) {
                  this.titlemode = 2;
               }
            } else if (this.titlemode == 3) {
               if (this.keyEvent == 17) {
                  this.stagemen--;
                  if (this.stagemen == -1) {
                     this.stagemen = 5;
                  }
               }

               if (this.keyEvent == 19) {
                  this.stagemen++;
                  if (this.stagemen == 6) {
                     this.stagemen = 0;
                  }
               }

               if (this.keyEvent == 20) {
                  if (this.stagelevel == 0 && this.stageopen[this.stagemen] == 1) {
                     this.setSoftLabel(0, "休憩");
                     this.setSoftLabel(1, "休憩");
                     this.gamemode = 1;
                     this.cyc = peoplebomkind;
                     int var161 = this.stagemen;
                     this.makefirst();
                     peoplebomkind = this.cyc;
                     this.peoplezannki = 8;
                     this.stagemen = var161;
                     this.peoplepower = 400;
                     this.stagepractice = 1;
                  } else if (this.stagelevel == 1 && this.stageopenH[this.stagemen] == 1) {
                     this.setSoftLabel(0, "休憩");
                     this.setSoftLabel(1, "休憩");
                     this.gamemode = 1;
                     this.cyc = peoplebomkind;
                     int var160 = this.stagemen;
                     this.makefirst();
                     peoplebomkind = this.cyc;
                     this.peoplezannki = 8;
                     this.stagemen = var160;
                     this.peoplepower = 400;
                     this.stagepractice = 1;
                  }
               }

               if (this.keyEvent == 21) {
                  this.titlemode = 22;
               }
            } else if (this.titlemode == 4) {
               if (this.keyEvent == 17) {
                  this.musicnum--;
                  if (this.musicnum == -1) {
                     this.musicnum = 17;
                  }
               }

               if (this.keyEvent == 19) {
                  this.musicnum++;
                  if (this.musicnum == 18) {
                     this.musicnum = 0;
                  }
               }

               if (this.keyEvent == 20) {
                  this.player.stop();

                  try {
                     MediaSound var162 = MediaManager.getSound("resource:///" + this.musicnum + ".mld");
                     var162.use();
                     this.player = AudioPresenter.getAudioPresenter();
                     this.player.setSound(var162);
                     this.player.setMediaListener(this);
                  } catch (Exception var118) {
                  }

                  this.player.setAttribute(4, this.volume);
                  this.player.play();
                  this.playmusic = this.musicnum;
               }

               if (this.keyEvent == 21) {
                  this.player.stop();

                  try {
                     MediaSound var163 = MediaManager.getSound("resource:///0.mld");
                     var163.use();
                     this.player = AudioPresenter.getAudioPresenter();
                     this.player.setSound(var163);
                     this.player.setMediaListener(this);
                  } catch (Exception var117) {
                  }

                  this.player.setAttribute(4, this.volume);
                  this.player.play();

                  for (this.cyc = 0; this.cyc < 7; this.cyc++) {
                     effectIn(900.0F, 0.0F, 3, this.cyc, 0, 0);
                  }

                  effectIn(900.0F, 0.0F, 5, 0, 0, 0);
                  this.titlemode = 0;
               }
            } else if (this.titlemode == 5) {
               if (this.keyEvent == 21) {
                  this.save();

                  for (this.cyc = 0; this.cyc < 7; this.cyc++) {
                     effectIn(900.0F, 0.0F, 3, this.cyc, 0, 0);
                  }

                  effectIn(900.0F, 0.0F, 5, 0, 0, 0);
                  this.titlemode = 0;
                  this.titleflag = 0;
               }

               if (this.titleflag == 0) {
                  if (this.keyEvent == 18) {
                     this.volume += 5;
                     if (this.volume > 100) {
                        this.volume = 100;
                     }

                     this.player.setAttribute(4, this.volume);
                  } else if (this.keyEvent == 16) {
                     this.volume -= 5;
                     if (this.volume < 0) {
                        this.volume = 0;
                     }

                     this.player.setAttribute(4, this.volume);
                  }
               }

               if (this.titleflag == 1) {
                  if (this.keyEvent == 18) {
                     this.sevolume += 5;
                     if (this.sevolume > 100) {
                        this.sevolume = 100;
                     }
                  } else if (this.keyEvent == 16) {
                     this.sevolume -= 5;
                     if (this.sevolume < 0) {
                        this.sevolume = 0;
                     }
                  }

                  if (this.stagetime2 % 30 == 0) {
                     this.seplayer[3].setAttribute(4, this.sevolume);
                     if (this.sevolume != 0) {
                        this.seplayer[3].play();
                     }
                  }
               }

               if (this.titleflag == 2) {
                  if (this.keyEvent == 18) {
                     this.shotkey++;
                     if (this.shotkey == 12) {
                        this.shotkey = 20;
                     }

                     if (this.shotkey > 20) {
                        this.shotkey = 20;
                     }
                  } else if (this.keyEvent == 16) {
                     this.shotkey--;
                     if (this.shotkey < 0) {
                        this.shotkey = 0;
                     }

                     if (this.shotkey == 19) {
                        this.shotkey = 11;
                     }
                  }
               }

               if (this.titleflag == 3) {
                  if (this.keyEvent == 18) {
                     this.speedkey++;
                     if (this.speedkey == 12) {
                        this.speedkey = 20;
                     }

                     if (this.speedkey > 20) {
                        this.speedkey = 20;
                     }
                  } else if (this.keyEvent == 16) {
                     this.speedkey--;
                     if (this.speedkey < 0) {
                        this.speedkey = 0;
                     }

                     if (this.speedkey == 19) {
                        this.speedkey = 11;
                     }
                  }
               }

               if (this.titleflag == 4) {
                  if (this.keyEvent == 18) {
                     this.bomkey++;
                     if (this.bomkey == 12) {
                        this.bomkey = 20;
                     }

                     if (this.bomkey > 20) {
                        this.bomkey = 20;
                     }
                  } else if (this.keyEvent == 16) {
                     this.bomkey--;
                     if (this.bomkey < 0) {
                        this.bomkey = 0;
                     }

                     if (this.bomkey == 19) {
                        this.bomkey = 11;
                     }
                  }
               }

               if (this.titleflag == 5 && (this.keyEvent == 18 || this.keyEvent == 16)) {
                  if (this.byougamode == 1) {
                     this.byougamode = 2;
                  } else if (this.byougamode == 2) {
                     this.byougamode = 1;
                  }
               }

               if (this.titleflag == 6 && this.keyEvent == 20) {
                  this.save();

                  for (this.cyc = 0; this.cyc < 7; this.cyc++) {
                     effectIn(900.0F, 0.0F, 3, this.cyc, 0, 0);
                  }

                  effectIn(900.0F, 0.0F, 5, 0, 0, 0);
                  this.titlemode = 0;
                  this.titleflag = 0;
               }

               if (this.keyEvent == 17) {
                  this.titleflag--;
                  if (this.titleflag == -1) {
                     this.titleflag = 6;
                  }
               }

               if (this.keyEvent == 19) {
                  this.titleflag++;
                  if (this.titleflag == 7) {
                     this.titleflag = 0;
                  }
               }
            } else if (this.titlemode == 6) {
               if (this.keyEvent == 21) {
                  for (this.cyc = 0; this.cyc < 7; this.cyc++) {
                     effectIn(900.0F, 0.0F, 3, this.cyc, 0, 0);
                  }

                  effectIn(900.0F, 0.0F, 5, 0, 0, 0);
                  this.titlemode = 0;
                  this.titleflag = 0;
               }

               if (this.keyEvent == 16) {
                  this.titleflag--;
                  if (this.titleflag == -1) {
                     this.titleflag = 3;
                  }
               }

               if (this.keyEvent == 18) {
                  this.titleflag++;
                  if (this.titleflag == 4) {
                     this.titleflag = 0;
                  }
               }
            } else if (this.titlemode == 7) {
               if (this.keyEvent == 21) {
                  for (this.cyc = 0; this.cyc < 7; this.cyc++) {
                     effectIn(900.0F, 0.0F, 3, this.cyc, 0, 0);
                  }

                  effectIn(900.0F, 0.0F, 5, 0, 0, 0);
                  this.titlemode = 0;
                  this.titleflag = 0;
               }

               if (this.keyEvent == 20) {
                  if (this.titleflag != 2) {
                     this.setSoftLabel(0, "休憩");
                     this.setSoftLabel(1, "休憩");
                     this.gamemode = 1;
                     this.cyc = peoplebomkind;
                     int var164 = this.titleflag;
                     this.makefirst();
                     peoplebomkind = this.cyc;
                     this.peoplezannki = 8;
                     this.stagemen = 10 + var164;
                     this.peoplepower = 400;
                     this.stagepractice = 3;
                  } else {
                     for (this.cyc = 0; this.cyc < 7; this.cyc++) {
                        effectIn(900.0F, 0.0F, 3, this.cyc, 0, 0);
                     }

                     effectIn(900.0F, 0.0F, 5, 0, 0, 0);
                     this.titlemode = 0;
                     this.titleflag = 3;
                  }
               }

               if (this.keyEvent == 17) {
                  this.titleflag--;
                  if (this.titleflag == -1) {
                     this.titleflag = 2;
                  }
               }

               if (this.keyEvent == 19) {
                  this.titleflag++;
                  if (this.titleflag == 3) {
                     this.titleflag = 0;
                  }
               }
            }

            this.keyEvent = -999;
         } else if (this.gamemode == 2) {
            if (this.keyEvent == 21) {
               this.gamemode = 1;
               this.player.restart();
            }

            if (this.keyEvent == 22) {
               this.gamemode = 1;
               this.player.restart();
            }

            if (this.titlemode == 0) {
               if (this.keyEvent == 20) {
                  this.gamemode = 1;
                  this.player.restart();
               }
            } else if (this.titlemode == 1) {
               if (this.keyEvent == 20) {
                  this.gamemode = 0;
                  this.titlemode = 0;
                  this.player.stop();

                  try {
                     MediaSound var159 = MediaManager.getSound("resource:///0.mld");
                     var159.use();
                     this.player = AudioPresenter.getAudioPresenter();
                     this.player.setSound(var159);
                     this.player.setMediaListener(this);
                  } catch (Exception var116) {
                  }

                  this.player.setAttribute(4, this.volume);
                  this.player.play();
                  this.makefirst();

                  for (this.cyc = 0; this.cyc < 7; this.cyc++) {
                     effectIn(900.0F, 0.0F, 3, this.cyc, 0, 0);
                  }

                  effectIn(900.0F, 0.0F, 4, 0, 0, 0);
                  effectIn(900.0F, 0.0F, 5, 0, 0, 0);
                  this.stagetime = 140;
               }
            } else if (this.titlemode == 2 && this.keyEvent == 20) {
               if (this.stagepractice == 0) {
                  this.gamemode = 1;
                  this.cyc = peoplebomkind;
                  this.makefirst();
                  peoplebomkind = this.cyc;
               } else if (this.stagepractice == 1) {
                  this.gamemode = 1;
                  this.cyc = peoplebomkind;
                  this.cyc2 = this.stagemen;
                  this.makefirst();
                  this.konnte = 1;
                  peoplebomkind = this.cyc;
                  this.stagemen = this.cyc2;
                  this.peoplezannki = 8;
                  this.peoplepower = 400;
               } else if (this.stagepractice == 2) {
                  this.gamemode = 1;
                  this.cyc = peoplebomkind;
                  this.cyc2 = this.stagemen;
                  this.makefirst();
                  this.konnte = 1;
                  peoplebomkind = this.cyc;
                  this.stagemen = this.cyc2;
               }
            }

            if (this.keyEvent == 17) {
               this.titlemode--;
            } else if (this.keyEvent == 19) {
               this.titlemode++;
            }

            this.titlemode = (this.titlemode + 3000) % 3;
            this.keyEvent = -999;
         } else if (this.gamemode == 3) {
            if (this.titlemode == 0) {
               if (this.keyEvent == 20) {
                  if (this.stagepractice == 0) {
                     this.gamemode = 1;
                     this.cyc = peoplebomkind;
                     this.cyc2 = this.stagemen;
                     this.makefirst();
                     this.konnte = 1;
                     peoplebomkind = this.cyc;
                     this.stagemen = this.cyc2;
                     this.peoplepower = 200;
                     this.load();
                  } else if (this.stagepractice == 1) {
                     this.gamemode = 1;
                     this.cyc = peoplebomkind;
                     this.cyc2 = this.stagemen;
                     this.makefirst();
                     this.konnte = 1;
                     peoplebomkind = this.cyc;
                     this.stagemen = this.cyc2;
                     this.peoplezannki = 8;
                     this.peoplepower = 400;
                     this.load();
                  } else if (this.stagepractice == 2) {
                     this.gamemode = 1;
                     this.cyc = peoplebomkind;
                     this.cyc2 = this.stagemen;
                     this.makefirst();
                     this.konnte = 1;
                     peoplebomkind = this.cyc;
                     this.stagemen = this.cyc2;
                     this.load();
                  }
               }
            } else if (this.titlemode == 1) {
               if (this.keyEvent == 20) {
                  this.gamemode = 0;
                  this.titlemode = 0;
                  this.player.stop();

                  try {
                     MediaSound var158 = MediaManager.getSound("resource:///0.mld");
                     var158.use();
                     this.player = AudioPresenter.getAudioPresenter();
                     this.player.setSound(var158);
                     this.player.setMediaListener(this);
                  } catch (Exception var115) {
                  }

                  this.player.setAttribute(4, this.volume);
                  this.player.play();
                  this.makefirst();

                  for (this.cyc = 0; this.cyc < 7; this.cyc++) {
                     effectIn(900.0F, 0.0F, 3, this.cyc, 0, 0);
                  }

                  effectIn(900.0F, 0.0F, 4, 0, 0, 0);
                  effectIn(900.0F, 0.0F, 5, 0, 0, 0);
                  this.stagetime = 140;
               }
            } else if (this.titlemode == 2 && this.keyEvent == 20) {
               this.load();
               if (this.stagepractice == 0) {
                  this.gamemode = 1;
                  this.cyc = peoplebomkind;
                  this.makefirst();
                  peoplebomkind = this.cyc;
               } else if (this.stagepractice == 1) {
                  this.gamemode = 1;
                  this.cyc = peoplebomkind;
                  this.cyc2 = this.stagemen;
                  this.makefirst();
                  this.konnte = 1;
                  peoplebomkind = this.cyc;
                  this.stagemen = this.cyc2;
                  this.peoplezannki = 8;
                  this.peoplepower = 400;
               } else if (this.stagepractice == 2) {
                  this.gamemode = 1;
                  this.cyc = peoplebomkind;
                  this.cyc2 = this.stagemen;
                  this.makefirst();
                  this.konnte = 1;
                  peoplebomkind = this.cyc;
                  this.stagemen = this.cyc2;
               }
            }

            if (this.keyEvent == 17) {
               this.titlemode--;
            }

            if (this.keyEvent == 19) {
               this.titlemode++;
            }

            this.titlemode = (this.titlemode + 3000) % 3;
            this.keyEvent = -999;
         } else if (this.gamemode == 4) {
            this.stagetime++;
            if (this.stagetime == 1) {
               this.stageY = 0.0F;
               this.player.stop();

               try {
                  MediaSound var141 = MediaManager.getSound("resource:///16.mld");
                  var141.use();
                  this.player = AudioPresenter.getAudioPresenter();
                  this.player.setSound(var141);
                  this.player.setMediaListener(this);
               } catch (Exception var114) {
               }

               this.player.setAttribute(4, this.volume);
               this.player.play();
            }

            if (this.stagetime > 270) {
               tohokaiwa.getedkaiwa(this.konnte, this.edflag);
               if (this.keyEvent == 20) {
                  this.edflag++;
                  tohokaiwa.effectflag = 0;
               }
            }

            if (peoplebomkind % 2 == 0) {
               if (this.konnte == 0) {
                  if (this.edflag > 10) {
                     this.stagetime = 0;
                     this.gamemode = 5;
                     this.edflag = 0;

                     try {
                        MediaImage var142 = MediaManager.getImage("resource:///omball.gif");
                        var142.use();
                        this.titleimg[0] = var142.getImage();
                     } catch (Exception var113) {
                     }

                     try {
                        MediaImage var143 = MediaManager.getImage("resource:///st.gif");
                        var143.use();
                        this.titleimg[1] = var143.getImage();
                     } catch (Exception var112) {
                     }

                     try {
                        MediaImage var144 = MediaManager.getImage("resource:///name.jpg");
                        var144.use();
                        this.titleimg[2] = var144.getImage();
                     } catch (Exception var111) {
                     }

                     try {
                        MediaImage var145 = MediaManager.getImage("resource:///dr.gif");
                        var145.use();
                        this.titleimg[3] = var145.getImage();
                     } catch (Exception var110) {
                     }
                  }
               } else if (this.edflag > 8) {
                  this.stagetime = 0;
                  this.gamemode = 5;
                  this.edflag = 0;

                  try {
                     MediaImage var146 = MediaManager.getImage("resource:///omball.gif");
                     var146.use();
                     this.titleimg[0] = var146.getImage();
                  } catch (Exception var109) {
                  }

                  try {
                     MediaImage var147 = MediaManager.getImage("resource:///st.gif");
                     var147.use();
                     this.titleimg[1] = var147.getImage();
                  } catch (Exception var108) {
                  }

                  try {
                     MediaImage var148 = MediaManager.getImage("resource:///name.jpg");
                     var148.use();
                     this.titleimg[2] = var148.getImage();
                  } catch (Exception var107) {
                  }

                  try {
                     MediaImage var149 = MediaManager.getImage("resource:///dr.gif");
                     var149.use();
                     this.titleimg[3] = var149.getImage();
                  } catch (Exception var106) {
                  }
               }
            } else if (peoplebomkind % 2 == 1) {
               if (this.konnte == 0) {
                  if (this.edflag > 18) {
                     this.stagetime = 0;
                     this.gamemode = 5;
                     this.edflag = 0;

                     try {
                        MediaImage var150 = MediaManager.getImage("resource:///omball.gif");
                        var150.use();
                        this.titleimg[0] = var150.getImage();
                     } catch (Exception var105) {
                     }

                     try {
                        MediaImage var151 = MediaManager.getImage("resource:///st.gif");
                        var151.use();
                        this.titleimg[1] = var151.getImage();
                     } catch (Exception var104) {
                     }

                     try {
                        MediaImage var152 = MediaManager.getImage("resource:///name.jpg");
                        var152.use();
                        this.titleimg[2] = var152.getImage();
                     } catch (Exception var103) {
                     }

                     try {
                        MediaImage var153 = MediaManager.getImage("resource:///dr.gif");
                        var153.use();
                        this.titleimg[3] = var153.getImage();
                     } catch (Exception var102) {
                     }
                  }
               } else if (this.edflag > 6) {
                  this.stagetime = 0;
                  this.gamemode = 5;
                  this.edflag = 0;

                  try {
                     MediaImage var154 = MediaManager.getImage("resource:///omball.gif");
                     var154.use();
                     this.titleimg[0] = var154.getImage();
                  } catch (Exception var101) {
                  }

                  try {
                     MediaImage var155 = MediaManager.getImage("resource:///st.gif");
                     var155.use();
                     this.titleimg[1] = var155.getImage();
                  } catch (Exception var100) {
                  }

                  try {
                     MediaImage var156 = MediaManager.getImage("resource:///name.jpg");
                     var156.use();
                     this.titleimg[2] = var156.getImage();
                  } catch (Exception var99) {
                  }

                  try {
                     MediaImage var157 = MediaManager.getImage("resource:///dr.gif");
                     var157.use();
                     this.titleimg[3] = var157.getImage();
                  } catch (Exception var98) {
                  }
               }
            }

            this.keyEvent = -999;
         } else if (this.gamemode == 5) {
            this.stagetime++;
            if (this.stagetime == 1) {
               this.stageY = 0.0F;
               this.stageXmove = 0.0F;
               this.stageYmove = 0.0F;

               for (this.aa = 0; this.aa < effect_max; this.aa++) {
                  effectmode[this.aa] = 0;
               }
            } else if (this.stagetime < 61) {
               if (this.volume - this.stagetime * 4 < 0) {
                  this.player.setAttribute(4, 0);
               } else {
                  this.player.setAttribute(4, this.volume - this.stagetime * 4);
               }
            } else if (this.stagetime == 61) {
               this.player.stop();
            } else if (this.stagetime == 101) {
               try {
                  MediaSound var139 = MediaManager.getSound("resource:///17.mld");
                  var139.use();
                  this.player = AudioPresenter.getAudioPresenter();
                  this.player.setSound(var139);
                  this.player.setMediaListener(this);
               } catch (Exception var97) {
               }

               this.player.setAttribute(4, this.volume);
               this.player.play();
            } else if (this.stagetime == 230) {
               effectIn(120.0F, -20.0F, 1, 0, 0, 0);
            }

            if (this.stagetime > 275 && this.stagetime < 325) {
               this.stageYmove = (float)(this.stageYmove + 0.2);
            } else if (this.stagetime == 350) {
               this.stageYmove = 10.0F;
            }

            if (this.stagetime > 1850 && this.stagetime < 1950) {
               this.stageYmove = (float)(this.stageYmove - 0.1);
            } else if (this.stagetime == 1950) {
               this.stageYmove = 0.0F;
            }

            if (this.stagetime > 440 && this.stagetime < 500) {
               this.stageY--;
            }

            if (this.stagetime == 1000) {
               this.stageXmove = -3.0F;
            }

            if (this.stagetime == 1450) {
               this.stageXmove = 0.0F;
            }

            if (this.stagetime > 2000 && this.stagetime < 2060) {
               this.stageY++;
            }

            if (this.stagetime > 100 && this.stagetime % 2 == 0) {
               effectIn((this.rand.nextInt() >>> 1) % 240, -10.0F, 2, 0, 0, 0);
               effectIn((this.rand.nextInt() >>> 1) % 240, -10.0F, 2, 1, 0, 0);
               effectIn((this.rand.nextInt() >>> 1) % 240, 250.0F, 2, 0, 0, 0);
               effectIn((this.rand.nextInt() >>> 1) % 240, 250.0F, 2, 1, 0, 0);
               effectIn((this.rand.nextInt() >>> 1) % 240, 250.0F, 2, 2, 0, 0);
            }

            for (this.aa = 0; this.aa < effect_max; this.aa++) {
               if (effectmode[this.aa] != 0) {
                  effectX[this.aa] = effectX[this.aa] + effectXmove[this.aa] - this.stageXmove;
                  effectY[this.aa] = effectY[this.aa] + effectYmove[this.aa] - this.stageYmove;
                  effecttime[this.aa]++;
                  if (effectmode[this.aa] == 1) {
                     if (effecttime[this.aa] < 51) {
                        effectYmove[this.aa] = (float)(effectYmove[this.aa] + 0.16);
                     }

                     if (effecttime[this.aa] == 151) {
                        effectYmove[this.aa] = 10.0F;
                     }

                     effectkakudo[this.aa] = effectkakudo[this.aa] + 36.0F;
                     if (this.stagetime == 1000) {
                        effectXmove[this.aa] = -3.0F;
                     }

                     if (this.stagetime == 1450) {
                        effectXmove[this.aa] = 0.0F;
                     }

                     if (this.stagetime == 1850) {
                        effectmode[this.aa] = 0;

                        for (this.cyc = 0; this.cyc < 30; this.cyc++) {
                           effectIn(
                              effectX[this.aa] + (this.rand.nextInt() >>> 1) % 30 - 15.0F,
                              effectY[this.aa] + (this.rand.nextInt() >>> 1) % 40 - 15.0F,
                              4,
                              1,
                              0,
                              0
                           );
                           effectIn(
                              effectX[this.aa] + (this.rand.nextInt() >>> 1) % 30 - 15.0F,
                              effectY[this.aa] + (this.rand.nextInt() >>> 1) % 40 - 15.0F,
                              4,
                              2,
                              0,
                              0
                           );
                        }
                     }

                     effectIn(effectX[this.aa], effectY[this.aa], 3, 0, 0, 0);
                     effectIn(
                        effectX[this.aa] + (this.rand.nextInt() >>> 1) % 30 - 15.0F, effectY[this.aa] + (this.rand.nextInt() >>> 1) % 30 - 15.0F, 4, 1, 0, 0
                     );
                     effectIn(
                        effectX[this.aa] + (this.rand.nextInt() >>> 1) % 30 - 15.0F, effectY[this.aa] + (this.rand.nextInt() >>> 1) % 30 - 15.0F, 4, 1, 0, 0
                     );
                     effectIn(
                        effectX[this.aa] + (this.rand.nextInt() >>> 1) % 30 - 15.0F, effectY[this.aa] + (this.rand.nextInt() >>> 1) % 30 - 15.0F, 4, 2, 0, 0
                     );
                  } else if (effectmode[this.aa] == 2) {
                     if (effectX[this.aa] > 280.0F || effectX[this.aa] < -30.0F || effectY[this.aa] > 280.0F || effectY[this.aa] < -30.0F) {
                        effectmode[this.aa] = 0;
                     }

                     if (effecttime[this.aa] == 1) {
                        effectXmove[this.aa] = (float)(-1.0 + (this.rand.nextInt() >>> 1) % 20 * 0.1);
                        effectYmove[this.aa] = (float)(0.5 + effectholdnumber0[this.aa] * 0.3 + (this.rand.nextInt() >>> 1) % 20 * 0.1);
                     }
                  } else if (effectmode[this.aa] == 3) {
                     if (effecttime[this.aa] == 20) {
                        effectmode[this.aa] = 0;
                     }
                  } else if (effectmode[this.aa] != 4) {
                     if (effectmode[this.aa] == 5) {
                        if (effectholdnumber1[this.aa] == 0) {
                           if (effecttime[this.aa] == 1) {
                              effectX[this.aa] = 140.0F;
                              effectY[this.aa] = 10.0F;
                              effectholdnumber0[this.aa] = 0;
                           }

                           if (effecttime[this.aa] < 21) {
                              effectX[this.aa] = 140.0F;
                              effectY[this.aa] = 10.0F;
                              effectholdnumber0[this.aa] = effectholdnumber0[this.aa] + 9;
                           }

                           if (this.titlemode != 0) {
                              effectholdnumber1[this.aa] = 1;
                              effectholdnumber0[this.aa] = 180;
                              effecttime[this.aa] = 0;
                           }
                        } else if (effectholdnumber1[this.aa] == 1) {
                           effectholdnumber0[this.aa] = effectholdnumber0[this.aa] - 18;
                           if (effecttime[this.aa] == 10) {
                              effectmode[this.aa] = 0;
                           }
                        }
                     }
                  } else {
                     if (effectX[this.aa] > 280.0F || effectX[this.aa] < -30.0F || effectY[this.aa] > 280.0F || effectY[this.aa] < -30.0F) {
                        effectmode[this.aa] = 0;
                     }

                     if (effecttime[this.aa] == 1) {
                        effectXmove[this.aa] = (float)(-4.0 + (this.rand.nextInt() >>> 1) % 80 * 0.1);
                        effectYmove[this.aa] = (float)(0.5 + effectholdnumber0[this.aa] * 0.3 + (this.rand.nextInt() >>> 1) % 20 * 0.1);
                     }
                  }
               }
            }

            if (this.stagetime > 2200 && this.keyEvent == 20) {
               this.gamemode = 0;
               this.titlemode = 0;
               this.player.stop();

               try {
                  MediaSound var140 = MediaManager.getSound("resource:///0.mld");
                  var140.use();
                  this.player = AudioPresenter.getAudioPresenter();
                  this.player.setSound(var140);
                  this.player.setMediaListener(this);
               } catch (Exception var96) {
               }

               this.player.setAttribute(4, this.volume);
               this.player.play();
               this.makefirst();

               for (this.cyc = 0; this.cyc < 7; this.cyc++) {
                  effectIn(900.0F, 0.0F, 3, this.cyc, 0, 0);
               }

               effectIn(900.0F, 0.0F, 4, 0, 0, 0);
               effectIn(900.0F, 0.0F, 5, 0, 0, 0);
               this.stagetime = 140;
            }

            this.keyEvent = -999;
         } else if (this.gamemode == 1) {
            if (this.titlekara == 1) {
               for (int var137 = 0; var137 < 10; var137++) {
                  this.titleimg[var137].dispose();
                  this.titleimg[var137] = null;
               }

               this.titlekara = 0;
            }

            if (this.keyEvent == 21) {
               this.gamemode = 2;
               this.player.pause();
            }

            if (this.keyEvent == 22) {
               this.gamemode = 2;
               this.player.pause();
            }

            this.stageY = this.stageY + this.stageYmove;
            this.stagetime++;
            this.stagetime2++;
            this.stage1move();

            for (this.aa = 0; this.aa < this.e_max; this.aa++) {
               if (this.emode[this.aa] != 0) {
                  this.etime[this.aa]++;
                  this.eX[this.aa] = this.eX[this.aa] + this.eXmove[this.aa];
                  this.eY[this.aa] = this.eY[this.aa] + this.eYmove[this.aa];
                  if (this.stagemen == 6 && this.emode[this.aa] == 10) {
                     if (this.eX[this.aa] > this.migi + 40) {
                        this.emode[this.aa] = 0;
                     }

                     if (this.eX[this.aa] < -40.0F) {
                        this.emode[this.aa] = 0;
                     }

                     if (this.eY[this.aa] > 280.0F) {
                        this.emode[this.aa] = 0;
                     }

                     if (this.eY[this.aa] < -40.0F) {
                        this.emode[this.aa] = 0;
                     }

                     if (this.emode[this.aa] == 0) {
                        this.e_seedown();
                     }
                  } else {
                     if (this.eX[this.aa] > this.migi + 20) {
                        this.emode[this.aa] = 0;
                     }

                     if (this.eX[this.aa] < -20.0F) {
                        this.emode[this.aa] = 0;
                     }

                     if (this.eY[this.aa] > 260.0F) {
                        this.emode[this.aa] = 0;
                     }

                     if (this.eY[this.aa] < -20.0F) {
                        this.emode[this.aa] = 0;
                     }

                     if (this.emode[this.aa] == 0) {
                        this.e_seedown();
                     }
                  }

                  if (this.stagemen == 0) {
                     this.stage1move(this.aa);
                  } else if (this.stagemen == 1) {
                     if (this.emode[this.aa] == 1000) {
                        this.kasatyuumove(this.aa);
                     } else if (this.emode[this.aa] == 1001) {
                        this.kogasamove(this.aa);
                     } else {
                        this.e2move(this.aa);
                     }
                  } else if (this.stagemen == 2) {
                     if (this.emode[this.aa] == 1000) {
                        this.tengutyuumove(this.aa);
                     } else if (this.emode[this.aa] == 1001) {
                        this.tengumove(this.aa);
                     } else {
                        this.stage3move(this.aa);
                     }
                  } else if (this.stagemen == 3) {
                     this.stage4move(this.aa);
                  } else if (this.stagemen == 4) {
                     this.stage5move(this.aa);
                  } else if (this.stagemen == 5) {
                     this.stage6move(this.aa);
                  } else if (this.stagemen == 6) {
                     this.stageEXmove(this.aa);
                  }

                  if (this.etairyoku[this.aa] < 0.0F) {
                     if (this.eitem[this.aa] < 4) {
                        this.itemIn(this.eX[this.aa], this.eY[this.aa], this.eitem[this.aa], 0);
                     }

                     if (this.eitem[this.aa] == 4) {
                        for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                           this.itemIn(
                              this.eX[this.aa] + (this.rand.nextInt() >>> 1) % 40 - 20.0F, this.eY[this.aa] + (this.rand.nextInt() >>> 1) % 40 - 20.0F, 1, 0
                           );
                        }
                     }

                     if (this.eitem[this.aa] == 5) {
                        for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                           this.itemIn(
                              this.eX[this.aa] + (this.rand.nextInt() >>> 1) % 40 - 20.0F, this.eY[this.aa] + (this.rand.nextInt() >>> 1) % 40 - 20.0F, 2, 0
                           );
                        }
                     }

                     if (this.eitem[this.aa] == 6) {
                        this.itemIn(this.eX[this.aa], this.eY[this.aa], 99, 0);
                     }

                     this.emode[this.aa] = 0;
                     effectIn(this.eX[this.aa], this.eY[this.aa], 1, 0, 0, 0);
                     this.e_seedown();
                  }
               }
            }

            float var138;
            if (this.peoplepower < 100) {
               var138 = 1.0F;
            } else if (this.peoplepower < 200) {
               var138 = 0.72F;
            } else if (this.peoplepower < 300) {
               var138 = 0.6F;
            } else if (this.peoplepower < 400) {
               var138 = 0.52F;
            } else {
               var138 = 0.5F;
            }

            for (this.aa = 0; this.aa < this.bullet_max; this.aa++) {
               if (this.bulletmode[this.aa] != 0) {
                  this.bullettime[this.aa]++;
                  this.bulletX[this.aa] = this.bulletX[this.aa] + this.bulletXmove[this.aa];
                  this.bulletY[this.aa] = this.bulletY[this.aa] + this.bulletYmove[this.aa];
                  if (this.bulletmode[this.aa] == 4) {
                     this.bullettime[this.aa]++;
                     this.bulletYmove[this.aa] = -12.0F;
                     if (this.bulletseehit[this.aa] == 0) {
                        if (this.bossmode == 1 && this.esuruu[this.bossnum] == 0) {
                           this.bulletkille[this.aa] = this.bossnum;
                           this.bulletseehit[this.aa] = 1;
                        } else {
                           for (this.cyc2 = 0; this.cyc2 < 10; this.cyc2++) {
                              for (this.cyc = 0; this.cyc < this.e_see_max; this.cyc++) {
                                 if (this.emode[this.cyc] != 0
                                    && this.esuruu[this.cyc] == 0
                                    && (this.eX[this.cyc] - this.bulletX[this.aa]) * (this.eX[this.cyc] - this.bulletX[this.aa])
                                          + (this.eY[this.cyc] - this.bulletY[this.aa]) * (this.eY[this.cyc] - this.bulletY[this.aa])
                                       < this.cyc2 * this.cyc2 * 625) {
                                    this.bulletkille[this.aa] = this.cyc;
                                    this.bulletseehit[this.aa] = 1;
                                    this.cyc = -999;
                                    break;
                                 }

                                 if (this.cyc == -999) {
                                    break;
                                 }
                              }

                              if (this.cyc == -999) {
                                 break;
                              }
                           }
                        }
                     }

                     if (this.etairyoku[this.bulletkille[this.aa]] < 0.0F) {
                        this.bulletseehit[this.aa] = -999;
                     }

                     if (this.emode[this.bulletkille[this.aa]] == 0) {
                        this.bulletseehit[this.aa] = -999;
                     }

                     if (this.bulletseehit[this.aa] == 1) {
                        this.bulletkakudo[this.aa] = this.getkakudo(
                           this.bulletX[this.aa], this.bulletY[this.aa], this.eX[this.bulletkille[this.aa]], this.eY[this.bulletkille[this.aa]]
                        );
                     }

                     this.bulletXmove[this.aa] = (float)(12.0 * Math.cos(this.bulletkakudo[this.aa] * 3.1415 / 180.0));
                     this.bulletYmove[this.aa] = (float)(12.0 * Math.sin(this.bulletkakudo[this.aa] * 3.1415 / 180.0));
                  }

                  if (this.bulletY[this.aa] < -10.0F || this.bulletY[this.aa] > 250.0F || this.bulletX[this.aa] > 210.0F || this.bulletX[this.aa] < -10.0F) {
                     this.bulletmode[this.aa] = 0;
                  }

                  for (this.cyc = 0; this.cyc < this.e_max; this.cyc++) {
                     if (this.emode[this.cyc] != 0
                        && (this.eX[this.cyc] - this.bulletX[this.aa]) * (this.eX[this.cyc] - this.bulletX[this.aa])
                              + (this.eY[this.cyc] - this.bulletY[this.aa]) * (this.eY[this.cyc] - this.bulletY[this.aa])
                           < 225.0F
                        && this.esuruu[this.cyc] == 0) {
                        if (this.emuteki[this.cyc] == 0) {
                           if (this.bulletmode[this.aa] == 4) {
                              this.etairyoku[this.cyc] = (float)(this.etairyoku[this.cyc] - var138 * 0.4);
                              if (this.eboss[this.cyc] == 1) {
                                 this.bosstairyoku = (float)(this.bosstairyoku - var138 * 0.4);
                              }
                           } else {
                              this.etairyoku[this.cyc] = this.etairyoku[this.cyc] - var138;
                              if (this.eboss[this.cyc] == 1) {
                                 this.bosstairyoku -= var138;
                              }
                           }
                        }

                        this.bulletmode[this.aa] = 0;
                        this.peoplescore += 10;
                        effectIn((int)this.bulletX[this.aa], (int)this.bulletY[this.aa], 2, 0, 0, 0);
                     }
                  }
               }
            }

            if (peoplebomkind == 1 && this.peoplenonshot == 0 && this.peopleshotting == 0) {
               for (this.aa = 0; this.aa < 4; this.aa++) {
                  if (this.peoplepower / 100 >= this.aa) {
                     for (this.cyc = 0; this.cyc < this.e_max; this.cyc++) {
                        if (this.emode[this.cyc] != 0
                           && this.emuteki[this.cyc] == 0
                           && this.eX[this.cyc] > this.omballX[this.aa] - 5
                           && this.eX[this.cyc] < this.omballX[this.aa] + 5
                           && this.eY[this.cyc] < this.omballY[this.aa]) {
                           this.etairyoku[this.cyc] = (float)(this.etairyoku[this.cyc] - var138 * 0.5);
                           if (this.eboss[this.cyc] == 1) {
                              this.bosstairyoku = (float)(this.bosstairyoku - var138 * 0.5);
                           }

                           this.peoplescore += 2;
                        }
                     }
                  }
               }
            }

            for (this.aa = 0; this.aa < this.bom_max; this.aa++) {
               if (this.bommode[this.aa] != 0) {
                  this.bomtime[this.aa]++;
                  this.bomX[this.aa] = this.bomX[this.aa] + this.bomXmove[this.aa];
                  this.bomY[this.aa] = this.bomY[this.aa] + this.bomYmove[this.aa];
                  if (this.bommode[this.aa] == 1) {
                     if (this.bomtime[this.aa] == 1) {
                        this.bomspeed[this.aa] = 10.0F;
                        this.bomseehit[this.aa] = -999;
                     }

                     if (this.bomtime[this.aa] < 80) {
                        this.bomX[this.aa] = (float)(this.peopleX + this.bomholdnumber0[this.aa] * Math.cos(this.bomkakudo[this.aa] * 3.1415 / 180.0));
                        this.bomY[this.aa] = (float)(this.peopleY + this.bomholdnumber0[this.aa] * Math.sin(this.bomkakudo[this.aa] * 3.1415 / 180.0));
                        if (this.bomholdnumber0[this.aa] < 40.0F) {
                           this.bomholdnumber0[this.aa] = this.bomholdnumber0[this.aa] + 3.0F;
                        }

                        this.bomkakudo[this.aa] = this.bomkakudo[this.aa] + 12.0F;
                     } else if (this.bomtime[this.aa] < 80) {
                        this.bomX[this.aa] = (float)(
                           this.peopleX + this.bomholdnumber0[this.aa] * Math.cos((this.bomkakudo[this.aa] + this.stagetime2 % 60 * 6) * 3.1415 / 180.0)
                        );
                        this.bomY[this.aa] = (float)(
                           this.peopleY + this.bomholdnumber0[this.aa] * Math.sin((this.bomkakudo[this.aa] + this.stagetime2 % 60 * 6) * 3.1415 / 180.0)
                        );
                        if (this.bomholdnumber0[this.aa] < 60.0F) {
                           this.bomholdnumber0[this.aa] = this.bomholdnumber0[this.aa] + 3.0F;
                        }
                     }

                     if (this.bomtime[this.aa] == 80) {
                        this.bomXmove[this.aa] = (float)(4.0 * Math.cos(this.bomkakudo[this.aa] * 3.1415 / 180.0));
                        this.bomYmove[this.aa] = (float)(4.0 * Math.sin(this.bomkakudo[this.aa] * 3.1415 / 180.0));
                     }

                     if (this.bomtime[this.aa] == 120) {
                        effectIn(this.bomX[this.aa], this.bomY[this.aa], 16, 2, 0, 0);
                        effectIn(this.bomX[this.aa], this.bomY[this.aa], 12, 10, 0, 0);

                        for (this.cyc = 0; this.cyc < this.tama_see_max; this.cyc++) {
                           this.kyori = (this.bomX[this.aa] - this.tamaX[this.cyc]) * (this.bomX[this.aa] - this.tamaX[this.cyc])
                              + (this.bomY[this.aa] - this.tamaY[this.cyc]) * (this.bomY[this.aa] - this.tamaY[this.cyc]);
                           if (this.kyori < 2500.0F && this.tamamode[this.cyc] != 0 && this.tamakesuna[this.cyc] == 0) {
                              this.tamamode[this.cyc] = 0;
                              effectIn(this.tamaX[this.cyc], this.tamaY[this.cyc], 5, this.tamairo[this.cyc], this.tamashape[this.cyc], 0);
                              this.itemIn(this.tamaX[this.cyc], this.tamaY[this.cyc], 3, 1);
                           }
                        }

                        if (this.sevolume != 0) {
                           AudioPresenter var185 = this.seplayer[5];
                           AudioPresenter var190 = this.seplayer[0];
                           var185.setAttribute(4, this.sevolume);
                        }

                        if (this.sevolume != 0) {
                           this.seplayer[5].play();
                        }

                        this.bommode[this.aa] = 0;
                     }

                     if (this.bomtime[this.aa] > 80) {
                        for (this.cyc = 0; this.cyc < this.e_max; this.cyc++) {
                           this.kyori = (this.bomX[this.aa] - this.eX[this.cyc]) * (this.bomX[this.aa] - this.eX[this.cyc])
                              + (this.bomY[this.aa] - this.eY[this.cyc]) * (this.bomY[this.aa] - this.eY[this.cyc]);
                           if (this.emode[this.cyc] != 0 && this.kyori < 400.0F && this.emuteki[this.cyc] == 0 && this.esuruu[this.cyc] == 0) {
                              this.etairyoku[this.cyc] = this.etairyoku[this.cyc] - 8.0F;
                              if (this.eboss[this.cyc] == 1) {
                                 this.bosstairyoku -= 8.0F;
                              }

                              effectIn(this.bomX[this.aa], this.bomY[this.aa], 16, 2, 0, 0);
                              effectIn(this.bomX[this.aa], this.bomY[this.aa], 12, 10, 0, 0);
                              if (this.sevolume != 0) {
                                 AudioPresenter var186 = this.seplayer[5];
                                 AudioPresenter var191 = this.seplayer[0];
                                 var186.setAttribute(4, this.sevolume);
                              }

                              if (this.sevolume != 0) {
                                 this.seplayer[5].play();
                              }

                              this.bommode[this.aa] = 0;
                           }
                        }

                        if (this.bomseehit[this.aa] == -999) {
                           for (this.cyc = 0; this.cyc < this.e_max; this.cyc++) {
                              if (this.emode[this.cyc] != 0 && this.emuteki[this.cyc] == 0 && this.esuruu[this.cyc] == 0) {
                                 float var168 = this.eX[this.cyc] - this.bomX[this.aa];
                                 float var178 = this.eY[this.cyc] - this.bomY[this.aa];
                                 float var182 = FastMath.atan2(var168, var178);
                                 this.bomkakudo[this.aa] = var182;
                                 // if (var178 < 0.0F) {
                                 //    this.bomkakudo[this.aa] = this.bomkakudo[this.aa] + 180.0F;
                                 // }

                                 this.bomXmove[this.aa] = (float)(this.bomspeed[this.aa] * Math.cos(this.bomkakudo[this.aa] * 3.1415 / 180.0));
                                 this.bomYmove[this.aa] = (float)(this.bomspeed[this.aa] * Math.sin(this.bomkakudo[this.aa] * 3.1415 / 180.0));
                                 this.bomseehit[this.aa] = this.cyc;
                                 break;
                              }
                           }
                        }

                        if (this.bomseehit[this.aa] != -999) {
                           float var169 = this.eX[this.bomseehit[this.aa]] - this.bomX[this.aa];
                           float var179 = this.eY[this.bomseehit[this.aa]] - this.bomY[this.aa];
                           float var183 = FastMath.atan2(var169, var179);
                           this.bomkakudo[this.aa] = var183;
                           // if (var179 < 0.0F) {
                           //    this.bomkakudo[this.aa] = this.bomkakudo[this.aa] + 180.0F;
                           // }

                           this.bomXmove[this.aa] = (float)(this.bomspeed[this.aa] * Math.cos(this.bomkakudo[this.aa] * 3.1415 / 180.0));
                           this.bomYmove[this.aa] = (float)(this.bomspeed[this.aa] * Math.sin(this.bomkakudo[this.aa] * 3.1415 / 180.0));
                           if (this.emode[this.bomseehit[this.aa]] == 0) {
                              this.bomseehit[this.aa] = -999;
                              this.bomXmove[this.aa] = (float)(this.bomXmove[this.aa] * 0.3);
                              this.bomYmove[this.aa] = (float)(this.bomYmove[this.aa] * 0.3);
                           }
                        }
                     }

                     for (this.cyc = 0; this.cyc < this.tama_see_max; this.cyc++) {
                        this.kyori = (this.bomX[this.aa] - this.tamaX[this.cyc]) * (this.bomX[this.aa] - this.tamaX[this.cyc])
                           + (this.bomY[this.aa] - this.tamaY[this.cyc]) * (this.bomY[this.aa] - this.tamaY[this.cyc]);
                        if (this.kyori < 400.0F && this.tamamode[this.cyc] != 0 && this.tamakesuna[this.cyc] == 0) {
                           this.tamamode[this.cyc] = 0;
                           effectIn(this.tamaX[this.cyc], this.tamaY[this.cyc], 5, this.tamairo[this.cyc], this.tamashape[this.cyc], 0);
                           this.itemIn(this.tamaX[this.cyc], this.tamaY[this.cyc], 3, 1);
                        }
                     }
                  } else if (this.bommode[this.aa] == 2) {
                     this.bomX[this.aa] = this.peopleX;
                     this.bomY[this.aa] = this.peopleY;
                     if (this.bomtime[this.aa] == 1) {
                        this.bomhaba[this.aa] = 2.0F;
                        if (this.sevolume != 0) {
                           AudioPresenter var188 = this.seplayer[2];
                           this.seplayer[2].setAttribute(4, this.sevolume);
                        }

                        if (this.sevolume != 0) {
                           this.seplayer[2].play();
                        }
                     }

                     if (this.bomtime[this.aa] == 20) {
                        if (this.sevolume != 0) {
                           AudioPresenter var189 = this.seplayer[4];
                           this.seplayer[4].setAttribute(4, this.sevolume);
                        }

                        if (this.sevolume != 0) {
                           this.seplayer[4].play();
                        }
                     }

                     if (this.bomtime[this.aa] > 21 && this.bomtime[this.aa] < 29) {
                        this.bomhaba[this.aa] = this.bomhaba[this.aa] + 10.0F;
                     }

                     if (this.bomtime[this.aa] > 151 && this.bomtime[this.aa] < 159) {
                        this.bomhaba[this.aa] = this.bomhaba[this.aa] - 10.0F;
                     }

                     if (this.bomtime[this.aa] == 161) {
                        this.bommode[this.aa] = 0;
                     }

                     for (this.cyc = 0; this.cyc < this.e_max; this.cyc++) {
                        if (this.emode[this.cyc] != 0
                           && this.eX[this.cyc] > this.bomX[this.aa] - this.bomhaba[this.aa] * 1.4
                           && this.eX[this.cyc] < this.bomX[this.aa] + this.bomhaba[this.aa] * 1.4
                           && this.eY[this.cyc] < this.bomY[this.aa]
                           && this.emuteki[this.cyc] == 0
                           && this.esuruu[this.cyc] == 0) {
                           this.etairyoku[this.cyc] = (float)(this.etairyoku[this.cyc] - 0.4);
                           if (this.eboss[this.cyc] == 1) {
                              this.bosstairyoku = (float)(this.bosstairyoku - 0.4);
                           }
                        }
                     }

                     for (this.cyc = 0; this.cyc < this.tama_see_max; this.cyc++) {
                        if (this.tamamode[this.cyc] != 0
                           && this.tamakesuna[this.cyc] == 0
                           && this.tamaX[this.cyc] > this.bomX[this.aa] - this.bomhaba[this.aa] * 1.4
                           && this.tamaX[this.cyc] < this.bomX[this.aa] + this.bomhaba[this.aa] * 1.4
                           && this.tamaY[this.cyc] < this.bomY[this.aa]) {
                           this.tamamode[this.cyc] = 0;
                           effectIn(this.tamaX[this.cyc], this.tamaY[this.cyc], 5, this.tamairo[this.cyc], this.tamashape[this.cyc], 0);
                           this.itemIn(this.tamaX[this.cyc], this.tamaY[this.cyc], 3, 1);
                        }
                     }
                  } else if (this.bommode[this.aa] == 3) {
                     if (this.bomtime[this.aa] == 1) {
                        this.bomXmove[this.aa] = 0.0F;
                        this.bomYmove[this.aa] = -10.0F;
                     }

                     if (this.bomY[this.aa] < -220.0F) {
                        this.bommode[this.aa] = 0;
                     }

                     for (this.cyc = 0; this.cyc < this.e_max; this.cyc++) {
                        if (this.emode[this.cyc] != 0
                           && this.eX[this.cyc] > this.bomX[this.aa] - 50.0F
                           && this.eX[this.cyc] < this.bomX[this.aa] + 50.0F
                           && this.eY[this.cyc] < this.bomY[this.aa] + 200.0F
                           && this.eY[this.cyc] > this.bomY[this.aa]
                           && this.emuteki[this.cyc] == 0
                           && this.esuruu[this.cyc] == 0) {
                           this.etairyoku[this.cyc] = (float)(this.etairyoku[this.cyc] - 0.3);
                           if (this.eboss[this.cyc] == 1) {
                              this.bosstairyoku = (float)(this.bosstairyoku - 0.3);
                           }
                        }
                     }

                     for (this.cyc = 0; this.cyc < this.tama_see_max; this.cyc++) {
                        if (this.tamamode[this.cyc] != 0
                           && this.tamakesuna[this.cyc] == 0
                           && this.tamaX[this.cyc] > this.bomX[this.aa] - 50.0F
                           && this.tamaX[this.cyc] < this.bomX[this.aa] + 50.0F
                           && this.tamaY[this.cyc] < this.bomY[this.aa] + 240.0F
                           && this.tamaY[this.cyc] > this.bomY[this.aa]) {
                           this.tamamode[this.cyc] = 0;
                           effectIn(this.tamaX[this.cyc], this.tamaY[this.cyc], 5, this.tamairo[this.cyc], this.tamashape[this.cyc], 0);
                           this.itemIn(this.tamaX[this.cyc], this.tamaY[this.cyc], 3, 1);
                        }
                     }
                  } else if (this.bommode[this.aa] == 4) {
                     if (this.bomholdnumber0[this.aa] < 30.0F) {
                        this.bomholdnumber0[this.aa] = this.bomholdnumber0[this.aa] + 3.0F;
                     }

                     this.bomX[this.aa] = (float)(this.peopleX + this.bomholdnumber0[this.aa] * Math.cos(this.bomkakudo[this.aa] * 3.1415 / 180.0));
                     this.bomY[this.aa] = (float)(this.peopleY + this.bomholdnumber0[this.aa] * Math.sin(this.bomkakudo[this.aa] * 3.1415 / 180.0));
                     this.bomkakudo[this.aa] = this.bomkakudo[this.aa] + 10.0F;
                     if (this.bomtime[this.aa] == 120) {
                        this.bomXmove[this.aa] = 0.0F;
                        this.bomYmove[this.aa] = 0.0F;
                        effectIn(this.bomX[this.aa], this.bomY[this.aa], 16, 0, 0, 0);
                        effectIn(this.bomX[this.aa], this.bomY[this.aa], 12, 10, 0, 0);
                     }

                     for (this.cyc = 0; this.cyc < this.e_max; this.cyc++) {
                        this.kyori = (this.bomX[this.aa] - this.eX[this.cyc]) * (this.bomX[this.aa] - this.eX[this.cyc])
                           + (this.bomY[this.aa] - this.eY[this.cyc]) * (this.bomY[this.aa] - this.eY[this.cyc]);
                        if (this.emode[this.cyc] != 0 && this.kyori < 2500.0F && this.emuteki[this.cyc] == 0 && this.esuruu[this.cyc] == 0) {
                           this.etairyoku[this.cyc] = (float)(this.etairyoku[this.cyc] - 0.2);
                           if (this.eboss[this.cyc] == 1) {
                              this.bosstairyoku = (float)(this.bosstairyoku - 0.2);
                           }
                        }
                     }

                     for (this.cyc = 0; this.cyc < this.tama_see_max; this.cyc++) {
                        this.kyori = (this.bomX[this.aa] - this.tamaX[this.cyc]) * (this.bomX[this.aa] - this.tamaX[this.cyc])
                           + (this.bomY[this.aa] - this.tamaY[this.cyc]) * (this.bomY[this.aa] - this.tamaY[this.cyc]);
                        if (this.kyori < 100.0F && this.tamamode[this.cyc] != 0 && this.tamakesuna[this.cyc] == 0) {
                           this.tamamode[this.cyc] = 0;
                           effectIn(this.tamaX[this.cyc], this.tamaY[this.cyc], 5, this.tamairo[this.cyc], this.tamashape[this.cyc], 0);
                           this.itemIn(this.tamaX[this.cyc], this.tamaY[this.cyc], 3, 1);
                        }
                     }

                     if (this.bomtime[this.aa] == 120) {
                        if (this.sevolume != 0) {
                           AudioPresenter var10000 = this.seplayer[5];
                           AudioPresenter var187 = this.seplayer[0];
                           var10000.setAttribute(4, this.sevolume);
                        }

                        if (this.sevolume != 0) {
                           this.seplayer[5].play();
                        }

                        this.bommode[this.aa] = 0;
                     }
                  } else if (this.bommode[this.aa] == 5) {
                     if (this.bomholdnumber0[this.aa] < 300.0F) {
                        this.bomholdnumber0[this.aa] = this.bomholdnumber0[this.aa] + 15.0F;
                     }

                     if (this.bomtime[this.aa] == 1) {
                        if (this.sevolume != 0) {
                           AudioPresenter var10001 = this.seplayer[4];
                           this.seplayer[4].setAttribute(4, this.sevolume);
                        }

                        if (this.sevolume != 0) {
                           this.seplayer[4].play();
                        }
                     }

                     if (this.bomtime[this.aa] < 31) {
                        for (this.cyc = 0; this.cyc < this.e_max; this.cyc++) {
                           this.kyori = (this.bomX[this.aa] - this.eX[this.cyc]) * (this.bomX[this.aa] - this.eX[this.cyc])
                              + (this.bomY[this.aa] - this.eY[this.cyc]) * (this.bomY[this.aa] - this.eY[this.cyc]);
                           if (this.emode[this.cyc] != 0
                              && this.kyori < this.bomholdnumber0[this.aa] * this.bomholdnumber0[this.aa]
                              && this.emuteki[this.cyc] == 0
                              && this.esuruu[this.cyc] == 0) {
                              this.etairyoku[this.cyc] = (float)(this.etairyoku[this.cyc] - 0.1);
                              if (this.eboss[this.cyc] == 1) {
                                 this.bosstairyoku = (float)(this.bosstairyoku - 0.1);
                              }
                           }
                        }
                     }

                     for (this.cyc = 0; this.cyc < this.tama_see_max; this.cyc++) {
                        this.kyori = (this.bomX[this.aa] - this.tamaX[this.cyc]) * (this.bomX[this.aa] - this.tamaX[this.cyc])
                           + (this.bomY[this.aa] - this.tamaY[this.cyc]) * (this.bomY[this.aa] - this.tamaY[this.cyc]);
                        if (this.kyori < this.bomholdnumber0[this.aa] * this.bomholdnumber0[this.aa]
                           && this.tamamode[this.cyc] != 0
                           && this.tamakesuna[this.cyc] == 0) {
                           this.tamamode[this.cyc] = 0;
                           effectIn(this.tamaX[this.cyc], this.tamaY[this.cyc], 5, this.tamairo[this.cyc], this.tamashape[this.cyc], 0);
                           this.itemIn(this.tamaX[this.cyc], this.tamaY[this.cyc], 3, 1);
                        }
                     }

                     if (this.bomtime[this.aa] == 50) {
                        this.bommode[this.aa] = 0;
                     }
                  }
               }
            }

            this.omballmove();
            this.keyState = this.getKeypadState();
            if (this.peopleslow == 0) {
               if (peoplebomkind % 2 == 0) {
                  this.peoplemove = 4;
               }

               if (peoplebomkind % 2 == 1) {
                  this.peoplemove = 5;
               }
            }

            if (this.peopleslow == 1) {
               this.peoplemove = 2;
            }

            if ((65536 & this.keyState) != 0 && this.peopleX > 10) {
               this.peopleX = this.peopleX - this.peoplemove;
            }

            if ((131072 & this.keyState) != 0 && this.peopleY > 15) {
               this.peopleY = this.peopleY - this.peoplemove;
            }

            if ((262144 & this.keyState) != 0 && this.peopleX < 180) {
               this.peopleX = this.peopleX + this.peoplemove;
            }

            if ((524288 & this.keyState) != 0 && this.peopleY < 220) {
               this.peopleY = this.peopleY + this.peoplemove;
            }

            if (this.stagetime % 3 == 0 && this.peoplemuteki != 2 && this.peoplenonshot == 0 && this.peopleshotting == 0) {
               this.bulletIn(this.peopleX + 3, this.peopleY, 1, -90);
               this.bulletIn(this.peopleX - 3, this.peopleY, 1, -90);
               this.cyc2 = this.peoplepower / 100;
               if (this.cyc2 == 5) {
                  this.cyc2 = 4;
               }

               if (peoplebomkind == 0) {
                  for (this.cyc = 0; this.cyc < this.cyc2; this.cyc++) {
                     if (this.peopleslow == 0) {
                        this.bulletIn(this.omballX[this.cyc], this.omballY[this.cyc], 4, -this.omballkakudo[this.cyc]);
                     }

                     if (this.peopleslow != 0) {
                        this.bulletIn(this.omballX[this.cyc], this.omballY[this.cyc], 4, -90);
                     }
                  }
               } else if (peoplebomkind == 2) {
                  for (this.cyc = 0; this.cyc < this.cyc2; this.cyc++) {
                     this.bulletIn(this.omballX[this.cyc], this.omballY[this.cyc], 2, -90);
                  }
               } else if (peoplebomkind == 3) {
                  for (this.cyc = 0; this.cyc < this.cyc2; this.cyc++) {
                     this.bulletIn(this.omballX[this.cyc], this.omballY[this.cyc], 3, -90);
                  }
               }
            }

            if (this.keyEvent == this.speedkey) {
               if (this.peopleslow == 0) {
                  this.peopleslow = 1;
               } else if (this.peopleslow == 1) {
                  this.peopleslow = 0;
               }
            }

            if (this.keyEvent == this.shotkey) {
               if (this.peopleshotting == 0) {
                  this.peopleshotting = 1;
               } else if (this.peopleshotting == 1) {
                  this.peopleshotting = 0;
               }
            }

            if (this.keyEvent == this.bomkey && this.peoplemuteki != 1 && this.peoplemuteki != 2 && this.peoplemuteki != 3 && this.peoplepower >= 100) {
               this.peoplepower -= 100;
               effectIn(999.0F, 999.0F, 999, 0, 0, 0);
            }

            if (this.stagepractice == 0) {
               if (this.stagelevel == 0) {
                  if (this.peoplehighscore1[peoplebomkind] < this.peoplescore) {
                     this.peoplehighscore[peoplebomkind] = this.peoplescore;
                  }
               } else if (this.stagelevel == 1 && this.peoplehighscore2[peoplebomkind] < this.peoplescore) {
                  this.peoplehighscore[peoplebomkind] = this.peoplescore;
               }
            } else if (this.stagepractice == 2 && this.peoplehighscore3[peoplebomkind] < this.peoplescore) {
               this.peoplehighscore[peoplebomkind] = this.peoplescore;
            }

            if (this.peoplehosi > 4) {
               this.peoplehosi -= 5;
               this.peoplezannki++;
               effectIn(0.0F, 0.0F, 22, 0, 0, 0);
            }

            if (this.stagetime2 % 30 == 0) {
               this.effect_seedown();
            }

            this.effectmove();
            this.keyEvent = -999;
            if (this.stagetime % 10 == 0) {
               this.tama_seedown();
            }

            for (this.aa = 0; this.aa < this.tama_see_max; this.aa++) {
               if (this.tamamode[this.aa] != 0) {
                  this.tamamove(this.aa);
               }
            }

            for (this.aa = 0; this.aa < this.laser_max; this.aa++) {
               if (this.lasermode[this.aa] != 0) {
                  this.lasertime[this.aa]++;
                  this.laserhaba[this.aa] = this.laserhaba[this.aa] + this.laserhabaspeed[this.aa];
                  if (this.lasermode[this.aa] == 3) {
                     if (this.lasertime[this.aa] > this.laserspeed[this.aa] + 20.0F && this.lasertime[this.aa] < this.laserendtime[this.aa] + 20) {
                        this.see_hit_laser(this.aa);
                     }
                  } else {
                     this.see_hit_laser(this.aa);
                  }

                  if (this.lasermode[this.aa] == 1) {
                     if (this.lasertime[this.aa] == 1) {
                        this.laserXmove[this.aa] = (float)(this.laserspeed[this.aa] * Math.cos(this.laserkakudo[this.aa] * 3.1415 / 180.0));
                        this.laserYmove[this.aa] = (float)(this.laserspeed[this.aa] * Math.sin(this.laserkakudo[this.aa] * 3.1415 / 180.0));
                        this.laserX[this.aa] = this.laserX[this.aa] + this.laserXmove[this.aa] * 5.0F;
                        this.laserY[this.aa] = this.laserY[this.aa] + this.laserYmove[this.aa] * 5.0F;
                        this.laserhaba[this.aa] = this.laserhaba_k[this.aa];
                        this.laserhabaspeed[this.aa] = 0.0F;
                     }

                     if (this.laserendtime[this.aa] > this.lasernagasa[this.aa]) {
                        this.lasernagasa[this.aa] = this.lasernagasa[this.aa] + this.laserspeed[this.aa];
                     } else {
                        this.laserX[this.aa] = this.laserX[this.aa] + this.laserXmove[this.aa];
                        this.laserY[this.aa] = this.laserY[this.aa] + this.laserYmove[this.aa];
                     }

                     if (this.laserX[this.aa] > this.migi + 10
                        || this.laserX[this.aa] < -10.0F
                        || this.laserY[this.aa] > 245.0F
                        || this.laserY[this.aa] < -15.0F) {
                        this.lasermode[this.aa] = 0;
                     }
                  } else if (this.lasermode[this.aa] == 3) {
                     if (this.lasertime[this.aa] == 1) {
                        this.laserXmove[this.aa] = 0.0F;
                        this.laserYmove[this.aa] = 0.0F;
                        this.laserhaba[this.aa] = 1.0F;
                        this.lasernagasa[this.aa] = 300.0F;
                     }

                     if (this.lasertime[this.aa] == this.laserspeed[this.aa] + 1.0F) {
                        this.laserhabaspeed[this.aa] = this.laserhaba_k[this.aa] / 30.0F;
                     }

                     if (this.lasertime[this.aa] == this.laserspeed[this.aa] + 31.0F) {
                        this.laserhabaspeed[this.aa] = 0.0F;
                     }

                     if (this.lasertime[this.aa] == this.laserspeed[this.aa] + this.laserendtime[this.aa] + 1.0F) {
                        this.laserhabaspeed[this.aa] = -this.laserhaba_k[this.aa] / 30.0F;
                     }

                     if (this.lasertime[this.aa] == this.laserspeed[this.aa] + this.laserendtime[this.aa] + 31.0F) {
                        this.laserhabaspeed[this.aa] = 0.0F;
                        this.lasermode[this.aa] = 0;
                     }

                     this.laserkakudo[this.aa] = this.laserkakudo[this.aa] + this.laserholdnumber0[this.aa];
                     if (this.laserX[this.aa] > this.migi + 100
                        || this.laserX[this.aa] < -100.0F
                        || this.laserY[this.aa] > 345.0F
                        || this.laserY[this.aa] < -115.0F) {
                        this.lasermode[this.aa] = 0;
                     }
                  } else if (this.lasermode[this.aa] != 4) {
                     if (this.lasermode[this.aa] == 5) {
                        if (this.lasertime[this.aa] == 1) {
                           this.laserhaba[this.aa] = 1.0F;
                           this.lasernagasa[this.aa] = 350.0F;
                           this.laserkakudo[this.aa] = 90.0F;
                        }

                        if (this.lasertime[this.aa] == this.laserspeed[this.aa] + 1.0F) {
                           this.laserhabaspeed[this.aa] = this.laserhaba_k[this.aa] / 30.0F;
                        }

                        if (this.lasertime[this.aa] == this.laserspeed[this.aa] + 31.0F) {
                           this.laserhabaspeed[this.aa] = 0.0F;
                        }

                        if (this.lasertime[this.aa] > this.laserspeed[this.aa] + 61.0F) {
                           this.laserkakudo[this.aa] = (float)(this.laserkakudo[this.aa] + 0.5 * Math.sin(this.laserholdnumber0[this.aa] * 3.1415 / 180.0));
                           this.laserholdnumber0[this.aa] = this.laserholdnumber0[this.aa] + 5.0F;
                        }
                     } else if (this.lasermode[this.aa] == 6) {
                        if (this.lasertime[this.aa] == 1) {
                           this.laserhaba[this.aa] = 1.0F;
                           this.laserhabaspeed[this.aa] = 0.0F;
                           this.lasernagasa[this.aa] = this.laserendtime[this.aa];
                        }

                        this.laserhaba[this.aa] = (float)(this.laserhaba[this.aa] + 0.04);
                        this.laserendtime[this.aa] = 2;
                        if (this.lasertime[this.aa] == 25) {
                           this.lasermode[this.aa] = 0;

                           for (this.cyc2 = 0; this.cyc2 * 10 < this.lasernagasa[this.aa]; this.cyc2++) {
                              this.sh(
                                 this.laserX[this.aa] + (int)(this.cyc2 * 10 * Math.cos(this.laserkakudo[this.aa] * 3.1415 / 180.0)),
                                 this.laserY[this.aa] + (int)(this.cyc2 * 10 * Math.sin(this.laserkakudo[this.aa] * 3.1415 / 180.0)),
                                 3,
                                 1.5F,
                                 this.cyc2 * 13 + this.laserholdnumber0[this.aa],
                                 0,
                                 2,
                                 (int)this.laserholdnumber1[this.aa],
                                 0,
                                 2
                              );
                           }
                        }
                     }
                  } else {
                     if (this.lasertime[this.aa] == 1) {
                        this.laserXmove[this.aa] = (float)(this.laserspeed[this.aa] * Math.cos(this.laserkakudo[this.aa] * 3.1415 / 180.0));
                        this.laserYmove[this.aa] = (float)(this.laserspeed[this.aa] * Math.sin(this.laserkakudo[this.aa] * 3.1415 / 180.0));
                        this.laserX[this.aa] = this.laserX[this.aa] + this.laserXmove[this.aa] * 5.0F;
                        this.laserY[this.aa] = this.laserY[this.aa] + this.laserYmove[this.aa] * 5.0F;
                        this.laserhaba[this.aa] = this.laserhaba_k[this.aa];
                        this.laserhabaspeed[this.aa] = 0.0F;
                     }

                     if (this.laserendtime[this.aa] > this.lasernagasa[this.aa]) {
                        this.lasernagasa[this.aa] = this.lasernagasa[this.aa] + this.laserspeed[this.aa];
                        this.laserkakudo[this.aa] = this.laserkakudo[this.aa] + this.laserholdnumber1[this.aa] * 5.0F;
                     } else {
                        this.laserX[this.aa] = (float)(
                           this.eX[this.bossnum] + (this.lasertime[this.aa] - this.lasernagasa[this.aa]) * Math.cos(this.laserkakudo[this.aa] * 3.1415 / 180.0)
                        );
                        this.laserY[this.aa] = (float)(
                           this.eY[this.bossnum] + (this.lasertime[this.aa] - this.lasernagasa[this.aa]) * Math.sin(this.laserkakudo[this.aa] * 3.1415 / 180.0)
                        );
                     }

                     if (this.laserX[this.aa] > this.migi + 50
                        || this.laserX[this.aa] < -50.0F
                        || this.laserY[this.aa] > 245.0F
                        || this.laserY[this.aa] < -15.0F) {
                        this.lasermode[this.aa] = 0;
                     }

                     this.laserkakudo[this.aa] = this.laserkakudo[this.aa] + this.laserholdnumber1[this.aa];
                  }
               }
            }

            for (this.aa = 0; this.aa < this.item_see_max; this.aa++) {
               if (this.itemmode[this.aa] != 0) {
                  this.itemtime[this.aa]++;
                  this.itemX[this.aa] = this.itemX[this.aa] + this.itemXmove[this.aa];
                  this.itemY[this.aa] = this.itemY[this.aa] + this.itemYmove[this.aa];
                  if (this.itemX[this.aa] > this.migi + 20 || this.itemX[this.aa] < -20.0F || this.itemY[this.aa] > 260.0F || this.itemY[this.aa] < -250.0F) {
                     if (this.itemmode[this.aa] == 99) {
                        this.peoplepoint += 100;
                     }

                     this.itemmode[this.aa] = 0;
                     this.item_seedown();
                  }

                  if (this.itemkaishuu[this.aa] == 0) {
                     if (this.itemYmove[this.aa] < 1.8) {
                        this.itemYmove[this.aa] = (float)(this.itemYmove[this.aa] + 0.15);
                     }

                     if (this.peopleY < 90) {
                        this.itemkaishuu[this.aa] = 1;
                     }
                  } else if (this.itemkaishuu[this.aa] == 1) {
                     if (this.itemYmove[this.aa] < 1.8) {
                        this.itemYmove[this.aa] = (float)(this.itemYmove[this.aa] + 0.45);
                     }

                     if (this.itemYmove[this.aa] > 0.0F) {
                        this.itemkaishuu[this.aa] = 2;
                     }
                  } else if (this.itemkaishuu[this.aa] == 2) {
                     float var170 = this.peopleX - this.itemX[this.aa];
                     float var180 = this.peopleY - this.itemY[this.aa];
                     float var184 = FastMath.atan2(var170, var180);
                     // if (var180 < 0.0F) {
                     //    var184 += 180.0F;
                     // }

                     this.itemXmove[this.aa] = (float)(9.0 * Math.cos(var184 * 3.1415 / 180.0));
                     this.itemYmove[this.aa] = (float)(9.0 * Math.sin(var184 * 3.1415 / 180.0));
                  }

                  float var171 = (this.itemX[this.aa] - this.peopleX) * (this.itemX[this.aa] - this.peopleX)
                     + (this.itemY[this.aa] - this.peopleY) * (this.itemY[this.aa] - this.peopleY);
                  if (var171 < 25.0F) {
                     if (this.itemmode[this.aa] == 1) {
                        if (this.peopleY < 90) {
                           this.peoplescore = this.peoplescore + this.peoplepoint;
                        } else if (this.peopleY < 140) {
                           this.peoplescore = this.peoplescore + (int)(this.peoplepoint * 0.75);
                        } else if (this.peopleY < 190) {
                           this.peoplescore = this.peoplescore + (int)(this.peoplepoint * 0.5);
                        } else {
                           this.peoplescore = this.peoplescore + (int)(this.peoplepoint * 0.25);
                        }
                     } else if (this.itemmode[this.aa] == 11) {
                        this.peoplepoint++;
                     } else if (this.itemmode[this.aa] == 2) {
                        this.peoplepower += 5;
                        if (this.peoplepower > 400) {
                           this.peoplepower = 400;
                        }
                     } else if (this.itemmode[this.aa] == 22) {
                        this.peoplepower += 100;
                        if (this.peoplepower > 400) {
                           this.peoplepower = 400;
                        }
                     } else if (this.itemmode[this.aa] == 3) {
                        this.peoplescore += 10;
                     } else if (this.itemmode[this.aa] == 99) {
                        effectIn(this.peopleX, this.peopleY, 21, 0, 0, 0);
                     }

                     this.itemmode[this.aa] = 0;
                  } else if (var171 < 900.0F && this.itemkaishuu[this.aa] == 0) {
                     this.itemkaishuu[this.aa] = 1;
                  }

                  if (this.peoplepower == 400 && (this.itemmode[this.aa] == 2 || this.itemmode[this.aa] == 22)) {
                     this.itemmode[this.aa] = 11;
                  }
               }
            }

            if (this.bossmode != 0) {
               this.bosstimelim--;
               if (this.etime[this.bossnum] > 150) {
                  this.spelbonus--;
               }

               if (this.spelbonus < 0) {
                  this.spelbonus = 0;
               }

               if (this.etime[this.bossnum] == 1) {
                  this.bosstairyoku_k = this.bosstairyoku;
                  this.bosshosi = 1;
               }

               if (this.bosstairyoku < 0.0F) {
                  if (this.sevolume != 0) {
                     AudioPresenter var192 = this.seplayer[0];
                     this.seplayer[0].setAttribute(4, this.sevolume);
                  }

                  if (this.sevolume != 0) {
                     this.seplayer[0].play();
                  }

                  this.edoing[this.bossnum]++;
                  this.etime[this.bossnum] = 0;
                  this.bosstairyoku = 1000.0F;
                  effectIn(this.eX[this.bossnum], this.eY[this.bossnum], 3, 0, 0, 0);
                  if (this.bosshosi != 0) {
                     this.itemIn(this.eX[this.bossnum], this.eY[this.bossnum], 99, 0);
                  }

                  this.bosshosi = 1;
                  if (this.bossspel == 0) {
                     this.bossspel = 1;
                  } else if (this.bossspel == 1) {
                     this.bossspel = 0;
                     this.peoplescore = this.peoplescore + this.spelbonus;
                     effectIn(0.0F, 0.0F, 13, this.spelbonus, 0, 0);
                     this.spelbonus = 0;
                     this.bossnokori--;
                  }
               }

               if (this.bosstimelim < 0) {
                  this.bosstairyoku = -1.0F;
               }
            }
         }

         while (System.currentTimeMillis() < var2 + this.keisan) {
         }

         var2 = System.currentTimeMillis();
      }
   }

   void drawBold(String var1, int var2, int var3, int var4, int var5) {
      this.g.setColor(var4);
      this.g.drawString(var1, var2 - 1, var3 - 1);
      this.g.drawString(var1, var2, var3 - 1);
      this.g.drawString(var1, var2 + 1, var3 - 1);
      this.g.drawString(var1, var2 - 1, var3);
      this.g.drawString(var1, var2 + 1, var3);
      this.g.drawString(var1, var2 - 1, var3 + 1);
      this.g.drawString(var1, var2, var3 + 1);
      this.g.drawString(var1, var2 + 1, var3 + 1);
      this.g.setColor(var5);
      this.g.drawString(var1, var2, var3);
   }

   String formatNum(int var1, int var2) {
      String var3 = "" + var1;

      while (var3.length() < var2) {
         var3 = "0" + var3;
      }

      return var3;
   }

   int bekijou(int var1, int var2) {
      for (this.cyc = 0; this.cyc < var2 - 1; this.cyc++) {
         var1 *= var1;
      }

      return var1;
   }

   public void processEvent(int var1, int var2) {
      if (var1 == 0) {
         this.keyEvent = var2;
      }
   }

   public void paint(Graphics var1) {
   }

   void save() {
      DataOutputStream var1 = null;

      try {
         var1 = Connector.openDataOutputStream("scratchpad:///0;pos=1");
         var1.write(this.volume);
      } catch (Exception var187) {
      } finally {
         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (Exception var176) {
         }
      }

      try {
         var1 = Connector.openDataOutputStream("scratchpad:///0;pos=6");
         var1.write(this.sevolume);
      } catch (Exception var185) {
      } finally {
         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (Exception var175) {
         }
      }

      try {
         var1 = Connector.openDataOutputStream("scratchpad:///0;pos=2");
         var1.write(this.bomkey);
      } catch (Exception var183) {
      } finally {
         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (Exception var174) {
         }
      }

      try {
         var1 = Connector.openDataOutputStream("scratchpad:///0;pos=3");
         var1.write(this.shotkey);
      } catch (Exception var181) {
      } finally {
         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (Exception var173) {
         }
      }

      try {
         var1 = Connector.openDataOutputStream("scratchpad:///0;pos=4");
         var1.write(this.speedkey);
      } catch (Exception var179) {
      } finally {
         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (Exception var172) {
         }
      }

      try {
         var1 = Connector.openDataOutputStream("scratchpad:///0;pos=5");
         var1.write(this.byougamode);
      } catch (Exception var177) {
      } finally {
         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (Exception var171) {
         }
      }
   }

   void highNsave(int var1) {
      DataOutputStream var2 = null;
      if (this.peoplehighscore[var1] > this.peoplehighscore1[var1]) {
         this.peoplehighscore1[var1] = this.peoplehighscore[var1];

         try {
            var2 = Connector.openDataOutputStream("scratchpad:///0;pos=" + (10 + 10 * var1));
            var2.write(this.peoplehighscore1[var1] / 16581375);
         } catch (Exception var94) {
         } finally {
            try {
               if (var2 != null) {
                  var2.close();
               }
            } catch (Exception var87) {
            }
         }

         try {
            var2 = Connector.openDataOutputStream("scratchpad:///0;pos=" + (11 + 10 * var1));
            var2.write(this.peoplehighscore1[var1] % 16581375 / 65025);
         } catch (Exception var92) {
         } finally {
            try {
               if (var2 != null) {
                  var2.close();
               }
            } catch (Exception var86) {
            }
         }

         try {
            var2 = Connector.openDataOutputStream("scratchpad:///0;pos=" + (12 + 10 * var1));
            var2.write(this.peoplehighscore1[var1] % 65025 / 255);
         } catch (Exception var90) {
         } finally {
            try {
               if (var2 != null) {
                  var2.close();
               }
            } catch (Exception var85) {
            }
         }

         try {
            var2 = Connector.openDataOutputStream("scratchpad:///0;pos=" + (13 + 10 * var1));
            var2.write(this.peoplehighscore1[var1] % 255);
         } catch (Exception var88) {
         } finally {
            try {
               if (var2 != null) {
                  var2.close();
               }
            } catch (Exception var84) {
            }
         }
      }
   }

   void highHsave(int var1) {
      DataOutputStream var2 = null;
      if (this.peoplehighscore[var1] > this.peoplehighscore2[var1]) {
         this.peoplehighscore2[var1] = this.peoplehighscore[var1];

         try {
            var2 = Connector.openDataOutputStream("scratchpad:///0;pos=" + (50 + 10 * var1));
            var2.write(this.peoplehighscore2[var1] / 16581375);
         } catch (Exception var94) {
         } finally {
            try {
               if (var2 != null) {
                  var2.close();
               }
            } catch (Exception var87) {
            }
         }

         try {
            var2 = Connector.openDataOutputStream("scratchpad:///0;pos=" + (51 + 10 * var1));
            var2.write(this.peoplehighscore2[var1] % 16581375 / 65025);
         } catch (Exception var92) {
         } finally {
            try {
               if (var2 != null) {
                  var2.close();
               }
            } catch (Exception var86) {
            }
         }

         try {
            var2 = Connector.openDataOutputStream("scratchpad:///0;pos=" + (52 + 10 * var1));
            var2.write(this.peoplehighscore2[var1] % 65025 / 255);
         } catch (Exception var90) {
         } finally {
            try {
               if (var2 != null) {
                  var2.close();
               }
            } catch (Exception var85) {
            }
         }

         try {
            var2 = Connector.openDataOutputStream("scratchpad:///0;pos=" + (53 + 10 * var1));
            var2.write(this.peoplehighscore2[var1] % 255);
         } catch (Exception var88) {
         } finally {
            try {
               if (var2 != null) {
                  var2.close();
               }
            } catch (Exception var84) {
            }
         }
      }
   }

   void highEsave(int var1) {
      DataOutputStream var2 = null;
      if (this.peoplehighscore[var1] > this.peoplehighscore3[var1]) {
         this.peoplehighscore3[var1] = this.peoplehighscore[var1];

         try {
            var2 = Connector.openDataOutputStream("scratchpad:///0;pos=" + (90 + 10 * var1));
            var2.write(this.peoplehighscore3[var1] / 16581375);
         } catch (Exception var94) {
         } finally {
            try {
               if (var2 != null) {
                  var2.close();
               }
            } catch (Exception var87) {
            }
         }

         try {
            var2 = Connector.openDataOutputStream("scratchpad:///0;pos=" + (91 + 10 * var1));
            var2.write(this.peoplehighscore3[var1] % 16581375 / 65025);
         } catch (Exception var92) {
         } finally {
            try {
               if (var2 != null) {
                  var2.close();
               }
            } catch (Exception var86) {
            }
         }

         try {
            var2 = Connector.openDataOutputStream("scratchpad:///0;pos=" + (92 + 10 * var1));
            var2.write(this.peoplehighscore3[var1] % 65025 / 255);
         } catch (Exception var90) {
         } finally {
            try {
               if (var2 != null) {
                  var2.close();
               }
            } catch (Exception var85) {
            }
         }

         try {
            var2 = Connector.openDataOutputStream("scratchpad:///0;pos=" + (93 + 10 * var1));
            var2.write(this.peoplehighscore3[var1] % 255);
         } catch (Exception var88) {
         } finally {
            try {
               if (var2 != null) {
                  var2.close();
               }
            } catch (Exception var84) {
            }
         }
      }
   }

   void stagesave() {
      DataOutputStream var1 = null;

      for (this.cyc = 0; this.cyc < 7; this.cyc++) {
         try {
            var1 = Connector.openDataOutputStream("scratchpad:///0;pos=" + (160 + this.cyc));
            var1.write(this.stageopen[this.cyc]);
         } catch (Exception var31) {
         } finally {
            try {
               if (var1 != null) {
                  var1.close();
               }
            } catch (Exception var28) {
            }
         }
      }

      for (this.cyc = 0; this.cyc < 7; this.cyc++) {
         try {
            var1 = Connector.openDataOutputStream("scratchpad:///0;pos=" + (170 + this.cyc));
            var1.write(this.stageopenH[this.cyc]);
         } catch (Exception var29) {
         } finally {
            try {
               if (var1 != null) {
                  var1.close();
               }
            } catch (Exception var27) {
            }
         }
      }
   }

   public void load() {
      DataInputStream var1 = null;

      try {
         var1 = Connector.openDataInputStream("scratchpad:///0;pos=1");
         this.volume = var1.read();
      } catch (Exception var1740) {
      } finally {
         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (Exception var1703) {
         }
      }

      try {
         var1 = Connector.openDataInputStream("scratchpad:///0;pos=6");
         this.sevolume = var1.read();
      } catch (Exception var1738) {
      } finally {
         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (Exception var1702) {
         }
      }

      try {
         var1 = Connector.openDataInputStream("scratchpad:///0;pos=2");
         this.bomkey = var1.read();
      } catch (Exception var1736) {
      } finally {
         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (Exception var1701) {
         }
      }

      try {
         var1 = Connector.openDataInputStream("scratchpad:///0;pos=3");
         this.shotkey = var1.read();
      } catch (Exception var1734) {
      } finally {
         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (Exception var1700) {
         }
      }

      try {
         var1 = Connector.openDataInputStream("scratchpad:///0;pos=4");
         this.speedkey = var1.read();
      } catch (Exception var1732) {
      } finally {
         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (Exception var1699) {
         }
      }

      try {
         var1 = Connector.openDataInputStream("scratchpad:///0;pos=5");
         this.byougamode = var1.read();
      } catch (Exception var1730) {
      } finally {
         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (Exception var1698) {
         }
      }

      for (this.cyc = 0; this.cyc < 7; this.cyc++) {
         try {
            var1 = Connector.openDataInputStream("scratchpad:///0;pos=" + (160 + this.cyc));
            this.stageopen[this.cyc] = var1.read();
         } catch (Exception var1742) {
         } finally {
            try {
               if (var1 != null) {
                  var1.close();
               }
            } catch (Exception var1697) {
            }
         }
      }

      for (this.cyc = 0; this.cyc < 7; this.cyc++) {
         try {
            var1 = Connector.openDataInputStream("scratchpad:///0;pos=" + (170 + this.cyc));
            this.stageopenH[this.cyc] = var1.read();
         } catch (Exception var1728) {
         } finally {
            try {
               if (var1 != null) {
                  var1.close();
               }
            } catch (Exception var1696) {
            }
         }
      }

      for (this.cyc2 = 0; this.cyc2 < 4; this.cyc2++) {
         this.peoplehighscore1[this.cyc2] = 0;
         this.peoplehighscore2[this.cyc2] = 0;
         this.peoplehighscore3[this.cyc2] = 0;

         try {
            var1 = Connector.openDataInputStream("scratchpad:///0;pos=" + (10 + 10 * this.cyc2));
            this.peoplehighscore1[this.cyc2] = this.peoplehighscore1[this.cyc2] + 16581375 * var1.read();
         } catch (Exception var1726) {
         } finally {
            try {
               if (var1 != null) {
                  var1.close();
               }
            } catch (Exception var1695) {
            }
         }

         try {
            var1 = Connector.openDataInputStream("scratchpad:///0;pos=" + (10 + 10 * this.cyc2 + 1));
            this.peoplehighscore1[this.cyc2] = this.peoplehighscore1[this.cyc2] + 65025 * var1.read();
         } catch (Exception var1724) {
         } finally {
            try {
               if (var1 != null) {
                  var1.close();
               }
            } catch (Exception var1694) {
            }
         }

         try {
            var1 = Connector.openDataInputStream("scratchpad:///0;pos=" + (10 + 10 * this.cyc2 + 2));
            this.peoplehighscore1[this.cyc2] = this.peoplehighscore1[this.cyc2] + 255 * var1.read();
         } catch (Exception var1722) {
         } finally {
            try {
               if (var1 != null) {
                  var1.close();
               }
            } catch (Exception var1693) {
            }
         }

         try {
            var1 = Connector.openDataInputStream("scratchpad:///0;pos=" + (10 + 10 * this.cyc2 + 3));
            this.peoplehighscore1[this.cyc2] = this.peoplehighscore1[this.cyc2] + var1.read();
         } catch (Exception var1720) {
         } finally {
            try {
               if (var1 != null) {
                  var1.close();
               }
            } catch (Exception var1692) {
            }
         }

         try {
            var1 = Connector.openDataInputStream("scratchpad:///0;pos=" + (50 + 10 * this.cyc2));
            this.peoplehighscore2[this.cyc2] = this.peoplehighscore2[this.cyc2] + 16581375 * var1.read();
         } catch (Exception var1718) {
         } finally {
            try {
               if (var1 != null) {
                  var1.close();
               }
            } catch (Exception var1691) {
            }
         }

         try {
            var1 = Connector.openDataInputStream("scratchpad:///0;pos=" + (51 + 10 * this.cyc2));
            this.peoplehighscore2[this.cyc2] = this.peoplehighscore2[this.cyc2] + 65025 * var1.read();
         } catch (Exception var1716) {
         } finally {
            try {
               if (var1 != null) {
                  var1.close();
               }
            } catch (Exception var1690) {
            }
         }

         try {
            var1 = Connector.openDataInputStream("scratchpad:///0;pos=" + (52 + 10 * this.cyc2));
            this.peoplehighscore2[this.cyc2] = this.peoplehighscore2[this.cyc2] + 255 * var1.read();
         } catch (Exception var1714) {
         } finally {
            try {
               if (var1 != null) {
                  var1.close();
               }
            } catch (Exception var1689) {
            }
         }

         try {
            var1 = Connector.openDataInputStream("scratchpad:///0;pos=" + (53 + 10 * this.cyc2));
            this.peoplehighscore2[this.cyc2] = this.peoplehighscore2[this.cyc2] + var1.read();
         } catch (Exception var1712) {
         } finally {
            try {
               if (var1 != null) {
                  var1.close();
               }
            } catch (Exception var1688) {
            }
         }

         try {
            var1 = Connector.openDataInputStream("scratchpad:///0;pos=" + (90 + 10 * this.cyc2));
            this.peoplehighscore3[this.cyc2] = this.peoplehighscore3[this.cyc2] + 16581375 * var1.read();
         } catch (Exception var1710) {
         } finally {
            try {
               if (var1 != null) {
                  var1.close();
               }
            } catch (Exception var1687) {
            }
         }

         try {
            var1 = Connector.openDataInputStream("scratchpad:///0;pos=" + (91 + 10 * this.cyc2));
            this.peoplehighscore3[this.cyc2] = this.peoplehighscore3[this.cyc2] + 65025 * var1.read();
         } catch (Exception var1708) {
         } finally {
            try {
               if (var1 != null) {
                  var1.close();
               }
            } catch (Exception var1686) {
            }
         }

         try {
            var1 = Connector.openDataInputStream("scratchpad:///0;pos=" + (92 + 10 * this.cyc2));
            this.peoplehighscore3[this.cyc2] = this.peoplehighscore3[this.cyc2] + 255 * var1.read();
         } catch (Exception var1706) {
         } finally {
            try {
               if (var1 != null) {
                  var1.close();
               }
            } catch (Exception var1685) {
            }
         }

         try {
            var1 = Connector.openDataInputStream("scratchpad:///0;pos=" + (93 + 10 * this.cyc2));
            this.peoplehighscore3[this.cyc2] = this.peoplehighscore3[this.cyc2] + var1.read();
         } catch (Exception var1704) {
         } finally {
            try {
               if (var1 != null) {
                  var1.close();
               }
            } catch (Exception var1684) {
            }
         }
      }
   }

   void drawmahoujinn(int var1, int var2, int var3) {
      float var10 = effectholdnumber1[var3];
      int var4 = (int)(var10 * Math.cos(effectholdnumber2[var3] * 3.1415 / 180.0));
      int var7 = (int)(var10 * Math.sin(effectholdnumber2[var3] * 3.1415 / 180.0));
      int var5 = (int)(var10 * Math.cos((effectholdnumber2[var3] + 120) * 3.1415 / 180.0));
      int var8 = (int)(var10 * Math.sin((effectholdnumber2[var3] + 120) * 3.1415 / 180.0));
      int var6 = (int)(var10 * Math.cos((effectholdnumber2[var3] - 120) * 3.1415 / 180.0));
      int var9 = (int)(var10 * Math.sin((effectholdnumber2[var3] - 120) * 3.1415 / 180.0));
      this.image[24].setAlpha(100);
      this.g
         .drawScaledImage(this.image[24], var1 - (int)var10 - 2, var2 - (int)var10 - 2, (int)(var10 * 2.0F + 4.0F), (int)(var10 * 2.0F + 4.0F), 0, 0, 100, 100);
      this.g.setColor(Graphics.getColorOfRGB(0, 200, 255));
      this.g.drawArc(var1 - (int)var10 - 3, var2 - (int)var10 - 3, (int)(var10 * 2.0F + 6.0F), (int)(var10 * 2.0F + 6.0F), 0, 360);
      this.g.setColor(Graphics.getColorOfRGB(0, 200, 255));
      this.g.drawArc(var1 - (int)var10, var2 - (int)var10, (int)var10 * 2, (int)var10 * 2, 0, 360);
      this.g.drawLine(var1 + var4, var2 + var7, var1 + var5, var2 + var8);
      this.g.drawLine(var1 + var5, var2 + var8, var1 + var6, var2 + var9);
      this.g.drawLine(var1 + var6, var2 + var9, var1 + var4, var2 + var7);
      this.g.drawLine(var1 - var4, var2 - var7, var1 - var5, var2 - var8);
      this.g.drawLine(var1 - var5, var2 - var8, var1 - var6, var2 - var9);
      this.g.drawLine(var1 - var6, var2 - var9, var1 - var4, var2 - var7);
   }

   void drawmahoujinnP(int var1, int var2) {
      float var9 = 20.0F;
      int var3 = (int)(var9 * Math.cos(this.stagetime2 % 36 * 10 * 3.1415 / 180.0));
      int var6 = (int)(var9 * Math.sin(this.stagetime2 % 36 * 10 * 3.1415 / 180.0));
      int var4 = (int)(var9 * Math.cos((this.stagetime2 % 36 + 12) * 10 * 3.1415 / 180.0));
      int var7 = (int)(var9 * Math.sin((this.stagetime2 % 36 + 12) * 10 * 3.1415 / 180.0));
      int var5 = (int)(var9 * Math.cos((this.stagetime2 % 36 - 12) * 10 * 3.1415 / 180.0));
      int var8 = (int)(var9 * Math.sin((this.stagetime2 % 36 - 12) * 10 * 3.1415 / 180.0));
      this.g.setColor(Graphics.getColorOfRGB(100, 255, 255, 20));
      this.g.drawArc(var1 - (int)var9 - 3, var2 - (int)var9 - 3, (int)(var9 * 2.0F + 6.0F), (int)(var9 * 2.0F + 6.0F), 0, 360);
      this.g.setColor(Graphics.getColorOfRGB(120, 255, 255, 120));
      this.g.drawArc(var1 - (int)var9, var2 - (int)var9, (int)var9 * 2, (int)var9 * 2, 0, 360);
      this.g.drawLine(var1 + var3, var2 + var6, var1 + var4, var2 + var7);
      this.g.drawLine(var1 + var4, var2 + var7, var1 + var5, var2 + var8);
      this.g.drawLine(var1 + var5, var2 + var8, var1 + var3, var2 + var6);
      this.g.drawLine(var1 - var3, var2 - var6, var1 - var4, var2 - var7);
      this.g.drawLine(var1 - var4, var2 - var7, var1 - var5, var2 - var8);
      this.g.drawLine(var1 - var5, var2 - var8, var1 - var3, var2 - var6);
   }

   void drawmahoujinnE(int var1, int var2) {
      float var9 = 10.0F;
      int var3 = (int)(var9 * Math.cos(this.stagetime2 % 36 * 10 * 3.1415 / 180.0));
      int var6 = (int)(var9 * Math.sin(this.stagetime2 % 36 * 10 * 3.1415 / 180.0));
      int var4 = (int)(var9 * Math.cos((this.stagetime2 % 36 + 12) * 10 * 3.1415 / 180.0));
      int var7 = (int)(var9 * Math.sin((this.stagetime2 % 36 + 12) * 10 * 3.1415 / 180.0));
      int var5 = (int)(var9 * Math.cos((this.stagetime2 % 36 - 12) * 10 * 3.1415 / 180.0));
      int var8 = (int)(var9 * Math.sin((this.stagetime2 % 36 - 12) * 10 * 3.1415 / 180.0));
      this.g.setColor(Graphics.getColorOfRGB(255, 255, 255, 20));
      this.g.drawArc(var1 - (int)var9 - 3, var2 - (int)var9 - 3, (int)(var9 * 2.0F + 6.0F), (int)(var9 * 2.0F + 6.0F), 0, 360);
      this.g.setColor(Graphics.getColorOfRGB(255, 255, 255, 120));
      this.g.drawArc(var1 - (int)var9, var2 - (int)var9, (int)var9 * 2, (int)var9 * 2, 0, 360);
      this.g.drawLine(var1 + var3, var2 + var6, var1 + var4, var2 + var7);
      this.g.drawLine(var1 + var4, var2 + var7, var1 + var5, var2 + var8);
      this.g.drawLine(var1 + var5, var2 + var8, var1 + var3, var2 + var6);
      this.g.drawLine(var1 - var3, var2 - var6, var1 - var4, var2 - var7);
      this.g.drawLine(var1 - var4, var2 - var7, var1 - var5, var2 - var8);
      this.g.drawLine(var1 - var5, var2 - var8, var1 - var3, var2 - var6);
   }

   void titledraw() {
      if (this.gamemode == 0) {
         if (this.titlekara == 0) {
            for (int var1 = 0; var1 < 11; var1++) {
               try {
                  MediaImage var2 = MediaManager.getImage("resource:///title" + var1 + ".gif");
                  var2.use();
                  this.titleimg[var1] = var2.getImage();
               } catch (Exception var6) {
               }
            }

            try {
               MediaImage var7 = MediaManager.getImage("resource:///title0.jpg");
               var7.use();
               this.titleimg[0] = var7.getImage();
            } catch (Exception var5) {
            }

            try {
               MediaImage var8 = MediaManager.getImage("resource:///title1.jpg");
               var8.use();
               this.titleimg[1] = var8.getImage();
            } catch (Exception var4) {
            }

            this.titlekara = 1;
         }

         if (this.titlemode == 0) {
            this.titleimg[0].setAlpha(255);
            this.g.drawImage(this.titleimg[0], 0, 0);

            for (this.cyc = 0; this.cyc < effect_max; this.cyc++) {
               this.titleeffectdrawback(this.cyc);
            }

            if (this.stagetime < 25) {
               this.g.setColor(Graphics.getColorOfRGB(255, 255, 255, 255 - this.stagetime * 10));
               this.g.fillRect(0, 0, 240, 240);
            }
         } else if (this.titlemode == 1) {
            this.titleimg[5].setAlpha(255);
            this.g.drawImage(this.titleimg[5], 0, 0);

            for (this.cyc = 0; this.cyc < effect_max; this.cyc++) {
               this.titleeffectdrawback(this.cyc);
            }

            this.g.setFont(Font.getFont(1879048448));
            this.drawBold("難易度選択", 20, 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
         } else if (this.titlemode == 2) {
            this.titleimg[5].setAlpha(255);
            this.g.drawImage(this.titleimg[5], 0, 0);

            for (this.cyc = 0; this.cyc < effect_max; this.cyc++) {
               this.titleeffectdrawback(this.cyc);
            }

            this.g.setFont(Font.getFont(1879048448));
            this.drawBold("キャラ選択", 20, 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            if (peoplebomkind == 0 || peoplebomkind == 2) {
               this.standimg[0].setAlpha(255);
               this.g.drawImage(this.standimg[0], -90, 80);
               this.g.setColor(Graphics.getColorOfRGB(0, 0, 255, 150));
               this.g.fillRect(65, 50, 220, 170);
               byte var9 = 75;
               byte var12 = 80;
               byte var3 = 20;
               this.g.setFont(Font.getFont(1879049216));
               this.drawBold("博麗霊夢", var9, var12, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
               this.drawBold("まだ異変は起こってないけど、", var9, var12 + var3 * 1, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
               this.drawBold("とりあえず魔界人が", var9, var12 + var3 * 2, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
               this.drawBold("幻想郷にのさばってるのが", var9, var12 + var3 * 3, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
               this.drawBold("気に食わない。", var9, var12 + var3 * 4, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
               this.drawBold("何かが起きる前に", var9, var12 + var3 * 5, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
               this.drawBold("解決してしまおう！", var9, var12 + var3 * 6, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (peoplebomkind == 1 || peoplebomkind == 3) {
               this.standimg[2].setAlpha(255);
               this.g.drawImage(this.standimg[2], -80, 80);
               this.g.setColor(Graphics.getColorOfRGB(0, 0, 255, 150));
               this.g.fillRect(65, 50, 220, 170);
               byte var10 = 75;
               byte var13 = 80;
               byte var14 = 20;
               this.g.setFont(Font.getFont(1879049216));
               this.drawBold("霧雨魔理沙", var10, var13, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
               this.drawBold("魔界には", var10, var13 + var14 * 1, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
               this.drawBold("スペシャルな魔法が", var10, var13 + var14 * 2, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
               this.drawBold("あるらしい。", var10, var13 + var14 * 3, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
               this.drawBold("究極の魔法を手にするため、", var10, var13 + var14 * 4, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
               this.drawBold("魔界探検に出かけるぜ！", var10, var13 + var14 * 5, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
               this.drawBold("", var10, var13 + var14 * 6, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }
         } else if (this.titlemode == 22) {
            this.titleimg[5].setAlpha(255);
            this.g.drawImage(this.titleimg[5], 0, 0);

            for (this.cyc = 0; this.cyc < effect_max; this.cyc++) {
               this.titleeffectdrawback(this.cyc);
            }

            this.g.setFont(Font.getFont(1879048448));
            this.drawBold("装備選択", 20, 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            this.g.drawImage(this.titleimg[1], 90, 30, 0, peoplebomkind * 180, 140, 180);
            if (peoplebomkind == 0 || peoplebomkind == 2) {
               this.standimg[0].setAlpha(255);
               this.g.drawImage(this.standimg[0], -90, 80);
            }

            if (peoplebomkind == 1 || peoplebomkind == 3) {
               this.standimg[2].setAlpha(255);
               this.g.drawImage(this.standimg[2], -80, 80);
            }
         } else if (this.titlemode == 3) {
            this.titleimg[5].setAlpha(255);
            this.g.drawImage(this.titleimg[5], 0, 0);

            for (this.cyc = 0; this.cyc < effect_max; this.cyc++) {
               this.titleeffectdrawback(this.cyc);
            }

            this.g.setFont(Font.getFont(1879048448));
            this.drawBold("ステージ選択", 20, 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            this.drawBold("STAGE 1", 50, 80, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
            this.drawBold("STAGE 2", 50, 100, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
            this.drawBold("STAGE 3", 50, 120, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
            this.drawBold("STAGE 4", 50, 140, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
            this.drawBold("STAGE 5", 50, 160, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
            this.drawBold("STAGE 6", 50, 180, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
            if (this.stagemen == 0) {
               this.drawBold("STAGE 1", 50, 80, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            } else if (this.stagemen == 1) {
               this.drawBold("STAGE 2", 50, 100, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            } else if (this.stagemen == 2) {
               this.drawBold("STAGE 3", 50, 120, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            } else if (this.stagemen == 3) {
               this.drawBold("STAGE 4", 50, 140, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            } else if (this.stagemen == 4) {
               this.drawBold("STAGE 5", 50, 160, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            } else if (this.stagemen == 5) {
               this.drawBold("STAGE 6", 50, 180, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            }
         } else if (this.titlemode == 4) {
            this.titleimg[5].setAlpha(255);
            this.g.drawImage(this.titleimg[5], 0, 0);

            for (this.cyc = 0; this.cyc < effect_max; this.cyc++) {
               this.titleeffectdrawback(this.cyc);
            }

            this.g.setFont(Font.getFont(1879048448));
            this.drawBold("幻想音楽室〜♪", 20, 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(205, 155, 255));
            this.g.setFont(Font.getFont(1879049216));
            this.drawBold(
               "NOW PLAYING " + this.formatNum(this.playmusic, 2), 150, 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 155, 255)
            );
            this.g.setFont(Font.getFont(1879049216));
            if (this.musicnum > this.musictop + 4) {
               this.musictop = this.musicnum - 4;
            }

            if (this.musicnum < this.musictop) {
               this.musictop = this.musicnum;
            }

            for (this.cyc = this.musictop; this.cyc < 5 + this.musictop; this.cyc++) {
               this.cyc2 = this.cyc - this.musictop;
               if (this.cyc == 0) {
                  this.drawBold("00  神魔の一覧", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
                  if (this.cyc == this.musicnum) {
                     this.drawBold("00  神魔の一覧", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
                  }
               } else if (this.cyc == 1) {
                  this.drawBold("01  春の空港に", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
                  if (this.cyc == this.musicnum) {
                     this.drawBold("01  春の空港に", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
                  }
               } else if (this.cyc == 2) {
                  this.drawBold("02  え？トーキューじゃないの？", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
                  if (this.cyc == this.musicnum) {
                     this.drawBold("02  え？トーキューじゃないの？", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
                  }
               } else if (this.cyc == 3) {
                  this.drawBold("03  ゲリラそよ風", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
                  if (this.cyc == this.musicnum) {
                     this.drawBold("03  ゲリラそよ風", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
                  }
               } else if (this.cyc == 4) {
                  this.drawBold("04  からかぜレペチャージュ", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
                  if (this.cyc == this.musicnum) {
                     this.drawBold("04  からかぜレペチャージュ", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
                  }
               } else if (this.cyc == 5) {
                  this.drawBold("05  弾幕サイクロンマグナム", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
                  if (this.cyc == this.musicnum) {
                     this.drawBold("05  弾幕サイクロンマグナム", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
                  }
               } else if (this.cyc == 6) {
                  this.drawBold("06  魁即制人", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
                  if (this.cyc == this.musicnum) {
                     this.drawBold("06  魁即制人", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
                  }
               } else if (this.cyc == 7) {
                  this.drawBold("07  ULTRAVIOLET ひもろぎ", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
                  if (this.cyc == this.musicnum) {
                     this.drawBold("07  ULTRAVIOLET ひもろぎ", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
                  }
               } else if (this.cyc == 8) {
                  this.drawBold("08  先制魔法まスパ！", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
                  if (this.cyc == this.musicnum) {
                     this.drawBold("08  先制魔法まスパ！", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
                  }
               } else if (this.cyc == 9) {
                  this.drawBold("09  夢想封印  閑", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
                  if (this.cyc == this.musicnum) {
                     this.drawBold("09  夢想封印  閑", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
                  }
               } else if (this.cyc == 10) {
                  this.drawBold("10  エソテリア地鉄バス", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
                  if (this.cyc == this.musicnum) {
                     this.drawBold("10  エソテリア地鉄バス", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
                  }
               } else if (this.cyc == 11) {
                  this.drawBold("11  東方の首都に魔彩光", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
                  if (this.cyc == this.musicnum) {
                     this.drawBold("11  東方の首都に魔彩光", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
                  }
               } else if (this.cyc == 12) {
                  this.drawBold("12  都市神話", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
                  if (this.cyc == this.musicnum) {
                     this.drawBold("12  都市神話", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
                  }
               } else if (this.cyc == 13) {
                  this.drawBold("13  高さ魔界一の幻想", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
                  if (this.cyc == this.musicnum) {
                     this.drawBold("13  高さ魔界一の幻想", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
                  }
               } else if (this.cyc == 14) {
                  this.drawBold("14  翌日談はフェスティバル", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
                  if (this.cyc == this.musicnum) {
                     this.drawBold("14  翌日談はフェスティバル", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
                  }
               } else if (this.cyc == 15) {
                  this.drawBold("15  悪霊☆滅すべし！", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
                  if (this.cyc == this.musicnum) {
                     this.drawBold("15  悪霊☆滅すべし！", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
                  }
               } else if (this.cyc == 16) {
                  this.drawBold("16  旅は幻想入り", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
                  if (this.cyc == this.musicnum) {
                     this.drawBold("16  旅は幻想入り", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
                  }
               } else if (this.cyc == 17) {
                  this.drawBold("17  夢をみる郷", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(0, 0, 255));
                  if (this.cyc == this.musicnum) {
                     this.drawBold("17  夢をみる郷", 10, 40 + this.cyc2 * 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
                  }
               }
            }

            this.g.setColor(Graphics.getColorOfRGB(0, 0, 255, 150));
            this.g.fillRect(10, 130, 220, 100);
            if (this.playmusic == 0) {
               this.drawBold("《原曲》博麗　〜 Eastern Wind", 10, 150, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(205, 255, 205));
               this.drawBold("　タイトル画面曲。", 10, 170, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　自分的にオーソドックスな雰囲気。", 10, 185, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　このゲームの曲はFUETREK社製の音源", 10, 200, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　を想定して作られてます。一応。", 10, 215, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("                                Dhi", 10, 225, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            }

            if (this.playmusic == 1) {
               this.drawBold("《原曲》Dream Express＋おてんば恋娘", 10, 150, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(205, 255, 205));
               this.drawBold("　春の湊に…と見せかけて実は別の曲。", 10, 170, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　ステージタイトルから連想したら", 10, 185, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　こうなりました。", 10, 200, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("                                Dhi", 10, 225, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            }

            if (this.playmusic == 2) {
               this.drawBold("《原曲》おてんば恋娘＋無何有の郷", 10, 150, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(205, 255, 205));
               this.drawBold("　曲名で何が言いたいか分かった人は、", 10, 170, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　たぶん地元民。", 10, 185, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　チルノは妖1面の印象が強いのは", 10, 200, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　自分だけでしょうか。", 10, 215, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("                                Dhi", 10, 225, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            }

            if (this.playmusic == 3) {
               this.drawBold("《原曲》夜空のユーフォーロマンス", 10, 150, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(205, 255, 205));
               this.drawBold("　最大の敵が処理落ちな2面。", 10, 170, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　この曲はぜひイヤホンで、", 10, 185, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　聴いてみてください。", 10, 200, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　", 10, 215, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("                                Dhi", 10, 225, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            }

            if (this.playmusic == 4) {
               this.drawBold("《原曲》万年置き傘にご注意を", 10, 150, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(205, 255, 205));
               this.drawBold("　あの方をリスペクトして", 10, 170, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　緋想天風味に。", 10, 185, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　タイトルのネタ元、", 10, 200, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　推測してくれる人いるのかな…", 10, 215, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("                                Dhi", 10, 225, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            }

            if (this.playmusic == 5) {
               this.drawBold("《原曲》妖怪の山", 10, 150, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(205, 255, 205));
               this.drawBold("　4拍子にするだけではありきたり", 10, 170, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　なので、サビの最初だけを切るという", 10, 185, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　無茶をやってみた。", 10, 200, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　", 10, 215, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("                                Dhi", 10, 225, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            }

            if (this.playmusic == 6) {
               this.drawBold("《原曲》風の循環＋ﾚﾄﾛｽﾍﾟｸﾃｨﾌﾞ京都", 10, 150, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(205, 255, 205));
               this.drawBold("　吹奏楽器のない文も", 10, 170, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　たまにはいいんじゃないかと。", 10, 185, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　実際に戦ってると", 10, 200, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　曲が短く感じるのは処理落ちのせい。", 10, 215, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("                                Dhi", 10, 225, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            }

            if (this.playmusic == 7) {
               this.drawBold("《原曲》ひもろぎ、むらさきにもえ", 10, 150, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(205, 255, 205));
               this.drawBold("　大昔のフリゲテイスト。やっぱ４面", 10, 170, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　は盛り上がるのが一番。", 10, 185, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　原曲はＦＦ成分を抜きにしても良曲", 10, 200, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　なので皆もっと流行らせようよ。", 10, 215, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("                                Dhi", 10, 225, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            }

            if (this.playmusic == 8) {
               this.drawBold("《原曲》恋色マスタースパーク", 10, 150, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(205, 255, 205));
               this.drawBold("　そしてやっちゃいました。", 10, 170, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　ご想像の通りアレです。", 10, 185, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　某手書きMAD作品に触発されました。", 10, 200, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("", 10, 215, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("                                Dhi", 10, 225, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            }

            if (this.playmusic == 9) {
               this.drawBold("《原曲》少女綺想曲＋二色蓮花蝶", 10, 150, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(205, 255, 205));
               this.drawBold("　「瞬」の逆。のどか。むしろ怠惰。", 10, 170, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　イメージ的にはお賽銭ちょうだいな", 10, 185, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　霊夢。閑古鳥の閑、でもある？", 10, 200, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　", 10, 215, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("                                Dhi", 10, 225, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            }

            if (this.playmusic == 10) {
               this.drawBold("《原曲》魔界地方都市エソテリア", 10, 150, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(205, 255, 205));
               this.drawBold("　エソテリア最高。", 10, 170, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　都市の中央に向かうイメージ。お使", 10, 185, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　いの電話は正常ですよ（何）", 10, 200, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　", 10, 215, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("                                Dhi", 10, 225, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            }

            if (this.playmusic == 11) {
               this.drawBold("《原曲》ﾌﾞｸﾚｼｭﾃｨの人形師", 10, 150, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(205, 255, 205));
               this.drawBold("　アリスといえばなぜか都市。ここに", 10, 170, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　は偶然じゃない何かを感じる。", 10, 185, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　曲の方は上手くそれっぽい雰囲気が", 10, 200, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　出せなかったわけですが…。", 10, 215, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("                                Dhi", 10, 225, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            }

            if (this.playmusic == 12) {
               this.drawBold("《原曲》世界の果て", 10, 150, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(205, 255, 205));
               this.drawBold("　伝説から神話へ。", 10, 170, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　６面コラボ。緊張感よりも不安感の", 10, 185, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　ほうを強調して（？）みました。", 10, 200, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　狭いような広いような。", 10, 215, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("                                Dhi", 10, 225, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            }

            if (this.playmusic == 13) {
               this.drawBold("《原曲》神話幻想", 10, 150, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(205, 255, 205));
               this.drawBold("　道中と同じ流れで上手い具合にハマ", 10, 170, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　ってくれました。", 10, 185, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　もうここまで来たら楽しむしかない", 10, 200, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　ですね。ラスボスだし。", 10, 215, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("                                Dhi", 10, 225, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            }

            if (this.playmusic == 14) {
               this.drawBold("《原曲》博麗神社境内", 10, 150, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(205, 255, 205));
               this.drawBold("　賑やかな神社。", 10, 170, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　１度はアレンジしてみたかった曲な", 10, 185, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　ので、作ってて楽しかったです。", 10, 200, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　「翌」＝82 97。", 10, 215, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("                                Dhi", 10, 225, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            }

            if (this.playmusic == 15) {
               this.drawBold("《原曲》リーインカーネーション", 10, 150, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(205, 255, 205));
               this.drawBold("　人の心の闇より生まれ（ｒｙ　です", 10, 170, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　ね。懐かしい。", 10, 185, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　曲は緊張感ゼロ。むしろこの曲で緊", 10, 200, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　張感出せちゃう原曲MIDIが凄い。", 10, 215, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("                                Dhi", 10, 225, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            }

            if (this.playmusic == 16) {
               this.drawBold("《原曲》神話幻想", 10, 150, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(205, 255, 205));
               this.drawBold("　ラスボス曲アレンジ。", 10, 170, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　幻想上に新しい空間ができるという", 10, 185, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　点でゲームも一種の旅である。", 10, 200, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　って言ってみたかっただけ。", 10, 215, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("                                Dhi", 10, 225, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            }

            if (this.playmusic == 17) {
               this.drawBold("《原曲》Mystic Dream", 10, 150, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(205, 255, 205));
               this.drawBold("　ED曲に毎回付いてる「Dream」って、", 10, 170, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　「夢をみる島」で語られるそれ的な", 10, 185, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　意味だったりするんでしょうか。", 10, 200, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("　という意味のタイトル（謎", 10, 215, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
               this.drawBold("                                Dhi", 10, 225, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(150, 255, 255));
            }
         } else if (this.titlemode == 5) {
            this.titleimg[5].setAlpha(255);
            this.g.drawImage(this.titleimg[5], 0, 0);
            this.g.setFont(Font.getFont(1879048448));
            this.drawBold("ＯＰＴＩＯＮ", 20, 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(205, 155, 255));
            this.g.setColor(Graphics.getColorOfRGB(125, 200, 155, 150));
            this.g.fillRect(10, 42 + this.titleflag * 20, 220, 21);
            this.g.setFont(Font.getFont(1879048448));
            this.drawBold("ＢＧＭ   ←→     " + this.volume, 20, 60, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            this.drawBold("ＳＥ     ←→     " + this.sevolume, 20, 80, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            if (this.shotkey < 10) {
               this.drawBold("SHOT KEY ←→    " + this.shotkey + "  キー", 20, 100, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.shotkey == 10) {
               this.drawBold("SHOT KEY ←→    ＊ キー", 20, 100, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.shotkey == 11) {
               this.drawBold("SHOT KEY ←→    ＃ キー", 20, 100, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.shotkey == 20) {
               this.drawBold("SHOT KEY ←→  決定 キー", 20, 100, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.speedkey < 10) {
               this.drawBold("SLOW KEY ←→    " + this.speedkey + "  キー", 20, 120, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.speedkey == 10) {
               this.drawBold("SLOW KEY ←→    ＊ キー", 20, 120, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.speedkey == 11) {
               this.drawBold("SLOW KEY ←→    ＃ キー", 20, 120, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.speedkey == 20) {
               this.drawBold("SLOW KEY ←→  決定 キー", 20, 120, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.bomkey < 10) {
               this.drawBold("BOMB KEY  ←→    " + this.bomkey + "  キー", 20, 140, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.bomkey == 10) {
               this.drawBold("BOMB KEY  ←→    ＊ キー", 20, 140, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.bomkey == 11) {
               this.drawBold("BOMB KEY  ←→    ＃ キー", 20, 140, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.bomkey == 20) {
               this.drawBold("BOMB KEY  ←→  決定 キー", 20, 140, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.byougamode == 1) {
               this.drawBold("描画回数  ←→     毎回", 20, 160, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.byougamode == 2) {
               this.drawBold("描画回数  ←→    １／２", 20, 160, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }

            this.drawBold("戻る", 20, 180, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
         } else if (this.titlemode == 6) {
            this.titleimg[5].setAlpha(255);
            this.g.drawImage(this.titleimg[5], 0, 0);
            this.g.setFont(Font.getFont(1879048448));
            this.drawBold("      ＲＥＳＵＬＴ", 20, 20, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(215, 165, 255));
            this.g.setFont(Font.getFont(1879049216));
            if (this.titleflag % 10 == 0) {
               this.drawBold(" 博麗霊夢、 人間装備", 30, 60, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.titleflag % 10 == 2) {
               this.drawBold(" 博麗霊夢、 妖怪装備", 30, 60, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.titleflag % 10 == 1) {
               this.drawBold("霧雨魔理沙、人間装備", 30, 60, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.titleflag % 10 == 3) {
               this.drawBold("霧雨魔理沙、妖怪装備", 30, 60, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.titleflag < 5) {
               this.drawBold(
                  " ノーマル   " + this.peoplehighscore1[this.titleflag], 35, 80, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255)
               );
               this.drawBold(
                  "  ハード    " + this.peoplehighscore2[this.titleflag], 35, 100, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255)
               );
               this.drawBold(
                  "エキストラ  " + this.peoplehighscore3[this.titleflag], 35, 120, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255)
               );
            }
         } else if (this.titlemode == 7) {
         }
      }

      for (int var11 = 0; var11 < effect_max; var11++) {
         if (effectmode[var11] != 0) {
            this.titleeffectdraw(var11);
         }
      }
   }

   void pausedraw() {
      if (this.gamemode == 2) {
         this.g.setColor(Graphics.getColorOfRGB(55, 165, 255, 200));
         this.g.fillRect(1, 8, 187, 224);
         this.g.setFont(Font.getFont(1879048448));
         this.drawBold("一時停止", 10, 50, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
         this.g.setFont(Font.getFont(1879048448));
         this.drawBold("一時停止を解除する", 10, 160, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
         this.drawBold("タイトルへ戻る", 10, 190, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
         this.drawBold("最初からやり直す", 10, 220, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
         if (this.titlemode == 0) {
            this.drawBold("一時停止を解除する", 10, 160, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 125, 125));
         } else if (this.titlemode == 1) {
            this.drawBold("タイトルへ戻る", 10, 190, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 125, 125));
         } else if (this.titlemode == 2) {
            this.drawBold("最初からやり直す", 10, 220, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 125, 125));
         }
      }
   }

   void gameoverdraw() {
      if (this.gamemode == 3) {
         this.g.setColor(Graphics.getColorOfRGB(55, 165, 255, 200));
         this.g.fillRect(1, 8, 187, 224);
         this.g.setFont(Font.getFont(1879048448));
         this.drawBold("満身創痍", 10, 50, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
         this.g.setFont(Font.getFont(1879048448));
         this.drawBold("続けて再挑戦する", 10, 160, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
         this.drawBold("タイトルへ戻る", 10, 190, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
         this.drawBold("最初からやり直す", 10, 220, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
         if (this.titlemode == 0) {
            this.drawBold("続けて再挑戦する", 10, 160, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 125, 125));
         } else if (this.titlemode == 1) {
            this.drawBold("タイトルへ戻る", 10, 190, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 125, 125));
         } else if (this.titlemode == 2) {
            this.drawBold("最初からやり直す", 10, 220, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 125, 125));
         }
      }
   }

   void gazouload() {
      for (this.cyc = 0; this.cyc < 3600; this.cyc++) {
         this.sin[this.cyc] = (float)Math.sin(this.cyc * 3.141592 / 1800.0);
         this.cos[this.cyc] = (float)Math.cos(this.cyc * 3.141592 / 1800.0);
      }

      for (int var1 = 0; var1 < 30; var1++) {
         try {
            MediaImage var2 = MediaManager.getImage("resource:///" + var1 + ".gif");
            var2.use();
            this.image[var1] = var2.getImage();
            this.loadingkasa();
         } catch (Exception var10) {
         }
      }

      for (int var11 = 0; var11 < 10; var11++) {
         try {
            MediaImage var14 = MediaManager.getImage("resource:///en" + var11 + ".gif");
            var14.use();
            this.eimg[var11] = var14.getImage();
            this.loadingkasa();
         } catch (Exception var9) {
         }
      }

      for (int var12 = 0; var12 < 5; var12++) {
         try {
            MediaImage var15 = MediaManager.getImage("resource:///stand" + var12 + ".gif");
            var15.use();
            this.standimg[var12] = var15.getImage();
            this.loadingkasa();
         } catch (Exception var8) {
         }
      }

      try {
         MediaImage var16 = MediaManager.getImage("resource:///4.gif");
         var16.use();
         this.flameimg[0] = var16.getImage();
         this.loadingkasa();
      } catch (Exception var7) {
      }

      try {
         MediaImage var17 = MediaManager.getImage("resource:///bg01.gif");
         var17.use();
         this.bgimg[0] = var17.getImage();
      } catch (Exception var6) {
      }

      try {
         MediaImage var18 = MediaManager.getImage("resource:///bg01.JPG");
         var18.use();
         this.bgimg[1] = var18.getImage();
      } catch (Exception var5) {
      }

      this.image[0].setAlpha(120);
      this.image[11].setAlpha(120);
      this.image[8].setAlpha(130);

      for (int var13 = 0; var13 < 8; var13++) {
         try {
            MediaSound var19 = MediaManager.getSound("resource:///se" + var13 + ".mld");
            var19.use();
            this.seplayer[var13] = AudioPresenter.getAudioPresenter();
            this.seplayer[var13].setSound(var19);
            this.seplayer[var13].setMediaListener(this);
            this.loadingkasa();
         } catch (Exception var4) {
         }
      }

      try {
         MediaSound var20 = MediaManager.getSound("resource:///0.mld");
         var20.use();
         this.player = AudioPresenter.getAudioPresenter();
         this.player.setSound(var20);
         this.player.setMediaListener(this);
         this.loadingkasa();
      } catch (Exception var3) {
      }

      this.player.setAttribute(4, this.volume);

      for (this.aa = 0; this.aa < 100; this.aa++) {
         this.loadingkasa();
      }
   }

   void eddraw() {
      if (peoplebomkind % 2 == 0) {
         if (this.konnte == 0) {
            if (this.edflag < 7) {
               this.g.drawImage(this.titleimg[0], 0, 0);
            }

            if (this.edflag > 6) {
               this.g.drawImage(this.titleimg[1], 0, 0);
            }
         } else {
            this.g.drawImage(this.titleimg[0], 0, 0);
         }
      }

      if (peoplebomkind % 2 == 1) {
         if (this.konnte == 0) {
            if (this.edflag < 10) {
               this.g.drawImage(this.titleimg[0], 0, 0);
            }

            if (this.edflag > 9) {
               this.g.drawImage(this.titleimg[1], 0, 0);
            }
         } else {
            this.g.drawImage(this.titleimg[0], 0, 0);
         }
      }

      if (this.stagetime < 240) {
         this.g.setColor(Graphics.getColorOfRGB(255, 255, 255, 250 - this.stagetime));
         this.g.fillRect(0, 0, 240, 240);
      } else if (this.stagetime < 271) {
         this.g.setColor(Graphics.getColorOfRGB(0, 0, 0, 120));
         this.g.fillRect(0, 190, 240, 50);
      } else {
         this.g.setColor(Graphics.getColorOfRGB(0, 0, 0, 120));
         this.g.fillRect(0, 190, 240, 50);
         this.g.setFont(Font.getFont(1879049216));
         this.drawBold(kaiwa1, 5, 205, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
         this.drawBold(kaiwa2, 5, 220, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
         this.drawBold(kaiwa3, 5, 235, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
      }
   }

   void sfdraw() {
      if (this.stagetime < 100) {
         this.g.setColor(Graphics.getColorOfRGB(0, 0, 60, 10));
         this.g.fillRect(0, 0, 240, 240);
      } else {
         this.g.setColor(Graphics.getColorOfRGB(0, 0, 60, 255));
         this.g.fillRect(0, 0, 240, 240);
      }

      for (int var2 = 0; var2 < effect_max; var2++) {
         int var3 = (int)(effectX[var2] + this.stageY);
         int var4 = (int)effectY[var2];
         if (effectmode[var2] == 999) {
            this.g.unlock(true);

            for (this.cyc = 0; this.cyc < 60; this.cyc++) {
               this.g.setColor(Graphics.getColorOfRGB(0, 0, 0, 20));
               this.g.fillRect(0, 0, 240, 240);
               this.g.setFont(Font.getFont(1879048448));
               this.drawBold(
                  "少女祈祷中･･･", 120, 220, Graphics.getColorOfRGB(this.cyc % 20 * 3, this.cyc % 20 * 3, this.cyc % 20 * 10), Graphics.getColorOfRGB(55, 55, 255)
               );

               try {
                  Thread.sleep(33L);
               } catch (Exception var6) {
               }
            }

            this.g.setColor(Graphics.getColorOfRGB(255, 255, 255, 255));
            this.g.fillRect(0, 0, 240, 240);
            this.g.lock();
         } else if (effectmode[var2] == 1) {
            this.titleimg[0].setAlpha(255);
            effectkakudo[var2] = effectkakudo[var2] % 360.0F;
            if (effectkakudo[var2] < 180.0F) {
               int var8 = (int)(effectkakudo[var2] / 18.0F);
               this.g.drawImage(this.titleimg[0], var3 - 15, var4 - 15, var8 * 30, 60, 30, 30);
            } else {
               int var9 = 10 - (int)((effectkakudo[var2] - 180.0F) / 18.0F);
               this.g.drawImage(this.titleimg[0], var3 - 15, var4 - 15, var9 * 30, 90, 30, 30);
            }
         } else if (effectmode[var2] == 2) {
            this.titleimg[1].setAlpha(255);
            this.g.drawImage(this.titleimg[1], var3 - 10, var4 - 10, effectholdnumber0[var2] * 20, 0, 20, 20);
         } else if (effectmode[var2] == 3) {
            this.titleimg[0].setAlpha(120 - 6 * effecttime[var2]);
            effectkakudo[var2] = effectkakudo[var2] % 360.0F;
            if (effectkakudo[var2] < 180.0F) {
               int var1 = (int)(effectkakudo[var2] / 18.0F);
               this.g.drawImage(this.titleimg[0], var3 - 15, var4 - 15, var1 * 30, 0, 30, 30);
            } else {
               int var7 = 10 - (int)((effectkakudo[var2] - 180.0F) / 18.0F);
               this.g.drawImage(this.titleimg[0], var3 - 15, var4 - 15, var7 * 30, 30, 30, 30);
            }
         } else if (effectmode[var2] == 4) {
            this.titleimg[1].setAlpha(180);
            this.g.drawImage(this.titleimg[1], var3 - 10, var4 - 10, effectholdnumber0[var2] * 20, 0, 20, 20);
         } else if (effectmode[var2] == 6) {
            if (effectholdnumber1[var2] == 0) {
               this.titleimg[9].setAlpha(255);
               if (effecttime[var2] < 10) {
                  this.titleimg[9].setAlpha(5 + effecttime[var2] * 25);
               }

               if (effectholdnumber2[var2] == 0 || effectholdnumber2[var2] == 1) {
                  if (effectholdnumber2[var2] != this.stagelevel) {
                     this.titleimg[9].setAlpha(122);
                  }

                  if (effecttime[var2] < 10 && effectholdnumber2[var2] != this.stagelevel) {
                     this.titleimg[9].setAlpha(5 + effecttime[var2] * 25 / 2);
                  }
               }

               this.g.drawImage(this.titleimg[9], var3, var4, 0, effectholdnumber2[var2] * 54, 240, 54);
            } else if (effectholdnumber1[var2] == 1) {
               this.titleimg[9].setAlpha(255);
               this.titleimg[9].setAlpha(255 - effecttime[var2] * 25);
               this.g.drawImage(this.titleimg[9], var3, var4, 0, effectholdnumber2[var2] * 54, 240, 54);
            }
         }
      }

      this.g.setColor(Graphics.getColorOfRGB(0, 0, 0));
      this.g.fillRect(240 + (int)this.stageY * 2, 0, (int)(-this.stageY * 2.0F), 240);
      if (this.stagetime > 550 && this.stagetime < 1851) {
         this.g.drawImage(this.titleimg[2], 120, 240 - (this.stagetime - 550));
      } else if (this.stagetime > 1850 && this.stagetime < 1970) {
         this.titleimg[2].setAlpha(255);
         if (this.stagetime > 1940) {
            this.titleimg[2].setAlpha(255 - (this.stagetime - 1940) * 8);
         }

         this.g.drawImage(this.titleimg[2], 120, -1060);
      }

      if (this.stagetime > 2150 && this.stagetime < 2181) {
         this.titleimg[3].setAlpha((this.stagetime - 2150) * 8);
         this.g.drawImage(this.titleimg[3], 240 - (this.stagetime - 2150) * 4, 210);
      } else if (this.stagetime > 2180) {
         this.titleimg[3].setAlpha(255);
         this.g.drawImage(this.titleimg[3], 120, 210);
      }

      if (this.stagetime > 60 && this.stagetime < 180) {
         this.g.setFont(Font.getFont(1879048448));
         this.drawBold("  原作；上海アリス幻樂団 様", 1, 120, Graphics.getColorOfRGB(255, 255, 255), Graphics.getColorOfRGB(55, 55, 255));
      }
   }

   void omballmove() {
      this.cyc2 = this.peoplepower / 100;
      if (this.cyc2 == 5) {
         this.cyc2 = 4;
      }

      for (this.cyc = 0; this.cyc < 4; this.cyc++) {
         this.omballX[this.cyc] = 999;
         this.omballY[this.cyc] = 999;
      }

      if (peoplebomkind == 2) {
         if (this.peopleslow == 0) {
            for (this.cyc = 0; this.cyc < this.cyc2; this.cyc++) {
               this.omballX[this.cyc] = this.peopleX
                  + (int)(this.omballkyori[0] * Math.cos((this.omballkakudo[0] + this.cyc * (360 / this.cyc2)) % 360 * 3.1415 / 180.0));
               this.omballY[this.cyc] = this.peopleY
                  + (int)(this.omballkyori[0] * Math.sin((this.omballkakudo[0] + this.cyc * (360 / this.cyc2)) % 360 * 3.1415 / 180.0));
            }
         } else if (this.peopleslow == 1 && this.cyc2 != 0) {
            for (this.cyc = 0; this.cyc < 4; this.cyc++) {
               this.omballX[this.cyc] = this.peopleX
                  + (int)(this.omballkyori[0] * Math.cos((this.omballkakudo[0] + this.cyc * (360 / this.cyc2)) % 360 * 3.1415 / 180.0));
               this.omballY[this.cyc] = this.peopleY
                  + (int)(this.omballkyori[0] * Math.sin((this.omballkakudo[0] + this.cyc * (360 / this.cyc2)) % 360 * 3.1415 / 180.0));
            }
         }

         this.omballkakudo[0] = this.omballkakudo[0] + 12;
         if (this.omballkyori[0] < 15) {
            this.omballkyori[0] = this.omballkyori[0] + 4;
         }

         if (this.peopleslow == 0) {
            this.omballkyori_k[0] = 35;
            if (this.omballkyori[0] < this.omballkyori_k[0]) {
               this.omballkyori[0] = this.omballkyori[0] + 4;
            }
         } else if (this.peopleslow == 1) {
            this.omballkyori_k[0] = 15;
            if (this.omballkyori[0] > this.omballkyori_k[0]) {
               this.omballkyori[0] = this.omballkyori[0] - 4;
            }
         }
      } else if (peoplebomkind == 1) {
         for (this.cyc = 0; this.cyc < 4; this.cyc++) {
            this.omballX[this.cyc] = this.peopleX + (int)(this.omballkyori[0] * Math.cos(-(this.cyc + 1) * (180 / (this.cyc2 + 1)) * 3.1415 / 180.0));
            this.omballY[this.cyc] = this.peopleY + (int)(this.omballkyori[0] * Math.sin(-(this.cyc + 1) * (180 / (this.cyc2 + 1)) * 3.1415 / 180.0));
         }

         if (this.omballkyori[0] < 10) {
            this.omballkyori[0] = this.omballkyori[0] + 4;
         }

         if (this.peopleslow == 0) {
            this.omballkyori_k[0] = 30;
            if (this.omballkyori[0] < this.omballkyori_k[0]) {
               this.omballkyori[0] = this.omballkyori[0] + 4;
            }
         } else if (this.peopleslow == 1) {
            this.omballkyori_k[0] = 10;
            if (this.omballkyori[0] > this.omballkyori_k[0]) {
               this.omballkyori[0] = this.omballkyori[0] - 4;
            }
         }
      } else if (peoplebomkind == 0) {
         for (this.cyc = 0; this.cyc < 4; this.cyc++) {
            this.omballkakudo[this.cyc] = 180 - (this.cyc + 1) * (180 / (this.cyc2 + 1));
            this.omballX[this.cyc] = this.peopleX + (int)(this.omballkyori[0] * Math.cos(this.omballkakudo[this.cyc] * 3.1415 / 180.0));
            this.omballY[this.cyc] = this.peopleY + (int)(this.omballkyori[0] * Math.sin(this.omballkakudo[this.cyc] * 3.1415 / 180.0));
         }

         if (this.peopleslow == 0) {
            this.omballkyori_k[0] = 30;
            if (this.omballkyori[0] < this.omballkyori_k[0]) {
               this.omballkyori[0] = this.omballkyori[0] + 6;
            }
         } else if (this.peopleslow == 1) {
            this.omballkyori_k[0] = -15;
            if (this.omballkyori[0] > this.omballkyori_k[0]) {
               this.omballkyori[0] = this.omballkyori[0] - 6;
            }
         }
      } else if (peoplebomkind == 3) {
         for (this.cyc = 0; this.cyc < 4; this.cyc++) {
            this.omballkakudo[this.cyc] = -(this.cyc + 1) * (180 / (this.cyc2 + 1)) + 180;
            this.omballX[this.cyc] = this.peopleX + (int)(this.omballkyori[0] * Math.cos(this.omballkakudo[this.cyc] * 3.1415 / 180.0));
            this.omballY[this.cyc] = this.peopleY + 5 + (int)(this.omballkyori[0] * 0.25 * Math.sin(this.omballkakudo[this.cyc] * 3.1415 / 180.0));
         }

         if (this.omballkyori[0] < 10) {
            this.omballkyori[0] = this.omballkyori[0] + 4;
         }

         if (this.peopleslow == 0) {
            this.omballkyori_k[0] = 60;
            if (this.omballkyori[0] < this.omballkyori_k[0]) {
               this.omballkyori[0] = this.omballkyori[0] + 4;
            }
         } else if (this.peopleslow == 1) {
            this.omballkyori_k[0] = 10;
            if (this.omballkyori[0] > this.omballkyori_k[0]) {
               this.omballkyori[0] = this.omballkyori[0] - 4;
            }
         }
      }
   }

   void tamamove(int var1) {
      if (this.tamaseehit[var1] == 0) {
         this.kyori = (this.tamaX[var1] - this.peopleX) * (this.tamaX[var1] - this.peopleX)
            + (this.tamaY[var1] - this.peopleY) * (this.tamaY[var1] - this.peopleY);
         if (this.kyori < this.tamaatari[var1] * this.tamaatari[var1]) {
            if (this.tamakesuna[var1] == 0) {
               this.tamamode[var1] = 0;
            }

            effectIn(this.tamaX[var1], this.tamaY[var1], 5, this.tamairo[var1], this.tamashape[var1], 0);
            if (this.peoplemuteki == 0) {
               effectIn(this.peopleX, this.peopleY, 14, 0, 0, 0);
               this.peoplemuteki = -99;
            }
         } else if (this.kyori < (this.tamaatari[var1] + 10) * (this.tamaatari[var1] + 10)) {
            if (this.tamakasuri[var1] == 0) {
               effectIn((int)((this.peopleX + this.tamaX[var1]) / 2.0F), (int)((this.peopleY + this.tamaY[var1]) / 2.0F), 24, 0, 0, 0);
               if (this.peoplekasuri < 100000) {
                  this.peoplekasuri++;
               }

               this.peoplepoint++;
               this.tamakasuri[var1] = 1;
            }
         } else if (this.kyori > (this.tamaatari[var1] + 10) * (this.tamaatari[var1] + 10)) {
            this.tamaseehit[var1] = 1;
         }
      } else if (this.tamaseehit[var1] == 1) {
         this.tamaseehit[var1] = 0;
      }

      this.tamatime[var1]++;
      if (this.tamatime[var1] > 5) {
         this.tamaX[var1] = this.tamaX[var1] + this.tamaXmove[var1];
         this.tamaY[var1] = this.tamaY[var1] + this.tamaYmove[var1];
      }

      if (this.tamashape[var1] == 6) {
         if (this.tamaX[var1] > this.migi + 25 || this.tamaX[var1] < -25.0F || this.tamaY[var1] > 255.0F || this.tamaY[var1] < -25.0F) {
            this.tamamode[var1] = 0;
         }
      } else if (this.tamashape[var1] == 9) {
         if (this.tamaX[var1] > this.migi + 35 || this.tamaX[var1] < -35.0F || this.tamaY[var1] > 275.0F || this.tamaY[var1] < -35.0F) {
            this.tamamode[var1] = 0;
         }
      } else if (this.tamaX[var1] > this.migi + 10 || this.tamaX[var1] < -10.0F || this.tamaY[var1] > 250.0F || this.tamaY[var1] < -10.0F) {
         this.tamamode[var1] = 0;
      }

      if (this.tamamode[var1] == 1) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }
      } else if (this.tamamode[var1] == 2) {
         if (this.tamatime[var1] == 1) {
            float var2 = this.tamaholdnumber0[var1] - this.tamaX[var1];
            float var3 = this.tamaholdnumber1[var1] - this.tamaY[var1];
            float var4 = FastMath.atan2(var2, var3);
            this.tamakakudo[var1] = this.tamakakudo[var1] + var4;
            // if (var3 < 0.0F) {
            //    this.tamakakudo[var1] = this.tamakakudo[var1] + 180.0F;
            // }

            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }
      } else if (this.tamamode[var1] == 3) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] == this.tamaholdnumber1[var1]) {
            this.tamaXmove[var1] = 0.0F;
            this.tamaYmove[var1] = 0.0F;
         }

         if (this.tamatime[var1] == this.tamaholdnumber2[var1]) {
            this.tamakakudo[var1] = this.tamakakudo[var1] + this.tamaholdnumber0[var1];
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }
      } else if (this.tamamode[var1] == 4) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] > this.tamaholdnumber1[var1] && this.tamatime[var1] < this.tamaholdnumber2[var1]) {
            this.tamakakudo[var1] = this.tamakakudo[var1] + this.tamaholdnumber0[var1];
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }
      } else if (this.tamamode[var1] == 5) {
         if (this.tamatime[var1] == 1) {
            float var5 = this.tamaholdnumber0[var1] - this.tamaX[var1];
            float var6 = this.tamaholdnumber1[var1] - this.tamaY[var1];
            float var7 = FastMath.atan2(var5, var6);
            if (this.tamaholdnumber2[var1] > 0) {
               this.tamaholdnumber0[var1] = 90;
            }

            if (this.tamaholdnumber2[var1] < 0) {
               this.tamaholdnumber0[var1] = -90;
            }

            this.tamakakudo[var1] = this.tamakakudo[var1] + var7;
            // if (var6 < 0.0F) {
            //    this.tamakakudo[var1] = this.tamakakudo[var1] + 180.0F;
            // }
         }

         this.tamaholdnumber0[var1] = this.tamaholdnumber0[var1] + this.tamaholdnumber2[var1];
         this.tamaXmove[var1] = (float)(
            this.tamaspeed[var1] * Math.cos((this.tamakakudo[var1] + 60.0 * Math.sin(this.tamaholdnumber0[var1] * 3.1415 / 180.0)) % 360.0 * 3.1415 / 180.0)
         );
         this.tamaYmove[var1] = (float)(
            this.tamaspeed[var1] * Math.sin((this.tamakakudo[var1] + 60.0 * Math.sin(this.tamaholdnumber0[var1] * 3.1415 / 180.0)) % 360.0 * 3.1415 / 180.0)
         );
         this.tamarange[var1] = (float)(this.tamakakudo[var1] + 60.0 * Math.sin(this.tamaholdnumber0[var1] * 3.1415 / 180.0));
         this.getPICNUM(var1);
      } else if (this.tamamode[var1] == 6) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] == this.tamaholdnumber1[var1]) {
            this.tamaXmove[var1] = 0.0F;
            this.tamaYmove[var1] = 0.0F;
         }

         if (this.tamatime[var1] == this.tamaholdnumber2[var1]) {
            this.tamamode[var1] = 0;
            if (this.stagelevel == 0) {
               this.laserIn(this.tamaX[var1], this.tamaY[var1], 1, 3.0F, 90.0F, 3.0F, 100, 0, 0, 5);
            } else if (this.stagelevel == 1) {
               this.laserIn(this.tamaX[var1], this.tamaY[var1], 1, 3.0F, 90.0F, 3.0F, 100, 0, 0, 5);
               this.laserIn(this.tamaX[var1], this.tamaY[var1], 1, 3.0F, 120.0F, 3.0F, 80, 0, 0, 5);
               this.laserIn(this.tamaX[var1], this.tamaY[var1], 1, 3.0F, 60.0F, 3.0F, 80, 0, 0, 5);
            }
         }
      } else if (this.tamamode[var1] == 7) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] == this.tamaholdnumber1[var1]) {
            this.tamaXmove[var1] = 0.0F;
            this.tamaYmove[var1] = 0.0F;
         }

         if (this.tamatime[var1] == this.tamaholdnumber2[var1]) {
            this.tamakakudo[var1] = this.getkakudo(this.tamaX[var1], this.tamaY[var1], this.peopleX, this.peopleY);
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }
      } else if (this.tamamode[var1] == 8) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] == this.tamaholdnumber1[var1]) {
            this.tamaXmove[var1] = this.tamaXmove[var1] / 3.0F;
            this.tamaYmove[var1] = this.tamaYmove[var1] / 3.0F;
         }

         if (this.tamatime[var1] == this.tamaholdnumber2[var1]) {
            this.tamaXmove[var1] = this.tamaXmove[var1] * 3.0F;
            this.tamaYmove[var1] = this.tamaYmove[var1] * 3.0F;
         }
      } else if (this.tamamode[var1] == 9) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamaYmove[var1] < this.tamaholdnumber0[var1]) {
            this.tamaYmove[var1] = (float)(this.tamaYmove[var1] + 0.06);
         }
      } else if (this.tamamode[var1] == 10) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         this.sh(this.tamaX[var1], this.tamaY[var1], 3, 2.0F, this.tamakakudo[var1] + this.tamaholdnumber0[var1], 0, 2, 60, 1, 1);
         this.tamaholdnumber0[var1] = this.tamaholdnumber0[var1] + this.tamaholdnumber1[var1];
      } else if (this.tamamode[var1] == 11) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] == this.tamaholdnumber1[var1]) {
            this.tamaXmove[var1] = 0.0F;
            this.tamaYmove[var1] = 0.0F;
         }

         if (this.tamatime[var1] == this.tamaholdnumber2[var1]) {
            this.tamakakudo[var1] = this.tamakakudo[var1] + this.tamaholdnumber0[var1];
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] < this.tamaholdnumber1[var1] || this.tamatime[var1] > this.tamaholdnumber2[var1]) {
            if (this.stagelevel == 0) {
               if (this.tamatime[var1] % 2 == 0) {
                  this.sh(this.tamaX[var1], this.tamaY[var1], 3, 2.0F, this.tamakakudo[var1] + this.tamaholdnumber3[var1], 0, 2, 60, 1, 1);
               }

               this.tamaholdnumber3[var1] = this.tamaholdnumber3[var1] + 29;
            } else if (this.stagelevel == 1) {
               this.sh(this.tamaX[var1], this.tamaY[var1], 3, 2.0F, this.tamakakudo[var1] + this.tamaholdnumber3[var1], 0, 2, 60, 1, 1);
               this.tamaholdnumber3[var1] = this.tamaholdnumber3[var1] + 29;
            }
         }
      } else if (this.tamamode[var1] == 12) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] == this.tamaholdnumber1[var1]) {
            this.tamaXmove[var1] = 0.0F;
            this.tamaYmove[var1] = 0.0F;
         }

         if (this.tamatime[var1] == this.tamaholdnumber2[var1]) {
            if (this.stagelevel == 0) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.tamaX[var1], this.tamaY[var1], 4, 2.0F, this.tamakakudo[var1] + this.cyc * 45, 10, 5, 35, 2, 1);
               }
            }

            if (this.stagelevel == 1) {
               for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                  this.sh(this.tamaX[var1], this.tamaY[var1], 4, 3.0F, this.tamakakudo[var1] + this.cyc * 30, 10, 5, 35, 2, 1);
               }
            }

            this.tamamode[var1] = 0;
         }
      } else if (this.tamamode[var1] == 13) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] == this.tamaholdnumber1[var1]) {
            this.tamaXmove[var1] = 0.0F;
            this.tamaYmove[var1] = 0.0F;
         }

         if (this.tamatime[var1] == this.tamaholdnumber2[var1]) {
            if (this.stagelevel == 0) {
               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.sh(
                     this.tamaX[var1],
                     this.tamaY[var1],
                     3,
                     2.0F,
                     this.tamakakudo[var1] + this.cyc * 72,
                     (int)((this.rand.nextInt() >>> 1) % 180 - 90 + this.tamakakudo[var1]),
                     30,
                     35,
                     2,
                     2
                  );
               }
            }

            if (this.stagelevel == 1) {
               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  this.sh(
                     this.tamaX[var1],
                     this.tamaY[var1],
                     3,
                     2.0F,
                     this.tamakakudo[var1] + this.cyc * 45,
                     (int)((this.rand.nextInt() >>> 1) % 180 - 90 + this.tamakakudo[var1]),
                     30,
                     35,
                     2,
                     2
                  );
               }
            }

            this.tamamode[var1] = 0;
         }
      } else if (this.tamamode[var1] == 14) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = 0.0F;
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] < 30) {
            this.tamaYmove[var1] = (float)(this.tamaYmove[var1] + this.tamaholdnumber0[var1] * 0.1);
         }
      } else if (this.tamamode[var1] == 15) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] < 11) {
            this.tamaholdnumber0[var1] = (int)(this.tamaholdnumber0[var1] + this.tamaholdnumber1[var1] * 0.1);
            this.tamaatari[var1] = (int)(this.tamaholdnumber0[var1] * 0.8);
         }
      } else if (this.tamamode[var1] == 16) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaholdnumber0[var1] = 0;
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamaX[var1] > this.migi) {
            this.sh(this.tamaX[var1], this.tamaY[var1], 1, this.tamaspeed[var1], 180.0F, 0, 0, 0, 0, this.tamairo[var1]);
            this.tamamode[var1] = 0;
         }

         if (this.tamaX[var1] < 0.0F) {
            this.sh(this.tamaX[var1], this.tamaY[var1], 1, this.tamaspeed[var1], 0.0F, 0, 0, 0, 0, this.tamairo[var1]);
            this.tamamode[var1] = 0;
         }
      } else if (this.tamamode[var1] == 17) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];

            for (this.cyc = 0; this.cyc < 18; this.cyc++) {
               this.sh(this.tamaX[var1], this.tamaY[var1], 8, 3.0F, var1 * 13 + this.cyc * 20, 0, 30, 0, 0, 5);
            }

            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] < 11) {
            this.tamaholdnumber0[var1] = (int)(this.tamaholdnumber0[var1] + this.tamaholdnumber1[var1] * 0.1);
            this.tamaatari[var1] = (int)(this.tamaholdnumber0[var1] * 0.8);
         }

         if (this.tamatime[var1] > 31) {
            if (this.tamatime[var1] % 2 == 0) {
               this.tamaholdnumber0[var1] = (int)(this.tamaholdnumber0[var1] - this.tamaholdnumber1[var1] * 0.005);
            }

            this.tamaatari[var1] = (int)(this.tamaholdnumber0[var1] * 0.8);
         }
      } else if (this.tamamode[var1] == 18) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] == 21) {
            this.tamaXmove[var1] = (float)(this.tamaXmove[var1] * 0.5);
            this.tamaYmove[var1] = (float)(this.tamaYmove[var1] * 0.5);
         }
      } else if (this.tamamode[var1] == 19) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamaX[var1] > this.migi || this.tamaX[var1] < 0.0F || this.tamaY[var1] > 235.0F || this.tamaY[var1] < 0.0F) {
            this.tamakakudo[var1] = this.getkakudo(this.tamaX[var1], this.tamaY[var1], this.peopleX, this.peopleY) - 30.0F + (this.rand.nextInt() >>> 1) % 60;
            this.sh(this.tamaX[var1], this.tamaY[var1], 8, this.tamaspeed[var1], this.tamakakudo[var1], 2, 2, 30, this.tamashape[var1], this.tamairo[var1]);
            this.tamamode[var1] = 0;
         }
      } else if (this.tamamode[var1] == 20) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = 0.0F;
            this.tamaYmove[var1] = 0.0F;
         }

         if (this.tamatime[var1] == 30) {
            this.sh(this.tamaX[var1], this.tamaY[var1], 1, this.tamaspeed[var1], this.tamakakudo[var1], 2, 2, 30, 8, 3);
            this.tamamode[var1] = 0;
         }
      } else if (this.tamamode[var1] == 21) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] == this.tamaholdnumber1[var1]) {
            this.tamamode[var1] = 0;
            this.tamakakudo[var1] = this.tamakakudo[var1] + this.tamaholdnumber0[var1];
            this.sh(this.tamaX[var1], this.tamaY[var1], 1, 1.0F, this.tamakakudo[var1], 0, 0, 0, 2, this.tamaholdnumber2[var1]);
         }
      } else if (this.tamamode[var1] == 22) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] == 20) {
            this.tamaXmove[var1] = 0.0F;
            this.tamaYmove[var1] = 0.0F;
         }

         if (this.tamatime[var1] == 80) {
            this.tamakakudo[var1] = this.getkakudo(this.tamaX[var1], this.tamaY[var1], this.peopleX, this.peopleY);
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.tamairo[var1] = 2;
            this.getPICNUM(var1);
         }
      } else if (this.tamamode[var1] == 23) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamaX[var1] > this.migi + 5 || this.tamaX[var1] < -5.0F) {
            this.sh(
               this.tamaX[var1], this.tamaY[var1], 1, this.tamaspeed[var1], 180.0F - this.tamakakudo[var1], 0, 0, 0, this.tamashape[var1], this.tamairo[var1]
            );
            this.tamamode[var1] = 0;
         } else if (this.tamaY[var1] < -5.0F) {
            this.sh(this.tamaX[var1], this.tamaY[var1], 1, this.tamaspeed[var1], -this.tamakakudo[var1], 0, 0, 0, this.tamashape[var1], this.tamairo[var1]);
            this.tamamode[var1] = 0;
         }
      } else if (this.tamamode[var1] == 24) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] == this.tamaholdnumber0[var1]) {
            this.sh(this.tamaX[var1], this.tamaY[var1], 25, this.tamaspeed[var1], this.tamakakudo[var1] + 0.0F + this.tamaholdnumber0[var1] * 13, 2, 0, 0, 0, 5);
            this.sh(
               this.tamaX[var1], this.tamaY[var1], 25, this.tamaspeed[var1], this.tamakakudo[var1] + 72.0F + this.tamaholdnumber0[var1] * 13, 3, 0, 0, 0, 5
            );
            this.sh(
               this.tamaX[var1], this.tamaY[var1], 25, this.tamaspeed[var1], this.tamakakudo[var1] + 144.0F + this.tamaholdnumber0[var1] * 13, 0, 0, 0, 0, 5
            );
            this.sh(
               this.tamaX[var1], this.tamaY[var1], 25, this.tamaspeed[var1], this.tamakakudo[var1] + 216.0F + this.tamaholdnumber0[var1] * 13, 1, 0, 0, 0, 5
            );
            this.sh(
               this.tamaX[var1], this.tamaY[var1], 25, this.tamaspeed[var1], this.tamakakudo[var1] + 288.0F + this.tamaholdnumber0[var1] * 13, 4, 0, 0, 0, 5
            );
            this.tamamode[var1] = 0;
         }
      } else if (this.tamamode[var1] == 25) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] == 30) {
            this.tamairo[var1] = this.tamaholdnumber0[var1];
         }
      } else if (this.tamamode[var1] == 26) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] == 30) {
            this.sh(this.tamaX[var1], this.tamaY[var1], 27, 2.0F, this.tamakakudo[var1] + 90.0F, 0, 0, 0, 0, 3);
            this.tamamode[var1] = 0;
         }
      } else if (this.tamamode[var1] == 27) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] == 30) {
            this.sh(this.tamaX[var1], this.tamaY[var1], 26, 2.0F, this.tamakakudo[var1] - 90.0F, 0, 0, 0, 0, 2);
            this.tamamode[var1] = 0;
         }
      } else if (this.tamamode[var1] == 28) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaX[var1] = this.tamaX[var1] + this.tamaXmove[var1] * 10.0F;
            this.tamaY[var1] = this.tamaY[var1] + this.tamaYmove[var1] * 10.0F;
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamaY[var1] > 245.0F || this.tamaY[var1] < -5.0F) {
            this.laserIn(this.tamaX[var1], this.tamaY[var1], 1, 3.5F, -this.tamakakudo[var1], 2.0F, 80, 0, 0, 5);
            this.tamamode[var1] = 0;
         }
      } else if (this.tamamode[var1] == 29) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaholdnumber0[var1] = 2;
         }

         if (this.tamatime[var1] > 30 && this.tamatime[var1] < 61) {
            this.tamaholdnumber0[var1]++;
         }

         if (this.tamatime[var1] > 150 && this.tamatime[var1] < 166) {
            this.tamaholdnumber0[var1]--;
            this.tamaholdnumber0[var1]--;
         }

         if (this.tamatime[var1] == 166) {
            this.tamamode[var1] = 0;
         }

         if (this.tamatime[var1] > 30
            && this.tamatime[var1] < 160
            && this.peopleY > this.tamaY[var1] - this.tamaholdnumber0[var1]
            && this.peopleY < this.tamaY[var1] + this.tamaholdnumber0[var1]) {
            this.sh(this.peopleX, this.peopleY, 1, 0.0F, 0.0F, 0, 0, 0, 0, 99);
         }
      } else if (this.tamamode[var1] == 30) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaholdnumber0[var1] = 2;
         }

         if (this.tamatime[var1] > 30 && this.tamatime[var1] < 61) {
            this.tamaholdnumber0[var1]++;
         }

         if (this.tamatime[var1] > 150 && this.tamatime[var1] < 166) {
            this.tamaholdnumber0[var1]--;
            this.tamaholdnumber0[var1]--;
         }

         if (this.tamatime[var1] == 166) {
            this.tamamode[var1] = 0;
         }

         if (this.tamatime[var1] > 30
            && this.tamatime[var1] < 160
            && this.peopleX > this.tamaX[var1] - this.tamaholdnumber0[var1]
            && this.peopleX < this.tamaX[var1] + this.tamaholdnumber0[var1]) {
            this.sh(this.peopleX, this.peopleY, 1, 0.0F, 0.0F, 0, 0, 0, 0, 99);
         }
      } else if (this.tamamode[var1] == 31) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamaY[var1] > 235.0F || this.tamaY[var1] < 0.0F) {
            this.sh(this.tamaX[var1], this.tamaY[var1], 1, this.tamaspeed[var1], -this.tamakakudo[var1], 2, 2, 30, this.tamashape[var1], this.tamairo[var1]);
            this.tamamode[var1] = 0;
         }
      } else if (this.tamamode[var1] == 32) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] == 15) {
            this.tamaXmove[var1] = 0.0F;
            this.tamaYmove[var1] = 0.0F;
         }

         if (this.tamatime[var1] == 30) {
            this.tamamode[var1] = 0;
            effectIn(this.tamaX[var1], this.tamaY[var1], 5, this.tamairo[var1], this.tamashape[var1], 0);
         }
      } else if (this.tamamode[var1] == 33) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] == this.tamaholdnumber1[var1]) {
            this.tamaXmove[var1] = 0.0F;
            this.tamaYmove[var1] = 0.0F;
         }

         if (this.tamatime[var1] == this.tamaholdnumber2[var1]) {
            this.tamakakudo[var1] = this.tamakakudo[var1] + this.tamaholdnumber0[var1];
            this.tamaXmove[var1] = (float)(2.0 * Math.cos(this.tamakakudo[var1] * 3.1415 / 180.0));
            this.tamaYmove[var1] = (float)(2.0 * Math.sin(this.tamakakudo[var1] * 3.1415 / 180.0));
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }
      } else if (this.tamamode[var1] == 34) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] % 2 == this.tamaholdnumber1[var1]) {
            this.tamaXmove[var1] = 0.0F;
            this.tamaYmove[var1] = 0.0F;
         }

         if (this.tamatime[var1] == this.tamaholdnumber2[var1]) {
            this.tamakakudo[var1] = this.tamakakudo[var1] + this.tamaholdnumber0[var1];
            this.tamaXmove[var1] = 2.0F * this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = 2.0F * this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }
      } else if (this.tamamode[var1] == 35) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] == 30) {
            this.tamashape[var1] = 5;
            effectIn(this.tamaX[var1], this.tamaY[var1], 5, this.tamairo[var1], 0, 0);
         }

         if (this.tamatime[var1] == 60) {
            this.tamashape[var1] = 6;
            effectIn(this.tamaX[var1], this.tamaY[var1], 5, this.tamairo[var1], 0, 0);
         }

         if (this.tamatime[var1] == 90) {
            this.tamamode[var1] = 0;
            effectIn(this.tamaX[var1], this.tamaY[var1], 5, this.tamairo[var1], 0, 0);
         }
      } else if (this.tamamode[var1] == 36) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (!(this.tamaX[var1] > this.migi + 5) && !(this.tamaX[var1] < -5.0F)) {
            if (this.tamaY[var1] < -5.0F || this.tamaY[var1] > 245.0F) {
               if (this.tamairo[var1] == 0) {
                  this.tamaYmove[var1] = -this.tamaYmove[var1];
                  this.tamairo[var1] = 4;
               } else if (this.tamairo[var1] == 4) {
                  this.tamaYmove[var1] = -this.tamaYmove[var1];
                  this.tamairo[var1] = 2;
               }
            }
         } else if (this.tamairo[var1] == 0) {
            this.tamaXmove[var1] = -this.tamaXmove[var1];
            this.tamairo[var1] = 4;
         } else if (this.tamairo[var1] == 4) {
            this.tamaXmove[var1] = -this.tamaXmove[var1];
            this.tamairo[var1] = 2;
         }
      } else if (this.tamamode[var1] == 37) {
         if (this.tamatime[var1] % 60 == this.tamaholdnumber0[var1]) {
            this.tamaXmove[var1] = 6 * this.tamaholdnumber1[var1];
            this.tamaYmove[var1] = 0.0F;
         }

         if (this.tamaXmove[var1] != 0.0F) {
            this.tamaXmove[var1] = (float)(this.tamaXmove[var1] - 0.2 * this.tamaholdnumber1[var1]);
            this.tamaYmove[var1] = (float)(this.tamaYmove[var1] + 0.1);
         } else {
            this.tamaXmove[var1] = 0.0F;
            this.tamaYmove[var1] = 0.0F;
         }
      } else if (this.tamamode[var1] == 38) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] == this.tamaholdnumber1[var1]) {
            this.tamaXmove[var1] = (float)(1.5 * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)]);
            this.tamaYmove[var1] = (float)(1.5 * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)]);
            this.tamairo[var1] = 5;
         }
      } else if (this.tamamode[var1] == 39) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] == 15) {
            effectIn(this.tamaX[var1], this.tamaY[var1], 5, this.tamairo[var1], 0, 0);
            this.tamamode[var1] = 0;
         }
      } else if (this.tamamode[var1] == 40) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] % 4 == 0) {
            this.sh(this.tamaX[var1], this.tamaY[var1], 39, 3.0F, (this.rand.nextInt() >>> 1) % 360, 0, 30, 0, 0, 3);
         }

         if (this.tamatime[var1] % 4 == 1) {
            this.sh(this.tamaX[var1], this.tamaY[var1], 39, 3.0F, (this.rand.nextInt() >>> 1) % 360, 0, 30, 0, 1, 3);
            this.sh(this.tamaX[var1], this.tamaY[var1], 39, 3.0F, (this.rand.nextInt() >>> 1) % 360, 0, 30, 0, 0, 3);
         }

         if (this.tamatime[var1] % 4 == 2) {
            this.sh(this.tamaX[var1], this.tamaY[var1], 39, 3.0F, (this.rand.nextInt() >>> 1) % 360, 0, 30, 0, 0, 3);
         }

         if (this.tamatime[var1] % 4 == 3) {
            this.sh(this.tamaX[var1], this.tamaY[var1], 39, 3.0F, (this.rand.nextInt() >>> 1) % 360, 0, 30, 0, 0, 3);
            this.sh(this.tamaX[var1], this.tamaY[var1], 39, 3.0F, (this.rand.nextInt() >>> 1) % 360, 0, 30, 0, 5, 3);
         }

         if (this.tamatime[var1] == (int)(160.0F / this.tamaspeed[var1])) {
            this.tamaYmove[var1] = (float)(this.tamaYmove[var1] * 0.001);
         }

         if (this.tamatime[var1] == (int)(160.0F / this.tamaspeed[var1]) + 60) {
            this.tamaYmove[var1] = -this.tamaYmove[var1] * 1000.0F;
         }
      } else if (this.tamamode[var1] == 41) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         this.tamaYmove[var1] = (float)(this.tamaYmove[var1] + 0.05);
         if (this.tamaX[var1] > this.migi + 5 || this.tamaX[var1] < -5.0F) {
            this.tamaXmove[var1] = -this.tamaXmove[var1];
         } else if (this.tamaY[var1] < -5.0F) {
            this.tamaYmove[var1] = -this.tamaYmove[var1];
         }
      } else if (this.tamamode[var1] == 42) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (this.tamatime[var1] == this.tamaholdnumber1[var1]) {
            this.tamaXmove[var1] = this.tamaXmove[var1] / 3.0F;
            this.tamaYmove[var1] = this.tamaYmove[var1] / 3.0F;
         }

         if (this.tamatime[var1] == this.tamaholdnumber2[var1]) {
            this.tamaXmove[var1] = this.tamaXmove[var1] * 3.0F;
            this.tamaYmove[var1] = this.tamaYmove[var1] * 3.0F;
         }

         if (this.tamatime[var1] > this.tamaholdnumber2[var1] && this.tamaYmove[var1] < this.tamaspeed[var1]) {
            this.tamaYmove[var1] = (float)(this.tamaYmove[var1] + 0.1 * this.tamaholdnumber0[var1]);
         }
      } else if (this.tamamode[var1] == 43) {
         if (this.tamatime[var1] == 1) {
            this.tamaXmove[var1] = this.tamaspeed[var1] * this.cos[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamaYmove[var1] = this.tamaspeed[var1] * this.sin[(int)((this.tamakakudo[var1] * 10.0F + 3.6E7F) % 3600.0F)];
            this.tamarange[var1] = this.tamakakudo[var1];
            this.getPICNUM(var1);
         }

         if (var1 % 2 == 0 && this.tamatime[var1] == 60) {
            this.tamaXmove[var1] = 0.0F;
            this.tamaYmove[var1] = 0.0F;
            this.tamakakudo[var1] = this.getkakudo(this.tamaX[var1], this.tamaY[var1], this.peopleX, this.peopleY);
            this.tamaholdnumber0[var1] = (int)(((this.rand.nextInt() >>> 1) % 400 - 200 + this.tamakakudo[var1] * 10.0F + 36000.0F) % 3600.0F);
            this.tamairo[var1] = 4;
         }

         if (var1 % 2 == 1 && this.tamatime[var1] == 60) {
            this.tamaXmove[var1] = 0.0F;
            this.tamaYmove[var1] = 0.0F;
         }

         if (this.tamatime[var1] < 60) {
            this.tamaYmove[var1] = (float)(this.tamaYmove[var1] + 0.2 * this.sin[this.tamaholdnumber0[var1]]);
            this.tamaXmove[var1] = (float)(this.tamaXmove[var1] + 0.2 * this.cos[this.tamaholdnumber0[var1]]);
         } else if (this.tamatime[var1] < 200) {
            this.tamaYmove[var1] = (float)(this.tamaYmove[var1] + 0.1 * this.sin[this.tamaholdnumber0[var1]]);
            if (var1 % 2 == 0) {
               this.tamaXmove[var1] = (float)(this.tamaXmove[var1] + 0.1 * this.cos[this.tamaholdnumber0[var1]]);
            }
         }
      }
   }

   void titleeffectmove() {
      for (this.aa = 0; this.aa < effect_max; this.aa++) {
         if (effectmode[this.aa] != 0) {
            effectX[this.aa] = effectX[this.aa] + effectXmove[this.aa];
            effectY[this.aa] = effectY[this.aa] + effectYmove[this.aa];
            effecttime[this.aa]++;
            if (effectmode[this.aa] == 1) {
               if (effecttime[this.aa] == 1 && effectholdnumber0[this.aa] == 0) {
                  this.gamemode = 1;
                  this.cyc = peoplebomkind;
                  this.makefirst();
                  peoplebomkind = this.cyc;
                  effectmode[this.aa] = 0;
               } else if (effecttime[this.aa] == 1 && effectholdnumber0[this.aa] == 1) {
                  this.gamemode = 1;
                  this.cyc = peoplebomkind;
                  this.makefirst();
                  peoplebomkind = this.cyc;
                  this.stagemen = 6;
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 2) {
               if (effecttime[this.aa] == 1) {
                  effectXmove[this.aa] = (float)((this.rand.nextInt() >>> 1) % 13 * 0.5 - 3.0);
                  effectYmove[this.aa] = (float)(1.0 + (this.rand.nextInt() >>> 1) % 8 * 0.5);
                  effectholdnumber1[this.aa] = (this.rand.nextInt() >>> 1) % 6 + 2;
                  effectkakudo[this.aa] = (this.rand.nextInt() >>> 1) % 20 * 18;
                  effectholdnumber0[this.aa] = 1 + (this.rand.nextInt() >>> 1) % 2 * 18;
               }

               effectkakudo[this.aa] = effectkakudo[this.aa] + effectholdnumber0[this.aa];
               if (effectX[this.aa] > 260.0F || effectX[this.aa] < -20.0F || effectY[this.aa] > 260.0F || effectY[this.aa] < -25.0F) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 3) {
               if (effectholdnumber1[this.aa] == 0) {
                  if (effecttime[this.aa] == 1) {
                     effectX[this.aa] = 256.0F;
                     effectY[this.aa] = 105 + effectholdnumber0[this.aa] * 18;
                     effectXmove[this.aa] = -6.0F;
                     effectYmove[this.aa] = 0.0F;
                     effectholdnumber2[this.aa] = effectholdnumber0[this.aa];
                     if (effectholdnumber0[this.aa] > 2) {
                        effectholdnumber0[this.aa]++;
                     }
                  }

                  if (effecttime[this.aa] == 21) {
                     effectXmove[this.aa] = 0.0F;
                     effectYmove[this.aa] = 0.0F;
                  }

                  if (this.titlemode != 0) {
                     effectholdnumber1[this.aa] = 1;
                     effecttime[this.aa] = 0;
                     effectXmove[this.aa] = 4.0F;
                  }
               } else if (effectholdnumber1[this.aa] == 1 && effecttime[this.aa] == 10) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 4) {
               if (effectholdnumber1[this.aa] == 0) {
                  if (effecttime[this.aa] == 1) {
                     effectX[this.aa] = -30.0F;
                     effectY[this.aa] = 160.0F;
                     effectXmove[this.aa] = 2.0F;
                     effectYmove[this.aa] = 0.0F;
                  }

                  if (effecttime[this.aa] == 21) {
                     effectXmove[this.aa] = 0.0F;
                     effectYmove[this.aa] = 0.0F;
                  }

                  if (this.titlemode != 0) {
                     effectholdnumber1[this.aa] = 1;
                     effecttime[this.aa] = 0;
                     effectXmove[this.aa] = -4.0F;
                  }
               } else if (effectholdnumber1[this.aa] == 1 && effecttime[this.aa] == 10) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 5) {
               if (effectholdnumber1[this.aa] == 0) {
                  if (effecttime[this.aa] == 1) {
                     effectX[this.aa] = 140.0F;
                     effectY[this.aa] = 10.0F;
                     effectholdnumber0[this.aa] = 0;
                  }

                  if (effecttime[this.aa] < 21) {
                     effectX[this.aa] = 130.0F;
                     effectY[this.aa] = 105.0F;
                     effectholdnumber0[this.aa] = effectholdnumber0[this.aa] + 7;
                  }

                  if (this.titlemode != 0) {
                     effectholdnumber1[this.aa] = 1;
                     effectholdnumber0[this.aa] = 140;
                     effecttime[this.aa] = 0;
                  }
               } else if (effectholdnumber1[this.aa] == 1) {
                  effectholdnumber0[this.aa] = effectholdnumber0[this.aa] - 14;
                  if (effecttime[this.aa] == 10) {
                     effectmode[this.aa] = 0;
                  }
               }
            } else if (effectmode[this.aa] == 6) {
               if (effectholdnumber1[this.aa] == 0) {
                  if (effecttime[this.aa] == 1) {
                     effectX[this.aa] = 168.0F;
                     effectXmove[this.aa] = -6.0F;
                  }

                  if (effecttime[this.aa] == 21) {
                     effectXmove[this.aa] = 0.0F;
                     effectYmove[this.aa] = 0.0F;
                  }

                  if (this.titlemode != 1) {
                     effectholdnumber1[this.aa] = 1;
                     effecttime[this.aa] = 0;
                     effectXmove[this.aa] = -6.0F;
                  }
               } else if (effectholdnumber1[this.aa] == 1 && effecttime[this.aa] == 10) {
                  effectmode[this.aa] = 0;
               }
            }
         }
      }
   }

   void titleeffectdraw(int var1) {
      int var2 = (int)effectX[var1];
      int var3 = (int)effectY[var1];
      if (effectmode[var1] == 1) {
         this.g.unlock(true);

         for (this.cyc = 0; this.cyc < 60; this.cyc++) {
            this.g.setColor(Graphics.getColorOfRGB(0, 0, 0, 20));
            this.g.fillRect(0, 0, 240, 240);
            this.g.setFont(Font.getFont(1879048448));
            this.drawBold(
               "少女祈祷中･･･", 120, 220, Graphics.getColorOfRGB(this.cyc % 20 * 3, this.cyc % 20 * 3, this.cyc % 20 * 10), Graphics.getColorOfRGB(55, 55, 255)
            );

            try {
               Thread.sleep(33L);
            } catch (Exception var5) {
            }
         }

         this.g.setColor(Graphics.getColorOfRGB(255, 255, 255, 255));
         this.g.fillRect(0, 0, 240, 240);
         this.g.lock();
      } else if (effectmode[var1] == 3) {
         if (effectholdnumber1[var1] == 0) {
            this.titleimg[6].setAlpha(255);
            this.titleimg[7].setAlpha(255);
            this.g.drawImage(this.titleimg[6], var2, var3, 0, effectholdnumber0[var1] * 21, 120, 22);
            if (this.titleflag == effectholdnumber2[var1]) {
               this.g.drawImage(this.titleimg[7], var2, var3, 0, effectholdnumber0[var1] * 21, 120, 22);
            }
         } else if (effectholdnumber1[var1] == 1) {
            this.titleimg[6].setAlpha(255 - effecttime[var1] * 25);
            this.titleimg[7].setAlpha(255 - effecttime[var1] * 25);
            this.g.drawImage(this.titleimg[6], var2, var3, 0, effectholdnumber0[var1] * 21, 120, 22);
            if (this.titleflag == effectholdnumber2[var1]) {
               this.g.drawImage(this.titleimg[7], var2, var3, 0, effectholdnumber0[var1] * 21, 120, 22);
            }
         }
      } else if (effectmode[var1] != 4 && effectmode[var1] == 6) {
         if (effectholdnumber1[var1] == 0) {
            this.titleimg[9].setAlpha(255);
            if (effecttime[var1] < 10) {
               this.titleimg[9].setAlpha(5 + effecttime[var1] * 25);
            }

            if (effectholdnumber2[var1] == 0 || effectholdnumber2[var1] == 1) {
               if (effectholdnumber2[var1] != this.stagelevel) {
                  this.titleimg[9].setAlpha(122);
               }

               if (effecttime[var1] < 10 && effectholdnumber2[var1] != this.stagelevel) {
                  this.titleimg[9].setAlpha(5 + effecttime[var1] * 25 / 2);
               }
            }

            this.g.drawImage(this.titleimg[9], var2, var3, 0, effectholdnumber2[var1] * 54, 240, 54);
         } else if (effectholdnumber1[var1] == 1) {
            this.titleimg[9].setAlpha(255);
            this.titleimg[9].setAlpha(255 - effecttime[var1] * 25);
            this.g.drawImage(this.titleimg[9], var2, var3, 0, effectholdnumber2[var1] * 54, 240, 54);
         }
      }
   }

   void titleeffectdrawback(int var1) {
      int var2 = (int)effectX[var1];
      int var3 = (int)effectY[var1];
      if (effectmode[var1] == 2) {
         this.image[7].setAlpha(150);
         effectkakudo[var1] = (effectkakudo[var1] + 7200.0F) % 360.0F;
         if (effectkakudo[var1] < 180.0F) {
            effectholdnumber2[var1] = (int)(effectkakudo[var1] / 18.0F);
            this.g.drawImage(this.image[7], var2 - 20, var3 - 20, effectholdnumber2[var1] * 40, 80, 40, 40);
         } else {
            effectholdnumber2[var1] = 10 - (int)((effectkakudo[var1] - 180.0F) / 18.0F);
            this.g.drawImage(this.image[7], var2 - 20, var3 - 20, effectholdnumber2[var1] * 40, 120, 40, 40);
         }
      } else if (effectmode[var1] == 5) {
         this.g.setColor(Graphics.getColorOfRGB(0, 0, 0, 150));
         this.g.fillRect(var2, var3, 120, effectholdnumber0[var1]);
      }
   }

   void effectmove() {
      for (this.aa = 0; this.aa < effect_see_max + 1; this.aa++) {
         if (effectmode[this.aa] != 0) {
            effectX[this.aa] = effectX[this.aa] + effectXmove[this.aa];
            effectY[this.aa] = effectY[this.aa] + effectYmove[this.aa];
            effecttime[this.aa]++;
            if (effectmode[this.aa] == 1) {
               if (effecttime[this.aa] == 12) {
                  effectmode[this.aa] = 0;
               }

               if (effecttime[this.aa] == 1) {
                  if (this.sevolume != 0) {
                     AudioPresenter var23 = this.seplayer[0];
                     this.seplayer[0].setAttribute(4, this.sevolume);
                  }

                  if (this.sevolume != 0) {
                     this.seplayer[0].play();
                  }
               }
            } else if (effectmode[this.aa] == 2) {
               if (effecttime[this.aa] == 10) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 3) {
               for (this.cyc = 0; this.cyc < this.tama_see_max; this.cyc++) {
                  if (this.tamamode[this.cyc] != 0
                     && (effectX[this.aa] - this.tamaX[this.cyc]) * (effectX[this.aa] - this.tamaX[this.cyc])
                           + (effectY[this.aa] - this.tamaY[this.cyc]) * (effectY[this.aa] - this.tamaY[this.cyc])
                        < effecttime[this.aa] * effecttime[this.aa] * 100) {
                     if (this.tamakesuna[this.cyc] == 0) {
                        this.tamamode[this.cyc] = 0;
                        effectIn(this.tamaX[this.cyc], this.tamaY[this.cyc], 5, this.tamairo[this.cyc], this.tamashape[this.cyc], 0);
                     } else {
                        this.tamamode[this.cyc] = 0;
                        effectIn(this.tamaX[this.cyc], this.tamaY[this.cyc], 1, this.tamairo[this.cyc], this.tamashape[this.cyc], 0);
                     }

                     this.itemIn(this.tamaX[this.cyc], this.tamaY[this.cyc], 3, 1);
                  }
               }

               for (this.cyc = 0; this.cyc < this.laser_max; this.cyc++) {
                  if (this.lasermode[this.cyc] != 0) {
                     this.lasermode[this.cyc] = 0;

                     for (this.cyc2 = 0; this.cyc2 * 10 < this.lasernagasa[this.cyc]; this.cyc2++) {
                        this.itemIn(
                           this.laserX[this.cyc] + (int)(this.cyc2 * 10 * Math.cos(this.laserkakudo[this.cyc] * 3.1415 / 180.0)),
                           this.laserY[this.cyc] + (int)(this.cyc2 * 10 * Math.sin(this.laserkakudo[this.cyc] * 3.1415 / 180.0)),
                           3,
                           1
                        );
                     }

                     for (this.cyc2 = 0; this.cyc2 * 10 < this.lasernagasa[this.cyc]; this.cyc2++) {
                        effectIn(
                           this.laserX[this.cyc] + (int)(this.cyc2 * 10 * Math.cos(this.laserkakudo[this.cyc] * 3.1415 / 180.0)),
                           this.laserY[this.cyc] + (int)(this.cyc2 * 10 * Math.sin(this.laserkakudo[this.cyc] * 3.1415 / 180.0)),
                           5,
                           1,
                           0,
                           0
                        );
                     }
                  }
               }

               if (effecttime[this.aa] == 30) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 33) {
               for (this.cyc = 0; this.cyc < this.tama_max; this.cyc++) {
                  if (this.tamamode[this.cyc] != 0
                     && this.tamakesuna[this.aa] == 0
                     && (effectX[this.aa] - this.tamaX[this.cyc]) * (effectX[this.aa] - this.tamaX[this.cyc])
                           + (effectY[this.aa] - this.tamaY[this.cyc]) * (effectY[this.aa] - this.tamaY[this.cyc])
                        < effecttime[this.aa] * effecttime[this.aa] * 100) {
                     effectIn(this.tamaX[this.cyc], this.tamaY[this.cyc], 5, this.tamairo[this.cyc], this.tamashape[this.cyc], 0);
                     this.tamamode[this.cyc] = 0;
                  }
               }

               if (effecttime[this.aa] == 30) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 333) {
               for (this.cyc = 0; this.cyc < this.tama_max; this.cyc++) {
                  if (this.tamamode[this.cyc] != 0) {
                     effectIn(this.tamaX[this.cyc], this.tamaY[this.cyc], 5, this.tamairo[this.cyc], this.tamashape[this.cyc], 0);
                     this.tamamode[this.cyc] = 0;
                  }
               }

               if (effecttime[this.aa] == 30) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 4) {
               if (effecttime[this.aa] == 1) {
                  if (this.sevolume != 0) {
                     AudioPresenter var22 = this.seplayer[4];
                     this.seplayer[4].setAttribute(4, this.sevolume);
                  }

                  if (this.sevolume != 0) {
                     this.seplayer[4].play();
                  }
               }

               if (effecttime[this.aa] == 50) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 5) {
               if (effecttime[this.aa] == 5) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 6) {
               if (effecttime[this.aa] == 1) {
                  effectX[this.aa] = 190.0F;
                  effectY[this.aa] = 180.0F;
                  effectXmove[this.aa] = -9.0F;
                  effectYmove[this.aa] = 0.0F;
                  if (this.sevolume != 0) {
                     AudioPresenter var21 = this.seplayer[1];
                     this.seplayer[1].setAttribute(4, this.sevolume);
                  }

                  if (this.sevolume != 0) {
                     this.seplayer[1].play();
                  }
               }

               if (effecttime[this.aa] == 21) {
                  effectXmove[this.aa] = 0.0F;
                  effectYmove[this.aa] = 0.0F;
               }

               if (effecttime[this.aa] == 51) {
                  effectXmove[this.aa] = 0.0F;
                  effectYmove[this.aa] = -8.0F;
               }

               if (effecttime[this.aa] == 71) {
                  effectXmove[this.aa] = 0.0F;
                  effectYmove[this.aa] = 0.0F;
               }

               if (this.bosstairyoku < 0.0F) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 66) {
               if (effecttime[this.aa] == 1) {
                  effectX[this.aa] = 190.0F;
                  effectY[this.aa] = 60.0F;
                  effectXmove[this.aa] = -9.0F;
                  effectYmove[this.aa] = 0.0F;
                  if (this.sevolume != 0) {
                     AudioPresenter var7 = this.seplayer[1];
                     AudioPresenter var20 = this.seplayer[0];
                     var7.setAttribute(4, this.sevolume);
                  }

                  if (this.sevolume != 0) {
                     this.seplayer[1].play();
                  }
               }

               if (effecttime[this.aa] == 21) {
                  effectXmove[this.aa] = 0.0F;
                  effectYmove[this.aa] = 0.0F;
               }

               if (effecttime[this.aa] == 51) {
                  effectXmove[this.aa] = 0.0F;
                  effectYmove[this.aa] = -2.0F;
               }

               if (effecttime[this.aa] == 71) {
                  effectXmove[this.aa] = 0.0F;
                  effectYmove[this.aa] = 0.0F;
               }

               if (this.bosstairyoku < 0.0F) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 7) {
               if (effecttime[this.aa] == 1) {
                  effectkakudo[this.aa] = effectholdnumber1[this.aa];
                  effectspeed[this.aa] = (float)(2.0 + (this.rand.nextInt() >>> 1) % 14 * 0.5);
                  effectXmove[this.aa] = (float)(effectspeed[this.aa] * Math.cos(effectkakudo[this.aa] * 3.1415 / 180.0));
                  effectYmove[this.aa] = (float)(effectspeed[this.aa] * Math.sin(effectkakudo[this.aa] * 3.1415 / 180.0));
                  effectX[this.aa] = effectX[this.aa] - 20.0F * effectXmove[this.aa];
                  effectY[this.aa] = effectY[this.aa] - 20.0F * effectYmove[this.aa];
                  effectkakudo[this.aa] = effectholdnumber1[this.aa];
                  effectholdnumber0[this.aa] = 1 + (this.rand.nextInt() >>> 1) % 5 * 18;
               }

               effectkakudo[this.aa] = effectkakudo[this.aa] + effectholdnumber0[this.aa];
               if (effecttime[this.aa] == 20) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 77) {
               if (effecttime[this.aa] == 1) {
                  effectXmove[this.aa] = 0.0F;
                  effectYmove[this.aa] = 0.0F;
                  if (this.sevolume != 0) {
                     AudioPresenter var6 = this.seplayer[2];
                     AudioPresenter var19 = this.seplayer[0];
                     var6.setAttribute(4, this.sevolume);
                  }

                  if (this.sevolume != 0) {
                     this.seplayer[2].play();
                  }
               }

               if (effecttime[this.aa] == 50) {
                  effectmode[this.aa] = 0;
               }

               effectholdnumber0[this.aa]++;
               if (effecttime[this.aa] < 41) {
                  effectIn(effectX[this.aa], effectY[this.aa], 7, 0, effectholdnumber0[this.aa] * 70, 0);
               }
            } else if (effectmode[this.aa] == 777) {
               if (effecttime[this.aa] == 1) {
                  effectXmove[this.aa] = 0.0F;
                  effectYmove[this.aa] = 0.0F;
                  if (this.sevolume != 0) {
                     AudioPresenter var18 = this.seplayer[2];
                     this.seplayer[2].setAttribute(4, this.sevolume);
                  }

                  if (this.sevolume != 0) {
                     this.seplayer[2].play();
                  }
               }

               if (effecttime[this.aa] == 30) {
                  effectmode[this.aa] = 0;
               }

               effectholdnumber0[this.aa]++;
               if (effecttime[this.aa] < 21) {
                  effectIn(effectX[this.aa], effectY[this.aa], 7, 0, effectholdnumber0[this.aa] * 70, 0);
               }
            } else if (effectmode[this.aa] == 8) {
               if (effecttime[this.aa] == 1) {
                  effectkakudo[this.aa] = effectholdnumber1[this.aa];
                  effectspeed[this.aa] = (float)(2.0 + (this.rand.nextInt() >>> 1) % 12 * 0.5);
                  effectXmove[this.aa] = (float)(effectspeed[this.aa] * Math.cos(effectkakudo[this.aa] * 3.1415 / 180.0));
                  effectYmove[this.aa] = (float)(effectspeed[this.aa] * Math.sin(effectkakudo[this.aa] * 3.1415 / 180.0));
                  effectkakudo[this.aa] = effectholdnumber1[this.aa];
                  effectholdnumber0[this.aa] = 1 + (this.rand.nextInt() >>> 1) % 3 * 18;
               }

               if (effecttime[this.aa] % 2 == 1) {
                  effectkakudo[this.aa] = effectkakudo[this.aa] + effectholdnumber0[this.aa];
               }

               if (effecttime[this.aa] == 30) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 88) {
               if (effecttime[this.aa] == 1) {
                  effectXmove[this.aa] = 0.0F;
                  effectYmove[this.aa] = 0.0F;
                  if (this.sevolume != 0) {
                     AudioPresenter var16 = this.seplayer[4];
                     this.seplayer[4].setAttribute(4, this.sevolume);
                  }

                  if (this.sevolume != 0) {
                     this.seplayer[4].play();
                  }
               }

               if (effecttime[this.aa] == 20) {
                  effectmode[this.aa] = 0;
                  effectIn(effectX[this.aa], effectY[this.aa], 12, 20, 0, 0);

                  for (this.cyc = 0; this.cyc < 72; this.cyc++) {
                     effectIn(effectX[this.aa], effectY[this.aa], 8, this.cyc * 10, this.cyc * 5, 0);
                  }

                  if (this.sevolume != 0) {
                     AudioPresenter var17 = this.seplayer[4];
                     this.seplayer[4].setAttribute(4, this.sevolume);
                  }

                  if (this.sevolume != 0) {
                     this.seplayer[4].play();
                  }
               }

               if (effecttime[this.aa] % 2 == 0) {
                  effectholdnumber0[this.aa]++;
                  effectIn(effectX[this.aa], effectY[this.aa], 8, 0, effectholdnumber0[this.aa] * 70, 0);
               }
            } else if (effectmode[this.aa] == 9) {
               if (effectholdnumber1[this.aa] == 0) {
                  if (effecttime[this.aa] == 1) {
                     effectX[this.aa] = 360.0F;
                     effectY[this.aa] = -120.0F;
                     effectXmove[this.aa] = -8.0F;
                     effectYmove[this.aa] = 8.0F;
                  }

                  if (effecttime[this.aa] == 31) {
                     effectXmove[this.aa] = -1.0F;
                     effectYmove[this.aa] = 1.0F;
                  }

                  if (effecttime[this.aa] == 61) {
                     effectXmove[this.aa] = -8.0F;
                     effectYmove[this.aa] = 8.0F;
                  }

                  if (effecttime[this.aa] == 101) {
                     effectmode[this.aa] = 0;
                  }
               }

               if (effectholdnumber1[this.aa] == 1) {
                  if (effecttime[this.aa] == 1) {
                     effectX[this.aa] = 360.0F;
                     effectY[this.aa] = 100.0F;
                     effectXmove[this.aa] = -8.0F;
                     effectYmove[this.aa] = 1.0F;
                  }

                  if (effecttime[this.aa] == 31) {
                     effectXmove[this.aa] = -1.0F;
                     effectYmove[this.aa] = 0.125F;
                  }

                  if (effecttime[this.aa] == 61) {
                     effectXmove[this.aa] = -8.0F;
                     effectYmove[this.aa] = 1.0F;
                  }

                  if (effecttime[this.aa] == 101) {
                     effectmode[this.aa] = 0;
                  }
               }

               if (effectholdnumber1[this.aa] == 2) {
                  if (effecttime[this.aa] == 1) {
                     effectX[this.aa] = -120.0F;
                     effectY[this.aa] = 160.0F;
                     effectXmove[this.aa] = 10.0F;
                     effectYmove[this.aa] = -1.0F;
                  }

                  if (effecttime[this.aa] == 21) {
                     effectXmove[this.aa] = 0.5F;
                     effectYmove[this.aa] = -0.05F;
                  }

                  if (effecttime[this.aa] == 61) {
                     effectXmove[this.aa] = 10.0F;
                     effectYmove[this.aa] = -1.0F;
                  }

                  if (effecttime[this.aa] == 121) {
                     effectmode[this.aa] = 0;
                  }
               }
            } else if (effectmode[this.aa] == 10) {
               this.peoplemuteki = 2;
               if (effectholdnumber1[this.aa] == 0) {
                  if (effecttime[this.aa] == 30) {
                     effectholdnumber1[this.aa] = 1;
                     effecttime[this.aa] = 0;
                  }
               } else if (effectholdnumber1[this.aa] == 1) {
                  if (effecttime[this.aa] == 1) {
                     effectholdnumber0[this.aa] = 0;
                     this.peoplenonshot = 1;
                  }

                  tohokaiwa.getkaiwa(effectholdnumber2[this.aa], effectholdnumber0[this.aa]);
                  if (effecttime[this.aa] % 300 == 0) {
                     effectholdnumber0[this.aa]++;
                     tohokaiwa.effectflag = 0;
                  }

                  if (this.keyEvent == 20) {
                     effecttime[this.aa] = 299;
                  }

                  if (tohokaiwa.effectNEXT == 1) {
                     this.etime[this.bossnum] = 0;
                     this.edoing[this.bossnum]++;
                     tohokaiwa.effectNEXT = 0;
                  }

                  this.makekaiwanext(this.aa);
               } else if (effectholdnumber1[this.aa] == 2 && effecttime[this.aa] == 20) {
                  this.peoplemuteki = 0;
                  this.peoplenonshot = 0;
                  effectmode[this.aa] = 0;
                  kaiwa1 = "";
                  kaiwa2 = "";
                  kaiwa3 = "";
               }
            } else if (effectmode[this.aa] == 11) {
               if (effecttime[this.aa] == 1) {
                  effectX[this.aa] = 100 + effectholdnumber1[this.aa] * 80;
                  effectY[this.aa] = 180.0F;
                  if (effectholdnumber1[this.aa] == 1) {
                     effectY[this.aa] = 160.0F;
                  }

                  effectXmove[this.aa] = -6 * effectholdnumber1[this.aa];
                  effectYmove[this.aa] = -2.0F;
                  if (effectholdnumber2[this.aa] == 0) {
                     effectXmove[this.aa] = 0.0F;
                     effectYmove[this.aa] = 0.0F;
                  }
               }

               if (effecttime[this.aa] == 10) {
                  effectXmove[this.aa] = 0.0F;
                  effectYmove[this.aa] = 0.0F;
               }

               if (effecttime[this.aa] == 300 || this.keyEvent == 20) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 12) {
               this.qx = (this.rand.nextInt() >>> 1) % 20 - 10;
               this.qy = (this.rand.nextInt() >>> 1) % 20 - 10;
               if (effecttime[this.aa] == effectholdnumber0[this.aa]) {
                  this.qx = 0;
                  this.qy = 0;
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 120) {
               this.qx = (this.rand.nextInt() >>> 1) % 6 - 3;
               this.qy = (this.rand.nextInt() >>> 1) % 6 - 3;
               if (effecttime[this.aa] == effectholdnumber0[this.aa]) {
                  this.qx = 0;
                  this.qy = 0;
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 13) {
               if (effecttime[this.aa] == 90) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 14) {
               if (effecttime[this.aa] == 1) {
                  this.peoplemuteki = 1;
                  this.spelbonus = 0;
                  if (this.sevolume != 0) {
                     AudioPresenter var5 = this.seplayer[3];
                     AudioPresenter var15 = this.seplayer[0];
                     var5.setAttribute(4, this.sevolume);
                  }

                  if (this.sevolume != 0) {
                     this.seplayer[3].play();
                  }
               } else if (effecttime[this.aa] < 14) {
                  this.peopleX = (int)effectX[this.aa];
                  this.peopleY = (int)effectY[this.aa];
                  if (this.keyEvent != -999
                     && this.keyEvent != 16
                     && this.keyEvent != 17
                     && this.keyEvent != 18
                     && this.keyEvent != 19
                     && (this.peoplepower > 100 || this.peoplepower == 100)) {
                     this.peoplepower -= 100;
                     effectIn(999.0F, 999.0F, 999, 0, 0, 0);
                     effectmode[this.aa] = 0;
                     this.peoplemuteki = 3;
                  }
               } else if (effecttime[this.aa] == 14) {
                  if (this.peoplepower > 100 || this.peoplepower == 100) {
                     this.peoplepower -= 100;
                     effectIn(999.0F, 999.0F, 9999, 0, 0, 0);
                     effectmode[this.aa] = 0;
                     this.peoplemuteki = 3;
                  }
               } else if (effecttime[this.aa] == 15) {
                  if (this.sevolume != 0) {
                     AudioPresenter var14 = this.seplayer[3];
                     this.seplayer[3].setAttribute(4, this.sevolume);
                  }

                  if (this.sevolume != 0) {
                     this.seplayer[3].play();
                  }

                  if (this.peoplezannki == 0) {
                     effectIn(0.0F, 0.0F, 18, 0, 0, 0);
                  }

                  if (this.peoplezannki > 0) {
                     this.peoplezannki--;
                  }

                  this.peoplenonshot = 1;
                  this.peoplemuteki = 1;
                  effectIn(this.peopleX, this.peopleY, 33, 0, 0, 0);

                  for (this.cyc = 0; this.cyc < this.item_max; this.cyc++) {
                     if (this.itemmode[this.cyc] != 0 && this.itemkaishuu[this.cyc] != 0) {
                        this.itemXmove[this.cyc] = 0.0F;
                        this.itemYmove[this.cyc] = -2.0F;
                        this.itemkaishuu[this.cyc] = 0;
                     }
                  }
               } else if (effecttime[this.aa] == 16) {
                  for (this.cyc = 0; this.cyc < this.item_max; this.cyc++) {
                     if (this.itemmode[this.cyc] != 0 && this.itemmode[this.cyc] != 22 && this.itemkaishuu[this.cyc] != 0) {
                        this.itemXmove[this.cyc] = 0.0F;
                        this.itemYmove[this.cyc] = -2.0F;
                        this.itemkaishuu[this.cyc] = 0;
                     }
                  }

                  this.itemIn(this.peopleX, this.peopleY - 15, 22, 0);
                  this.itemIn(this.peopleX + 20, this.peopleY, 22, 0);
                  this.itemIn(this.peopleX - 20, this.peopleY, 22, 0);
                  this.peoplepower -= 300;
                  if (this.peoplepower < 0) {
                     this.peoplepower = 0;
                  }

                  this.peoplemuteki = 1;
                  this.peopleX = 95;
                  this.peopleY = 300;
                  this.bosshosi = 0;
               } else if (effecttime[this.aa] > 15 && effecttime[this.aa] < 55) {
                  for (this.cyc = 0; this.cyc < this.item_max; this.cyc++) {
                     if (this.itemmode[this.cyc] != 0 && this.itemmode[this.cyc] != 22 && this.itemkaishuu[this.cyc] != 0) {
                        this.itemXmove[this.cyc] = 0.0F;
                        this.itemYmove[this.cyc] = -2.0F;
                        this.itemkaishuu[this.cyc] = 0;
                     }
                  }

                  this.peoplemuteki = 1;
                  this.peopleX = 95;
                  this.peopleY = 300;
               } else if (effecttime[this.aa] > 55 && effecttime[this.aa] < 90) {
                  this.peopleX = 95;
                  this.peopleY = 300 - (effecttime[this.aa] - 55) * 3;
               } else if (effecttime[this.aa] == 90) {
                  this.peoplenonshot = 0;
               } else if (effecttime[this.aa] == 240) {
                  this.peoplemuteki = 0;
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 15) {
               if (effecttime[this.aa] == 1) {
                  effectkakudo[this.aa] = effectholdnumber1[this.aa];
                  effectXmove[this.aa] = (float)((this.rand.nextInt() >>> 1) % 12 * 0.5 - 3.0);
                  effectholdnumber1[this.aa] = (this.rand.nextInt() >>> 1) % 6 + 2;
                  effectkakudo[this.aa] = (this.rand.nextInt() >>> 1) % 20 * 18;
                  effectholdnumber0[this.aa] = (this.rand.nextInt() >>> 1) % 2 * 18;
               }

               effectkakudo[this.aa] = effectkakudo[this.aa] + effectholdnumber0[this.aa];
               effectYmove[this.aa] = (float)(effectholdnumber1[this.aa] * 0.5 + this.stageYmove * 0.5);
               if (effectX[this.aa] > this.migi + 20 || effectX[this.aa] < -20.0F || effectY[this.aa] > 255.0F || effectY[this.aa] < -25.0F) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 16) {
               if (effecttime[this.aa] == 20) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 17) {
               if (effecttime[this.aa] < 16) {
                  effectholdnumber1[this.aa] = effectholdnumber1[this.aa] + 6;
               }

               if (effecttime[this.aa] > 29 && effecttime[this.aa] < 45) {
                  effectholdnumber0[this.aa]++;
               }

               if (effecttime[this.aa] > 150 && effecttime[this.aa] < 164) {
                  effectholdnumber0[this.aa]--;
               }

               if (effecttime[this.aa] > 180 && effecttime[this.aa] < 195) {
                  effectholdnumber1[this.aa] = effectholdnumber1[this.aa] - 6;
               }

               if (effecttime[this.aa] == 165) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 18) {
               if (effecttime[this.aa] == 15) {
                  if (this.stagepractice == 2) {
                     this.highEsave(peoplebomkind);
                  } else if (this.stagepractice == 0 && this.konnte == 0) {
                     if (this.stagelevel == 0) {
                        this.highNsave(peoplebomkind);
                     }

                     if (this.stagelevel == 1) {
                        this.highHsave(peoplebomkind);
                     }
                  }

                  effectmode[this.aa] = 0;
                  this.gamemode = 3;
               }
            } else if (effectmode[this.aa] == 19) {
               if (effectholdnumber0[this.aa] == 0) {
                  if (effecttime[this.aa] == 1) {
                     effectholdnumber1[this.aa] = 255;
                  }

                  effectholdnumber1[this.aa] = effectholdnumber1[this.aa] - 10;
                  if (effecttime[this.aa] == 26) {
                     effectmode[this.aa] = 0;
                  }
               } else if (effectholdnumber0[this.aa] == 1) {
                  if (effecttime[this.aa] == 1) {
                     effectholdnumber1[this.aa] = 255;
                  }

                  if (effecttime[this.aa] > 30) {
                     effectholdnumber1[this.aa] = effectholdnumber1[this.aa] - 10;
                  }

                  if (effecttime[this.aa] == 56) {
                     effectmode[this.aa] = 0;
                  }
               } else if (effectholdnumber0[this.aa] == 2) {
                  if (effecttime[this.aa] == 1) {
                     effectholdnumber1[this.aa] = 0;
                  }

                  if (effecttime[this.aa] < 30) {
                     effectholdnumber1[this.aa] = effectholdnumber1[this.aa] + 5;
                  }

                  if (effecttime[this.aa] > 171) {
                     effectholdnumber1[this.aa] = effectholdnumber1[this.aa] - 5;
                  }

                  if (effecttime[this.aa] == 200) {
                     effectmode[this.aa] = 0;
                  }
               } else if (effectholdnumber0[this.aa] == 3) {
                  if (effecttime[this.aa] == 1) {
                     effectholdnumber1[this.aa] = 0;
                  }

                  if (effecttime[this.aa] < 30) {
                     effectholdnumber1[this.aa] = effectholdnumber1[this.aa] + 5;
                  }

                  if (effecttime[this.aa] > 151) {
                     effectholdnumber1[this.aa] = effectholdnumber1[this.aa] - 5;
                  }

                  if (effecttime[this.aa] == 180) {
                     effectmode[this.aa] = 0;
                  }
               } else if (effectholdnumber0[this.aa] == 4) {
                  if (effecttime[this.aa] == 1) {
                     effectholdnumber1[this.aa] = 0;
                  }

                  if (effecttime[this.aa] < 30) {
                     effectholdnumber1[this.aa] = effectholdnumber1[this.aa] + 5;
                  }

                  if (effecttime[this.aa] > 201) {
                     effectholdnumber1[this.aa] = effectholdnumber1[this.aa] - 5;
                  }

                  if (effecttime[this.aa] == 230) {
                     effectmode[this.aa] = 0;
                  }
               } else if (effectholdnumber0[this.aa] == 5) {
                  if (effecttime[this.aa] == 1) {
                     effectholdnumber1[this.aa] = 0;
                  }

                  if (effecttime[this.aa] < 30) {
                     effectholdnumber1[this.aa] = effectholdnumber1[this.aa] + 5;
                  }

                  if (effecttime[this.aa] > 121) {
                     effectholdnumber1[this.aa] = effectholdnumber1[this.aa] - 5;
                  }

                  if (effecttime[this.aa] == 150) {
                     effectmode[this.aa] = 0;
                  }
               }
            } else if (effectmode[this.aa] == 20) {
               if (effecttime[this.aa] == 1) {
                  effectholdnumber1[this.aa] = this.volume;
               }

               if (this.stagepractice != 0) {
                  this.gamemode = 3;
                  effectmode[this.aa] = 0;
               }

               if (this.keyEvent == 20 && effecttime[this.aa] < 300) {
                  effecttime[this.aa] = 300;
               }

               if (effecttime[this.aa] < 50) {
                  effectholdnumber1[this.aa] = effectholdnumber1[this.aa] - 4;
                  if (effectholdnumber1[this.aa] < 0) {
                     effectholdnumber1[this.aa] = 0;
                  }

                  this.player.setAttribute(4, effectholdnumber1[this.aa]);
               }

               if (effecttime[this.aa] == 300) {
                  this.stagetime = 0;
                  this.stagetime2 = 0;
                  this.stagemen++;
                  effectmode[this.aa] = 0;
                  effectIn(0.0F, 0.0F, 19, 1, 0, 0);
               }
            } else if (effectmode[this.aa] == 21) {
               if (effecttime[this.aa] == 1) {
                  effectXmove[this.aa] = (10.0F - effectX[this.aa]) / 10.0F;
                  effectYmove[this.aa] = (230.0F - effectY[this.aa]) / 10.0F;
               }

               if (effecttime[this.aa] == 10) {
                  this.peoplehosi++;
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 22) {
               if (effecttime[this.aa] == 120) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 23) {
               if (effecttime[this.aa] == 1) {
                  if (this.sevolume != 0) {
                     AudioPresenter var13 = this.seplayer[0];
                     this.seplayer[0].setAttribute(4, this.sevolume);
                  }

                  if (this.sevolume != 0) {
                     this.seplayer[0].play();
                  }
               }

               if (effecttime[this.aa] == 30) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 24) {
               if (effecttime[this.aa] == 1) {
                  effectkakudo[this.aa] = (this.rand.nextInt() >>> 1) % 360;
                  effectspeed[this.aa] = (float)(4.0 + (this.rand.nextInt() >>> 1) % 6 * 0.5);
                  effectXmove[this.aa] = (float)(effectspeed[this.aa] * Math.cos(effectkakudo[this.aa] * 3.1415 / 180.0));
                  effectYmove[this.aa] = (float)(effectspeed[this.aa] * Math.sin(effectkakudo[this.aa] * 3.1415 / 180.0));
                  effectholdnumber0[this.aa] = 5 + (this.rand.nextInt() >>> 1) % 10;
               }

               if (effecttime[this.aa] == 15) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 25) {
               if (effecttime[this.aa] == 1) {
                  effectholdnumber0[this.aa] = 20;
                  if (this.sevolume != 0) {
                     AudioPresenter var4 = this.seplayer[2];
                     AudioPresenter var11 = this.seplayer[0];
                     var4.setAttribute(4, this.sevolume);
                  }

                  if (this.sevolume != 0) {
                     this.seplayer[2].play();
                  }
               }

               if (effecttime[this.aa] < 21) {
                  effectholdnumber1[this.aa] = effectholdnumber1[this.aa] + 6;
               }

               if (effecttime[this.aa] > 50 && effecttime[this.aa] < 72) {
                  effectholdnumber0[this.aa] = effectholdnumber0[this.aa] + 9;
               }

               if (effecttime[this.aa] == 51) {
                  if (this.sevolume != 0) {
                     AudioPresenter var12 = this.seplayer[0];
                     this.seplayer[0].setAttribute(4, this.sevolume);
                  }

                  if (this.sevolume != 0) {
                     this.seplayer[0].play();
                  }
               }

               if (effecttime[this.aa] == 80) {
                  for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                     this.tmmode[this.cyc] = 1;
                  }
               }

               if (this.haneflag == 0) {
                  for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                     this.tmmode[this.cyc] = 0;
                  }

                  effectmode[this.aa] = 0;
               }

               this.tmX[0] = this.eX[this.bossnum] + 40.0F;
               this.tmY[0] = this.eY[this.bossnum] - 30.0F;
               this.tmX[1] = this.eX[this.bossnum] + 80.0F;
               this.tmY[1] = this.eY[this.bossnum] + 15.0F;
               this.tmX[2] = this.eX[this.bossnum] - 40.0F;
               this.tmY[2] = this.eY[this.bossnum] - 30.0F;
               this.tmX[3] = this.eX[this.bossnum] - 80.0F;
               this.tmY[3] = this.eY[this.bossnum] + 15.0F;
            } else if (effectmode[this.aa] == 26) {
               if (effecttime[this.aa] == 1) {
                  this.keisan = 330;
               }

               if (effecttime[this.aa] == 20) {
                  this.keisan = 33;
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 27) {
               if (effecttime[this.aa] == 1) {
                  effectholdnumber0[this.aa] = 180;
                  if (this.sevolume != 0) {
                     AudioPresenter var3 = this.seplayer[1];
                     AudioPresenter var10 = this.seplayer[0];
                     var3.setAttribute(4, this.sevolume);
                  }

                  if (this.sevolume != 0) {
                     this.seplayer[1].play();
                  }
               } else if (effecttime[this.aa] < 30) {
                  effectholdnumber0[this.aa] = effectholdnumber0[this.aa] - 6;
               }

               if (effecttime[this.aa] == 89) {
                  effectmode[this.aa] = 0;
               }
            } else if (effectmode[this.aa] == 28) {
               if (effecttime[this.aa] == 1) {
                  effectX[this.aa] = effectX[this.aa] - 20.0F + (this.rand.nextInt() >>> 1) % 40;
                  effectY[this.aa] = effectY[this.aa] - 20.0F + (this.rand.nextInt() >>> 1) % 40;
                  effectholdnumber0[this.aa] = 0;
               }

               if (effecttime[this.aa] == 90) {
                  this.eIn((int)effectX[this.aa], (int)effectY[this.aa], 4, 0, 4);
                  effectmode[this.aa] = 0;
               }

               effectholdnumber0[this.aa] = effectholdnumber0[this.aa] + 3;
            } else if (effectmode[this.aa] == 30) {
               if (effectholdnumber0[this.aa] == 0) {
                  if (effecttime[this.aa] < 37) {
                     if (effecttime[this.aa] < 19) {
                        effectholdnumber1[this.aa] = effectholdnumber1[this.aa] + 3;
                     }

                     effectholdnumber2[this.aa] = (int)(effectholdnumber2[this.aa] + (41 - effecttime[this.aa]) * 0.5);
                  } else if (effecttime[this.aa] == 41) {
                     effecttime[this.aa] = 0;
                     effectholdnumber0[this.aa] = 1;
                  }
               } else if (effectholdnumber0[this.aa] == 1) {
                  effectholdnumber1[this.aa] = (int)(54.0F - 18.0F * this.sin[effecttime[this.aa] * 60 % 3600]);
                  if (effecttime[this.aa] < 24) {
                     effectholdnumber2[this.aa] = (int)(effectholdnumber2[this.aa] - effecttime[this.aa] * 0.5);
                  } else {
                     effectholdnumber2[this.aa] = effectholdnumber2[this.aa] - 12;
                  }

                  if (this.bossmahoujinn == 0) {
                     effecttime[this.aa] = 0;
                     effectholdnumber0[this.aa] = 2;
                  }
               } else if (effectholdnumber0[this.aa] == 2) {
                  effectholdnumber1[this.aa] = effectholdnumber1[this.aa] - 3;
                  if (effectholdnumber1[this.aa] < 1) {
                     effectmode[this.aa] = 0;
                  }

                  if (effecttime[this.aa] == 20) {
                     effectmode[this.aa] = 0;
                  }
               }
            } else if (effectmode[this.aa] == 999) {
               if (effecttime[this.aa] == 1) {
                  if (this.sevolume != 0) {
                     AudioPresenter var10000 = this.seplayer[5];
                     AudioPresenter var10001 = this.seplayer[0];
                     var10000.setAttribute(4, this.sevolume);
                  }

                  if (this.sevolume != 0) {
                     this.seplayer[5].play();
                  }
               }

               if (peoplebomkind == 0) {
                  this.peoplemuteki = 3;
                  if (effecttime[this.aa] == 1) {
                     if (this.stagemen == 5 && (this.edoing[this.bossnum] == 24 || this.edoing[this.bossnum] == 22)) {
                        this.emuteki[this.bossnum] = 1;
                     }

                     this.spelbonus = 0;
                     effectIn(0.0F, 0.0F, 19, 2, 0, 0);

                     for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                        this.bomIn(this.peopleX, this.peopleY, 1, this.cyc * 45, 0, 0, 0, 0);
                     }
                  }

                  if (effecttime[this.aa] == 181) {
                     effectmode[this.aa] = 0;
                     this.peoplemuteki = 0;
                     if (this.stagemen == 5 && this.emode[this.bossnum] == 1001) {
                        this.emuteki[this.bossnum] = 0;
                     }
                  }
               } else if (peoplebomkind == 1) {
                  if (effecttime[this.aa] == 1) {
                     effectIn(0.0F, 0.0F, 19, 3, 0, 0);
                     this.bomIn(1000.0F, 1000.0F, 2, 0.0F, 0, 0, 0, 0);
                     this.spelbonus = 0;
                     this.peoplemuteki = 3;
                     if (this.stagemen == 5 && (this.edoing[this.bossnum] == 24 || this.edoing[this.bossnum] == 22)) {
                        this.emuteki[this.bossnum] = 1;
                     }
                  }

                  if (effecttime[this.aa] == 20) {
                     effectIn(0.0F, 0.0F, 12, 140, 0, 0);
                  }

                  if (effecttime[this.aa] == 181) {
                     effectmode[this.aa] = 0;
                     this.peoplemuteki = 0;
                     if (this.stagemen == 5 && this.emode[this.bossnum] == 1001) {
                        this.emuteki[this.bossnum] = 0;
                     }
                  }
               } else if (peoplebomkind == 2) {
                  this.peoplemuteki = 3;
                  if (effecttime[this.aa] == 1) {
                     if (this.sevolume != 0) {
                        AudioPresenter var1 = this.seplayer[2];
                        AudioPresenter var8 = this.seplayer[0];
                        var1.setAttribute(4, this.sevolume);
                     }

                     if (this.sevolume != 0) {
                        this.seplayer[2].play();
                     }

                     effectIn(0.0F, 0.0F, 19, 4, 0, 0);
                     this.spelbonus = 0;
                     effectX[this.aa] = this.peopleX;
                     effectIn(this.peopleX, 240.0F, 77, 0, 0, 0);
                     if (this.stagemen == 5 && (this.edoing[this.bossnum] == 24 || this.edoing[this.bossnum] == 22)) {
                        this.emuteki[this.bossnum] = 1;
                     }
                  }

                  if (effecttime[this.aa] == 53) {
                     effectIn(0.0F, 0.0F, 12, 20, 0, 0);
                     if (this.sevolume != 0) {
                        AudioPresenter var2 = this.seplayer[4];
                        AudioPresenter var9 = this.seplayer[0];
                        var2.setAttribute(4, this.sevolume);
                     }

                     if (this.sevolume != 0) {
                        this.seplayer[4].play();
                     }
                  }

                  if (effecttime[this.aa] > 50 && effecttime[this.aa] < 200 && effecttime[this.aa] % 20 == 13) {
                     this.bomIn(effectX[this.aa], 240.0F, 3, 0.0F, 0, 0, 0, 0);
                  }

                  if (effecttime[this.aa] == 250) {
                     effectmode[this.aa] = 0;
                     this.peoplemuteki = 0;
                     if (this.stagemen == 5 && this.emode[this.bossnum] == 1001) {
                        this.emuteki[this.bossnum] = 0;
                     }
                  }
               } else if (peoplebomkind == 3) {
                  this.peoplemuteki = 3;
                  if (effecttime[this.aa] == 1) {
                     effectIn(0.0F, 0.0F, 19, 5, 0, 0);
                     this.spelbonus = 0;

                     for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                        this.bomIn(this.peopleX, this.peopleY, 4, this.cyc * 72 - 90, 0, -160, 0, 0);
                     }

                     if (this.stagemen == 5 && (this.edoing[this.bossnum] == 24 || this.edoing[this.bossnum] == 22)) {
                        this.emuteki[this.bossnum] = 1;
                     }
                  }

                  if (effecttime[this.aa] == 181) {
                     effectmode[this.aa] = 0;
                     this.peoplemuteki = 0;
                     if (this.stagemen == 5 && this.emode[this.bossnum] == 1001) {
                        this.emuteki[this.bossnum] = 0;
                     }
                  }
               }
            } else if (effectmode[this.aa] == 9999) {
               this.peoplemuteki = 3;
               if (effecttime[this.aa] == 1) {
                  this.spelbonus = 0;
                  this.bomIn(this.peopleX, this.peopleY, 5, 0.0F, 0, 0, 0, 0);
                  if (this.stagemen == 5 && (this.edoing[this.bossnum] == 24 || this.edoing[this.bossnum] == 22)) {
                     this.emuteki[this.bossnum] = 1;
                  }
               }

               if (effecttime[this.aa] == 51) {
                  effectmode[this.aa] = 0;
                  this.peoplemuteki = 0;
                  if (this.stagemen == 5 && this.emode[this.bossnum] == 1001) {
                     this.emuteki[this.bossnum] = 0;
                  }
               }
            }
         }
      }
   }

   void effectdraw(int var1) {
      int var2 = (int)effectX[var1];
      int var3 = (int)effectY[var1];
      if (effectmode[var1] == 1) {
         this.image[6].setAlpha(255 - effecttime[var1] * 20);
         this.g
            .drawScaledImage(
               this.image[6],
               var2 - 1 - effecttime[var1] * 4,
               var3 - 1 - effecttime[var1] * 4,
               1 + effecttime[var1] * 8,
               1 + effecttime[var1] * 8,
               0,
               235,
               30,
               30
            );
      } else if (effectmode[var1] == 2) {
         this.g.setColor(Graphics.getColorOfRGB(255, 255, 255));
         this.g.drawArc(var2 - effecttime[var1], var3 - effecttime[var1], effecttime[var1] * 2, effecttime[var1] * 2, 0, 360);
      } else if (effectmode[var1] == 5) {
         if (effectholdnumber1[var1] == 6) {
            this.image[5].setAlpha(255 - effecttime[var1] * 20);
            this.g
               .drawScaledImage(
                  this.image[5],
                  var2 - 17 + effecttime[var1] * 3,
                  var3 - 17 + effecttime[var1] * 3,
                  33 - effecttime[var1] * 6,
                  33 - effecttime[var1] * 6,
                  32 * effectholdnumber0[var1],
                  24,
                  32,
                  32
               );
         } else {
            this.image[6].setAlpha(50 + effecttime[var1] * 40);
            this.g
               .drawScaledImage(
                  this.image[6],
                  var2 - 1 - effecttime[var1] * 2,
                  var3 - 1 - effecttime[var1] * 2,
                  2 + effecttime[var1] * 2,
                  2 + effecttime[var1] * 2,
                  20 * effectholdnumber0[var1],
                  215,
                  20,
                  20
               );
         }
      } else if (effectmode[var1] == 6) {
         var3 += 5;
         this.g.setFont(Font.getFont(1879049216));
         this.drawBold(this.spelname, var2, var3, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));

         for (this.cyc = 0; this.cyc < 3; this.cyc++) {
            this.g.setColor(Graphics.getColorOfRGB(255, 40 * this.cyc, 40 * this.cyc));
            this.g.drawLine(var2 - this.cyc, var3 + 5 + this.cyc, var2 + 170 + this.cyc, var3 + 5);
         }

         if (effecttime[var1] > 80) {
            this.g.setFont(Font.getFont(1879049216));
            this.drawBold(
               "Spellbonus  " + this.formatNum(this.spelbonus, 5),
               var2 + 35,
               var3 + 17,
               Graphics.getColorOfRGB(55, 55, 55),
               Graphics.getColorOfRGB(255, 255, 255)
            );
         }
      } else if (effectmode[var1] == 66) {
         var3 += 5;
         this.g.setFont(Font.getFont(1879049216));
         this.drawBold("  「リーインカーネーション」", var2, var3, Graphics.getColorOfRGB(55, 55, 55), Graphics.getColorOfRGB(255, 255, 255));

         for (this.cyc = 0; this.cyc < 3; this.cyc++) {
            this.g.setColor(Graphics.getColorOfRGB(40 * this.cyc, 40 * this.cyc, 255));
            this.g.drawLine(var2 - this.cyc, var3 + 5 + this.cyc, var2 + 170 + this.cyc, var3 + 5);
         }
      } else if (effectmode[var1] == 77) {
         if (effecttime[var1] < 10) {
            this.image[17].setAlpha(effecttime[var1] * 15);
         } else {
            this.image[17].setAlpha(155 - (effecttime[var1] - 10) * 2);
         }

         this.g
            .drawScaledImage(
               this.image[17],
               (int)(var2 - 120 + effecttime[var1] * 2.4),
               (int)(var3 - 120 + effecttime[var1] * 2.4),
               (int)(241.0 - effecttime[var1] * 4.8),
               (int)(241.0 - effecttime[var1] * 4.8),
               0,
               0,
               100,
               100
            );
      } else if (effectmode[var1] == 777) {
         if (effecttime[var1] < 10) {
            this.image[17].setAlpha(effecttime[var1] * 15);
         } else {
            this.image[17].setAlpha(155 - (effecttime[var1] - 10) * 2);
         }

         this.g
            .drawScaledImage(
               this.image[17],
               var2 - 60 + effecttime[var1] * 2,
               var3 - 60 + effecttime[var1] * 2,
               121 - effecttime[var1] * 4,
               121 - effecttime[var1] * 4,
               0,
               0,
               100,
               100
            );
      } else if (effectmode[var1] == 7) {
         if (effecttime[var1] < 10) {
            this.image[7].setAlpha(effecttime[var1] * 15);
         } else {
            this.image[7].setAlpha(155 - (effecttime[var1] - 10) * 2);
         }

         effectkakudo[var1] = (effectkakudo[var1] + 7200.0F) % 360.0F;
         if (effectkakudo[var1] < 180.0F) {
            effectholdnumber2[var1] = (int)(effectkakudo[var1] / 18.0F);
            this.g
               .drawScaledImage(
                  this.image[7],
                  var2 - 30 + effecttime[var1],
                  var3 - 30 + effecttime[var1],
                  61 - effecttime[var1] * 2,
                  61 - effecttime[var1] * 2,
                  effectholdnumber2[var1] * 40,
                  0,
                  40,
                  40
               );
         } else {
            effectholdnumber2[var1] = 10 - (int)((effectkakudo[var1] - 180.0F) / 18.0F);
            this.g
               .drawScaledImage(
                  this.image[7],
                  var2 - 30 + effecttime[var1],
                  var3 - 30 + effecttime[var1],
                  61 - effecttime[var1] * 2,
                  61 - effecttime[var1] * 2,
                  effectholdnumber2[var1] * 40,
                  40,
                  40,
                  40
               );
         }
      } else if (effectmode[var1] == 8) {
         this.image[7].setAlpha(255 - effecttime[var1] * 8);
         effectkakudo[var1] = (effectkakudo[var1] + 720.0F) % 360.0F;
         if (effectkakudo[var1] < 180.0F) {
            effectholdnumber2[var1] = (int)(effectkakudo[var1] / 18.0F);
            this.g
               .drawScaledImage(
                  this.image[7],
                  var2 + effecttime[var1],
                  var3 + effecttime[var1],
                  effecttime[var1] * 2,
                  effecttime[var1] * 2,
                  effectholdnumber2[var1] * 40,
                  0,
                  40,
                  40
               );
         } else {
            effectholdnumber2[var1] = 10 - (int)((effectkakudo[var1] - 180.0F) / 18.0F);
            this.g
               .drawScaledImage(
                  this.image[7],
                  var2 + effecttime[var1],
                  var3 + effecttime[var1],
                  effecttime[var1] * 2,
                  effecttime[var1] * 2,
                  effectholdnumber2[var1] * 40,
                  40,
                  40,
                  40
               );
         }
      } else if (effectmode[var1] == 11) {
         if (effectholdnumber2[var1] == 0) {
            if (effectholdnumber0[var1] <= 3) {
               this.standimg[effectholdnumber0[var1]].setAlpha(150);
               this.g.drawImage(this.standimg[effectholdnumber0[var1]], var2 - 120, var3 - 120);
            } else {
               this.standimg[4].setAlpha(150);
               this.g.drawImage(this.standimg[4], var2 - 120, var3 - 120);
            }
         }
      } else if (effectmode[var1] == 14) {
         this.g.setColor(Graphics.getColorOfRGB(255, 0, 0));
         if (effecttime[var1] < 15) {
            this.g.setColor(Graphics.getColorOfRGB(255, 0, 0, 120));
            this.g.fillRect(0, 0, 240, 240);
            this.g.drawArc(var2 - 45 + effecttime[var1] * 3, var3 - 45 + effecttime[var1] * 3, 90 - effecttime[var1] * 6, 90 - effecttime[var1] * 6, 0, 360);
         } else if (effecttime[var1] > 15 && effecttime[var1] < 25) {
            this.image[6].setAlpha(255 - (effecttime[var1] - 15) * 20);
            this.g
               .drawScaledImage(
                  this.image[6],
                  var2 - 1 - (effecttime[var1] - 15) * 5,
                  var3 - 1 - (effecttime[var1] - 15) * 5,
                  1 + (effecttime[var1] - 15) * 10,
                  1 + (effecttime[var1] - 15) * 10,
                  30,
                  235,
                  30,
                  30
               );
         }
      } else if (effectmode[var1] == 16) {
         if (effecttime[var1] < 11) {
            this.image[14].setAlpha(200);
         }

         if (effecttime[var1] > 10) {
            this.image[14].setAlpha(210 - (effecttime[var1] - 10) * 20);
         }

         this.g
            .drawScaledImage(
               this.image[14],
               var2 - effecttime[var1] * 3 - 5,
               var3 - effecttime[var1] * 3,
               effecttime[var1] * 6,
               effecttime[var1] * 6,
               effectholdnumber0[var1] % 4 * 40,
               80,
               40,
               40
            );
      } else if (effectmode[var1] == 17) {
         this.g
            .drawScaledImage(
               this.image[15],
               var2 - effectholdnumber1[var1] - 5,
               var3 - effectholdnumber0[var1],
               effectholdnumber1[var1] * 2,
               effectholdnumber0[var1] * 2,
               0,
               0,
               180,
               30
            );
         if (effecttime[var1] > 60) {
            this.g.setFont(Font.getFont(1879048448));
            if (this.stagemen == 0) {
               this.drawBold("    春の魔界旅行", var2 - 85, var3, Graphics.getColorOfRGB(50, 50, 255), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.stagemen == 1) {
               this.drawBold("    永遠の置き傘", var2 - 85, var3, Graphics.getColorOfRGB(0, 255, 0), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.stagemen == 2) {
               this.drawBold("   魔界へと続く道", var2 - 85, var3, Graphics.getColorOfRGB(255, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.stagemen == 3 && peoplebomkind % 2 == 0) {
               this.drawBold("魔力を含んだ地下世界", var2 - 85, var3, Graphics.getColorOfRGB(50, 50, 255), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.stagemen == 3 && peoplebomkind % 2 == 1) {
               this.drawBold("   伝説の夢の魔界", var2 - 85, var3, Graphics.getColorOfRGB(50, 50, 255), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.stagemen == 4) {
               this.drawBold("      謎の館Ⅹ", var2 - 85, var3, Graphics.getColorOfRGB(255, 50, 255), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.stagemen == 5) {
               this.drawBold("     魔界のはて", var2 - 85, var3, Graphics.getColorOfRGB(50, 50, 255), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.stagemen == 6) {
               this.drawBold("魔界のラブリー守護霊", var2 - 85, var3, Graphics.getColorOfRGB(255, 50, 255), Graphics.getColorOfRGB(255, 255, 255));
            }
         }

         if (effecttime[var1] > 90) {
            this.g.setFont(Font.getFont(1879049216));
            if (this.stagemen == 0) {
               this.drawBold("STAGE 1  博麗神社付近", var2 - 45, var3 + 20, Graphics.getColorOfRGB(50, 50, 255), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.stagemen == 1) {
               this.drawBold("STAGE 2  博麗神社裏山", var2 - 45, var3 + 20, Graphics.getColorOfRGB(0, 255, 0), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.stagemen == 2) {
               this.drawBold("STAGE 3  魔界の入り口", var2 - 45, var3 + 20, Graphics.getColorOfRGB(255, 55, 55), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.stagemen == 3) {
               this.drawBold("STAGE 4  魔界", var2 - 45, var3 + 20, Graphics.getColorOfRGB(50, 50, 255), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.stagemen == 4) {
               this.drawBold("STAGE 5  パンデモニウム", var2 - 55, var3 + 20, Graphics.getColorOfRGB(255, 50, 255), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.stagemen == 5) {
               this.drawBold("STAGE 6  魔界最深部", var2 - 45, var3 + 20, Graphics.getColorOfRGB(50, 50, 255), Graphics.getColorOfRGB(255, 255, 255));
            }

            if (this.stagemen == 6) {
               this.drawBold("STAGE EX  博麗神社", var2 - 45, var3 + 20, Graphics.getColorOfRGB(255, 50, 255), Graphics.getColorOfRGB(255, 255, 255));
            }
         }
      } else if (effectmode[var1] == 20) {
         this.g.setFont(Font.getFont(1879048448));
         this.drawBold("Challenge Next Stage", 20, 80, Graphics.getColorOfRGB(255, 0, 0), Graphics.getColorOfRGB(55, 55, 55));
      } else if (effectmode[var1] == 21) {
         this.image[13].setAlpha(150);
         this.g.drawImage(this.image[13], var2 - 16, var3 - 16, 0, 80, 32, 32);
      } else if (effectmode[var1] == 22) {
         this.g.setFont(Font.getFont(1879048448));
         this.drawBold("     ＥＸＴＥＮＤ！", 0, 60, Graphics.getColorOfRGB(170, 0, 255), Graphics.getColorOfRGB(160, 222, 249));
         if (effecttime[var1] % 20 < 10) {
            this.g.setFont(Font.getFont(1879049216));

            for (this.cyc = 0; this.cyc < 5; this.cyc++) {
               this.drawBold("☆", 5 + this.cyc * 8, 230, Graphics.getColorOfRGB(255, 255, 255), Graphics.getColorOfRGB(170, 0, 255));
            }
         } else {
            this.g.setFont(Font.getFont(1879049216));

            for (this.cyc = 0; this.cyc < 5; this.cyc++) {
               this.drawBold("☆", 5 + this.cyc * 8, 230, Graphics.getColorOfRGB(0, 0, 0), Graphics.getColorOfRGB(170, 0, 255));
            }
         }
      } else if (effectmode[var1] == 23) {
         this.image[6].setAlpha(255 - effecttime[var1] * 7);
         this.g
            .drawScaledImage(
               this.image[6],
               var2 - 1 - effecttime[var1] * 4,
               var3 - 1 - effecttime[var1] * 4,
               1 + effecttime[var1] * 8,
               1 + effecttime[var1] * 8,
               0,
               235,
               30,
               30
            );
      } else if (effectmode[var1] == 24) {
         this.g.setColor(Graphics.getColorOfRGB(255, 255, 255, 150));
         this.g.fillRect(var2 - 3, var3 - 3, 6, 6);
      } else if (effectmode[var1] == 28) {
         this.g.setColor(Graphics.getColorOfRGB(255, 255, 255, 150));
         this.g
            .fillRect(
               (int)(var2 + (90 - effecttime[var1]) * Math.cos(effectholdnumber0[var1] * 3.1415 / 180.0)),
               (int)(var3 + (90 - effecttime[var1]) * Math.sin(effectholdnumber0[var1] * 3.1415 / 180.0)),
               20,
               20
            );
      } else if (effectmode[var1] == 29) {
         this.g.setColor(Graphics.getColorOfRGB(0, 0, 0, 150));
         this.g.fillRect(0, 60, 240, 30);
         this.g.setFont(Font.getFont(1879048448));
         this.drawBold("  ＡＬＬ  ＣＬＥＡＲ！", 0, 80, Graphics.getColorOfRGB(170, 0, 255), Graphics.getColorOfRGB(160, 222, 249));
      }
   }

   void stage1move() {
      if (this.stagemen == 0) {
         if (this.stagetime == 1) {
            try {
               MediaImage var1 = MediaManager.getImage("resource:///bg01.JPG");
               var1.use();
               this.bgimg[0] = var1.getImage();
            } catch (Exception var44) {
            }

            try {
               MediaImage var45 = MediaManager.getImage("resource:///bg02.JPG");
               var45.use();
               this.bgimg[1] = var45.getImage();
            } catch (Exception var43) {
            }

            try {
               MediaImage var46 = MediaManager.getImage("resource:///stand4.gif");
               var46.use();
               this.standimg[4] = var46.getImage();
            } catch (Exception var42) {
            }

            this.player.stop();

            try {
               MediaSound var47 = MediaManager.getSound("resource:///1.mld");
               var47.use();
               this.player = AudioPresenter.getAudioPresenter();
               this.player.setSound(var47);
               this.player.setMediaListener(this);
            } catch (Exception var41) {
            }

            this.player.setAttribute(4, this.volume);
            this.player.play();

            for (this.cyc = 0; this.cyc < 30; this.cyc++) {
               effectIn((this.rand.nextInt() >>> 1) % 200, (this.rand.nextInt() >>> 1) % 270, 15, 0, 0, 0);
            }

            this.stageYmove = -5.0F;
            this.stagetime = 800;
            this.load();
            if (this.stagelevel == 0) {
               this.peoplehighscore[peoplebomkind] = this.peoplehighscore1[peoplebomkind];
            }

            if (this.stagelevel == 1) {
               this.peoplehighscore[peoplebomkind] = this.peoplehighscore2[peoplebomkind];
            }

            if (this.stagepractice == 1) {
               this.peoplehighscore[peoplebomkind] = 99999999;
            }

            effectIn(0.0F, 0.0F, 19, 0, 0, 0);
         }

         if (this.stagetime < 900) {
            this.stageYmove = (float)(this.stageYmove + 0.15);
         } else if (this.stagetime > 1000 && this.stagetime < 1050) {
            this.stageYmove = (float)(this.stageYmove - 0.1);
         } else if (this.stagetime > 1850 && this.stagetime < 1900) {
            this.stageYmove = (float)(this.stageYmove - 0.08);
         } else if (this.stagetime > 20050 && this.stagetime < 20150) {
            this.stageYmove = (float)(this.stageYmove + 0.05);
         }

         if (this.stagetime % 6 == 0) {
            effectIn((this.rand.nextInt() >>> 1) % 60, -10.0F, 15, 0, 0, 0);
         }

         if (this.stagetime % 6 == 2) {
            effectIn((this.rand.nextInt() >>> 1) % 60 + 65, -10.0F, 15, 0, 0, 0);
         }

         if (this.stagetime % 6 == 4) {
            effectIn((this.rand.nextInt() >>> 1) % 60 + 130, -10.0F, 15, 0, 0, 0);
         }

         if (this.stagetime == 820) {
            this.eIn(this.migi - 20, -10, 4, -1, 5);
         }

         if (this.stagetime == 1000) {
            this.eIn(20, -10, 4, 1, 5);
         }

         for (this.cyc = 0; this.cyc < 5; this.cyc++) {
            if (this.stagetime == 900 + this.cyc * 20) {
               this.eIn((this.rand.nextInt() >>> 1) % 60, -10, 1, 1, 2);
            }

            if (this.stagetime == 910 + this.cyc * 20) {
               this.eIn(this.migi - (this.rand.nextInt() >>> 1) % 60, -10, 1, -1, 2);
            }
         }

         if (this.stagetime == 1150) {
            effectIn(100.0F, 80.0F, 17, 1, 1, 0);
         }

         for (this.cyc = 0; this.cyc < 5; this.cyc++) {
            if (this.stagetime == 1300 + this.cyc * 10) {
               this.eIn(this.cyc * 5, -10, 3, 1, this.cyc % 2 + 1);
            }

            if (this.stagetime == 1500 + this.cyc * 10) {
               this.eIn(this.migi - this.cyc * 10, -10, 3, -1, (this.cyc + 1) % 2 + 1);
            }
         }

         if (this.stagetime == 1350) {
            this.eIn(this.migi - 20, -10, 4, -1, 4);
         }

         if (this.stagetime == 1550) {
            this.eIn(20, -10, 4, 1, 4);
         }

         for (this.cyc = 0; this.cyc < 5; this.cyc++) {
            if (this.stagetime == 1670 + this.cyc * 20) {
               this.eIn(this.cyc * 20, -10, 3, 1, 1);
            }

            if (this.stagetime == 1680 + this.cyc * 20) {
               this.eIn(this.migi - this.cyc * 20, -10, 3, -1, 1);
            }

            if (this.stagetime == 1770 + this.cyc * 10) {
               this.eIn(80 - this.cyc * 10, -10, 3, 1, 2);
            }

            if (this.stagetime == 1770 + this.cyc * 10) {
               this.eIn(120 + this.cyc * 10, -10, 3, -1, 2);
            }
         }

         if (this.stagetime == 1850) {
            this.eIn(200, -10, 1000, 0, 0);
         }

         for (this.cyc = 0; this.cyc < 10; this.cyc++) {
            if (this.stagetime == 20000 + this.cyc * 20) {
               this.eIn(this.cyc * 15, -10, 3, 1, 1);
            }

            if (this.stagetime == 20010 + this.cyc * 20) {
               this.eIn(this.migi - this.cyc * 15, -10, 3, -1, 1);
            }
         }

         for (this.cyc = 0; this.cyc < 3; this.cyc++) {
            if (this.stagetime == 20200 + this.cyc * 120) {
               this.eIn(this.migi - 20 - this.cyc * 10, -10, 4, -1, 4);
            }

            if (this.stagetime == 20260 + this.cyc * 120) {
               this.eIn(20 + this.cyc * 10, -10, 4, 1, 4);
            }
         }

         if (this.stagetime == 20560) {
            this.eIn(this.migi - 20 - this.cyc * 10, -10, 4, -1, 5);
         }

         if (this.stagetime == 20620) {
            this.eIn(20 + this.cyc * 10, -10, 4, 1, 5);
         }

         for (this.cyc = 0; this.cyc < 8; this.cyc++) {
            if (this.stagetime == 20700 + this.cyc * 20) {
               this.eIn(this.cyc * 15, -10, 3, 1, 1);
            }

            if (this.stagetime == 20710 + this.cyc * 20) {
               this.eIn(this.migi - this.cyc * 15, -10, 3, -1, 1);
            }
         }

         for (this.cyc = 0; this.cyc < 2; this.cyc++) {
            if (this.stagetime == 20860 + this.cyc * 20) {
               this.eIn(this.cyc * 15, -10, 3, 1, 2);
            }

            if (this.stagetime == 20870 + this.cyc * 20) {
               this.eIn(this.migi - this.cyc * 15, -10, 3, -1, 2);
            }
         }

         if (this.stagetime == 21000) {
            this.eIn(-10, -10, 1001, 0, 0);
         }

         if (this.stagetime == 21000) {
            effectIn(0.0F, 0.0F, 10, 0, 0, 0);
         }

         if (this.stagetime == 50060) {
            effectIn(0.0F, 0.0F, 10, 0, 0, 1);
         }
      }

      if (this.stagemen == 1) {
         if (this.stagetime == 1) {
            try {
               MediaImage var48 = MediaManager.getImage("resource:///bg03.gif");
               var48.use();
               this.bgimg[0] = var48.getImage();
            } catch (Exception var40) {
            }

            try {
               MediaImage var49 = MediaManager.getImage("resource:///bg04.jpg");
               var49.use();
               this.bgimg[2] = var49.getImage();
            } catch (Exception var39) {
            }

            try {
               MediaImage var50 = MediaManager.getImage("resource:///bg05.JPG");
               var50.use();
               this.bgimg[1] = var50.getImage();
            } catch (Exception var38) {
            }

            try {
               MediaImage var51 = MediaManager.getImage("resource:///bg05.gif");
               var51.use();
               this.bgimg[3] = var51.getImage();
            } catch (Exception var37) {
            }

            try {
               MediaImage var52 = MediaManager.getImage("resource:///stand5.gif");
               var52.use();
               this.standimg[4] = var52.getImage();
            } catch (Exception var36) {
            }

            this.player.stop();

            try {
               MediaSound var53 = MediaManager.getSound("resource:///3.mld");
               var53.use();
               this.player = AudioPresenter.getAudioPresenter();
               this.player.setSound(var53);
               this.player.setMediaListener(this);
            } catch (Exception var35) {
            }

            this.player.setAttribute(4, this.volume);
            this.player.play();
            this.stagetime = 800;
            this.stageYmove = 3.0F;
            if (this.stagelevel == 0) {
               if (this.stageopen[0] == 0) {
                  this.stageopen[0] = 1;
                  this.stagesave();
               }
            } else if (this.stagelevel == 1 && this.stageopenH[0] == 0) {
               this.stageopenH[0] = 1;
               this.stagesave();
            }
         }

         if (this.stagetime > 1000 && this.stagetime < 1050) {
            this.stageYmove = (float)(this.stageYmove - 0.04);
         }

         for (this.cyc = 0; this.cyc < 4; this.cyc++) {
            if (this.stagetime == 830 + this.cyc * 30) {
               this.eIn(-10, 120, 1, 1, 1);
            }

            if (this.stagetime == 860 + this.cyc * 30) {
               this.eIn(this.migi + 10, 120, 1, -1, 2);
            }
         }

         if (this.stagetime == 980) {
            this.eIn(100, -10, 2, 0, 5);
         }

         if (this.stagetime == 1150) {
            effectIn(100.0F, 80.0F, 17, 1, 1, 0);
         }

         for (this.cyc = 0; this.cyc < 7; this.cyc++) {
            if (this.stagetime == 1300 + this.cyc * 30) {
               this.eIn(-10, 50, 3, 1, this.cyc % 2 + 1);
            }

            if (this.stagetime == 1315 + this.cyc * 30) {
               this.eIn(this.migi + 10, 50, 3, -1, (this.cyc + 1) % 2 + 1);
            }
         }

         for (this.cyc = 0; this.cyc < 5; this.cyc++) {
            if (this.stagetime == 1600 + this.cyc * 60) {
               this.eIn(30 + this.cyc * 30, -10, 4, 1, 1);
            }

            if (this.stagetime == 1630 + this.cyc * 60) {
               this.eIn(this.migi - 30 - this.cyc * 30, -10, 4, -1, 1);
            }
         }

         if (this.stagetime == 2000) {
            this.eIn(this.migi - 30, -10, 1000, 0, 0);
         }

         for (this.cyc = 0; this.cyc < 10; this.cyc++) {
            if (this.stagetime == 20060 + this.cyc * 20) {
               this.eIn(-10, 80 + this.cyc % 5 * 5, 5, 1, 2);
            }

            if (this.stagetime == 20070 + this.cyc * 20) {
               this.eIn(this.migi + 10, 80 + this.cyc % 5 * 5, 5, -1, 1);
            }
         }

         for (this.cyc = 0; this.cyc < 5; this.cyc++) {
            if (this.stagetime == 20300 + this.cyc * 60) {
               this.eIn(30 + this.cyc * 30, -10, 4, 1, 1);
            }

            if (this.stagetime == 20330 + this.cyc * 60) {
               this.eIn(this.migi - 30 - this.cyc * 30, -10, 4, -1, 1);
            }
         }

         for (this.cyc = -1; this.cyc < 7; this.cyc++) {
            if (this.stagetime == 20700 + this.cyc * 30) {
               this.eIn(-10, 50, 3, 1, 1);
            }

            if (this.stagetime == 20700 + this.cyc * 30) {
               this.eIn(this.migi + 10, 50, 3, -1, 1);
            }
         }

         for (this.cyc = 0; this.cyc < 2; this.cyc++) {
            if (this.stagetime == 20940 + this.cyc * 60) {
               this.eIn(30 + this.cyc * 30, -10, 4, 1, this.cyc % 2 + 1);
            }

            if (this.stagetime == 20940 + this.cyc * 60) {
               this.eIn(this.migi - 30 - this.cyc * 30, -10, 4, -1, this.cyc % 2 + 1);
            }
         }

         if (this.stagetime == 21200) {
            this.eIn(200, -10, 1001, 0, 0);
         }

         if (this.stagetime == 21200) {
            effectIn(0.0F, 0.0F, 10, 0, 0, 2);
         }

         if (this.stagetime == 50090) {
            effectIn(0.0F, 0.0F, 10, 0, 0, 3);
         }
      }

      if (this.stagemen == 2) {
         if (this.stagetime == 1) {
            try {
               MediaImage var54 = MediaManager.getImage("resource:///bg06.gif");
               var54.use();
               this.bgimg[0] = var54.getImage();
            } catch (Exception var34) {
            }

            try {
               MediaImage var55 = MediaManager.getImage("resource:///bg07.jpg");
               var55.use();
               this.bgimg[2] = var55.getImage();
            } catch (Exception var33) {
            }

            try {
               MediaImage var56 = MediaManager.getImage("resource:///bg08.JPG");
               var56.use();
               this.bgimg[1] = var56.getImage();
            } catch (Exception var32) {
            }

            try {
               MediaImage var57 = MediaManager.getImage("resource:///stand6.gif");
               var57.use();
               this.standimg[4] = var57.getImage();
            } catch (Exception var31) {
            }

            this.player.stop();

            try {
               MediaSound var58 = MediaManager.getSound("resource:///5.mld");
               var58.use();
               this.player = AudioPresenter.getAudioPresenter();
               this.player.setSound(var58);
               this.player.setMediaListener(this);
            } catch (Exception var30) {
            }

            this.player.setAttribute(4, this.volume);
            this.player.play();
            this.stagetime = 800;
            this.stageYmove = 0.0F;

            for (this.cyc = 0; this.cyc < 30; this.cyc++) {
               effectIn((this.rand.nextInt() >>> 1) % 200, (this.rand.nextInt() >>> 1) % 270, 15, 0, 0, 0);
            }

            if (this.stagelevel == 0) {
               if (this.stageopen[1] == 0) {
                  this.stageopen[1] = 1;
                  this.stagesave();
               }
            } else if (this.stagelevel == 1 && this.stageopenH[1] == 0) {
               this.stageopenH[1] = 1;
               this.stagesave();
            }
         }

         if (this.stagetime > 850 && this.stagetime < 1050) {
            this.stageYmove = (float)(this.stageYmove + 0.05);
         }

         if (this.stagetime > 21500 && this.stagetime < 21550) {
            this.stageYmove = (float)(this.stageYmove - 0.19);
         }

         if (this.stagetime % 6 == 0) {
            effectIn((this.rand.nextInt() >>> 1) % 60, -10.0F, 15, 0, 0, 0);
         }

         if (this.stagetime % 6 == 2) {
            effectIn((this.rand.nextInt() >>> 1) % 60 + 65, -10.0F, 15, 0, 0, 0);
         }

         if (this.stagetime % 6 == 4) {
            effectIn((this.rand.nextInt() >>> 1) % 60 + 130, -10.0F, 15, 0, 0, 0);
         }

         if (this.stagetime == 830) {
            effectIn(100.0F, 80.0F, 17, 1, 1, 0);
         }

         for (this.cyc = 0; this.cyc < 4; this.cyc++) {
            if (this.stagetime == 1000 + this.cyc * 10) {
               this.eIn(-10, 120, 2, 1, 1);
            }

            if (this.stagetime == 1050 + this.cyc * 10) {
               this.eIn(this.migi + 10, 120, 2, -1, 1);
            }
         }

         for (this.cyc = 1; this.cyc < 7; this.cyc++) {
            if (this.stagetime == 1090 + this.cyc * 30) {
               this.cyc2 = (this.rand.nextInt() >>> 1) % 40;
               this.eIn(20 + this.cyc2, -10, 1, 1, 1);
               this.eIn(this.migi - 20 - this.cyc2, -10, 1, 1, 1);
            }
         }

         for (this.cyc = 0; this.cyc < 10; this.cyc++) {
            if (this.stagetime == 1300 + this.cyc * 5) {
               this.eIn(this.migi + 10, 50, 3, -1, 1);
            }

            if (this.stagetime == 1350 + this.cyc * 5) {
               this.eIn(-10, 50, 3, 1, 2);
            }
         }

         if (this.stagetime == 1430) {
            this.eIn(this.migi - 30, -10, 4, -1, 4);
         }

         if (this.stagetime == 1530) {
            this.eIn(30, -10, 4, 1, 4);
         }

         for (this.cyc = 0; this.cyc < 5; this.cyc++) {
            if (this.stagetime == 1600 + this.cyc * 30) {
               this.eIn(-10, 120, 2, 1, 1);
            }

            if (this.stagetime == 1615 + this.cyc * 30) {
               this.eIn(this.migi + 10, 120, 2, -1, 2);
            }
         }

         if (this.stagetime == 1750) {
            this.eIn(this.migi - 40, -10, 1000, 0, 0);
         }

         for (this.cyc = 0; this.cyc < 6; this.cyc++) {
            if (this.stagetime == 20100 + this.cyc * 15) {
               this.eIn(-10, 120, 2, 1, 2);
            }

            if (this.stagetime == 20200 + this.cyc * 15) {
               this.eIn(this.migi + 10, 120, 2, -1, 1);
            }
         }

         if (this.stagetime == 20300) {
            this.eIn(this.migi - 30, -10, 4, -1, 4);
         }

         if (this.stagetime == 20430) {
            this.eIn(30, -10, 4, 1, 4);
         }

         for (this.cyc = 0; this.cyc < 10; this.cyc++) {
            if (this.stagetime == 20390 + this.cyc * 5) {
               this.eIn(-10, 50, 3, 1, 2);
            }

            if (this.stagetime == 20520 + this.cyc * 5) {
               this.eIn(this.migi + 10, 50, 3, -1, 2);
            }
         }

         if (this.stagetime == 20560) {
            this.eIn(this.migi - 30, -10, 4, -1, 5);
         }

         if (this.stagetime == 20560) {
            this.eIn(30, -10, 4, 1, 5);
         }

         for (this.cyc = 0; this.cyc < 7; this.cyc++) {
            if (this.stagetime == 20700 + this.cyc * 30) {
               this.cyc2 = (this.rand.nextInt() >>> 1) % 40;
               this.eIn(20 + this.cyc2, -10, 1, 1, 1);
               this.eIn(this.migi - 20 - this.cyc2, -10, 1, 1, 1);
            }
         }

         if (this.stagetime == 20910) {
            this.eIn(40, -10, 1, 1, 1);
            this.eIn(this.migi - 40, -10, 1, 1, 1);
            this.eIn(70, -10, 1, 1, 1);
            this.eIn(this.migi - 70, -10, 1, 1, 1);
         }

         if (this.stagetime == 21000) {
            this.eIn(100, -10, 5, 0, 6);
         }

         if (this.stagetime == 21500) {
            this.eIn(this.migi - 40, -10, 1001, 0, 0);
         }

         if (this.stagetime == 21500) {
            effectIn(0.0F, 0.0F, 10, 0, 0, 4);
         }

         if (this.stagetime == 50090) {
            effectIn(0.0F, 0.0F, 10, 0, 0, 5);
         }
      }

      if (this.stagemen == 3) {
         if (this.stagetime == 1) {
            try {
               MediaImage var59 = MediaManager.getImage("resource:///bg09.gif");
               var59.use();
               this.bgimg[0] = var59.getImage();
            } catch (Exception var29) {
            }

            try {
               MediaImage var60 = MediaManager.getImage("resource:///bg09.JPG");
               var60.use();
               this.bgimg[2] = var60.getImage();
            } catch (Exception var28) {
            }

            try {
               MediaImage var61 = null;
               if (peoplebomkind % 2 == 0) {
                  var61 = MediaManager.getImage("resource:///bg10.JPG");
               }

               if (peoplebomkind % 2 == 1) {
                  var61 = MediaManager.getImage("resource:///bg100.JPG");
               }

               var61.use();
               this.bgimg[1] = var61.getImage();
            } catch (Exception var27) {
            }

            try {
               MediaImage var62 = MediaManager.getImage("resource:///stand7.gif");
               if (peoplebomkind % 2 == 1) {
                  var62 = MediaManager.getImage("resource:///stand8.gif");
               }

               var62.use();
               this.standimg[4] = var62.getImage();
            } catch (Exception var26) {
            }

            this.player.stop();

            try {
               MediaSound var63 = MediaManager.getSound("resource:///7.mld");
               var63.use();
               this.player = AudioPresenter.getAudioPresenter();
               this.player.setSound(var63);
               this.player.setMediaListener(this);
            } catch (Exception var25) {
            }

            this.player.setAttribute(4, this.volume);
            this.player.play();
            this.stagetime = 800;
            this.stageYmove = 4.0F;
            if (this.stagelevel == 0) {
               if (this.stageopen[2] == 0) {
                  this.stageopen[2] = 1;
                  this.stagesave();
               }
            } else if (this.stagelevel == 1 && this.stageopenH[2] == 0) {
               this.stageopenH[2] = 1;
               this.stagesave();
            }
         }

         if (this.stagetime == 850) {
            this.eIn(-10, 30, 1, 1, 1);
         }

         if (this.stagetime == 850) {
            this.eIn(this.migi + 10, 30, 1, -1, 1);
         }

         if (this.stagetime == 880) {
            this.eIn(-10, 170, 2, 1, 1);
         }

         if (this.stagetime == 880) {
            this.eIn(this.migi + 10, 170, 2, -1, 1);
         }

         if (this.stagetime == 1080) {
            effectIn(100.0F, 80.0F, 17, 1, 1, 0);
         }

         for (this.cyc = 0; this.cyc < 5; this.cyc++) {
            if (this.stagetime == 1230 + this.cyc * 30) {
               this.eIn(30 + this.cyc % 2 * 30, -10, 4, 1, 2);
            }

            if (this.stagetime == 1230 + this.cyc * 30) {
               this.eIn(this.migi - 30 - this.cyc % 2 * 30, -10, 4, -1, 2);
            }
         }

         for (this.cyc = 0; this.cyc < 5; this.cyc++) {
            if (this.stagetime == 1440 + this.cyc * 80) {
               this.eIn(-20, 20, 5, 1, 1);
            }

            if (this.stagetime == 1500 + this.cyc * 80) {
               this.eIn(this.migi + 20, 20, 5, -1, 1);
            }
         }

         for (this.cyc = 0; this.cyc < 3; this.cyc++) {
            if (this.stagetime == 1830 + this.cyc * 40) {
               this.eIn(-20, 40, 6, 1, 1);
            }

            if (this.stagetime == 1850 + this.cyc * 40) {
               this.eIn(this.migi + 20, 40, 6, -1, 1);
            }
         }

         for (this.cyc = 0; this.cyc < 7; this.cyc++) {
            if (this.stagetime == 2000 + this.cyc * 30) {
               this.eIn(20 + this.cyc % 3 * 10, -20, 7, 1, 1);
            }

            if (this.stagetime == 2015 + this.cyc * 30) {
               this.eIn(this.migi - 20 - this.cyc % 3 * 10, -20, 7, -1, 1);
            }
         }

         if (this.stagetime > 2285 && this.stagetime < 2335) {
            this.stageYmove = (float)(this.stageYmove - 0.1);
         }

         if (this.stagetime == 2285) {
            this.eIn(200, -20, 1000, 1, 1);
         }

         if (this.stagetime > 20050 && this.stagetime < 20100) {
            this.stageYmove = (float)(this.stageYmove + 0.1);
         }

         if (this.stagetime == 20120) {
            this.eIn(-10, 30, 1, 1, 1);
         }

         if (this.stagetime == 20120) {
            this.eIn(this.migi + 10, 30, 1, -1, 1);
         }

         if (this.stagetime == 20150) {
            this.eIn(-10, 170, 2, 1, 1);
         }

         if (this.stagetime == 20150) {
            this.eIn(this.migi + 10, 170, 2, -1, 1);
         }

         for (this.cyc = 0; this.cyc < 3; this.cyc++) {
            if (this.stagetime == 20320 + this.cyc * 120) {
               this.eIn(-20, 20, 5, 1, 1);
            }

            if (this.stagetime == 20380 + this.cyc * 120) {
               this.eIn(this.migi - 20, 20, 5, -1, 1);
            }
         }

         for (this.cyc = 0; this.cyc < 5; this.cyc++) {
            if (this.stagetime == 20780 + this.cyc * 30) {
               this.eIn(30 + this.cyc % 2 * 30, -10, 4, 1, 2);
            }

            if (this.stagetime == 20780 + this.cyc * 30) {
               this.eIn(this.migi - 30 - this.cyc % 2 * 30, -10, 4, -1, 2);
            }
         }

         if (this.stagetime == 21150) {
            if (this.stagetime == 21150) {
               effectIn(0.0F, 0.0F, 10, 0, 0, 6);
            }

            if (peoplebomkind % 2 == 0) {
               this.eIn(this.migi + 10, -20, 1001, 0, 0);
            }

            if (peoplebomkind % 2 == 1) {
               this.eIn(this.migi + 10, -20, 1002, 0, 0);
            }
         }

         if (this.stagetime == 50090) {
            effectIn(0.0F, 0.0F, 10, 0, 0, 7);
         }
      }

      if (this.stagemen == 4) {
         if (this.stagetime == 1) {
            try {
               MediaImage var64 = MediaManager.getImage("resource:///bg11.JPG");
               var64.use();
               this.bgimg[0] = var64.getImage();
            } catch (Exception var24) {
            }

            try {
               MediaImage var65 = MediaManager.getImage("resource:///bg12.JPG");
               var65.use();
               this.bgimg[1] = var65.getImage();
            } catch (Exception var23) {
            }

            try {
               MediaImage var66 = MediaManager.getImage("resource:///stand9.gif");
               var66.use();
               this.standimg[4] = var66.getImage();
            } catch (Exception var22) {
            }

            this.player.stop();

            try {
               MediaSound var67 = MediaManager.getSound("resource:///10.mld");
               var67.use();
               this.player = AudioPresenter.getAudioPresenter();
               this.player.setSound(var67);
               this.player.setMediaListener(this);
            } catch (Exception var21) {
            }

            this.player.setAttribute(4, this.volume);
            this.player.play();
            this.stagetime = 1000;
            this.stageYmove = 1.5F;
            if (this.stagelevel == 0) {
               if (this.stageopen[3] == 0) {
                  this.stageopen[3] = 1;
                  this.stagesave();
               }
            } else if (this.stagelevel == 1 && this.stageopenH[3] == 0) {
               this.stageopenH[3] = 1;
               this.stagesave();
            }
         }

         for (this.cyc = 0; this.cyc < 10; this.cyc++) {
            if (this.stagetime == 1030 + 10 * this.cyc) {
               this.eIn(this.migi + 10, 50 + this.cyc % 10 * 5, 1, -1, 2);
            }

            if (this.stagetime == 1032 + 10 * this.cyc) {
               this.eIn(-10, 50 + this.cyc % 10 * 5, 1, 1, 2);
            }
         }

         if (this.stagetime == 1270) {
            effectIn(100.0F, 80.0F, 17, 1, 1, 0);
         }

         for (this.cyc = 0; this.cyc < 4; this.cyc++) {
            if (this.stagetime == 1420 + 120 * this.cyc) {
               this.eIn(this.migi + 20, 100, 2, -4, 4);
            }

            if (this.stagetime == 1480 + 120 * this.cyc) {
               this.eIn(-20, 100, 2, 4, 4);
            }
         }

         for (this.cyc = 0; this.cyc < 2; this.cyc++) {
            if (this.stagetime == 2000 + 120 * this.cyc) {
               this.eIn(this.migi - 20, -20, 3, 1, 4);
            }

            if (this.stagetime == 2000 + 120 * this.cyc) {
               this.eIn(20, -20, 3, 1, 4);
            }

            if (this.stagetime == 2060 + 120 * this.cyc) {
               this.eIn(this.migi - 20, 260, 3, -1, 4);
            }

            if (this.stagetime == 2060 + 120 * this.cyc) {
               this.eIn(20, 260, 3, -1, 4);
            }

            if (this.stagetime == 2270 + 120 * this.cyc) {
               this.eIn(this.migi - 20, -20, 3, 1, 4);
            }

            if (this.stagetime == 2270 + 120 * this.cyc) {
               this.eIn(20, -20, 3, 1, 4);
            }

            if (this.stagetime == 2330 + 120 * this.cyc) {
               this.eIn(this.migi - 20, 260, 3, -1, 4);
            }

            if (this.stagetime == 2330 + 120 * this.cyc) {
               this.eIn(20, 260, 3, -1, 4);
            }
         }

         for (this.cyc = 0; this.cyc < 3; this.cyc++) {
            if (this.stagetime == 2540 + 30 * this.cyc) {
               this.eIn(this.migi - 20, -20, 3, 1, 4);
            }

            if (this.stagetime == 2540 + 30 * this.cyc) {
               this.eIn(20, -20, 3, 1, 4);
            }
         }

         if (this.stagetime == 2660) {
            this.eIn(this.migi - 20, 260, 3, -1, 4);
         }

         if (this.stagetime == 2660) {
            this.eIn(20, 260, 3, -1, 4);
         }

         for (this.cyc = 0; this.cyc < 4; this.cyc++) {
            if (this.stagetime == 2800 + 30 * this.cyc) {
               this.eIn(this.migi - 20 - this.cyc * 10, -20, 4, 1, 1);
            }

            if (this.stagetime == 2920 + 30 * this.cyc) {
               this.eIn(20 + this.cyc * 10, -20, 4, 1, 2);
            }

            if (this.stagetime == 3040 + 30 * this.cyc) {
               this.eIn(this.migi - 20 - this.cyc * 10, -20, 4, 1, 1);
            }

            if (this.stagetime == 3040 + 30 * this.cyc) {
               this.eIn(20 + this.cyc * 10, -20, 4, 1, 2);
            }
         }

         if (this.stagetime == 3240) {
            this.eIn(this.migi + 20, 100, 2, -8, 4);
         }

         if (this.stagetime == 3240) {
            this.eIn(-20, 100, 2, 8, 4);
         }

         if (this.stagetime == 3430) {
            this.eIn(-20, 0, 1000, 0, 0);
         }

         for (this.cyc = 0; this.cyc < 20; this.cyc++) {
            if (this.stagetime == 20100 + 10 * this.cyc) {
               this.eIn(this.migi + 10, 50 + this.cyc % 10 * 5, 1, -1, 1);
            }

            if (this.stagetime == 20105 + 10 * this.cyc) {
               this.eIn(-10, 50 + this.cyc % 10 * 5, 1, 1, 2);
            }
         }

         for (this.cyc = 0; this.cyc < 1; this.cyc++) {
            if (this.stagetime == 20350 + 240 * this.cyc) {
               this.eIn(this.migi + 20, 100, 2, -4, 5);
            }

            if (this.stagetime == 20350 + 240 * this.cyc) {
               this.eIn(-20, 100, 2, 4, 5);
            }

            if (this.stagetime == 20470 + 240 * this.cyc) {
               this.eIn(this.migi + 20, 100, 2, -8, 4);
            }

            if (this.stagetime == 20470 + 240 * this.cyc) {
               this.eIn(-20, 100, 2, 8, 4);
            }
         }

         for (this.cyc = 0; this.cyc < 2; this.cyc++) {
            if (this.stagetime == 20700 + 120 * this.cyc) {
               this.eIn(this.migi - 20, -20, 3, 1, 4);
            }

            if (this.stagetime == 20700 + 120 * this.cyc) {
               this.eIn(20, -20, 3, 1, 4);
            }
         }

         if (this.stagetime == 20760) {
            this.eIn(this.migi - 20, 260, 3, -1, 4);
         }

         if (this.stagetime == 20760) {
            this.eIn(20, 260, 3, -1, 4);
         }

         for (this.cyc = 0; this.cyc < 4; this.cyc++) {
            if (this.stagetime == 20900 + 30 * this.cyc) {
               this.eIn(this.migi - 20 - this.cyc * 10, -20, 4, 1, 1);
            }

            if (this.stagetime == 20900 + 30 * this.cyc) {
               this.eIn(20 + this.cyc * 10, -20, 4, 1, 2);
            }

            if (this.stagetime == 21050 + 30 * this.cyc) {
               this.eIn(this.migi - 20 - this.cyc * 10, -20, 4, 1, 2);
            }

            if (this.stagetime == 21050 + 30 * this.cyc) {
               this.eIn(20 + this.cyc * 10, -20, 4, 1, 1);
            }
         }

         if (this.stagetime == 21300) {
            this.eIn(this.migi - 20, -20, 3, 1, 4);
         }

         if (this.stagetime == 21300) {
            this.eIn(20, -20, 3, 1, 4);
         }

         if (this.stagetime == 21300) {
            this.eIn(this.migi - 20, 260, 3, -1, 4);
         }

         if (this.stagetime == 21300) {
            this.eIn(20, 260, 3, -1, 4);
         }

         if (this.stagetime == 21420) {
            this.eIn(this.migi + 20, 100, 2, -8, 4);
         }

         if (this.stagetime == 21420) {
            this.eIn(-20, 100, 2, 8, 4);
         }

         if (this.stagetime == 21700) {
            effectIn(0.0F, 0.0F, 10, 0, 0, 8);
         }

         if (this.stagetime == 21700) {
            this.eIn(-20, 0, 1001, 0, 0);
         }

         if (this.stagetime == 50090) {
            effectIn(0.0F, 0.0F, 10, 0, 0, 9);
         }
      }

      if (this.stagemen == 5) {
         if (this.stagetime == 1) {
            try {
               MediaImage var68 = MediaManager.getImage("resource:///bg13.JPG");
               var68.use();
               this.bgimg[0] = var68.getImage();
            } catch (Exception var20) {
            }

            try {
               MediaImage var69 = MediaManager.getImage("resource:///bg14.JPG");
               var69.use();
               this.bgimg[1] = var69.getImage();
            } catch (Exception var19) {
            }

            try {
               MediaImage var70 = MediaManager.getImage("resource:///stand10.gif");
               var70.use();
               this.standimg[4] = var70.getImage();
            } catch (Exception var18) {
            }

            this.player.stop();

            try {
               MediaSound var71 = MediaManager.getSound("resource:///12.mld");
               var71.use();
               this.player = AudioPresenter.getAudioPresenter();
               this.player.setSound(var71);
               this.player.setMediaListener(this);
            } catch (Exception var17) {
            }

            this.player.setAttribute(4, this.volume);
            this.player.play();
            this.stagetime = 400;
            this.stageYmove = 1.5F;
            if (this.stagelevel == 0) {
               if (this.stageopen[4] == 0) {
                  this.stageopen[4] = 1;
                  this.stagesave();
               }
            } else if (this.stagelevel == 1 && this.stageopenH[4] == 0) {
               this.stageopenH[4] = 1;
               this.stagesave();
            }
         }

         if (this.stagetime == 500) {
            this.eIn(95, -20, 12, 0, 5);
         }

         if (this.stagetime == 500) {
            this.eIn(this.migi + 10, 30, 13, -1, 5);
         }

         if (this.stagetime == 500) {
            this.eIn(this.migi + 10, 60, 13, -1, 5);
         }

         if (this.stagetime == 500) {
            this.eIn(-10, 30, 13, 1, 5);
         }

         if (this.stagetime == 500) {
            this.eIn(-10, 60, 13, 1, 5);
         }

         if (this.stagetime == 950) {
            effectIn(100.0F, 80.0F, 17, 1, 1, 0);
         }

         for (this.cyc = 0; this.cyc < 7; this.cyc++) {
            for (this.cyc2 = 1; this.cyc2 < 10; this.cyc2++) {
               if (this.stagetime == 1100 + this.cyc * 120 + this.cyc2) {
                  this.eIn(-15 + this.cyc2 * 24, -20, 3, 1, 1);
               }

               if (this.stagetime == 1100 + this.cyc * 120 + this.cyc2 + 60) {
                  this.eIn(this.migi + 15 - this.cyc2 * 24, -20, 3, -1, 1);
               }
            }

            if (this.stagetime == 1100 + this.cyc * 120) {
               this.eIn(-15, -20, 3, 1, 5);
            }

            if (this.stagetime == 1100 + this.cyc * 120 + 60) {
               this.eIn(this.migi + 15, -20, 3, -1, 5);
            }
         }

         if (this.stagetime == 1900) {
            this.eIn(-20, 0, 1000, 0, 0);
         }

         if (this.stagetime == 20250) {
            this.eIn(-20, 0, 1001, 0, 0);
         }

         if (this.stagetime == 20250) {
            effectIn(0.0F, 0.0F, 10, 0, 0, 10);
         }

         if (this.stagetime == 80100) {
            effectIn(900.0F, 0.0F, 29, 0, 0, 0);
         }

         if (this.stagetime > 80240 && this.stagetime < 80300) {
            if (this.volume - (this.stagetime - 80240) * 4 < 0) {
               this.player.setAttribute(4, 0);
            } else {
               this.player.setAttribute(4, this.volume - (this.stagetime - 80240) * 4);
            }
         }

         if (this.stagetime == 80300) {
            if (this.stagepractice != 0) {
               this.gamemode = 3;
            } else if (this.stagepractice == 0) {
               if (this.stagelevel == 0) {
                  if (this.stageopen[5] == 0) {
                     this.stageopen[5] = 1;
                     this.stagesave();
                  }
               } else if (this.stagelevel == 1 && this.stageopenH[5] == 0) {
                  this.stageopenH[5] = 1;
                  this.stagesave();
               }

               this.setSoftLabel(0, "");
               this.setSoftLabel(1, "");
               this.gamemode = 4;
               this.stagetime = 0;
               this.stagetime2 = 0;
               this.edflag = 0;
               if (peoplebomkind % 2 == 0) {
                  if (this.konnte == 0) {
                     this.stageopenH[6] = 1;
                     this.stagesave();
                     if (this.stagelevel == 0) {
                        this.highNsave(peoplebomkind);
                     }

                     if (this.stagelevel == 1) {
                        this.highHsave(peoplebomkind);
                     }

                     try {
                        MediaImage var72 = MediaManager.getImage("resource:///ED2.jpg");
                        var72.use();
                        this.titleimg[0] = var72.getImage();
                     } catch (Exception var16) {
                     }

                     try {
                        MediaImage var73 = MediaManager.getImage("resource:///ED3.jpg");
                        var73.use();
                        this.titleimg[1] = var73.getImage();
                     } catch (Exception var15) {
                     }
                  } else {
                     try {
                        MediaImage var74 = MediaManager.getImage("resource:///ED1.jpg");
                        var74.use();
                        this.titleimg[0] = var74.getImage();
                     } catch (Exception var14) {
                     }
                  }
               } else if (peoplebomkind % 2 == 1) {
                  if (this.konnte == 0) {
                     this.stageopenH[6] = 1;
                     this.stagesave();
                     if (this.stagelevel == 0) {
                        this.highNsave(peoplebomkind);
                     }

                     if (this.stagelevel == 1) {
                        this.highHsave(peoplebomkind);
                     }

                     try {
                        MediaImage var75 = MediaManager.getImage("resource:///ED5.jpg");
                        var75.use();
                        this.titleimg[0] = var75.getImage();
                     } catch (Exception var13) {
                     }

                     try {
                        MediaImage var76 = MediaManager.getImage("resource:///ED6.jpg");
                        var76.use();
                        this.titleimg[1] = var76.getImage();
                     } catch (Exception var12) {
                     }
                  } else {
                     try {
                        MediaImage var77 = MediaManager.getImage("resource:///ED4.jpg");
                        var77.use();
                        this.titleimg[0] = var77.getImage();
                     } catch (Exception var11) {
                     }
                  }
               }
            }
         }
      }

      if (this.stagemen == 6) {
         if (this.stagetime == 1) {
            try {
               MediaImage var78 = MediaManager.getImage("resource:///bgEX.jpg");
               var78.use();
               this.bgimg[0] = var78.getImage();
            } catch (Exception var10) {
            }

            try {
               MediaImage var79 = MediaManager.getImage("resource:///bg04.jpg");
               var79.use();
               this.bgimg[2] = var79.getImage();
            } catch (Exception var9) {
            }

            try {
               MediaImage var80 = MediaManager.getImage("resource:///bg05.JPG");
               var80.use();
               this.bgimg[1] = var80.getImage();
            } catch (Exception var8) {
            }

            try {
               MediaImage var81 = MediaManager.getImage("resource:///bg05.gif");
               var81.use();
               this.bgimg[3] = var81.getImage();
            } catch (Exception var7) {
            }

            try {
               MediaImage var82 = MediaManager.getImage("resource:///stand5.gif");
               var82.use();
               this.standimg[4] = var82.getImage();
            } catch (Exception var6) {
            }

            this.player.stop();

            try {
               MediaSound var83 = MediaManager.getSound("resource:///14.mld");
               var83.use();
               this.player = AudioPresenter.getAudioPresenter();
               this.player.setSound(var83);
               this.player.setMediaListener(this);
            } catch (Exception var5) {
            }

            this.player.setAttribute(4, this.volume);
            this.player.play();
            this.stagetime = 870;
            this.peoplehighscore[peoplebomkind] = this.peoplehighscore3[peoplebomkind];
            this.peoplepower = 0;
            this.peoplepoint = 3000;
            this.stageYmove = 4.5F;
         }

         for (this.cyc = 0; this.cyc < 12; this.cyc++) {
            if (this.stagetime == 910 + this.cyc * 13 + 6) {
               this.eIn(-10, 120, 1, 2, 2);
            }

            if (this.stagetime == 910 + this.cyc * 13) {
               this.eIn(this.migi + 10, 120, 1, -2, 2);
            }
         }

         if (this.stagetime == 1250) {
            effectIn(100.0F, 80.0F, 17, 1, 1, 0);
         }

         if (this.stagetime == 1400) {
            this.eIn(40, 0, 2, 0, 4);
         }

         if (this.stagetime == 1510) {
            this.eIn(this.migi - 40, 0, 2, 0, 4);
         }

         if (this.stagetime == 1620) {
            this.eIn(40, 0, 2, 0, 4);
         }

         if (this.stagetime == 1730) {
            this.eIn(this.migi - 40, 0, 2, 0, 4);
         }

         if (this.stagetime == 1840) {
            this.eIn(40, 0, 2, 0, 4);
         }

         if (this.stagetime == 1840) {
            this.eIn(this.migi - 40, 0, 2, 0, 4);
         }

         for (this.cyc = 0; this.cyc < 4; this.cyc++) {
            if (this.stagetime == 2000 + this.cyc * 30) {
               this.eIn(40 + (this.rand.nextInt() >>> 1) % 30, 0, 12, 2, 2);
            }

            if (this.stagetime == 2000 + this.cyc * 30) {
               this.eIn(this.migi - 40 - (this.rand.nextInt() >>> 1) % 30, 0, 12, -2, 2);
            }
         }

         for (this.cyc = 0; this.cyc < 10; this.cyc++) {
            if (this.stagetime == 2150 + this.cyc * 15) {
               this.eIn(-20, 90, 11, 2, 2);
            }

            if (this.stagetime == 2157 + this.cyc * 15) {
               this.eIn(this.migi + 20, 90, 11, -2, 2);
            }
         }

         for (this.cyc = 0; this.cyc < 10; this.cyc++) {
            if (this.stagetime == 2300 + this.cyc * 10) {
               this.eIn(-20, 40 + (this.rand.nextInt() >>> 1) % 30, 3, 1, 2);
            }

            if (this.stagetime == 2420 + this.cyc * 10) {
               this.eIn(this.migi + 20, 40 + (this.rand.nextInt() >>> 1) % 30, 3, -1, 2);
            }

            if (this.stagetime == 2540 + this.cyc * 10) {
               this.eIn(-20, 40 + (this.rand.nextInt() >>> 1) % 30, 3, 1, 2);
            }

            if (this.stagetime == 2660 + this.cyc * 10) {
               this.eIn(this.migi + 20, 40 + (this.rand.nextInt() >>> 1) % 30, 3, -1, 2);
            }
         }

         if (this.stagetime == 2420) {
            this.eIn(-20, 0, 5, 1, 2);
         }

         if (this.stagetime == 2300) {
            this.eIn(this.migi + 20, 0, 5, -1, 2);
         }

         if (this.stagetime == 2660) {
            this.eIn(-20, 0, 5, 1, 2);
         }

         if (this.stagetime == 2540) {
            this.eIn(this.migi + 20, 0, 5, -1, 2);
         }

         if (this.stagetime == 2900) {
            this.eIn(-20, 80, 1000, 0, 0);
         }

         if (this.stagetime == 2900) {
            effectIn(0.0F, 0.0F, 10, 0, 0, 13);
         }

         for (this.cyc = 0; this.cyc < 10; this.cyc++) {
            if (this.stagetime == 20100 + this.cyc * 30) {
               effectIn(50.0F, 80 + this.cyc % 3 * 10, 28, 0, 0, 11);
            }

            if (this.stagetime == 20100 + this.cyc * 30) {
               effectIn(this.migi - 50, 80 + this.cyc % 3 * 10, 28, 0, 0, 11);
            }
         }

         for (this.cyc = 0; this.cyc < 10; this.cyc++) {
            if (this.stagetime == 20550 + this.cyc * 10) {
               this.eIn(-20, 40 + (this.rand.nextInt() >>> 1) % 30, 6, 1, 2);
            }

            if (this.stagetime == 20670 + this.cyc * 10) {
               this.eIn(this.migi + 20, 40 + (this.rand.nextInt() >>> 1) % 30, 6, -1, 2);
            }

            if (this.stagetime == 20790 + this.cyc * 10) {
               this.eIn(-20, 40 + (this.rand.nextInt() >>> 1) % 30, 6, 1, 2);
            }

            if (this.stagetime == 20910 + this.cyc * 10) {
               this.eIn(this.migi + 20, 40 + (this.rand.nextInt() >>> 1) % 30, 6, -1, 2);
            }
         }

         if (this.stagetime == 20670) {
            this.eIn(-20, 0, 7, 1, 2);
         }

         if (this.stagetime == 20550) {
            this.eIn(this.migi + 20, 0, 7, -1, 2);
         }

         if (this.stagetime == 20910) {
            this.eIn(-20, 0, 7, 1, 2);
         }

         if (this.stagetime == 20790) {
            this.eIn(this.migi + 20, 0, 7, -1, 2);
         }

         for (this.cyc = 50; this.cyc < 60; this.cyc++) {
            if (this.stagetime == 20550 + this.cyc * 10) {
               this.eIn(-20, 40 + (this.rand.nextInt() >>> 1) % 30, 6, 1, 2);
            }

            if (this.stagetime == 20670 + this.cyc * 10) {
               this.eIn(this.migi + 20, 40 + (this.rand.nextInt() >>> 1) % 30, 6, -1, 2);
            }
         }

         if (this.stagetime == 21170) {
            this.eIn(-20, 0, 7, 1, 2);
         }

         if (this.stagetime == 21050) {
            this.eIn(this.migi + 20, 0, 7, -1, 2);
         }

         for (this.cyc = 0; this.cyc < 2; this.cyc++) {
            if (this.stagetime == 21350 + this.cyc * 25) {
               this.eIn(40 + (this.rand.nextInt() >>> 1) % 30, 0, 12, 2, 2);
            }

            if (this.stagetime == 21350 + this.cyc * 25) {
               this.eIn(this.migi - 40 - (this.rand.nextInt() >>> 1) % 30, 0, 12, -2, 2);
            }
         }

         for (this.cyc2 = 0; this.cyc2 < 3; this.cyc2++) {
            if (this.stagetime == 21500 + this.cyc2 * 200) {
               this.eIn(40, 0, 2, 0, 4);
            }

            for (this.cyc = 0; this.cyc < 7; this.cyc++) {
               if (this.stagetime == 21500 + this.cyc * 15 + this.cyc2 * 200) {
                  this.eIn(this.migi + 20, 90, 11, -2, 2);
               }
            }

            if (this.stagetime == 21600 + this.cyc2 * 200) {
               this.eIn(this.migi - 40, 0, 2, 0, 4);
            }

            for (this.cyc = 0; this.cyc < 7; this.cyc++) {
               if (this.stagetime == 21600 + this.cyc * 15 + this.cyc2 * 200) {
                  this.eIn(-20, 90, 11, 2, 2);
               }
            }
         }

         for (this.cyc = 0; this.cyc < 5; this.cyc++) {
            if (this.stagetime == 22150 + this.cyc * 25) {
               this.eIn(40 + (this.rand.nextInt() >>> 1) % 30, 0, 12, 2, 2);
            }

            if (this.stagetime == 22150 + this.cyc * 25) {
               this.eIn(this.migi - 40 - (this.rand.nextInt() >>> 1) % 30, 0, 12, -2, 2);
            }
         }

         for (this.cyc2 = 0; this.cyc2 < 3; this.cyc2++) {
            if (this.stagetime == 22300 + this.cyc2 * 100) {
               this.eIn(40, 0, 13, 0, 4);
            }

            if (this.stagetime == 22350 + this.cyc2 * 100) {
               this.eIn(this.migi - 40, 0, 13, 0, 4);
            }
         }

         for (this.cyc = 0; this.cyc < 5; this.cyc++) {
            if (this.stagetime == 22700 - 5 * this.cyc) {
               effectIn((this.rand.nextInt() >>> 1) % 40 + 40 * this.cyc, (this.rand.nextInt() >>> 1) % 20 + 80, 28, 0, 0, 11);
            }

            if (this.stagetime == 22700 + 5 * this.cyc) {
               effectIn((this.rand.nextInt() >>> 1) % 40 + 40 * this.cyc, (this.rand.nextInt() >>> 1) % 20 + 100, 28, 0, 0, 11);
            }
         }

         if (this.stagetime == 23100) {
            try {
               MediaImage var84 = MediaManager.getImage("resource:///bg15.JPG");
               var84.use();
               this.bgimg[1] = var84.getImage();
            } catch (Exception var4) {
            }

            try {
               MediaImage var85 = MediaManager.getImage("resource:///stand11.gif");
               var85.use();
               this.standimg[4] = var85.getImage();
            } catch (Exception var3) {
            }

            effectIn(0.0F, 0.0F, 10, 0, 0, 11);
            this.eIn(-20, 0, 1001, 0, 0);
         }

         if (this.stagetime == 80090) {
            effectIn(0.0F, 0.0F, 10, 0, 0, 12);
         }

         if (this.stagetime == 85001) {
            effectIn(900.0F, 0.0F, 29, 0, 0, 0);
         }

         if (this.stagetime > 85090 && this.keyEvent == 20) {
            this.highEsave(peoplebomkind);
            this.gamemode = 0;
            this.titlemode = 0;
            this.player.stop();

            try {
               MediaSound var86 = MediaManager.getSound("resource:///0.mld");
               var86.use();
               this.player = AudioPresenter.getAudioPresenter();
               this.player.setSound(var86);
               this.player.setMediaListener(this);
            } catch (Exception var2) {
            }

            this.player.setAttribute(4, this.volume);
            this.player.play();
            this.makefirst();
            this.stagetime = 0;
         }
      }
   }

   void stage1move(int var1) {
      if (this.emode[var1] == 1) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 1 * this.emuki[var1];
            this.eYmove[var1] = 6.0F;
            this.etairyoku[var1] = 1.0F;
         } else if (this.etime[var1] < 30) {
            this.eYmove[var1] = (float)(this.eYmove[var1] - 0.2);
         } else if (this.etime[var1] == 30) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 120) {
            this.eXmove[var1] = 1 * this.emuki[var1];
            this.eYmove[var1] = 1.0F;
         }

         if (this.etime[var1] == 35) {
            this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
            if (this.stagelevel == 0) {
               this.sh(this.eX[var1], this.eY[var1], 8, 6.0F, this.ehnum[var1], 0, 10, 0, 0, 1);
            } else if (this.stagelevel == 1) {
               for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 8, (float)(6.0 + 1.8 * this.cyc), this.ehnum[var1], 0, 10, 0, 0, 1);
               }
            }
         }
      } else if (this.emode[var1] == 2) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 3 * this.emuki[var1];
            this.eYmove[var1] = 0.0F;
            this.etairyoku[var1] = 1.0F;
            this.eshape[var1] = 0;
         } else if (this.etime[var1] < 31) {
            this.eXmove[var1] = (float)(this.eXmove[var1] - this.emuki[var1] * 0.1);
            this.eYmove[var1] = (float)(this.eYmove[var1] + 0.05);
         }

         if (this.etime[var1] == 15) {
            if (this.stagelevel == 0) {
               this.sh(this.eX[var1], this.eY[var1], 2, 2.0F, 0.0F, this.peopleX, this.peopleY, 0, 0, 1);
            }

            if (this.stagelevel == 1) {
               for (this.cyc = -1; this.cyc < 2; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 2, 3.0F, this.cyc * 15, this.peopleX, this.peopleY, 0, 0, 0);
               }
            }
         }
      } else if (this.emode[var1] == 3) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 1 * this.emuki[var1];
            this.eYmove[var1] = 6.0F;
            this.etairyoku[var1] = 1.0F;
         } else if (this.etime[var1] < 25) {
            this.eYmove[var1] = (float)(this.eYmove[var1] - 0.2);
         } else if (this.etime[var1] == 30) {
            this.eXmove[var1] = 1 * this.emuki[var1];
            this.eYmove[var1] = -3.0F;
         }

         if (this.etime[var1] == 20) {
            this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
            if (this.stagelevel == 0) {
               this.sh(this.eX[var1], this.eY[var1], 8, 6.0F, this.ehnum[var1], 0, 8, 0, 0, 1);
            }

            if (this.stagelevel == 1) {
               for (this.cyc = -1; this.cyc < 2; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 8, 9.0F, 15 * this.cyc + this.ehnum[var1], 0, 8, 0, 0, 1);
               }
            }
         }
      } else if (this.emode[var1] == 4) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 1 * this.emuki[var1];
            this.eYmove[var1] = 4.0F;
            this.etairyoku[var1] = 10.0F;
            this.eshape[var1] = 3;
         } else if (this.etime[var1] == 21) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 40) {
            this.eXmove[var1] = 1 * this.emuki[var1];
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 100) {
            this.eXmove[var1] = 2 * this.emuki[var1];
            this.eYmove[var1] = 0.0F;
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] == 40 || this.etime[var1] == 70) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

               for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 8, 4.5F, this.cyc * 30 + this.ehnum[var1], 0, 10, 0, 0, 1);
               }
            }
         } else if (this.stagelevel == 1 && (this.etime[var1] == 40 || this.etime[var1] == 55 || this.etime[var1] == 70 || this.etime[var1] == 85)) {
            this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

            for (this.cyc = 0; this.cyc < 15; this.cyc++) {
               this.sh(this.eX[var1], this.eY[var1], 8, 6.0F, this.cyc * 24 + this.ehnum[var1], 0, 10, 0, 0, 1);
            }
         }
      } else if (this.emode[var1] == 1000) {
         if (this.edoing[var1] == 0) {
            this.bosstairyoku = 80.0F;
            this.bosstimelim = 900;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               this.etairyoku[var1] = 10000.0F;
               this.bossmode = 1;
               this.eboss[var1] = 1;
               this.bossnum = var1;
               this.bossnokori = 3;
            } else if (this.etime[var1] == 31) {
               effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
               this.bossmahoujinn = 1;
            } else if (this.etime[var1] == 50) {
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
            } else if (this.etime[var1] == 100) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 1) {
            if (this.etime[var1] % 20 == 0) {
               this.getemove(var1, 10, 2);
            }

            if (this.etime[var1] % 20 == 10) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] % 10 == 1) {
               if (this.stagelevel == 0) {
                  for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                     this.sh(
                        this.eX[var1] + 40.0F * this.cos[this.eholdnumber[var1] % 3600],
                        this.eY[var1] + 40.0F * this.sin[this.eholdnumber[var1] % 3600],
                        1,
                        1.5F,
                        this.cyc * 60 + this.eholdnumber[var1],
                        -160,
                        20,
                        40,
                        1,
                        5
                     );
                  }

                  this.eholdnumber[var1] = this.eholdnumber[var1] + 430;
               } else if (this.stagelevel == 1) {
                  for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                     this.sh(
                        this.eX[var1] + 40.0F * this.cos[this.eholdnumber[var1] % 3600],
                        this.eY[var1] + 40.0F * this.sin[this.eholdnumber[var1] % 3600],
                        1,
                        1.5F,
                        this.cyc * 60 + this.eholdnumber[var1],
                        -160,
                        20,
                        40,
                        1,
                        1
                     );
                  }

                  this.eholdnumber[var1] = this.eholdnumber[var1] + 1800;

                  for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                     this.sh(
                        this.eX[var1] + 40.0F * this.cos[this.eholdnumber[var1] % 3600],
                        this.eY[var1] + 40.0F * this.sin[this.eholdnumber[var1] % 3600],
                        1,
                        1.5F,
                        this.cyc * 60 + this.eholdnumber[var1],
                        -160,
                        20,
                        40,
                        1,
                        5
                     );
                  }

                  this.eholdnumber[var1] = this.eholdnumber[var1] + 430;
               }
            }
         } else if (this.edoing[var1] == 2) {
            this.bosstairyoku = 150.0F;
            this.bosstimelim = 600;
            this.spelbonus = 5000;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 4, 0, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "       襲来「迫りくる大寒波」";
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 60) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 3) {
            if (this.stagelevel == 0) {
               if (this.etime[var1] % 20 == 1) {
                  for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                     this.sh(
                        this.eX[var1] + (this.rand.nextInt() >>> 1) % 120 - 60.0F,
                        this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F,
                        3,
                        2.0F,
                        this.cyc * 30,
                        30,
                        10,
                        40,
                        1,
                        1
                     );
                  }
               }

               if (this.etime[var1] % 60 == 0) {
                  for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 2, 2.0F, this.cyc * 60, this.peopleX, this.peopleY, 40, 6, 1);
                  }
               }
            } else if (this.stagelevel == 1) {
               if (this.etime[var1] % 20 == 1) {
                  for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                     this.sh(
                        this.eX[var1] + (this.rand.nextInt() >>> 1) % 120 - 60.0F,
                        this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F,
                        3,
                        2.0F,
                        this.cyc * 30,
                        30,
                        10,
                        40,
                        1,
                        1
                     );
                  }
               }

               if (this.etime[var1] % 20 == 11) {
                  for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                     this.sh(
                        this.eX[var1] + (this.rand.nextInt() >>> 1) % 120 - 60.0F,
                        this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F,
                        3,
                        2.0F,
                        this.cyc * 30,
                        30,
                        10,
                        40,
                        1,
                        1
                     );
                  }
               }

               if (this.etime[var1] % 60 == 0) {
                  for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 2, 3.0F, this.cyc * 60, this.peopleX, this.peopleY, 40, 6, 1);
                  }
               }
            }
         } else if (this.edoing[var1] == 4) {
            if (this.etime[var1] == 1) {
               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
               }

               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
               }

               this.bossmode = 0;
               effectIn(this.eX[var1], this.eY[var1], 777, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 4, 0, 0, 0);
               this.stagetime = 20000;
               this.bossmahoujinn = 0;
            }

            if (this.etime[var1] == 50) {
               this.eXmove[var1] = 2.0F;
               this.eYmove[var1] = -3.0F;
            }
         }
      } else if (this.emode[var1] == 1001) {
         if (this.edoing[var1] == 0) {
            this.bossnum = var1;
            this.bossnokori = 2;
            this.eX[var1] = this.migi + 10;
            this.eY[var1] = -10.0F;
            this.etairyoku[var1] = 10000.0F;
         } else if (this.edoing[var1] == 1) {
            if (this.etime[var1] == 1) {
               if (peoplebomkind == 1 || peoplebomkind == 3) {
                  this.player.stop();

                  try {
                     MediaSound var2 = MediaManager.getSound("resource:///2.mld");
                     var2.use();
                     this.player = AudioPresenter.getAudioPresenter();
                     this.player.setSound(var2);
                     this.player.setMediaListener(this);
                  } catch (Exception var4) {
                  }

                  this.player.setAttribute(4, this.volume);
                  this.player.play();
               }

               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
               this.bossmahoujinn = 1;
               effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
            } else if (this.etime[var1] == 31) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 50) {
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
            }
         } else if (this.edoing[var1] == 2) {
            this.bosstairyoku = 120.0F;
            this.bosstimelim = 900;
            if (this.etime[var1] != 1) {
               if (this.etime[var1] == 11) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               }
            } else {
               if (peoplebomkind == 0 || peoplebomkind == 2) {
                  this.player.stop();

                  try {
                     MediaSound var5 = MediaManager.getSound("resource:///2.mld");
                     var5.use();
                     this.player = AudioPresenter.getAudioPresenter();
                     this.player.setSound(var5);
                     this.player.setMediaListener(this);
                  } catch (Exception var3) {
                  }

                  this.player.setAttribute(4, this.volume);
                  this.player.play();
               }

               this.eXmove[var1] = (95.0F - this.eX[var1]) / 10.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 10.0F;
            }

            if (this.etime[var1] == 30) {
               this.bossmode = 1;
               this.eboss[var1] = 1;
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 3) {
            if (this.etime[var1] % 60 == 1) {
               this.getemove(var1, 20, 1);
            }

            if (this.etime[var1] % 60 == 20) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.stagelevel == 0) {
               if (this.etime[var1] % 30 == 1) {
                  for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 2, 2.0F, this.cyc * 36, this.peopleX, this.peopleY, 40, 0, 1);
                  }
               }

               if (this.etime[var1] % 60 == 31) {
                  for (this.cyc = 0; this.cyc < 24; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 7, 3.0F, this.cyc * 15, 0, 30, 50, 1, 1);
                  }
               }
            } else if (this.stagelevel == 1) {
               if (this.etime[var1] % 30 == 1) {
                  this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
               }

               if (this.etime[var1] % 10 == 1) {
                  for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 30 + this.ehnum[var1], this.peopleX, this.peopleY, 40, 0, 1);
                  }
               }

               if (this.etime[var1] % 60 == 31) {
                  for (this.cyc = 0; this.cyc < 24; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 7, 4.0F, this.cyc * 15, 0, 20, 50, 1, 1);
                  }
               }
            }
         } else if (this.edoing[var1] == 4) {
            this.bosstairyoku = 200.0F;
            this.bosstimelim = 900;
            this.spelbonus = 6000;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 4, 0, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "氷符「クリスタライズスノウ」";
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 50) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 5) {
            if (this.etime[var1] % 180 < 100) {
               if (this.stagelevel == 0) {
                  if (this.etime[var1] % 5 == 0) {
                     for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                        this.sh(
                           this.eX[var1] + (float)((100 - this.etime[var1] % 210) * Math.cos(this.eholdnumber[var1] * 13 * 3.1415 / 180.0)),
                           this.eY[var1] + (float)((100 - this.etime[var1] % 210) * Math.sin(this.eholdnumber[var1] * 13 * 3.1415 / 180.0)),
                           3,
                           2.0F,
                           this.cyc * 60 + this.eholdnumber[var1] + 90,
                           0,
                           8,
                           40,
                           1,
                           5
                        );
                     }
                  }

                  this.eholdnumber[var1]++;
               } else if (this.stagelevel == 1) {
                  if (this.etime[var1] % 5 == 0) {
                     for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                        this.sh(
                           this.eX[var1] + (float)((100 - this.etime[var1] % 210) * Math.cos(this.eholdnumber[var1] * 13 * 3.1415 / 180.0)),
                           this.eY[var1] + (float)((100 - this.etime[var1] % 210) * Math.sin(this.eholdnumber[var1] * 13 * 3.1415 / 180.0)),
                           3,
                           2.0F,
                           this.cyc * 60 + this.eholdnumber[var1] + 90,
                           0,
                           10,
                           40,
                           1,
                           5
                        );
                     }
                  }

                  if (this.etime[var1] % 5 == 0) {
                     for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                        this.sh(
                           this.eX[var1] + (float)((100 - this.etime[var1] % 210) * Math.cos(this.eholdnumber[var1] * 13 * 3.1415 / 180.0)),
                           this.eY[var1] + (float)((100 - this.etime[var1] % 210) * Math.sin(this.eholdnumber[var1] * 13 * 3.1415 / 180.0)),
                           3,
                           1.0F,
                           this.cyc * 60 + this.eholdnumber[var1] + 90,
                           0,
                           10,
                           40,
                           1,
                           5
                        );
                     }
                  }

                  this.eholdnumber[var1]++;
               }
            }
         } else if (this.edoing[var1] == 6) {
            this.bosstairyoku = 120.0F;
            this.bosstimelim = 1000;
            if (this.etime[var1] == 1) {
               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
               }

               for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
               }

               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 50) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 7) {
            if (this.etime[var1] % 30 == 1) {
               this.getemove(var1, 10, 3);
            }

            if (this.etime[var1] % 30 == 10) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.stagelevel == 0) {
               if (this.etime[var1] % 120 == 1 || this.etime[var1] % 120 == 31) {
                  for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 2, 2.0F, this.cyc * 30, this.peopleX, this.peopleY, 40, 0, 1);
                  }
               }

               if (this.etime[var1] % 120 == 61 || this.etime[var1] % 120 == 91) {
                  for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 7, 3.0F, this.cyc * 30, 0, 30, 50, 1, 1);
                  }
               }
            } else if (this.stagelevel == 1) {
               if (this.etime[var1] % 120 == 1 || this.etime[var1] % 120 == 21 || this.etime[var1] % 120 == 41) {
                  for (this.cyc = 0; this.cyc < 24; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 2, 2.0F, this.cyc * 15, this.peopleX, this.peopleY, 40, 0, 1);
                  }
               }

               if (this.etime[var1] % 120 == 61 || this.etime[var1] % 120 == 81 || this.etime[var1] % 120 == 101) {
                  for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 7, 4.0F, this.cyc * 30, 0, 20, 50, 1, 1);
                  }
               }
            }
         } else if (this.edoing[var1] == 8) {
            this.bosstairyoku = 180.0F;
            this.bosstimelim = 1200;
            this.spelbonus = 8000;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 4, 0, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "氷柱「アイシクルスライダ」";
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 50) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 9) {
            if (this.etime[var1] % 30 == 1) {
               this.getemove(var1, 20, 2);
            }

            if (this.etime[var1] % 30 == 20) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] % 30 == 20) {
               if (this.stagelevel == 1) {
                  for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 6, 2.0F, this.cyc * 180, 0, 30, 60, 1, 1);
                  }
               }

               this.sh(this.eX[var1], this.eY[var1], 6, 1.0F, -90.0F, 0, 30, 60, 1, 1);

               for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 2, 2.0F, this.cyc * 60, this.peopleX, this.peopleY, 40, 0, 1);
               }
            }
         } else if (this.edoing[var1] == 10) {
            if (this.etime[var1] == 1) {
               this.bossmode = 0;
               this.bossmahoujinn = 0;
               effectIn(this.eX[var1], this.eY[var1], 4, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 777, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
               this.stagetime = 50000;
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] == 30) {
               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
               }

               for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
               }

               effectIn(this.eX[var1], this.eY[var1], 4, 0, 0, 0);
               this.emode[var1] = 0;
            }
         }
      }
   }

   void e2move(int var1) {
      if (this.emode[var1] == 1) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 3 * this.emuki[var1];
            this.eYmove[var1] = 0.0F;
            this.etairyoku[var1] = 1.0F;
         } else if (this.etime[var1] < 30) {
            this.eXmove[var1] = (float)(this.eXmove[var1] - 0.15 * this.emuki[var1]);
            this.eYmove[var1] = (float)(this.eYmove[var1] - 0.1);
         } else if (this.etime[var1] == 30) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 70) {
            this.eXmove[var1] = 3 * this.emuki[var1];
            this.eYmove[var1] = -1.0F;
         }

         if (this.etime[var1] == 40) {
            this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] > 40 && this.etime[var1] < 50 && this.etime[var1] % 3 == 1) {
               for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 3.0F, this.ehnum[var1] + this.cyc * 60, 0, 0, 0, 2, 9);
               }
            }
         } else if (this.stagelevel == 1 && this.etime[var1] > 40 && this.etime[var1] < 60 && this.etime[var1] % 3 == 1) {
            for (this.cyc = 0; this.cyc < 12; this.cyc++) {
               this.sh(this.eX[var1], this.eY[var1], 1, 3.0F, this.ehnum[var1] + this.cyc * 30, 0, 0, 0, 2, 9);
            }
         }
      } else if (this.emode[var1] == 2) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 3 * this.emuki[var1];
            this.eYmove[var1] = 3.0F;
            this.etairyoku[var1] = 500.0F;
            this.eshape[var1] = 3;
         } else if (this.etime[var1] == 30) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 150) {
            this.etairyoku[var1] = 1.0F;
         } else if (this.etime[var1] == 300) {
            this.eYmove[var1] = -2.0F;
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] > 60 && this.etime[var1] % 4 == 1 && this.etime[var1] % 40 < 20) {
               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  this.sh(
                     this.eX[var1],
                     this.eY[var1],
                     1,
                     (float)(1.0 + 0.1 * (this.eholdnumber[var1] % 5)),
                     -this.eholdnumber[var1] * 21 + this.cyc * 45,
                     -3,
                     20,
                     50,
                     2,
                     11
                  );
               }

               this.eholdnumber[var1]++;
            }

            if (this.etime[var1] > 60 && this.etime[var1] % 4 == 1 && this.etime[var1] % 40 > 19) {
               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  this.sh(
                     this.eX[var1],
                     this.eY[var1],
                     1,
                     (float)(1.0 + 0.1 * (this.eholdnumber[var1] % 6)),
                     this.eholdnumber[var1] * 21 + this.cyc * 45,
                     -3,
                     20,
                     50,
                     2,
                     1
                  );
               }

               this.eholdnumber[var1]++;
            }
         } else if (this.stagelevel == 1) {
            if (this.etime[var1] > 60 && this.etime[var1] % 2 == 1 && this.etime[var1] % 40 < 20) {
               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  this.sh(
                     this.eX[var1],
                     this.eY[var1],
                     1,
                     (float)(1.0 + 0.1 * (this.eholdnumber[var1] % 10)),
                     -this.eholdnumber[var1] * 13 + this.cyc * 45,
                     -3,
                     20,
                     50,
                     2,
                     11
                  );
               }

               this.eholdnumber[var1]++;
            }

            if (this.etime[var1] > 60 && this.etime[var1] % 2 == 1 && this.etime[var1] % 40 > 19) {
               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  this.sh(
                     this.eX[var1],
                     this.eY[var1],
                     1,
                     (float)(1.0 + 0.1 * (this.eholdnumber[var1] % 10)),
                     this.eholdnumber[var1] * 13 + this.cyc * 45,
                     -3,
                     20,
                     50,
                     2,
                     1
                  );
               }

               this.eholdnumber[var1]++;
            }
         }
      } else if (this.emode[var1] == 3) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 2 * this.emuki[var1];
            this.eYmove[var1] = 0.0F;
            this.etairyoku[var1] = 1.0F;
         } else if (this.etime[var1] == 20) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = -1.0F;
         } else if (this.etime[var1] == 30) {
            this.eXmove[var1] = 3 * this.emuki[var1];
            this.eYmove[var1] = -1.0F;
         }

         if (this.etime[var1] == 20) {
            this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
         }

         if (this.etime[var1] == 20) {
            if (this.stagelevel == 0) {
               for (this.cyc2 = 0; this.cyc2 < 6; this.cyc2++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 3.0F, this.ehnum[var1] + this.cyc2 * 60, 0, 0, 0, 5, 1);
               }
            }

            if (this.stagelevel == 1) {
               for (this.cyc2 = 0; this.cyc2 < 12; this.cyc2++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 3.0F, this.ehnum[var1] + this.cyc2 * 30, 0, 0, 0, 6, 1);
               }
            }
         }
      } else if (this.emode[var1] == 4) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 5.0F;
            this.etairyoku[var1] = 8.0F;
            this.eshape[var1] = 1;
         } else if (this.etime[var1] == 20) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 60) {
            this.eXmove[var1] = 1 * this.emuki[var1];
            this.eYmove[var1] = -3.0F;
         }

         if (this.etime[var1] == 30) {
            this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
         }

         if (this.etime[var1] == 30) {
            if (this.stagelevel == 0) {
               for (this.cyc = 0; this.cyc < 30; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 3, (float)(1.5 + this.cyc % 10 * 0.2), -16.0F + this.ehnum[var1] + this.cyc * 12, 0, 15, 40, 0, 5);
               }

               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 3, 2.5F, this.ehnum[var1] + this.cyc * 72, 0, 15, 40, 5, 1);
               }
            } else if (this.stagelevel == 1) {
               for (this.cyc = 0; this.cyc < 45; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 3, (float)(1.5 + this.cyc % 9 * 0.2), -16.0F + this.ehnum[var1] + this.cyc * 8, 0, 15, 40, 0, 5);
               }

               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 3, 2.5F, this.ehnum[var1] + this.cyc * 72, 0, 15, 40, 5, 1);
               }
            }
         }

         if (this.stagelevel == 1) {
            if (this.etime[var1] == 60) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
            }

            if (this.etime[var1] == 60) {
               for (this.cyc = 0; this.cyc < 45; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 3, (float)(1.5 + this.cyc % 9 * 0.2), 16.0F - this.ehnum[var1] + this.cyc * 8, 0, 15, 40, 0, 5);
               }

               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 3, 2.5F, this.ehnum[var1] + this.cyc * 72, 0, 15, 40, 5, 1);
               }
            }
         }
      } else if (this.emode[var1] == 5) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 3 * this.emuki[var1];
            this.eYmove[var1] = 0.0F;
            this.etairyoku[var1] = 2.0F;
            this.eshape[var1] = 1;
         } else if (this.etime[var1] < 30) {
            this.eXmove[var1] = (float)(this.eXmove[var1] - 0.15 * this.emuki[var1]);
            this.eYmove[var1] = (float)(this.eYmove[var1] - 0.1);
         } else if (this.etime[var1] == 30) {
            this.eXmove[var1] = 2 * this.emuki[var1];
            this.eYmove[var1] = 0.0F;
            this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 10;
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] > 30 && this.etime[var1] % 30 == this.eholdnumber[var1]) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 90, 0, 0, 0, 5, 1);
               }
            }
         } else if (this.stagelevel == 1 && this.etime[var1] > 30 && this.etime[var1] % 10 == this.eholdnumber[var1]) {
            for (this.cyc = 0; this.cyc < 4; this.cyc++) {
               this.sh(this.eX[var1], this.eY[var1], 1, 3.0F, this.cyc * 90, 0, 0, 0, 5, 1);
            }
         }
      } else if (this.emode[var1] == 6) {
         if (this.etime[var1] == 1) {
            this.eholdnumber[var1] = 0;
            this.eholdnumber3[var1] = (int)this.eX[var1];
            this.ehnum[var1] = this.eY[var1];
            if (this.emuki[var1] > 0) {
               this.eholdnumber2[var1] = 1;
            }

            if (this.emuki[var1] < 0) {
               this.eholdnumber2[var1] = -1;
            }

            this.etairyoku[var1] = 2005.0F;
            this.eshape[var1] = 2;
         }

         if (this.etime[var1] < 10) {
            this.etairyoku[var1] = 2001.0F;
         }

         this.emuki[var1] = this.emuki[var1] + this.eholdnumber2[var1] * 2;
         this.eholdnumber[var1]++;
         if (this.etime[var1] < 10) {
            this.eholdnumber[var1] = this.eholdnumber[var1] + 2;
         }

         this.eX[var1] = (float)(this.eholdnumber3[var1] + this.eholdnumber[var1] * Math.cos(this.emuki[var1] * 3.1415 / 180.0));
         this.eY[var1] = (float)(this.ehnum[var1] + this.eholdnumber[var1] * Math.sin(this.emuki[var1] * 3.1415 / 180.0));
         if (this.etairyoku[var1] < 2000.0F) {
            if (this.stagelevel == 0) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
               this.sh(this.eX[var1], this.eY[var1], 8, 2.0F, this.ehnum[var1], 0, 2, 32, 0, 5);
            }

            if (this.stagelevel == 1) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 8, 2.0F, this.cyc * 72 + this.ehnum[var1], 0, 2, 32, 0, 5);
               }
            }

            this.etairyoku[var1] = -10.0F;
         }

         if (this.edoing[this.bossnum] != 5) {
            this.etairyoku[var1] = -10.0F;
         }

         if ((this.peopleX - this.eX[var1]) * (this.peopleX - this.eX[var1]) + (this.peopleY - this.eY[var1]) * (this.peopleY - this.eY[var1]) < 64.0F) {
            this.sh(this.peopleX, this.peopleY, 1, 0.0F, 0.0F, 0, 0, 0, -99, 0);
            this.etairyoku[var1] = -10.0F;
         }
      } else if (this.emode[var1] == 7) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 5 * this.emuki[var1];
            this.eYmove[var1] = 0.5F;
            this.etairyoku[var1] = 100.0F;
            this.eshape[var1] = 2;
            this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 20;
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] % 30 == this.eholdnumber[var1]) {
               this.ehnum[var1] = this.getkakudo(this.eX[this.bossnum], this.eY[this.bossnum], this.peopleX, this.peopleY);
               this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.ehnum[var1], 0, 20, 50, 1, 5);
            }
         } else if (this.stagelevel == 1 && this.etime[var1] % 20 == this.eholdnumber[var1]) {
            this.ehnum[var1] = this.getkakudo(this.eX[this.bossnum], this.eY[this.bossnum], this.peopleX, this.peopleY);
            this.sh(this.eX[var1], this.eY[var1], 1, 3.0F, this.ehnum[var1], 0, 20, 50, 1, 5);
         }

         if (this.edoing[this.bossnum] != 11) {
            this.etairyoku[var1] = -10.0F;
         }
      }
   }

   void kasatyuumove(int var1) {
      if (this.edoing[var1] == 0) {
         this.bosstairyoku = 100.0F;
         this.bosstimelim = 900;
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
            this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
            this.bossmahoujinn = 1;
            effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
            this.etairyoku[var1] = 10000.0F;
            this.bossmode = 1;
            effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
            this.eboss[var1] = 1;
            this.bossnum = var1;
            this.bossnokori = 4;
         } else if (this.etime[var1] == 31) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 50) {
            this.etime[var1] = 0;
            this.edoing[var1]++;
         }
      } else if (this.edoing[var1] == 1) {
         if (this.etime[var1] % 100 == 70) {
            this.getemove(var1, 20, 2);
         }

         if (this.etime[var1] % 100 == 90) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         }

         if (this.etime[var1] % 100 == 0) {
            this.eholdnumber[var1] = 0;
         }

         if (this.etime[var1] % 100 < 40 && this.etime[var1] % 1 == 0) {
            if (this.stagelevel == 0) {
               this.sh(
                  (float)(this.eX[var1] + (60 - this.etime[var1] % 100) * 0.5 * Math.cos((-90 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                  (float)(this.eY[var1] + (60 - this.etime[var1] % 100) * 0.5 * Math.sin((-90 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                  8,
                  2.0F,
                  -90 + this.eholdnumber[var1],
                  this.peopleX,
                  15,
                  40,
                  0,
                  5
               );
               this.eholdnumber[var1] = this.eholdnumber[var1] + 17;
               this.sh(
                  (float)(this.eX[var1] + (60 - this.etime[var1] % 100) * 0.5 * Math.cos((-90 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                  (float)(this.eY[var1] + (60 - this.etime[var1] % 100) * 0.5 * Math.sin((-90 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                  8,
                  2.0F,
                  -90 + this.eholdnumber[var1],
                  this.peopleX,
                  15,
                  40,
                  0,
                  5
               );
               this.eholdnumber[var1] = this.eholdnumber[var1] + 17;
            } else if (this.stagelevel == 1) {
               for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                  this.sh(
                     (float)(this.eX[var1] + (60 - this.etime[var1] % 100) * 0.5 * Math.cos((-90 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     (float)(this.eY[var1] + (60 - this.etime[var1] % 100) * 0.5 * Math.sin((-90 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     8,
                     2.5F,
                     -90 + this.cyc * 2 + this.eholdnumber[var1],
                     this.peopleX,
                     15,
                     40,
                     0,
                     5
                  );
               }

               this.eholdnumber[var1] = this.eholdnumber[var1] + 13;

               for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                  this.sh(
                     (float)(this.eX[var1] + (60 - this.etime[var1] % 100) * 0.5 * Math.cos((-90 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     (float)(this.eY[var1] + (60 - this.etime[var1] % 100) * 0.5 * Math.sin((-90 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     8,
                     2.5F,
                     -90 + this.cyc * 2 + this.eholdnumber[var1],
                     this.peopleX,
                     15,
                     40,
                     0,
                     5
                  );
               }

               this.eholdnumber[var1] = this.eholdnumber[var1] + 13;
            }
         }
      } else if (this.edoing[var1] == 2) {
         this.bosstairyoku = 150.0F;
         this.bosstimelim = 600;
         this.spelbonus = 8000;
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
            this.eYmove[var1] = (90.0F - this.eY[var1]) / 30.0F;
            effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
            effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
            effectIn(0.0F, 0.0F, 27, 180, 0, 0);
            effectIn(900.0F, 900.0F, 9, 4, 0, 0);
            effectIn(900.0F, 900.0F, 6, 0, 0, 0);
            if (this.stagelevel == 0) {
               this.spelname = "      驚雨「暴風雨の大空飛行」";
            }

            if (this.stagelevel == 1) {
               this.spelname = "          波動「ハドレー循環」";
            }

            this.etairyoku[var1] = 10000.0F;
         } else if (this.etime[var1] == 31) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 60) {
            this.etime[var1] = 0;
            this.edoing[var1]++;
         }
      } else if (this.edoing[var1] == 3) {
         if (this.stagelevel == 0) {
            if (this.etime[var1] % 5 == 1) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 60;

               for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 4, 2.5F, this.cyc * 60 + this.eholdnumber[var1], 2, 5, 60, 1, 1);
               }
            }

            if (this.etime[var1] > 60 && this.etime[var1] % 30 == 0) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 60;

               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  this.sh(25.0F, this.eX[var1], this.eY[var1], 4, 2.0F, this.cyc * 45 + this.eholdnumber[var1], 2, 5, 60, 5, 5);
               }
            }
         } else if (this.stagelevel == 1) {
            if (this.etime[var1] % 4 == 1) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 60;

               for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 4, 3.0F, this.cyc * 60 + this.eholdnumber[var1], 2, 5, 60, 1, 1);
               }
            }

            if (this.etime[var1] > 60 && this.etime[var1] % 30 == 0) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 60;

               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.sh(25.0F, this.eX[var1], this.eY[var1], 4, 2.5F, this.cyc * 36 + this.eholdnumber[var1], 2, 5, 60, 5, 5);
               }
            }
         }
      } else if (this.edoing[var1] == 4) {
         if (this.etime[var1] == 1) {
            for (this.cyc = 0; this.cyc < 10; this.cyc++) {
               this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
            }

            for (this.cyc = 0; this.cyc < 10; this.cyc++) {
               this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
            }

            this.bossmahoujinn = 0;
            this.bossmode = 0;
            this.bossmahoujinn = 0;
            effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
            effectIn(this.eX[var1], this.eY[var1], 4, 0, 0, 0);
            this.stagetime = 20000;
         }

         if (this.etime[var1] == 50) {
            this.eXmove[var1] = 2.0F;
            this.eYmove[var1] = -3.0F;
         }
      }
   }

   void kogasamove(int var1) {
      if (this.edoing[var1] == 0) {
         this.bossnum = var1;
         this.eX[var1] = this.migi + 15;
         this.eY[var1] = -10.0F;
         this.etairyoku[var1] = 10000.0F;
         this.bossnokori = 3;
      } else if (this.edoing[var1] == 1) {
         if (this.etime[var1] == 1) {
            this.bossmahoujinn = 1;
            effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
            this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
            this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
         } else if (this.etime[var1] == 31) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         }
      } else if (this.edoing[var1] == 2) {
         this.bosstairyoku = 100.0F;
         this.bosstimelim = 900;
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = (95.0F - this.eX[var1]) / 10.0F;
            this.eYmove[var1] = (100.0F - this.eY[var1]) / 10.0F;
            this.player.stop();

            try {
               MediaSound var2 = MediaManager.getSound("resource:///4.mld");
               var2.use();
               this.player = AudioPresenter.getAudioPresenter();
               this.player.setSound(var2);
               this.player.setMediaListener(this);
            } catch (Exception var3) {
            }

            this.player.setAttribute(4, this.volume);
            this.player.play();
         } else if (this.etime[var1] == 11) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         }

         if (this.etime[var1] == 30) {
            this.bossmode = 1;
            this.eboss[var1] = 1;
            this.etime[var1] = 0;
            this.edoing[var1]++;
         }
      } else if (this.edoing[var1] == 3) {
         if (this.etime[var1] % 100 == 70) {
            this.getemove(var1, 20, 2);
         }

         if (this.etime[var1] % 100 == 90) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         }

         if (this.etime[var1] % 100 == 0) {
            this.eholdnumber[var1] = 0;
         }

         if (this.etime[var1] % 100 < 40) {
            if (this.stagelevel == 0) {
               if (this.etime[var1] % 1 == 0) {
                  for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                     this.sh(
                        (float)(this.eX[var1] + (60 - this.etime[var1] % 100) * 0.5 * Math.cos((-90 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                        (float)(this.eY[var1] + (60 - this.etime[var1] % 100) * 0.5 * Math.sin((-90 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                        8,
                        2.0F,
                        -90 + this.cyc * 35 + this.eholdnumber[var1] - 90,
                        this.peopleX,
                        25,
                        35,
                        0,
                        1
                     );
                  }

                  this.eholdnumber[var1] = this.eholdnumber[var1] + 13;
               }
            } else if (this.stagelevel == 1 && this.etime[var1] % 1 == 0) {
               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.sh(
                     (float)(this.eX[var1] + (60 - this.etime[var1] % 100) * 0.5 * Math.cos((-90 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     (float)(this.eY[var1] + (60 - this.etime[var1] % 100) * 0.5 * Math.sin((-90 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     8,
                     2.5F,
                     this.cyc * 60 + this.eholdnumber[var1] - 90,
                     this.peopleX,
                     25,
                     35,
                     0,
                     1
                  );
               }

               this.eholdnumber[var1] = this.eholdnumber[var1] + 13;
            }
         }
      } else if (this.edoing[var1] == 4) {
         this.bosstairyoku = 150.0F;
         this.bosstimelim = 2700;
         this.spelbonus = 6000;
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
            this.eYmove[var1] = (90.0F - this.eY[var1]) / 30.0F;
            effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
            effectIn(0.0F, 0.0F, 27, 180, 0, 0);
            effectIn(900.0F, 900.0F, 9, 5, 1, 0);
            effectIn(900.0F, 900.0F, 6, 0, 0, 0);
            this.spelname = "      傘符「ﾊﾟﾗｿﾙｽﾀｰｽﾌﾟﾗｲﾂ」";
            this.etairyoku[var1] = 10000.0F;
         } else if (this.etime[var1] == 31) {
            effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 60) {
            this.etime[var1] = 0;
            this.edoing[var1]++;
         }
      } else if (this.edoing[var1] == 5) {
         if (this.etime[var1] % 120 == 1) {
            for (this.cyc = 1; this.cyc < 5; this.cyc++) {
               this.eIn((int)this.eX[var1], (int)this.eY[var1], 6, 90 * this.cyc, 0);
            }
         }

         if (this.etime[var1] % 120 == 31) {
            for (this.cyc = 1; this.cyc < 5; this.cyc++) {
               this.eIn((int)this.eX[var1], (int)this.eY[var1], 6, -90 * this.cyc, 0);
            }
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] % 4 == 1) {
               for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                  this.sh(
                     (float)(this.eX[var1] + 30.0 * Math.cos((-90 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     (float)(this.eY[var1] + 30.0 * Math.sin((-90 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     8,
                     2.5F,
                     -90 + this.cyc * 25 + this.eholdnumber[var1] - 90,
                     this.peopleX,
                     15,
                     40,
                     0,
                     1
                  );
               }

               this.eholdnumber[var1] = this.eholdnumber[var1] + 21;
            }
         } else if (this.stagelevel == 1 && this.etime[var1] % 2 == 1) {
            for (this.cyc = 0; this.cyc < 3; this.cyc++) {
               this.sh(
                  (float)(this.eX[var1] + 30.0 * Math.cos((-90 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                  (float)(this.eY[var1] + 30.0 * Math.sin((-90 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                  8,
                  2.5F,
                  -90 + this.cyc * 25 + this.eholdnumber[var1] - 90,
                  this.peopleX,
                  15,
                  40,
                  0,
                  1
               );
            }

            this.eholdnumber[var1] = this.eholdnumber[var1] + 13;
         }
      } else if (this.edoing[var1] == 6) {
         this.bosstairyoku = 100.0F;
         this.bosstimelim = 2700;
         if (this.etime[var1] == 1) {
            for (this.cyc = 0; this.cyc < 10; this.cyc++) {
               this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
            }

            for (this.cyc = 0; this.cyc < 3; this.cyc++) {
               this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
            }

            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
            effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
            this.etairyoku[var1] = 10000.0F;
         } else if (this.etime[var1] == 50) {
            this.etime[var1] = 0;
            this.edoing[var1]++;
         }
      } else if (this.edoing[var1] == 7) {
         if (this.etime[var1] % 100 == 70) {
            this.getemove(var1, 20, 2);
         }

         if (this.etime[var1] % 100 == 90) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] % 100 < 20 && this.etime[var1] % 2 == 1) {
               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  this.sh(
                     (float)(this.eX[var1] + (60 - this.etime[var1] % 100) * 0.5 * Math.cos((this.cyc * 30 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     (float)(this.eY[var1] + (60 - this.etime[var1] % 100) * 0.5 * Math.sin((this.cyc * 30 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     8,
                     2.5F,
                     this.cyc * 45 + this.eholdnumber[var1],
                     this.peopleX,
                     15,
                     40,
                     0,
                     4
                  );
               }

               this.eholdnumber[var1] = this.eholdnumber[var1] + 21;
            }

            if (this.etime[var1] % 100 > 40 && this.etime[var1] % 100 < 60 && this.etime[var1] % 2 == 1) {
               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  this.sh(
                     (float)(this.eX[var1] + (60 - this.etime[var1] % 100) * 0.5 * Math.cos((this.cyc * 30 - this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     (float)(this.eY[var1] + (60 - this.etime[var1] % 100) * 0.5 * Math.sin((this.cyc * 30 - this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     8,
                     2.5F,
                     this.cyc * 45 - this.eholdnumber[var1],
                     this.peopleX,
                     15,
                     40,
                     0,
                     4
                  );
               }

               this.eholdnumber[var1] = this.eholdnumber[var1] + 21;
            }
         } else if (this.stagelevel == 1) {
            if (this.etime[var1] % 100 < 20 && this.etime[var1] % 2 == 1) {
               for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                  this.sh(
                     (float)(this.eX[var1] + (60 - this.etime[var1] % 100) * 0.5 * Math.cos((this.cyc * 30 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     (float)(this.eY[var1] + (60 - this.etime[var1] % 100) * 0.5 * Math.sin((this.cyc * 30 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     8,
                     3.0F,
                     this.cyc * 30 + this.eholdnumber[var1],
                     this.peopleX,
                     15,
                     40,
                     0,
                     4
                  );
               }

               this.eholdnumber[var1] = this.eholdnumber[var1] + 21;
            }

            if (this.etime[var1] % 100 > 40 && this.etime[var1] % 100 < 60 && this.etime[var1] % 2 == 1) {
               for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                  this.sh(
                     (float)(this.eX[var1] + (100 - this.etime[var1] % 100) * 0.5 * Math.cos((this.cyc * 30 - this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     (float)(this.eY[var1] + (100 - this.etime[var1] % 100) * 0.5 * Math.sin((this.cyc * 30 - this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     8,
                     3.0F,
                     this.cyc * 30 - this.eholdnumber[var1],
                     this.peopleX,
                     15,
                     40,
                     0,
                     4
                  );
               }

               this.eholdnumber[var1] = this.eholdnumber[var1] + 21;
            }
         }

         if (this.etime[var1] % 100 == 80) {
            effectIn(this.eX[var1], this.eY[var1], 777, 0, 0, 0);
         }
      } else if (this.edoing[var1] == 8) {
         this.bosstairyoku = 150.0F;
         this.bosstimelim = 2700;
         this.spelbonus = 8000;
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
            this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
            effectIn(0.0F, 0.0F, 27, 180, 0, 0);
            effectIn(900.0F, 900.0F, 9, 4, 0, 0);
            effectIn(900.0F, 900.0F, 6, 0, 0, 0);
            if (this.stagelevel == 0) {
               this.spelname = "    雨空「レインアンブレラ」";
            }

            if (this.stagelevel == 1) {
               this.spelname = "        宝具「伝説の雨傘」";
            }

            this.etairyoku[var1] = 10000.0F;
         } else if (this.etime[var1] == 31) {
            effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 60) {
            this.etime[var1] = 0;
            this.edoing[var1]++;
         }
      } else if (this.edoing[var1] == 9) {
         if (this.stagelevel == 1) {
            if (this.etime[var1] % 140 < 60 && this.etime[var1] % 2 == 1) {
               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  this.sh(
                     (float)(this.eX[var1] + (80 - this.etime[var1] % 140) * 0.5 * Math.cos((this.cyc * 45 - this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     (float)(this.eY[var1] + (80 - this.etime[var1] % 140) * 0.5 * Math.sin((this.cyc * 45 - this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     8,
                     3.0F,
                     this.cyc * 45 + this.eholdnumber[var1],
                     this.peopleX,
                     15,
                     35,
                     0,
                     5
                  );
               }

               this.eholdnumber[var1] = this.eholdnumber[var1] + 29;
            }

            if (this.etime[var1] % 140 > 60 && this.etime[var1] % 140 < 120 && this.etime[var1] % 2 == 1) {
               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  this.sh(
                     (float)(this.eX[var1] + (140 - this.etime[var1] % 140) * 0.5 * Math.cos((this.cyc * 45 - this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     (float)(this.eY[var1] + (80 - this.etime[var1] % 140) * 0.5 * Math.sin((this.cyc * 45 - this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     8,
                     3.0F,
                     this.cyc * 45 - this.eholdnumber[var1],
                     this.peopleX,
                     15,
                     35,
                     0,
                     1
                  );
               }

               this.eholdnumber[var1] = this.eholdnumber[var1] + 29;
            }
         } else if (this.stagelevel == 0) {
            if (this.etime[var1] % 140 == 0) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 360;
            }

            if (this.etime[var1] % 140 < 42 && this.etime[var1] % 3 == 1) {
               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  this.sh(
                     (int)((80 - this.etime[var1] % 140) * 0.5),
                     this.eX[var1],
                     this.eY[var1],
                     8,
                     3.0F,
                     this.cyc * 45 - this.eholdnumber[var1],
                     this.peopleX,
                     15,
                     0,
                     0,
                     5
                  );
               }

               if (this.etime[var1] % 280 < 60) {
                  this.eholdnumber[var1] = this.eholdnumber[var1] + 31;
               }

               if (this.etime[var1] % 280 > 60) {
                  this.eholdnumber[var1] = this.eholdnumber[var1] - 31;
               }
            }

            if (this.etime[var1] % 140 > 60 && this.etime[var1] % 140 < 110 && this.etime[var1] % 3 == 1) {
               if (this.peopleY > 119) {
                  for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                     this.sh(
                        (int)((180 - this.etime[var1] % 140) * 0.3),
                        this.eX[var1],
                        this.eY[var1],
                        42,
                        3.0F,
                        this.cyc * 45 - this.eholdnumber[var1],
                        1,
                        15,
                        0,
                        0,
                        1
                     );
                  }
               }

               if (this.peopleY < 120) {
                  for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                     this.sh(
                        (int)((180 - this.etime[var1] % 140) * 0.3),
                        this.eX[var1],
                        this.eY[var1],
                        42,
                        4.0F,
                        this.cyc * 45 - this.eholdnumber[var1],
                        -1,
                        15,
                        0,
                        0,
                        1
                     );
                  }
               }

               this.eholdnumber[var1] = this.eholdnumber[var1] + 31;
            }
         }
      } else if (this.edoing[var1] == 10) {
         this.bosstairyoku = 250.0F;
         this.bosstimelim = 2700;
         this.spelbonus = 10000;
         if (this.etime[var1] == 1) {
            for (this.cyc = 0; this.cyc < 10; this.cyc++) {
               this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
            }

            for (this.cyc = 0; this.cyc < 3; this.cyc++) {
               this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
            }

            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 61) {
            this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
            this.eYmove[var1] = (120.0F - this.eY[var1]) / 30.0F;
            this.bossspel = 1;
            effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
            effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
            effectIn(0.0F, 0.0F, 27, 180, 0, 0);
            effectIn(900.0F, 900.0F, 9, 4, 0, 0);
            effectIn(900.0F, 900.0F, 6, 0, 0, 0);
            this.spelname = "        戦争「置き傘一斉蜂起」";
            this.etairyoku[var1] = 10000.0F;
         } else if (this.etime[var1] == 91) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 100) {
            this.etime[var1] = 0;
            this.edoing[var1]++;
         }
      } else if (this.edoing[var1] == 11) {
         if (this.etime[var1] % 10 == 1) {
            for (this.cyc = 0; this.cyc < 3; this.cyc++) {
               this.eIn(this.migi + 10 + this.cyc * 3, -10 + this.cyc * 40 + (this.rand.nextInt() >>> 1) % 30, 7, -1, 0);
            }
         }

         if (this.etime[var1] % 120 == 0) {
            for (this.cyc2 = 0; this.cyc2 < 5; this.cyc2++) {
               for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 2, (float)(1.0 + this.cyc2 * 0.5), this.cyc * 30, this.peopleX, this.peopleY, 40, 2, 2);
               }
            }
         }
      } else if (this.edoing[var1] == 12) {
         if (this.etime[var1] == 1) {
            this.bossmode = 0;
            effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
            this.stagetime = 50000;
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         }

         if (this.etime[var1] == 30) {
            for (this.cyc = 0; this.cyc < 10; this.cyc++) {
               this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
            }

            for (this.cyc = 0; this.cyc < 3; this.cyc++) {
               this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
            }

            this.bossmahoujinn = 0;
            this.emode[var1] = 0;
         }
      }
   }

   void stage3move(int var1) {
      if (this.emode[var1] == 1) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 6.0F;
            this.etairyoku[var1] = 10.0F;
            this.eshape[var1] = 1;
         } else if (this.etime[var1] < 30) {
            this.eYmove[var1] = (float)(this.eYmove[var1] - 0.2);
         } else if (this.etime[var1] == 30) {
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 60) {
            this.eYmove[var1] = 3.0F;
         }

         if (this.etime[var1] == 30) {
            if (this.stagelevel == 0) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

               for (this.cyc = 0; this.cyc < 24; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, 15 * this.cyc + this.ehnum[var1], 0, 20, 20, 0, 1);
               }

               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.sh(
                     this.eX[var1],
                     this.eY[var1],
                     1,
                     (float)(1.2 + (this.rand.nextInt() >>> 1) % 10 * 0.1),
                     36 * this.cyc + (this.rand.nextInt() >>> 1) % 20,
                     0,
                     20,
                     0,
                     1,
                     0
                  );
               }
            } else if (this.stagelevel == 1) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

               for (this.cyc = 0; this.cyc < 24; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 3.0F, 15 * this.cyc + this.ehnum[var1], 0, 20, 20, 0, 1);
               }

               for (this.cyc = 0; this.cyc < 20; this.cyc++) {
                  this.sh(
                     this.eX[var1],
                     this.eY[var1],
                     1,
                     (float)(1.5 + (this.rand.nextInt() >>> 1) % 15 * 0.1),
                     18 * this.cyc + (this.rand.nextInt() >>> 1) % 20,
                     0,
                     20,
                     0,
                     1,
                     0
                  );
               }
            }
         }
      } else if (this.emode[var1] == 2) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 3 * this.emuki[var1];
            this.eYmove[var1] = 0.0F;
            this.etairyoku[var1] = 3.0F;
         } else if (this.etime[var1] < 30) {
            this.eXmove[var1] = (float)(this.eXmove[var1] - 0.1 * this.emuki[var1]);
            this.eYmove[var1] = (float)(this.eYmove[var1] - 0.1);
         }

         if (this.etime[var1] == 30) {
            if (this.stagelevel == 0) {
               this.sh(this.eX[var1], this.eY[var1], 2, 1.6F, 0.0F, this.peopleX, this.peopleY, 0, 0, 2);
               this.sh(this.eX[var1], this.eY[var1], 2, 2.0F, 0.0F, this.peopleX, this.peopleY, 0, 0, 2);
            } else if (this.stagelevel == 1) {
               for (this.cyc = -2; this.cyc < 3; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 2, 2.6F, this.cyc * 25, this.peopleX, this.peopleY, 0, 0, 2);
               }

               for (this.cyc = -2; this.cyc < 3; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 2, 3.0F, this.cyc * 25, this.peopleX, this.peopleY, 0, 0, 2);
               }
            }
         }
      } else if (this.emode[var1] == 3) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 5 * this.emuki[var1];
            this.eYmove[var1] = 0.0F;
            this.etairyoku[var1] = 1.0F;
         } else if (this.etime[var1] > 30 && this.etime[var1] < 42) {
            this.eXmove[var1] = (float)(this.eXmove[var1] - 0.5 * this.emuki[var1]);
            this.eYmove[var1] = (float)(this.eYmove[var1] + 0.2);
         }

         if (this.etime[var1] == 10) {
            if (this.stagelevel == 0) {
               for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 2, 2.0F, this.cyc * 180, this.peopleX, this.peopleY, 50, 2, 5);
               }
            } else if (this.stagelevel == 1) {
               for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 2, 3.5F, this.cyc * 60 - 5 + (this.rand.nextInt() >>> 1) % 10, this.peopleX, this.peopleY, 50, 2, 5);
               }

               for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 2, 2.0F, this.cyc * 60 - 5 + (this.rand.nextInt() >>> 1) % 10, this.peopleX, this.peopleY, 50, 2, 5);
               }
            }
         }
      } else if (this.emode[var1] == 4) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 5.0F;
            this.etairyoku[var1] = 15.0F;
            this.eshape[var1] = 3;
         } else if (this.etime[var1] == 20) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 100) {
            this.eYmove[var1] = -2.0F;
         }

         if (this.etime[var1] == 30) {
            this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
            this.eholdnumber[var1] = 0;
            this.laserIn(this.eX[var1], this.eY[var1], 3, 3.0F, this.ehnum[var1], 5.0F, 80, 0, 0, 0);
            if (this.stagelevel == 1) {
               this.laserIn(this.eX[var1], this.eY[var1], 3, 3.0F, this.ehnum[var1] + 60.0F, 5.0F, 80, 0, 0, 0);
               this.laserIn(this.eX[var1], this.eY[var1], 3, 3.0F, this.ehnum[var1] - 60.0F, 5.0F, 80, 0, 0, 0);
            }
         }

         if (this.etime[var1] > 30 && this.etime[var1] < 90) {
            if (this.stagelevel == 0) {
               this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.ehnum[var1] + this.eholdnumber[var1] * 15, 0, 0, 0, 2, 1);
               this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.ehnum[var1] - this.eholdnumber[var1] * 15, 0, 0, 0, 2, 1);
            } else if (this.stagelevel == 1) {
               for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, (float)(2.0 + this.cyc * 0.5), this.ehnum[var1] + this.eholdnumber[var1] * 15, 0, 0, 0, 2, 1);
               }

               for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, (float)(2.0 + this.cyc * 0.5), this.ehnum[var1] - this.eholdnumber[var1] * 15, 0, 0, 0, 2, 1);
               }
            }

            this.eholdnumber[var1]++;
         }
      } else if (this.emode[var1] == 5) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 2.0F;
            this.eshape[var1] = 3;
         } else if (this.etime[var1] == 50) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
            this.eholdnumber[var1] = 90;
            this.eholdnumber2[var1] = 3;
         } else if (this.etime[var1] == 400) {
            this.eYmove[var1] = -1.0F;
         }

         if (this.etime[var1] < 300) {
            this.etairyoku[var1] = 15.0F;
         }

         if (this.etime[var1] > 60 && this.etime[var1] < 400) {
            this.eholdnumber[var1] = this.eholdnumber[var1] + this.eholdnumber2[var1];
            this.eholdnumber2[var1] = this.eholdnumber2[var1] + this.eholdnumber3[var1];
            this.eholdnumber3[var1] = 6;
            if (this.stagelevel == 0) {
               for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                  if (this.stagetime % 2 == 0) {
                     this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 120 + this.eholdnumber[var1] / 50, 1, 35, 115, 2, 2);
                  }
               }

               if (this.etime[var1] % 90 == 0) {
                  for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 2, 1.5F, this.cyc * 60, this.peopleX, this.peopleY, 0, 6, 2);
                  }
               }
            } else if (this.stagelevel == 1) {
               for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 3.0F, this.cyc * 120 + this.eholdnumber[var1] / 50, 1, 35, 115, 2, 2);
               }

               if (this.etime[var1] % 60 == 0) {
                  for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 2, 2.0F, this.cyc * 60, this.peopleX, this.peopleY, 0, 6, 2);
                  }
               }
            }
         }
      }
   }

   void tengutyuumove(int var1) {
      if (this.edoing[var1] == 0) {
         this.bosstairyoku = 100.0F;
         this.bosstimelim = 900;
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = (95.0F - this.eX[var1]) / 10.0F;
            this.eYmove[var1] = (100.0F - this.eY[var1]) / 10.0F;
            this.bossmahoujinn = 1;
            effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
            effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
            this.etairyoku[var1] = 10000.0F;
            this.bossmode = 1;
            this.eboss[var1] = 1;
            this.bossnum = var1;
            this.bossnokori = 4;
         } else if (this.etime[var1] == 11) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 30) {
            this.etime[var1] = 0;
            this.edoing[var1]++;
         }
      } else if (this.edoing[var1] == 1) {
         if (this.etime[var1] % 120 == 60) {
            this.getemove(var1, 20, 2);
         }

         if (this.etime[var1] % 120 == 80) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         }

         if (this.etime[var1] % 120 == 0) {
            this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 90;
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] % 120 < 30 && this.etime[var1] % 3 == 0) {
               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 4, 3.0F, this.cyc * 45 + this.eholdnumber[var1] * 4, -5, 15, 25, 2, 2);
               }

               this.eholdnumber[var1]++;
            }

            if (this.etime[var1] % 120 > 30 && this.etime[var1] % 120 < 60 && this.etime[var1] % 3 == 0) {
               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 4, 3.0F, this.cyc * 45 - this.eholdnumber[var1] * 4, 5, 15, 25, 2, 1);
               }

               this.eholdnumber[var1]++;
            }
         } else if (this.stagelevel == 1) {
            if (this.etime[var1] % 120 < 30 && this.etime[var1] % 3 == 0) {
               for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 4, 3.0F, this.cyc * 30 + this.eholdnumber[var1] * 3, -5, 15, 25, 2, 2);
               }

               this.eholdnumber[var1]++;
            }

            if (this.etime[var1] % 120 > 30 && this.etime[var1] % 120 < 60 && this.etime[var1] % 3 == 0) {
               for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 4, 3.0F, this.cyc * 30 - this.eholdnumber[var1] * 3, 5, 15, 25, 2, 1);
               }

               this.eholdnumber[var1]++;
            }
         }
      } else if (this.edoing[var1] == 2) {
         this.bosstairyoku = 150.0F;
         this.bosstimelim = 600;
         this.spelbonus = 8000;
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
            this.eYmove[var1] = (90.0F - this.eY[var1]) / 30.0F;
            effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
            effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
            effectIn(900.0F, 900.0F, 9, 6, 0, 0);
            effectIn(900.0F, 900.0F, 6, 0, 0, 0);
            if (this.stagelevel == 0) {
               this.spelname = "      風符「天狗道の開風」";
            }

            if (this.stagelevel == 1) {
               this.spelname = "旋風「サルタ・エアライン」";
            }

            this.etairyoku[var1] = 10000.0F;
         } else if (this.etime[var1] == 31) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 60) {
            this.etime[var1] = 0;
            this.edoing[var1]++;
         }
      } else if (this.edoing[var1] == 3) {
         if (this.etime[var1] % 120 == 80) {
            this.getemove(var1, 20, 2);
         }

         if (this.etime[var1] % 120 == 100) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
            effectIn(this.eX[var1], this.eY[var1], 777, 0, 0, 0);
         }

         this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
         if (this.etime[var1] % 120 == 1) {
            if (this.stagelevel == 0) {
               this.sh(this.eX[var1], this.eY[var1], 1, 3.0F, this.ehnum[var1], 0, 29, 40, 6, 1);
               this.sh(this.eX[var1], this.eY[var1], 10, 4.0F, this.ehnum[var1] + 60.0F, 0, 29, 40, 6, 1);
               this.sh(this.eX[var1], this.eY[var1], 10, 4.0F, this.ehnum[var1] - 60.0F, 0, 29, 40, 6, 1);
            } else if (this.stagelevel == 1) {
               this.sh(this.eX[var1], this.eY[var1], 10, 4.0F, this.ehnum[var1], 0, 29, 40, 6, 1);
               this.sh(this.eX[var1], this.eY[var1], 10, 4.0F, this.ehnum[var1] + 120.0F, 0, 29, 40, 6, 1);
               this.sh(this.eX[var1], this.eY[var1], 10, 4.0F, this.ehnum[var1] - 120.0F, 0, 29, 40, 6, 1);
            }
         }
      } else if (this.edoing[var1] == 4) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
            this.bossmahoujinn = 0;
            this.bossmode = 0;
            effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
            effectIn(this.eX[var1], this.eY[var1], 4, 0, 0, 0);
            this.stagetime = 20000;
         }

         if (this.etime[var1] == 50) {
            for (this.cyc = 0; this.cyc < 10; this.cyc++) {
               this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
            }

            for (this.cyc = 0; this.cyc < 5; this.cyc++) {
               this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
            }

            this.eXmove[var1] = 2.0F;
            this.eYmove[var1] = -3.0F;
         }
      }
   }

   void tengumove(int var1) {
      if (this.edoing[var1] == 0) {
         this.bossmahoujinn = 0;
         this.bossnokori = 3;
         this.bossnum = var1;
         this.eX[var1] = this.migi + 15;
         this.eY[var1] = -10.0F;
         this.etairyoku[var1] = 10000.0F;
      } else if (this.edoing[var1] == 1) {
         if (peoplebomkind % 2 == 1) {
            if (this.etime[var1] == 1) {
               effectIn(100.0F, 100.0F, 77, 0, 0, 0);
            }

            if (this.etime[var1] == 31) {
               effectIn(0.0F, 0.0F, 12, 30, 0, 0);

               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  effectIn((this.rand.nextInt() >>> 1) % 200, (this.rand.nextInt() >>> 1) % 240, 16, 0, 0, 1);
               }
            }
         }

         if (peoplebomkind % 2 == 0) {
            this.etime[var1] = 0;
            this.edoing[var1]++;
         }
      } else if (this.edoing[var1] == 2) {
         if (this.etime[var1] == 1) {
            this.bossmahoujinn = 1;
            if (peoplebomkind == 0 || peoplebomkind == 2) {
               this.player.stop();

               try {
                  MediaSound var2 = MediaManager.getSound("resource:///6.mld");
                  var2.use();
                  this.player = AudioPresenter.getAudioPresenter();
                  this.player.setSound(var2);
                  this.player.setMediaListener(this);
               } catch (Exception var4) {
               }

               effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
               this.player.setAttribute(4, this.volume);
               this.player.play();
            }

            this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
            this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
         } else if (this.etime[var1] == 31) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         }
      } else if (this.edoing[var1] == 3) {
         this.bosstairyoku = 90.0F;
         this.bosstimelim = 900;
         if (this.etime[var1] != 1) {
            if (this.etime[var1] == 11) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }
         } else {
            if (peoplebomkind == 1 || peoplebomkind == 3) {
               this.player.stop();

               try {
                  MediaSound var5 = MediaManager.getSound("resource:///6.mld");
                  var5.use();
                  this.player = AudioPresenter.getAudioPresenter();
                  this.player.setSound(var5);
                  this.player.setMediaListener(this);
               } catch (Exception var3) {
               }

               effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
               this.player.setAttribute(4, this.volume);
               this.player.play();
            }

            this.eXmove[var1] = (95.0F - this.eX[var1]) / 10.0F;
            this.eYmove[var1] = (100.0F - this.eY[var1]) / 10.0F;
         }

         if (this.etime[var1] == 30) {
            this.bossmode = 1;
            this.eboss[var1] = 1;
            this.etime[var1] = 0;
            this.edoing[var1]++;
         }
      } else if (this.edoing[var1] == 4) {
         if (this.etime[var1] % 60 == 0) {
            this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 90;
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] % 40 < 20 && this.etime[var1] % 3 == 0) {
               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 4, 2.0F, this.cyc * 45 + this.eholdnumber[var1], -6, 15, 25, 2, 0);
               }

               this.eholdnumber[var1]++;
            }

            if (this.etime[var1] % 40 > 20 && this.etime[var1] % 3 == 0) {
               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 4, 2.0F, this.cyc * 45 - this.eholdnumber[var1], 6, 15, 25, 2, 5);
               }

               this.eholdnumber[var1]++;
            }
         } else if (this.stagelevel == 1) {
            if (this.etime[var1] % 40 < 20 && this.etime[var1] % 3 == 0) {
               for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 4, 3.0F, this.cyc * 30 + this.eholdnumber[var1], -6, 15, 25, 2, 0);
               }

               this.eholdnumber[var1]++;
            }

            if (this.etime[var1] % 40 > 20 && this.etime[var1] % 3 == 0) {
               for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 4, 3.0F, this.cyc * 30 - this.eholdnumber[var1], 6, 15, 25, 2, 5);
               }

               this.eholdnumber[var1]++;
            }
         }
      } else if (this.edoing[var1] == 5) {
         this.bosstairyoku = 150.0F;
         this.bosstimelim = 1200;
         this.spelbonus = 12000;
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
            this.eYmove[var1] = (90.0F - this.eY[var1]) / 30.0F;
            effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
            effectIn(0.0F, 0.0F, 27, 180, 0, 0);
            effectIn(900.0F, 900.0F, 9, 6, 0, 0);
            effectIn(900.0F, 900.0F, 6, 0, 0, 0);
            if (this.stagelevel == 0) {
               this.spelname = "風符「鳳旋花」";
            }

            if (this.stagelevel == 1) {
               this.spelname = "風符「スパイラルパターン」";
            }

            this.etairyoku[var1] = 10000.0F;
         } else if (this.etime[var1] == 31) {
            effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 60) {
            this.etime[var1] = 0;
            this.edoing[var1]++;
         }
      } else if (this.edoing[var1] == 6) {
         if (this.etime[var1] % 90 == 60) {
            this.getemove(var1, 20, 2);
            this.eYmove[var1] = 0.0F;
         }

         if (this.etime[var1] % 90 == 80) {
            this.eXmove[var1] = 0.0F;
         }

         this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

         for (this.cyc2 = 0; this.cyc2 < 20; this.cyc2++) {
            if (this.etime[var1] % 200 == this.cyc2 * 2 + 1) {
               this.sh(this.eX[var1], this.eY[var1], 12, 4.0F, this.eholdnumber[var1] * 36 + this.ehnum[var1] - 180.0F, 3, 15, 16, 5, 1);
               this.eholdnumber[var1]++;
            }
         }

         for (this.cyc2 = 0; this.cyc2 < 20; this.cyc2++) {
            if (this.etime[var1] % 200 == 100 + this.cyc2 * 2 + 1) {
               this.sh(this.eX[var1], this.eY[var1], 13, 4.0F, this.eholdnumber[var1] * 36 - this.ehnum[var1] - 180.0F, 3, 15, 16, 5, 2);
               this.eholdnumber[var1]++;
            }
         }
      } else if (this.edoing[var1] == 7) {
         this.bosstairyoku = 150.0F;
         this.bosstimelim = 600;
         if (this.etime[var1] == 1) {
            for (this.cyc = 0; this.cyc < 10; this.cyc++) {
               this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
            }

            for (this.cyc = 0; this.cyc < 3; this.cyc++) {
               this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
            }

            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
            this.etairyoku[var1] = 10000.0F;
         } else if (this.etime[var1] == 60) {
            this.etime[var1] = 0;
            this.edoing[var1]++;
         }
      } else if (this.edoing[var1] == 8) {
         if (this.etime[var1] % 200 == 50) {
            this.getemove(var1, 10, 2);
         }

         if (this.etime[var1] % 200 == 60) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         }

         if (this.etime[var1] % 60 == 0) {
            this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 90;
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] % 60 < 30 && this.etime[var1] % 2 == 0) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 4, 2.0F, this.cyc * 90 + this.eholdnumber[var1] * 13, -14, 30, 35, 2, 5);
               }

               this.eholdnumber[var1]++;
            }

            if (this.etime[var1] % 60 > 30 && this.etime[var1] % 3 == 0) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 4, 2.0F, this.cyc * 90 - this.eholdnumber[var1] * 13, 14, 30, 35, 2, 1);
               }

               this.eholdnumber[var1]++;
            }
         } else if (this.stagelevel == 1) {
            if (this.etime[var1] % 60 < 30 && this.etime[var1] % 2 == 0) {
               for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 4, 2.0F, this.cyc * 60 + this.eholdnumber[var1] * 13, -14, 30, 35, 2, 5);
               }

               this.eholdnumber[var1]++;
            }

            if (this.etime[var1] % 60 > 30 && this.etime[var1] % 2 == 0) {
               for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 4, 2.0F, this.cyc * 60 - this.eholdnumber[var1] * 13, 14, 30, 35, 2, 1);
               }

               this.eholdnumber[var1]++;
            }
         }
      } else if (this.edoing[var1] == 9) {
         this.bosstairyoku = 150.0F;
         this.bosstimelim = 600;
         this.spelbonus = 12000;
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
            this.eYmove[var1] = (90.0F - this.eY[var1]) / 30.0F;
            effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
            effectIn(0.0F, 0.0F, 27, 180, 0, 0);
            effectIn(900.0F, 900.0F, 9, 6, 0, 0);
            effectIn(900.0F, 900.0F, 6, 0, 0, 0);
            if (this.stagelevel == 0) {
               this.spelname = "「妖怪エアロダイナミクス」";
            }

            if (this.stagelevel == 1) {
               this.spelname = "「飛行鬼雲」";
            }

            this.etairyoku[var1] = 10000.0F;
         } else if (this.etime[var1] == 31) {
            effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 60) {
            this.etime[var1] = 0;
            this.edoing[var1]++;
         }
      } else if (this.edoing[var1] == 10) {
         if (this.etime[var1] % 90 == 60) {
            this.getemove(var1, 20, 2);
            this.eYmove[var1] = 0.0F;
         }

         if (this.etime[var1] % 90 == 80) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         }

         this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
         if (this.etime[var1] == 1) {
            this.ehnum[var1] = 90.0F;
         }

         if (this.etime[var1] % 120 == 1) {
            this.sh(this.eX[var1], this.eY[var1], 11, 4.0F, this.ehnum[var1] + 90.0F, -150, 25, 40, 6, 1);
            this.sh(this.eX[var1], this.eY[var1], 11, 4.0F, this.ehnum[var1] - 90.0F, 150, 25, 50, 6, 1);
         }

         if (this.etime[var1] % 120 == 61) {
            this.sh(this.eX[var1], this.eY[var1], 11, 4.0F, this.ehnum[var1] + 150.0F, -150, 25, 40, 6, 1);
            this.sh(this.eX[var1], this.eY[var1], 11, 4.0F, this.ehnum[var1] - 150.0F, 150, 25, 40, 6, 1);
         }
      } else if (this.edoing[var1] == 11) {
         this.bosstairyoku = 150.0F;
         this.bosstimelim = 600;
         if (this.etime[var1] == 1) {
            for (this.cyc = 0; this.cyc < 10; this.cyc++) {
               this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
            }

            for (this.cyc = 0; this.cyc < 3; this.cyc++) {
               this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
            }

            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
            this.etairyoku[var1] = 10000.0F;
         } else if (this.etime[var1] == 60) {
            this.etime[var1] = 0;
            this.edoing[var1]++;
         }
      } else if (this.edoing[var1] == 12) {
         if (this.etime[var1] % 120 == 60) {
            this.getemove(var1, 10, 2);
         }

         if (this.etime[var1] % 120 == 70) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         }

         if (this.etime[var1] % 15 == 0) {
            this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 90;
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] % 30 < 15 && this.etime[var1] % 4 == 0) {
               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 4, 2.7F, this.cyc * 45 + this.eholdnumber[var1] * 2, -13, 15, 27, 2, 5);
               }

               this.eholdnumber[var1]++;
            }

            if (this.etime[var1] % 30 > 15 && this.etime[var1] % 4 == 0) {
               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 4, 2.7F, this.cyc * 45 - this.eholdnumber[var1] * 2, 13, 15, 27, 2, 1);
               }

               this.eholdnumber[var1]++;
            }
         } else if (this.stagelevel == 1) {
            if (this.etime[var1] % 30 < 10 && this.etime[var1] % 3 == 0) {
               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 4, 3.0F, this.cyc * 36 + this.eholdnumber[var1] * 2, -13, 15, 27, 2, 5);
               }

               this.eholdnumber[var1]++;
            }

            if (this.etime[var1] % 30 > 15 && this.etime[var1] % 30 < 25 && this.etime[var1] % 3 == 0) {
               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 4, 3.0F, this.cyc * 36 - this.eholdnumber[var1] * 2, 13, 15, 27, 2, 1);
               }

               this.eholdnumber[var1]++;
            }
         }
      } else if (this.edoing[var1] == 13) {
         this.bosstairyoku = 250.0F;
         this.bosstimelim = 2700;
         this.spelbonus = 15000;
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
            this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
            effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
            effectIn(0.0F, 0.0F, 27, 180, 0, 0);
            effectIn(900.0F, 900.0F, 9, 6, 0, 0);
            effectIn(900.0F, 900.0F, 6, 0, 0, 0);
            if (this.stagelevel == 0) {
               this.spelname = "旋符「空飛ぶ羽団扇」";
            }

            if (this.stagelevel == 1) {
               this.spelname = "旋魔「虹色の風」";
            }

            this.etairyoku[var1] = 10000.0F;
         } else if (this.etime[var1] == 31) {
            effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 70) {
            this.etime[var1] = 0;
            this.edoing[var1]++;
         }
      } else if (this.edoing[var1] == 14) {
         if (this.etime[var1] % 80 == 1) {
            this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 60;
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] % 80 == 1) {
               for (this.cyc2 = 0; this.cyc2 < 6; this.cyc2++) {
                  for (this.cyc = -3; this.cyc < 4; this.cyc++) {
                     this.sh(
                        (float)(this.eX[var1] + 40.0 * Math.cos((this.cyc2 * 60 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                        (float)(this.eY[var1] + 40.0 * Math.sin((this.cyc2 * 60 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                        3,
                        2.0F,
                        this.cyc2 * 60 + this.eholdnumber[var1] + this.cyc * 30,
                        150,
                        30,
                        40,
                        2,
                        0
                     );
                  }
               }
            }

            if (this.etime[var1] % 80 == 41) {
               this.eholdnumber[var1] = this.eholdnumber[var1] + 30;

               for (this.cyc2 = 0; this.cyc2 < 6; this.cyc2++) {
                  for (this.cyc = -2; this.cyc < 3; this.cyc++) {
                     this.sh(
                        (float)(this.eX[var1] + 10.0 * Math.cos((this.cyc2 * 60 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                        (float)(this.eY[var1] + 10.0 * Math.sin((this.cyc2 * 60 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                        3,
                        2.0F,
                        this.cyc2 * 60 + this.eholdnumber[var1] + this.cyc * 32,
                        -150,
                        20,
                        40,
                        2,
                        1
                     );
                  }
               }
            }

            if (this.etime[var1] % 40 == 20) {
               for (this.cyc2 = 0; this.cyc2 < 6; this.cyc2++) {
                  this.sh(this.eX[var1], this.eY[var1], 2, 2.0F, this.cyc2 * 60, this.peopleX, this.peopleY, 30, 5, 2);
               }

               this.eholdnumber2[var1]++;
            }

            if (this.etime[var1] % 80 == 41) {
               for (this.cyc2 = 0; this.cyc2 < 12; this.cyc2++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc2 * 30, this.peopleX, this.peopleY, 30, 2, 3);
               }

               this.eholdnumber2[var1]++;
            }
         } else if (this.stagelevel == 1) {
            if (this.etime[var1] % 80 == 1) {
               for (this.cyc2 = 0; this.cyc2 < 6; this.cyc2++) {
                  for (this.cyc = -6; this.cyc < 7; this.cyc++) {
                     this.sh(
                        (float)(this.eX[var1] + 40.0 * Math.cos((this.cyc2 * 60 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                        (float)(this.eY[var1] + 40.0 * Math.sin((this.cyc2 * 60 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                        3,
                        2.0F,
                        this.cyc2 * 60 + this.eholdnumber[var1] + this.cyc * 15,
                        150,
                        30,
                        40,
                        2,
                        0
                     );
                  }
               }
            }

            if (this.etime[var1] % 80 == 41) {
               this.eholdnumber[var1] = this.eholdnumber[var1] + 30;

               for (this.cyc2 = 0; this.cyc2 < 6; this.cyc2++) {
                  for (this.cyc = -5; this.cyc < 6; this.cyc++) {
                     this.sh(
                        (float)(this.eX[var1] + 10.0 * Math.cos((this.cyc2 * 60 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                        (float)(this.eY[var1] + 10.0 * Math.sin((this.cyc2 * 60 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                        3,
                        2.0F,
                        this.cyc2 * 60 + this.eholdnumber[var1] + this.cyc * 16,
                        -150,
                        20,
                        40,
                        2,
                        1
                     );
                  }
               }
            }

            if (this.etime[var1] % 40 == 20) {
               for (this.cyc2 = 0; this.cyc2 < 6; this.cyc2++) {
                  this.sh(this.eX[var1], this.eY[var1], 2, 2.0F, this.cyc2 * 60, this.peopleX, this.peopleY, 30, 6, 2);
               }

               this.eholdnumber2[var1]++;
            }

            if (this.etime[var1] % 80 == 41) {
               for (this.cyc2 = 0; this.cyc2 < 24; this.cyc2++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc2 * 15, this.peopleX, this.peopleY, 30, 2, 3);
               }

               this.eholdnumber2[var1]++;
            }
         }
      } else if (this.edoing[var1] == 15) {
         if (this.etime[var1] == 1) {
            this.bossmode = 0;
            effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
            this.stagetime = 50000;
            this.bossmahoujinn = 0;
         }

         if (this.etime[var1] == 30) {
            for (this.cyc = 0; this.cyc < 10; this.cyc++) {
               this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
            }

            for (this.cyc = 0; this.cyc < 5; this.cyc++) {
               this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
            }

            this.emode[var1] = 0;
         }
      }
   }

   void stage4move(int var1) {
      if (this.emode[var1] == 1) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = this.emuki[var1] * 5;
            this.eYmove[var1] = 0.25F;
            this.etairyoku[var1] = 20.0F;
            this.eshape[var1] = 1;
         } else if (this.etime[var1] > 25 && this.etime[var1] < 80) {
            this.eXmove[var1] = (float)(this.eXmove[var1] - this.emuki[var1] * 0.25);
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] > 5 && this.etime[var1] % 3 == 1) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 90 - this.eholdnumber[var1] * 17, 0, 20, 20, 0, 0);
               }

               this.eholdnumber[var1] = this.eholdnumber[var1] - this.emuki[var1];
            }
         } else if (this.stagelevel == 1 && this.etime[var1] > 5 && this.etime[var1] % 2 == 1) {
            for (this.cyc = 0; this.cyc < 4; this.cyc++) {
               this.sh(this.eX[var1], this.eY[var1], 1, 4.0F, this.cyc * 90 - this.eholdnumber[var1] * 17, 0, 20, 20, 0, 0);
            }

            this.eholdnumber[var1] = this.eholdnumber[var1] - this.emuki[var1];
         }
      } else if (this.emode[var1] == 2) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 3 * this.emuki[var1];
            this.eYmove[var1] = -1.0F;
            this.etairyoku[var1] = 10.0F;
            this.eshape[var1] = 3;
         } else if (this.etime[var1] == 20) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 50) {
            this.eYmove[var1] = -2.0F;
            this.eholdnumber[var1] = 90;
         }

         if (this.etime[var1] < 50) {
            this.etairyoku[var1] = 10.0F;
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] > 50) {
               this.sh(
                  (float)(this.eX[var1] + 30.0 * Math.cos(this.eholdnumber[var1] * 3.1415 / 180.0)),
                  (float)(this.eY[var1] + 30.0 * Math.sin(this.eholdnumber[var1] * 3.1415 / 180.0)),
                  3,
                  1.5F,
                  this.eholdnumber[var1],
                  0,
                  2,
                  10,
                  0,
                  5
               );
               this.eholdnumber[var1] = this.eholdnumber[var1] + this.emuki[var1] * 23;
            }
         } else if (this.stagelevel == 1 && this.etime[var1] > 50) {
            this.sh(
               (float)(this.eX[var1] + 30.0 * Math.cos(this.eholdnumber[var1] * 3.1415 / 180.0)),
               (float)(this.eY[var1] + 30.0 * Math.sin(this.eholdnumber[var1] * 3.1415 / 180.0)),
               3,
               2.0F,
               this.eholdnumber[var1],
               0,
               2,
               10,
               0,
               5
            );
            this.eholdnumber[var1] = this.eholdnumber[var1] + this.emuki[var1] * 13;
            this.sh(
               (float)(this.eX[var1] + 30.0 * Math.cos(this.eholdnumber[var1] * 3.1415 / 180.0)),
               (float)(this.eY[var1] + 30.0 * Math.sin(this.eholdnumber[var1] * 3.1415 / 180.0)),
               3,
               2.0F,
               this.eholdnumber[var1],
               0,
               2,
               10,
               0,
               5
            );
            this.eholdnumber[var1] = this.eholdnumber[var1] + this.emuki[var1] * 13;
         }
      } else if (this.emode[var1] != 3) {
         if (this.emode[var1] == 4) {
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 2.0F;
               this.etairyoku[var1] = 5.0F;
            }

            if (this.etime[var1] > 50 && this.etime[var1] < 70) {
               this.eXmove[var1] = (float)(this.eXmove[var1] + this.emuki[var1] * 0.2);
               this.eYmove[var1] = (float)(this.eYmove[var1] - 0.2);
               this.etairyoku[var1] = 5.0F;
            }

            if (this.stagelevel == 0) {
               if (this.etime[var1] % 30 == 0) {
                  for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 30, 0, 30, 60, 0, 4);
                  }
               }
            } else if (this.stagelevel == 1 && this.etime[var1] % 30 == 0) {
               for (this.cyc = 0; this.cyc < 18; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 2.5F, this.cyc * 20, 0, 30, 60, 0, 4);
               }
            }
         } else if (this.emode[var1] == 5) {
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = 7 * this.emuki[var1];
               this.eYmove[var1] = 2.0F;
               this.etairyoku[var1] = 25.0F;
               this.eshape[var1] = 1;
            } else if (this.etime[var1] < 30) {
               this.eXmove[var1] = (float)(this.eXmove[var1] - 0.1 * this.emuki[var1]);
            }

            if (this.etime[var1] > 30 && this.etime[var1] < 90) {
               this.eXmove[var1] = (float)(-4.0 * Math.sin(this.eholdnumber[var1] * 3.1415 / 180.0));
               this.eYmove[var1] = (float)(4.0 * Math.cos(this.eholdnumber[var1] * 3.1415 / 180.0));
               this.eholdnumber[var1] = this.eholdnumber[var1] + 4 * this.emuki[var1];
            } else if (this.etime[var1] == 100) {
               this.eXmove[var1] = 2.0F * this.eXmove[var1];
            }

            if (this.stagelevel == 0) {
               if (this.etime[var1] > 30 && this.etime[var1] % 12 == 0) {
                  this.eholdnumber2[var1] = (this.rand.nextInt() >>> 1) % 40 - 20;
                  this.ehnum[var1] = this.getkakudo(this.eX[var1] + this.eholdnumber2[var1], this.eY[var1], this.peopleX, this.peopleY);

                  for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                     this.sh(this.eX[var1] + this.eholdnumber2[var1], this.eY[var1], 1, (float)(2.5 + this.cyc * 0.4), this.ehnum[var1], 0, 0, 30, 2, 5);
                  }

                  for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                     this.sh(
                        this.eX[var1] + this.eholdnumber2[var1], this.eY[var1], 1, (float)(3.0 + this.cyc * 0.5), 180.0F + this.ehnum[var1], 0, 0, 30, 2, 5
                     );
                  }
               }
            } else if (this.stagelevel == 1 && this.etime[var1] > 30 && this.etime[var1] % 10 == 0) {
               this.eholdnumber2[var1] = (this.rand.nextInt() >>> 1) % 40 - 20;
               this.ehnum[var1] = this.getkakudo(this.eX[var1] + this.eholdnumber2[var1], this.eY[var1], this.peopleX, this.peopleY);

               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.sh(this.eX[var1] + this.eholdnumber2[var1], this.eY[var1], 1, (float)(2.5 + this.cyc * 0.4), this.ehnum[var1], 0, 0, 30, 2, 5);
               }

               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.sh(this.eX[var1] + this.eholdnumber2[var1], this.eY[var1], 1, (float)(3.0 + this.cyc * 0.5), 180.0F + this.ehnum[var1], 0, 0, 30, 2, 5);
               }
            }
         } else if (this.emode[var1] == 6) {
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = 3 * this.emuki[var1];
               this.eYmove[var1] = 0.0F;
               this.etairyoku[var1] = 10.0F;
               this.eholdnumber[var1] = 20;
            }

            if (this.etime[var1] == 20) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] == 40) {
               this.eXmove[var1] = 4 * this.emuki[var1];
               this.eYmove[var1] = 0.0F;
            }

            if (this.stagelevel == 0) {
               if (this.etime[var1] > 20 && this.etime[var1] < 41 && this.etime[var1] % 3 == 0) {
                  this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
                  this.sh(this.eX[var1], this.eY[var1], 1, (float)(this.eholdnumber[var1] * 0.1), this.ehnum[var1], 0, 20, 50, 2, 1);
                  this.eholdnumber[var1] = this.eholdnumber[var1] + 3;
               }
            } else if (this.stagelevel == 1 && this.etime[var1] > 20 && this.etime[var1] < 41 && this.etime[var1] % 3 == 0) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

               for (this.cyc = -1; this.cyc < 2; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, (float)(this.eholdnumber[var1] * 0.1), this.ehnum[var1] + this.cyc * 30, 0, 20, 50, 2, 1);
               }

               this.eholdnumber[var1] = this.eholdnumber[var1] + 5;
            }
         } else if (this.emode[var1] == 7) {
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 5.0F;
               this.etairyoku[var1] = 20.0F;
            }

            if (this.etime[var1] == 20) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] == 40) {
               this.eXmove[var1] = 4 * this.emuki[var1];
               this.eYmove[var1] = 0.0F;
            }

            if (this.stagelevel == 0) {
               if (this.etime[var1] == 30) {
                  this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 10 - 5;
                  this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

                  for (this.cyc = -1; this.cyc < 2; this.cyc++) {
                     this.laserIn(this.eX[var1], this.eY[var1], 1, 3.0F, 20 * this.cyc + this.ehnum[var1], 3.0F, 60, 0, 0, 5);
                  }

                  for (this.cyc = 0; this.cyc < 18; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.ehnum[var1] + this.cyc * 20, 0, 20, 50, 0, 1);
                  }
               }
            } else if (this.stagelevel == 1 && this.etime[var1] == 30) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 10 - 5;
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

               for (this.cyc = -3; this.cyc < 3; this.cyc++) {
                  this.laserIn(this.eX[var1], this.eY[var1], 1, 4.0F, this.eholdnumber[var1] + 20 * this.cyc + this.ehnum[var1], 3.0F, 60, 0, 0, 5);
               }

               for (this.cyc = 0; this.cyc < 24; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 3.0F, this.eholdnumber[var1] + this.ehnum[var1] + this.cyc * 15, 0, 20, 50, 0, 1);
               }
            }
         } else if (this.emode[var1] == 8) {
            if (this.etime[var1] == 1) {
               this.eYmove[var1] = -4.0F;
               this.etairyoku[var1] = 10.0F;
            } else if (this.etime[var1] < 30) {
               this.eYmove[var1] = (float)(this.eYmove[var1] + 0.1);
            } else if (this.etime[var1] < 60) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
               this.eholdnumber[var1]++;
               this.eholdnumber[var1]++;
               this.eXmove[var1] = (float)(this.eholdnumber[var1] * 0.1 * Math.cos(this.ehnum[var1] * 3.1415 / 180.0));
               this.eYmove[var1] = (float)(this.eholdnumber[var1] * 0.1 * Math.sin(this.ehnum[var1] * 3.1415 / 180.0));
            }

            if (this.etime[var1] > 30 && this.etime[var1] % 3 == 0) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
               this.sh(this.eX[var1], this.eY[var1], 35, 2.0F, this.ehnum[var1], 0, 0, 0, 0, 1);
            }
         } else if (this.emode[var1] == 9) {
            if (this.etime[var1] == 1) {
               this.eYmove[var1] = -4.0F;
               this.etairyoku[var1] = 10.0F;
            } else if (this.etime[var1] < 30) {
               this.eYmove[var1] = (float)(this.eYmove[var1] + 0.1);
            } else if (this.etime[var1] < 60) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
               this.eholdnumber[var1]++;
               this.eholdnumber[var1]++;
               this.eXmove[var1] = (float)(this.eholdnumber[var1] * 0.1 * Math.cos(this.ehnum[var1] * 3.1415 / 180.0));
               this.eYmove[var1] = (float)(this.eholdnumber[var1] * 0.1 * Math.sin(this.ehnum[var1] * 3.1415 / 180.0));
            }

            if (this.etime[var1] > 30 && this.etime[var1] % 3 == 0) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
               this.sh(this.eX[var1], this.eY[var1], 35, 2.0F, this.ehnum[var1], 0, 0, 0, 0, 2);
            }
         } else if (this.emode[var1] == 10) {
            if (this.etime[var1] == 1) {
               this.eYmove[var1] = -4.0F;
               this.etairyoku[var1] = 10.0F;
            } else if (this.etime[var1] < 30) {
               this.eYmove[var1] = (float)(this.eYmove[var1] + 0.1);
            } else if (this.etime[var1] < 60) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
               this.eholdnumber[var1]++;
               this.eholdnumber[var1]++;
               this.eXmove[var1] = (float)(this.eholdnumber[var1] * 0.1 * Math.cos(this.ehnum[var1] * 3.1415 / 180.0));
               this.eYmove[var1] = (float)(this.eholdnumber[var1] * 0.1 * Math.sin(this.ehnum[var1] * 3.1415 / 180.0));
            }

            if (this.etime[var1] > 30 && this.etime[var1] % 3 == 0) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
               this.sh(this.eX[var1], this.eY[var1], 35, 2.0F, this.ehnum[var1], 0, 0, 0, 0, 4);
            }
         } else if (this.emode[var1] == 11) {
            if (this.etime[var1] == 1) {
               this.eYmove[var1] = -4.0F;
               this.etairyoku[var1] = 10.0F;
            } else if (this.etime[var1] < 30) {
               this.eYmove[var1] = (float)(this.eYmove[var1] + 0.1);
            } else if (this.etime[var1] < 60) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
               this.eholdnumber[var1]++;
               this.eholdnumber[var1]++;
               this.eXmove[var1] = (float)(this.eholdnumber[var1] * 0.1 * Math.cos(this.ehnum[var1] * 3.1415 / 180.0));
               this.eYmove[var1] = (float)(this.eholdnumber[var1] * 0.1 * Math.sin(this.ehnum[var1] * 3.1415 / 180.0));
            }

            if (this.etime[var1] > 30 && this.etime[var1] % 3 == 0) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
               this.sh(this.eX[var1], this.eY[var1], 35, 2.0F, this.ehnum[var1], 0, 0, 0, 0, 0);
            }
         } else if (this.emode[var1] == 1000) {
            for (this.cyc = 0; this.cyc < 2; this.cyc++) {
               this.tmX[this.cyc * 2] = this.eX[var1]
                  + (50.0F + 30.0F * this.sin[this.stagetime % 120 * 30]) * this.cos[(this.stagetime2 * 60 + this.cyc * 1800) % 3600];
               this.tmY[this.cyc * 2] = this.eY[var1]
                  + (50.0F + 30.0F * this.sin[this.stagetime % 120 * 30]) * this.sin[(this.stagetime2 * 60 + this.cyc * 1800) % 3600];
            }

            for (this.cyc = 0; this.cyc < 2; this.cyc++) {
               this.tmX[1 + this.cyc * 2] = this.eX[var1]
                  + (50.0F + 30.0F * this.sin[(this.stagetime + 60) % 120 * 30])
                     * this.cos[((900 - this.stagetime2 * 60 + this.cyc * 1800) % 3600 + 3600) % 3600];
               this.tmY[1 + this.cyc * 2] = this.eY[var1]
                  + (50.0F + 30.0F * this.sin[(this.stagetime + 60) % 120 * 30])
                     * this.sin[((900 - this.stagetime2 * 60 + this.cyc * 1800) % 3600 + 3600) % 3600];
            }

            if (this.edoing[var1] == 0) {
               if (this.etime[var1] == 1) {
                  for (this.cyc = 0; this.cyc < 4; this.tmiro[this.cyc] = this.cyc++) {
                     this.tmmode[this.cyc] = 3;
                  }

                  this.esuruu[var1] = 1;
                  this.eXmove[var1] = this.migi + 20;
                  this.eYmove[var1] = 200.0F;
                  this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
                  this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
                  this.etairyoku[var1] = 10000.0F;
               } else if (this.etime[var1] == 31) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
                  effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
               } else if (this.etime[var1] == 80) {
                  this.etime[var1] = 0;
                  this.edoing[var1]++;
               }
            } else if (this.edoing[var1] == 1) {
               this.etairyoku[var1] = 10000.0F;
               if (this.stagelevel == 0) {
                  if (this.etime[var1] % 3 == 0) {
                     for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                        this.sh(this.tmX[this.cyc], this.tmY[this.cyc], 1, 1.5F, this.cyc % 2 * 180 + this.stagetime2 * 4, 90, 0, 30, 0, this.cyc);
                     }
                  }
               } else if (this.stagelevel == 1 && this.etime[var1] % 2 == 0) {
                  for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                     this.sh(this.tmX[this.cyc], this.tmY[this.cyc], 1, 1.8F, this.cyc % 2 * 180 + this.stagetime2 * 4, 90, 0, 30, 0, this.cyc);
                  }
               }

               if (this.etime[var1] == 525) {
                  effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
                  effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
                  this.etime[var1] = 0;
                  this.edoing[var1]++;
               }
            } else if (this.edoing[var1] == 2) {
               if (this.etime[var1] == 1) {
                  this.eXmove[var1] = (95.0F - this.eX[var1]) / 50.0F;
                  this.eYmove[var1] = (100.0F - this.eY[var1]) / 50.0F;
               }

               if (this.etime[var1] == 51) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;

                  for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                     this.tmmode[this.cyc] = 0;
                     this.tmiro[this.cyc] = this.cyc;
                     effectIn(this.tmX[this.cyc], this.tmY[this.cyc], 1, 0, 0, 0);
                     this.itemIn(this.tmX[this.cyc], this.tmY[this.cyc], 99, 0);
                  }
               }

               if (this.etime[var1] == 81) {
                  this.etime[var1] = 0;
                  this.edoing[var1]++;
               }
            } else if (this.edoing[var1] == 3) {
               if (this.etime[var1] == 1) {
                  this.stagetime = 20050;
                  this.eXmove[var1] = -6.0F;
                  this.eYmove[var1] = -0.5F;
               }

               this.eXmove[var1] = (float)(this.eXmove[var1] + 0.2);
            }
         } else if (this.emode[var1] == 1001) {
            if (this.edoing[var1] == 0) {
               this.bossmahoujinn = 0;
               this.bossnum = var1;
               this.bossnokori = 4;
               this.eX[var1] = this.migi + 15;
               this.eY[var1] = -10.0F;
               this.etairyoku[var1] = 10000.0F;
               this.edoing[var1]++;
            } else if (this.edoing[var1] == 1) {
               this.etime[var1] = 0;
            } else if (this.edoing[var1] == 2) {
               if (this.etime[var1] == 1) {
                  this.bossmahoujinn = 1;
                  this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
                  this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
               } else if (this.etime[var1] == 31) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               }
            } else if (this.edoing[var1] == 3) {
               this.bosstairyoku = 200.0F;
               this.bosstimelim = 900;
               if (this.etime[var1] == 1) {
                  effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
                  this.player.stop();

                  try {
                     MediaSound var2 = MediaManager.getSound("resource:///8.mld");
                     var2.use();
                     this.player = AudioPresenter.getAudioPresenter();
                     this.player.setSound(var2);
                     this.player.setMediaListener(this);
                  } catch (Exception var4) {
                  }

                  this.player.setAttribute(4, this.volume);
                  this.player.play();
                  this.eXmove[var1] = (95.0F - this.eX[var1]) / 10.0F;
                  this.eYmove[var1] = (100.0F - this.eY[var1]) / 10.0F;
               } else if (this.etime[var1] == 11) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               }

               if (this.etime[var1] == 30) {
                  for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                     this.tmmode[this.cyc] = 1;
                  }

                  this.bossmode = 1;
                  this.eboss[var1] = 1;
                  this.etime[var1] = 0;
                  this.edoing[var1]++;
               }
            } else if (this.edoing[var1] == 4) {
               if (this.etime[var1] == 0) {
                  this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 90;
               }

               if (this.stagelevel == 0) {
                  for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                     this.tmX[this.cyc] = (float)(
                        this.eX[var1] + 50.0 * Math.cos((this.eholdnumber[var1] + 72 * this.cyc - this.eholdnumber[var1]) * 3.1415 / 180.0)
                     );
                     this.tmY[this.cyc] = (float)(
                        this.eY[var1] + 50.0 * Math.sin((this.eholdnumber[var1] + 72 * this.cyc - this.eholdnumber[var1]) * 3.1415 / 180.0)
                     );
                  }

                  if (this.etime[var1] % 8 == 0) {
                     for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                        this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 72 + this.eholdnumber[var1] * 19, 1, 6, 30, 8, 3);
                     }

                     for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                        this.sh(this.tmX[this.cyc], this.tmY[this.cyc], 1, 2.0F, this.cyc * 72 - this.eholdnumber[var1] * 19 + 150, 1, 6, 30, 8, 3);
                     }

                     this.eholdnumber[var1]++;
                  }
               } else if (this.stagelevel == 1) {
                  for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                     this.tmX[this.cyc] = (float)(
                        this.eX[var1] + 50.0 * Math.cos((this.eholdnumber[var1] + 72 * this.cyc - this.eholdnumber[var1]) * 3.1415 / 180.0)
                     );
                     this.tmY[this.cyc] = (float)(
                        this.eY[var1] + 50.0 * Math.sin((this.eholdnumber[var1] + 72 * this.cyc - this.eholdnumber[var1]) * 3.1415 / 180.0)
                     );
                  }

                  if (this.etime[var1] % 5 == 0) {
                     for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                        this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 72 + this.eholdnumber[var1] * 13, 1, 6, 30, 8, 3);
                     }

                     for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                        this.sh(this.tmX[this.cyc], this.tmY[this.cyc], 1, 2.0F, this.cyc * 72 - this.eholdnumber[var1] * 13 + 150, 1, 6, 30, 8, 3);
                     }

                     this.eholdnumber[var1]++;
                  }
               }
            } else if (this.edoing[var1] == 5) {
               this.bosstairyoku = 250.0F;
               this.bosstimelim = 1200;
               this.spelbonus = 12000;
               if (this.etime[var1] == 1) {
                  for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                     this.tmmode[this.cyc] = 0;
                  }

                  this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
                  this.eYmove[var1] = (80.0F - this.eY[var1]) / 30.0F;
                  effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
                  effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
                  effectIn(0.0F, 0.0F, 27, 180, 0, 0);
                  effectIn(900.0F, 900.0F, 9, 6, 0, 0);
                  effectIn(900.0F, 900.0F, 6, 0, 0, 0);
                  if (this.stagelevel == 0) {
                     this.spelname = "恋符「ラジアルロード」";
                  }

                  if (this.stagelevel == 1) {
                     this.spelname = "恋符「しし座流星群衝突」";
                  }

                  this.etairyoku[var1] = 10000.0F;
               } else if (this.etime[var1] == 31) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               } else if (this.etime[var1] == 60) {
                  this.etime[var1] = 0;
                  this.edoing[var1]++;
               }
            } else if (this.edoing[var1] == 6) {
               if (this.etime[var1] % 120 == 100) {
                  this.getemove(var1, 20, 2);
               }

               if (this.etime[var1] % 120 == 0) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               }

               if (this.stagelevel == 0) {
                  if (this.etime[var1] % 120 == 1) {
                     this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

                     for (this.cyc = -2; this.cyc < 3; this.cyc++) {
                        this.sh(this.eX[var1], this.eY[var1], 1, 2.5F, this.cyc * 25 + this.ehnum[var1], 0, 0, 0, 8, 3);
                     }
                  }

                  if (this.etime[var1] % 120 == 10) {
                     for (this.cyc = -2; this.cyc < 3; this.cyc++) {
                        this.laserIn(this.eX[var1], this.eY[var1], 1, 2.5F, this.cyc * 25 + this.ehnum[var1], 3.0F, 120, 0, 0, 3);
                     }
                  }

                  if (this.etime[var1] % 120 > 80 && this.etime[var1] % 120 < 120 && this.etime[var1] % 2 == 0) {
                     for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                        this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 90 + this.eholdnumber[var1] * 17, 0, 0, 0, 8, 2);
                     }

                     this.eholdnumber[var1]++;
                  }
               } else if (this.stagelevel == 1) {
                  if (this.etime[var1] % 120 == 1) {
                     this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

                     for (this.cyc = -3; this.cyc < 4; this.cyc++) {
                        this.sh(this.eX[var1], this.eY[var1], 1, 3.0F, this.cyc * 20 + this.ehnum[var1], 0, 0, 0, 8, 3);
                     }
                  }

                  if (this.etime[var1] % 120 == 10) {
                     for (this.cyc = -3; this.cyc < 4; this.cyc++) {
                        this.laserIn(this.eX[var1], this.eY[var1], 1, 3.0F, this.cyc * 20 + this.ehnum[var1], 3.0F, 120, 0, 0, 3);
                     }
                  }

                  if (this.etime[var1] % 120 > 80 && this.etime[var1] % 120 < 120) {
                     for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                        this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 90 + this.eholdnumber[var1] * 17, 0, 0, 0, 8, 2);
                     }

                     this.eholdnumber[var1]++;
                  }
               }
            } else if (this.edoing[var1] == 7) {
               this.bosstairyoku = 200.0F;
               this.bosstimelim = 600;
               if (this.etime[var1] == 1) {
                  for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                     this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
                  }

                  for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                     this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
                  }

                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
                  this.etairyoku[var1] = 10000.0F;
               } else if (this.etime[var1] == 30) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               } else if (this.etime[var1] == 60) {
                  for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                     this.tmmode[this.cyc] = 1;
                  }

                  this.etime[var1] = 0;
                  this.edoing[var1]++;
               }
            } else if (this.edoing[var1] == 8) {
               if (this.etime[var1] % 200 == 50) {
                  this.getemove(var1, 10, 2);
               }

               if (this.etime[var1] % 200 == 60) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               }

               if (this.stagelevel == 0) {
                  if (this.etime[var1] == 0) {
                     this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 90;
                  }

                  for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                     this.tmX[this.cyc] = (float)(
                        this.eX[var1] + 30.0 * Math.cos((this.eholdnumber[var1] + 72 * this.cyc - this.eholdnumber[var1] * 2) * 3.1415 / 180.0)
                     );
                     this.tmY[this.cyc] = (float)(
                        this.eY[var1] + 30.0 * Math.sin((this.eholdnumber[var1] + 72 * this.cyc - this.eholdnumber[var1] * 2) * 3.1415 / 180.0)
                     );
                  }

                  if (this.etime[var1] % 5 == 0) {
                     for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                        this.sh(this.tmX[this.cyc], this.tmY[this.cyc], 1, 2.0F, this.cyc * 72 - this.eholdnumber[var1] * 13 + 160, 1, 6, 30, 8, 2);
                     }

                     if (this.etime[var1] % 10 == 0) {
                        for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                           this.sh(this.tmX[this.cyc], this.tmY[this.cyc], 1, 1.0F, this.cyc * 72 - this.eholdnumber[var1] * 13, 1, 6, 30, 8, 1);
                        }
                     }

                     this.eholdnumber[var1]++;
                  }
               } else if (this.stagelevel == 1) {
                  if (this.etime[var1] == 0) {
                     this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 90;
                  }

                  for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                     this.tmX[this.cyc] = (float)(
                        this.eX[var1] + 30.0 * Math.cos((this.eholdnumber[var1] + 72 * this.cyc - this.eholdnumber[var1] * 2) * 3.1415 / 180.0)
                     );
                     this.tmY[this.cyc] = (float)(
                        this.eY[var1] + 30.0 * Math.sin((this.eholdnumber[var1] + 72 * this.cyc - this.eholdnumber[var1] * 2) * 3.1415 / 180.0)
                     );
                  }

                  if (this.etime[var1] % 4 == 0) {
                     for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                        this.sh(this.tmX[this.cyc], this.tmY[this.cyc], 1, 2.5F, this.cyc * 72 - this.eholdnumber[var1] * 13 + 160, 1, 6, 30, 8, 2);
                     }

                     if (this.etime[var1] % 8 == 0) {
                        for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                           this.sh(this.tmX[this.cyc], this.tmY[this.cyc], 1, 1.0F, this.cyc * 72 - this.eholdnumber[var1] * 13, 1, 6, 30, 8, 1);
                        }
                     }

                     this.eholdnumber[var1]++;
                  }
               }
            } else if (this.edoing[var1] == 9) {
               this.bosstairyoku = 250.0F;
               this.bosstimelim = 600;
               this.spelbonus = 12000;
               if (this.etime[var1] == 1) {
                  for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                     this.tmmode[this.cyc] = 0;
                  }

                  this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
                  this.eYmove[var1] = (90.0F - this.eY[var1]) / 30.0F;
                  effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
                  effectIn(0.0F, 0.0F, 27, 180, 0, 0);
                  effectIn(900.0F, 900.0F, 9, 6, 0, 0);
                  effectIn(900.0F, 900.0F, 6, 0, 0, 0);
                  this.spelname = "輝光「ﾄﾙﾈｰﾄﾞｽｰﾊﾟｰｽﾀｰ」";
                  this.etairyoku[var1] = 10000.0F;
               } else if (this.etime[var1] == 31) {
                  effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               } else if (this.etime[var1] == 60) {
                  this.tmmode[1] = 1;
                  this.etime[var1] = 0;
                  this.edoing[var1]++;
               }
            } else if (this.edoing[var1] == 10) {
               if (this.etime[var1] % 90 == 60) {
                  this.getemove(var1, 20, 2);
                  this.eYmove[var1] = 0.0F;
               }

               if (this.etime[var1] % 90 == 80) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               }

               if (this.stagelevel == 0) {
                  this.eholdnumber[var1] = this.eholdnumber[var1] + 5;
                  this.eholdnumber2[var1] = this.eholdnumber2[var1] + 2;
                  this.tmX[0] = (float)(40.0 * Math.cos(this.eholdnumber[var1] * 3.1415 / 180.0));
                  this.tmY[0] = (float)(10.0 * Math.sin(this.eholdnumber[var1] * 3.1415 / 180.0));
                  this.tmX[1] = (float)(
                     this.eX[var1]
                        + this.tmX[0] * Math.cos(this.eholdnumber2[var1] * 3.1415 / 180.0)
                        - this.tmY[0] * Math.sin(this.eholdnumber2[var1] * 3.1415 / 180.0)
                  );
                  this.tmY[1] = (float)(
                     this.eY[var1]
                        + this.tmX[0] * Math.sin(this.eholdnumber2[var1] * 3.1415 / 180.0)
                        + this.tmY[0] * Math.cos(this.eholdnumber2[var1] * 3.1415 / 180.0)
                  );
                  this.sh(this.tmX[1], this.tmY[1], 3, 2.0F, this.eholdnumber[var1] + this.eholdnumber2[var1], 0, 2, 20, 8, 1);
                  if (this.etime[var1] % 30 == 0) {
                     this.ehnum[var1] = this.getkakudo(this.tmX[1], this.tmY[1], this.peopleX, this.peopleY);

                     for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                        this.sh(this.tmX[1], this.tmY[1], 1, 3.0F, this.ehnum[var1] + this.cyc * 30, 0, 2, 20, 8, 3);
                     }
                  }
               } else if (this.stagelevel == 1) {
                  this.eholdnumber[var1] = this.eholdnumber[var1] + 5;
                  this.eholdnumber2[var1] = this.eholdnumber2[var1] + 2;
                  this.tmX[0] = (float)(40.0 * Math.cos(this.eholdnumber[var1] * 3.1415 / 180.0));
                  this.tmY[0] = (float)(15.0 * Math.sin(this.eholdnumber[var1] * 3.1415 / 180.0));
                  this.tmX[1] = (float)(
                     this.eX[var1]
                        + this.tmX[0] * Math.cos(this.eholdnumber2[var1] * 3.1415 / 180.0)
                        - this.tmY[0] * Math.sin(this.eholdnumber2[var1] * 3.1415 / 180.0)
                  );
                  this.tmY[1] = (float)(
                     this.eY[var1]
                        + this.tmX[0] * Math.sin(this.eholdnumber2[var1] * 3.1415 / 180.0)
                        + this.tmY[0] * Math.cos(this.eholdnumber2[var1] * 3.1415 / 180.0)
                  );
                  this.sh(this.tmX[1], this.tmY[1], 3, 2.0F, this.eholdnumber[var1] + this.eholdnumber2[var1], 0, 2, 20, 8, 1);
                  if (this.etime[var1] % 30 == 0) {
                     this.ehnum[var1] = this.getkakudo(this.tmX[1], this.tmY[1], this.peopleX, this.peopleY);

                     for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                        this.sh(this.tmX[1], this.tmY[1], 1, 3.0F, this.ehnum[var1] + this.cyc * 30, 0, 2, 20, 8, 3);
                     }
                  }

                  if (this.etime[var1] % 2 == 0) {
                     this.sh(this.tmX[1], this.tmY[1], 1, 2.5F, (this.rand.nextInt() >>> 1) % 360, 0, 2, 20, 8, 2);
                  }
               }
            } else if (this.edoing[var1] == 11) {
               this.bosstairyoku = 200.0F;
               this.bosstimelim = 600;
               if (this.etime[var1] == 1) {
                  for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                     this.tmmode[this.cyc] = 0;
                  }

                  for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                     this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
                  }

                  for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                     this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
                  }

                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
                  this.etairyoku[var1] = 10000.0F;
               } else if (this.etime[var1] == 60) {
                  for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                     this.tmmode[this.cyc] = 1;
                  }

                  this.etime[var1] = 0;
                  this.edoing[var1]++;
               }
            } else if (this.edoing[var1] == 12) {
               if (this.etime[var1] % 120 == 60) {
                  this.getemove(var1, 10, 2);
               }

               if (this.etime[var1] % 120 == 70) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               }

               if (this.stagelevel == 0) {
                  for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                     this.tmX[this.cyc] = (float)(
                        this.eX[var1] + 50.0 * Math.cos((this.eholdnumber[var1] + 72 * this.cyc - this.eholdnumber[var1] * 3) * 3.1415 / 180.0)
                     );
                     this.tmY[this.cyc] = (float)(
                        this.eY[var1] + 50.0 * Math.sin((this.eholdnumber[var1] + 72 * this.cyc - this.eholdnumber[var1] * 3) * 3.1415 / 180.0)
                     );
                  }

                  if (this.etime[var1] % 8 == 0) {
                     for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                        this.sh(
                           this.eX[var1],
                           this.eY[var1],
                           1,
                           1.5F,
                           this.cyc * 72 + this.eholdnumber[var1] * 13 + (this.rand.nextInt() >>> 1) % 90,
                           1,
                           6,
                           30,
                           8,
                           3
                        );
                     }

                     for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                        this.sh(
                           this.tmX[this.cyc],
                           this.tmY[this.cyc],
                           1,
                           1.5F,
                           this.cyc * 72 - this.eholdnumber[var1] * 13 + 150 + (this.rand.nextInt() >>> 1) % 90,
                           1,
                           6,
                           30,
                           8,
                           3
                        );
                     }

                     this.eholdnumber[var1]++;
                  }
               } else if (this.stagelevel == 1) {
                  for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                     this.tmX[this.cyc] = (float)(
                        this.eX[var1] + 50.0 * Math.cos((this.eholdnumber[var1] + 72 * this.cyc - this.eholdnumber[var1] * 3) * 3.1415 / 180.0)
                     );
                     this.tmY[this.cyc] = (float)(
                        this.eY[var1] + 50.0 * Math.sin((this.eholdnumber[var1] + 72 * this.cyc - this.eholdnumber[var1] * 3) * 3.1415 / 180.0)
                     );
                  }

                  if (this.etime[var1] % 4 == 0) {
                     for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                        this.sh(
                           this.eX[var1],
                           this.eY[var1],
                           1,
                           2.0F,
                           this.cyc * 72 + this.eholdnumber[var1] * 13 + (this.rand.nextInt() >>> 1) % 90,
                           1,
                           6,
                           30,
                           8,
                           3
                        );
                     }

                     for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                        this.sh(
                           this.tmX[this.cyc],
                           this.tmY[this.cyc],
                           1,
                           2.0F,
                           this.cyc * 72 - this.eholdnumber[var1] * 13 + 150 + (this.rand.nextInt() >>> 1) % 90,
                           1,
                           6,
                           30,
                           8,
                           3
                        );
                     }

                     this.eholdnumber[var1]++;
                  }
               }
            } else if (this.edoing[var1] == 13) {
               this.bosstairyoku = 250.0F;
               this.bosstimelim = 2700;
               this.spelbonus = 15000;
               if (this.etime[var1] == 1) {
                  for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                     this.tmmode[this.cyc] = 0;
                  }

                  this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
                  this.eYmove[var1] = (80.0F - this.eY[var1]) / 30.0F;
                  effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
                  effectIn(0.0F, 0.0F, 27, 180, 0, 0);
                  effectIn(900.0F, 900.0F, 9, 6, 0, 0);
                  effectIn(900.0F, 900.0F, 6, 0, 0, 0);
                  this.spelname = "「コメットリターン」";
                  this.etairyoku[var1] = 10000.0F;
               } else if (this.etime[var1] == 31) {
                  effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               } else if (this.etime[var1] == 70) {
                  this.eholdnumber2[var1] = 0;
                  this.etime[var1] = 0;
                  this.edoing[var1]++;
               }
            } else if (this.edoing[var1] == 14) {
               if (this.stagelevel == 0) {
                  if (this.etime[var1] % 80 == 1) {
                     this.eXmove[var1] = (this.peopleX - this.eX[var1]) / 30.0F;
                  }

                  if (this.etime[var1] % 80 == 31) {
                     this.eXmove[var1] = 0.0F;
                  }

                  if (this.etime[var1] % 80 == 31) {
                     this.sh(this.eX[var1], this.eY[var1], 40, 2.0F, 90.0F, 1, 6, 30, 8, 3);
                  }
               } else if (this.stagelevel == 1) {
                  if (this.etime[var1] % 60 == 1) {
                     this.eXmove[var1] = (this.peopleX - this.eX[var1]) / 30.0F;
                  }

                  if (this.etime[var1] % 60 == 31) {
                     this.eXmove[var1] = 0.0F;
                  }

                  if (this.etime[var1] % 30 == 15) {
                     for (this.cyc = 0; this.cyc < 36; this.cyc++) {
                        this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 10, 1, 6, 30, 0, 1);
                     }
                  }

                  if (this.etime[var1] % 60 == 31) {
                     this.sh(this.eX[var1], this.eY[var1], 40, 2.0F, 90.0F, 1, 6, 30, 8, 3);
                  }
               }
            } else if (this.edoing[var1] == 15) {
               this.bosstairyoku = 300.0F;
               this.bosstimelim = 2700;
               this.spelbonus = 15000;
               if (this.etime[var1] == 1) {
                  for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                     this.tmmode[this.cyc] = 0;
                  }

                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               } else if (this.etime[var1] == 91) {
                  this.bossspel = 1;
                  this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
                  this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
                  effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
                  effectIn(0.0F, 0.0F, 27, 180, 0, 0);
                  effectIn(900.0F, 900.0F, 9, 6, 0, 0);
                  effectIn(900.0F, 900.0F, 6, 0, 0, 0);
                  this.spelname = "儀符「天の川流域氾濫」";
                  this.etairyoku[var1] = 10000.0F;
               } else if (this.etime[var1] == 121) {
                  effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               } else if (this.etime[var1] == 160) {
                  this.etime[var1] = 0;
                  this.edoing[var1]++;
               }
            } else if (this.edoing[var1] == 16) {
               if (this.stagelevel == 0) {
                  if (this.etime[var1] % 80 == 1) {
                     this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 60;
                  }

                  if (this.etime[var1] % 180 < 30 && this.etime[var1] % 2 == 0) {
                     for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                        this.sh(
                           this.etime[var1] % 180 * 7 - 10 + (this.rand.nextInt() >>> 1) % 8,
                           100 + this.cyc * 30 + (this.rand.nextInt() >>> 1) % 10,
                           14,
                           5.0F,
                           -90.0F,
                           2,
                           30,
                           40,
                           8,
                           5
                        );
                     }

                     for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                        this.sh(
                           this.migi - this.etime[var1] % 180 * 7 + 10 + (this.rand.nextInt() >>> 1) % 8,
                           120 - this.cyc * 30 + (this.rand.nextInt() >>> 1) % 10,
                           14,
                           5.0F,
                           90.0F,
                           -2,
                           30,
                           40,
                           8,
                           5
                        );
                     }
                  }
               } else if (this.stagelevel == 1) {
                  if (this.etime[var1] % 100 == 31) {
                     this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 60;
                  }

                  if (this.etime[var1] % 100 < 30 && this.etime[var1] % 2 == 0) {
                     for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                        this.sh(
                           this.etime[var1] % 100 * 7 - 10 + (this.rand.nextInt() >>> 1) % 8,
                           100 + this.cyc * 30 + (this.rand.nextInt() >>> 1) % 10,
                           14,
                           4.5F,
                           -90.0F,
                           2,
                           30,
                           40,
                           8,
                           5
                        );
                     }

                     for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                        this.sh(
                           this.migi - this.etime[var1] % 100 * 7 + 10 + (this.rand.nextInt() >>> 1) % 8,
                           120 - this.cyc * 30 + (this.rand.nextInt() >>> 1) % 10,
                           14,
                           4.5F,
                           90.0F,
                           -2,
                           30,
                           40,
                           8,
                           5
                        );
                     }
                  }
               }
            } else if (this.edoing[var1] == 17) {
               if (this.etime[var1] == 1) {
                  this.bossmode = 0;
                  effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
                  this.stagetime = 50000;
                  this.bossmahoujinn = 0;
               }

               if (this.etime[var1] == 30) {
                  for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                     this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
                  }

                  for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                     this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
                  }

                  this.bossmahoujinn = 0;
                  this.emode[var1] = 0;
               }
            }
         } else if (this.emode[var1] == 1002) {
            if (this.edoing[var1] == 0) {
               this.bossmahoujinn = 0;
               this.bossnum = var1;
               this.bossnokori = 4;
               this.eX[var1] = this.migi + 15;
               this.eY[var1] = -10.0F;
               this.etairyoku[var1] = 10000.0F;
            } else if (this.edoing[var1] == 1) {
               this.edoing[var1]++;
               this.etime[var1] = 0;
            } else if (this.edoing[var1] == 2) {
               if (this.etime[var1] == 1) {
                  this.bossmahoujinn = 1;
                  effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
                  this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
                  this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
               } else if (this.etime[var1] == 31) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               }
            } else if (this.edoing[var1] == 3) {
               this.bosstairyoku = 90.0F;
               this.bosstimelim = 900;
               if (this.etime[var1] == 1) {
                  this.player.stop();

                  try {
                     MediaSound var5 = MediaManager.getSound("resource:///9.mld");
                     var5.use();
                     this.player = AudioPresenter.getAudioPresenter();
                     this.player.setSound(var5);
                     this.player.setMediaListener(this);
                  } catch (Exception var3) {
                  }

                  this.player.setAttribute(4, this.volume);
                  this.player.play();
                  this.eXmove[var1] = (95.0F - this.eX[var1]) / 10.0F;
                  this.eYmove[var1] = (100.0F - this.eY[var1]) / 10.0F;
               } else if (this.etime[var1] == 11) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               }

               if (this.etime[var1] == 30) {
                  this.bossmode = 1;
                  this.eboss[var1] = 1;
                  this.etime[var1] = 0;
                  this.edoing[var1]++;
               }
            } else if (this.edoing[var1] == 4) {
               if (this.etime[var1] % 160 == 110) {
                  this.getemove(var1, 30, 1);
               }

               if (this.etime[var1] % 160 == 140) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               }

               if (this.etime[var1] == 0) {
                  this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 10;
               }

               if (this.stagelevel == 0) {
                  if (this.etime[var1] % 120 < 40 && this.etime[var1] % 2 == 0) {
                     for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                        this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 180 + this.eholdnumber[var1] * 17, 1, 6, 30, 3, 2);
                        this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 180 + this.eholdnumber[var1] * 17 + 90, 1, 6, 30, 3, 2);
                     }

                     this.eholdnumber[var1]++;
                  } else if (this.etime[var1] % 120 < 80 && this.etime[var1] % 2 == 0) {
                     for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                        this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 180 - this.eholdnumber[var1] * 17, 1, 6, 30, 3, 6);
                        this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 180 - this.eholdnumber[var1] * 17 + 90, 1, 6, 30, 3, 6);
                     }

                     this.eholdnumber[var1]++;
                  }
               } else if (this.stagelevel == 1) {
                  if (this.etime[var1] % 120 < 40) {
                     for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                        this.sh(this.eX[var1], this.eY[var1], 1, 2.5F, this.cyc * 180 + this.eholdnumber[var1] * 17, 1, 6, 30, 3, 2);
                        this.sh(this.eX[var1], this.eY[var1], 1, 2.5F, this.cyc * 180 + this.eholdnumber[var1] * 17 + 90, 1, 6, 30, 3, 2);
                     }

                     this.eholdnumber[var1]++;
                  } else if (this.etime[var1] % 120 < 80) {
                     for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                        this.sh(this.eX[var1], this.eY[var1], 1, 2.5F, this.cyc * 180 - this.eholdnumber[var1] * 17, 1, 6, 30, 3, 6);
                        this.sh(this.eX[var1], this.eY[var1], 1, 2.5F, this.cyc * 180 - this.eholdnumber[var1] * 17 + 90, 1, 6, 30, 3, 6);
                     }

                     this.eholdnumber[var1]++;
                  }
               }
            } else if (this.edoing[var1] == 5) {
               this.bosstairyoku = 300.0F;
               this.bosstimelim = 1200;
               this.spelbonus = 12000;
               if (this.etime[var1] == 1) {
                  this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
                  this.eYmove[var1] = (110.0F - this.eY[var1]) / 30.0F;
                  effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
                  effectIn(0.0F, 0.0F, 27, 180, 0, 0);
                  effectIn(900.0F, 900.0F, 9, 6, 0, 0);
                  effectIn(900.0F, 900.0F, 6, 0, 0, 0);
                  if (this.stagelevel == 0) {
                     this.spelname = "霊符「夢想封印　核」";
                  }

                  if (this.stagelevel == 1) {
                     this.spelname = "霊符「夢想封印　色」";
                  }

                  this.etairyoku[var1] = 10000.0F;
               } else if (this.etime[var1] == 31) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
                  effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
               } else if (this.etime[var1] == 60) {
                  this.etime[var1] = 0;
                  this.edoing[var1]++;
               }
            } else if (this.edoing[var1] == 6) {
               if (this.stagelevel == 0) {
                  if (this.etime[var1] % 200 == 1) {
                     this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
                     effectIn(this.eX[var1], this.eY[var1], 23, 0, 0, 0);

                     for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                        this.sh(this.eX[var1], this.eY[var1], 15, 1.0F, this.cyc * 90 + this.ehnum[var1], 0, 50, 0, 9, this.cyc % 4);
                     }
                  }

                  if (this.etime[var1] % 200 > 60 && this.etime[var1] % 200 < 170 && this.etime[var1] % 2 == 1) {
                     for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                        this.sh(
                           this.eX[var1],
                           this.eY[var1],
                           1,
                           (float)(1.5 + (this.rand.nextInt() >>> 1) % 100 * 0.01),
                           this.cyc * 120 + this.eholdnumber[var1] * 7,
                           0,
                           0,
                           0,
                           3,
                           2
                        );
                     }

                     this.eholdnumber[var1]++;
                  }
               } else if (this.stagelevel == 1) {
                  if (this.etime[var1] % 200 == 1) {
                     this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
                     effectIn(this.eX[var1], this.eY[var1], 23, 0, 0, 0);

                     for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                        this.sh(this.eX[var1], this.eY[var1], 15, 1.0F, this.cyc * 60 + this.ehnum[var1], 0, 50, 0, 9, this.cyc % 4);
                     }
                  }

                  if (this.etime[var1] % 200 > 60 && this.etime[var1] % 200 < 170) {
                     for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                        this.sh(
                           this.eX[var1],
                           this.eY[var1],
                           1,
                           (float)(1.5 + (this.rand.nextInt() >>> 1) % 100 * 0.01),
                           this.cyc * 120 + this.eholdnumber[var1] * 7,
                           0,
                           0,
                           0,
                           3,
                           2
                        );
                     }

                     this.eholdnumber[var1]++;
                  }
               }

               if (this.etime[var1] % 200 == 160) {
                  effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
               }
            } else if (this.edoing[var1] == 7) {
               this.bosstairyoku = 150.0F;
               this.bosstimelim = 900;
               if (this.etime[var1] == 1) {
                  for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                     this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
                  }

                  for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                     this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
                  }

                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
                  this.etairyoku[var1] = 10000.0F;
               } else if (this.etime[var1] == 30) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
                  effectIn(this.eX[var1], this.eY[var1], 777, 0, 0, 0);
               } else if (this.etime[var1] == 50) {
                  this.etime[var1] = 0;
                  this.edoing[var1]++;
               }
            } else if (this.edoing[var1] == 8) {
               if (this.etime[var1] % 120 == 102) {
                  this.eXmove[var1] = (95.0F - this.eX[var1]) / 10.0F;
                  this.eYmove[var1] = (100.0F - this.eY[var1]) / 10.0F;
               }

               if (this.etime[var1] % 120 == 112) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               }

               if (this.stagelevel == 0) {
                  if (this.etime[var1] % 160 == 1) {
                     this.eholdnumber[var1] = 0;
                  }

                  if (this.etime[var1] % 160 < 32 && this.etime[var1] % 5 == 1) {
                     this.sh(this.eX[var1], this.eY[var1], 41, 5.0F, 180 + this.eholdnumber[var1] * 23, 0, 0, 0, 13, 0);
                     this.eholdnumber[var1]++;
                  }

                  if (this.etime[var1] % 160 == 41) {
                     this.eholdnumber[var1] = 0;
                  }

                  if (this.etime[var1] % 160 > 40 && this.etime[var1] % 160 < 72 && this.etime[var1] % 5 == 1) {
                     this.sh(this.eX[var1], this.eY[var1], 41, 5.0F, -this.eholdnumber[var1] * 23, 0, 0, 0, 13, 0);
                     this.eholdnumber[var1]++;
                  }

                  if (this.etime[var1] % 160 == 121) {
                     for (this.cyc = 0; this.cyc < 24; this.cyc++) {
                        this.sh(56.0F, this.eX[var1], this.eY[var1], 7, 1.6F, this.cyc * 15, 0, 10, 40, 3, 2);
                     }

                     for (this.cyc = 0; this.cyc < 24; this.cyc++) {
                        this.sh(40.0F, this.eX[var1], this.eY[var1], 7, 2.8F, this.cyc * 15, 0, 10, 40, 0, 2);
                     }
                  }

                  if (this.etime[var1] % 160 == 140) {
                     effectIn(this.eX[var1], this.eY[var1], 777, 0, 0, 0);
                     this.getemove(var1, 20, 1);
                  }

                  if (this.etime[var1] % 160 == 0) {
                     this.eXmove[var1] = 0.0F;
                     this.eYmove[var1] = 0.0F;
                  }
               } else if (this.stagelevel == 1) {
                  if (this.etime[var1] % 160 == 1) {
                     this.eholdnumber[var1] = 0;
                  }

                  if (this.etime[var1] % 160 < 33 && this.etime[var1] % 4 == 1) {
                     this.sh(this.eX[var1], this.eY[var1], 41, 5.0F, 180 + this.eholdnumber[var1] * 23, 0, 0, 0, 13, 0);
                     this.eholdnumber[var1]++;
                  }

                  if (this.etime[var1] % 160 == 41) {
                     this.eholdnumber[var1] = 0;
                  }

                  if (this.etime[var1] % 160 > 40 && this.etime[var1] % 160 < 73 && this.etime[var1] % 4 == 1) {
                     this.sh(this.eX[var1], this.eY[var1], 41, 5.0F, -this.eholdnumber[var1] * 23, 0, 0, 0, 13, 0);
                     this.eholdnumber[var1]++;
                  }

                  if (this.etime[var1] % 160 == 121) {
                     for (this.cyc = 0; this.cyc < 24; this.cyc++) {
                        this.sh(56.0F, this.eX[var1], this.eY[var1], 7, 1.6F, this.cyc * 15, 0, 10, 40, 3, 2);
                     }

                     for (this.cyc = 0; this.cyc < 24; this.cyc++) {
                        this.sh(40.0F, this.eX[var1], this.eY[var1], 7, 2.8F, this.cyc * 15, 0, 10, 40, 0, 2);
                     }
                  }

                  if (this.etime[var1] % 160 == 140) {
                     effectIn(this.eX[var1], this.eY[var1], 777, 0, 0, 0);
                     this.getemove(var1, 20, 1);
                  }

                  if (this.etime[var1] % 160 == 0) {
                     this.eXmove[var1] = 0.0F;
                     this.eYmove[var1] = 0.0F;
                  }
               }
            } else if (this.edoing[var1] == 9) {
               this.bosstairyoku = 250.0F;
               this.bosstimelim = 600;
               this.spelbonus = 12000;
               if (this.etime[var1] == 1) {
                  this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
                  this.eYmove[var1] = (90.0F - this.eY[var1]) / 30.0F;
                  effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
                  effectIn(0.0F, 0.0F, 27, 180, 0, 0);
                  effectIn(900.0F, 900.0F, 9, 6, 0, 0);
                  effectIn(900.0F, 900.0F, 6, 0, 0, 0);
                  this.spelname = "夢符「博麗挟撃結界」";
                  this.etairyoku[var1] = 10000.0F;
               } else if (this.etime[var1] == 31) {
                  effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               } else if (this.etime[var1] == 60) {
                  this.etime[var1] = 0;
                  this.edoing[var1]++;
                  this.eholdnumber[var1] = 30;
                  this.eholdnumber2[var1] = 30;
                  this.eholdnumber3[var1] = -5;
                  this.ehnum[var1] = -5.0F;
               }
            } else if (this.edoing[var1] == 10) {
               this.eholdnumber[var1] = this.eholdnumber[var1] + this.eholdnumber3[var1];
               this.eholdnumber2[var1] = (int)(this.eholdnumber2[var1] + this.ehnum[var1]);
               if (this.eholdnumber[var1] > 60) {
                  this.eholdnumber3[var1] = -17;
               }

               if (this.eholdnumber[var1] < -240) {
                  this.eholdnumber3[var1] = 17;
               }

               if (this.eholdnumber2[var1] > 60) {
                  this.ehnum[var1] = -13.0F;
               }

               if (this.eholdnumber2[var1] < -240) {
                  this.ehnum[var1] = 13.0F;
               }

               if (this.stagelevel == 0 && this.stagetime % 2 == 0) {
                  this.sh(this.eX[var1], this.eY[var1], 16, 3.0F, this.eholdnumber[var1], 1, 30, 60, 3, 2);
                  if (this.etime[var1] > 90) {
                     this.sh(this.eX[var1], this.eY[var1], 16, 2.0F, this.eholdnumber2[var1], 1, 30, 60, 3, 1);
                  }
               } else if (this.stagelevel == 1) {
                  this.sh(this.eX[var1], this.eY[var1], 16, 3.0F, this.eholdnumber[var1], 1, 30, 60, 3, 2);
                  if (this.etime[var1] > 90) {
                     this.sh(this.eX[var1], this.eY[var1], 16, 2.0F, this.eholdnumber2[var1], 1, 30, 60, 3, 1);
                  }
               }

               if (this.stagelevel == 0) {
                  if (this.etime[var1] % 30 == 0) {
                     this.sh(this.eX[var1], this.eX[var1], 2, 3.0F, 0.0F, this.peopleX, this.peopleY, 20, 5, 5);
                  }
               } else if (this.stagelevel == 1 && this.etime[var1] % 40 == 0) {
                  this.sh(this.eX[var1], this.eX[var1], 2, 2.5F, 0.0F, this.peopleX, this.peopleY, 20, 5, 5);
               }
            } else if (this.edoing[var1] == 11) {
               this.bosstairyoku = 150.0F;
               this.bosstimelim = 900;
               if (this.etime[var1] == 1) {
                  for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                     this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
                  }

                  for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                     this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
                  }

                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
                  this.etairyoku[var1] = 10000.0F;
               } else if (this.etime[var1] == 60) {
                  this.etime[var1] = 0;
                  this.edoing[var1]++;
               }
            } else if (this.edoing[var1] == 12) {
               if (this.etime[var1] % 60 == 30) {
                  this.getemove(var1, 20, 2);
               }

               if (this.etime[var1] % 60 == 50) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               }

               if (this.stagelevel == 0) {
                  if (this.etime[var1] % 60 == 10) {
                     for (this.cyc = 0; this.cyc < 36; this.cyc++) {
                        this.sh(
                           this.eX[var1] - 45.0F + (this.rand.nextInt() >>> 1) % 90,
                           this.eY[var1] - 30.0F + (this.rand.nextInt() >>> 1) % 60,
                           3,
                           3.0F,
                           this.cyc * 10,
                           0,
                           10,
                           40,
                           3,
                           1
                        );
                     }

                     for (this.cyc = 0; this.cyc < 36; this.cyc++) {
                        this.sh(
                           this.eX[var1] - 45.0F + (this.rand.nextInt() >>> 1) % 90,
                           this.eY[var1] - 30.0F + (this.rand.nextInt() >>> 1) % 60,
                           3,
                           3.0F,
                           this.cyc * 10,
                           0,
                           10,
                           40,
                           3,
                           4
                        );
                     }
                  }
               } else if (this.stagelevel == 1 && this.etime[var1] % 60 == 10) {
                  for (this.cyc = 0; this.cyc < 36; this.cyc++) {
                     this.sh(
                        this.eX[var1] - 45.0F + (this.rand.nextInt() >>> 1) % 90,
                        this.eY[var1] - 30.0F + (this.rand.nextInt() >>> 1) % 60,
                        3,
                        3.3F,
                        this.cyc * 10,
                        0,
                        10,
                        40,
                        3,
                        1
                     );
                  }

                  for (this.cyc = 0; this.cyc < 36; this.cyc++) {
                     this.sh(
                        this.eX[var1] - 45.0F + (this.rand.nextInt() >>> 1) % 90,
                        this.eY[var1] - 30.0F + (this.rand.nextInt() >>> 1) % 60,
                        3,
                        3.3F,
                        this.cyc * 10,
                        0,
                        10,
                        40,
                        3,
                        4
                     );
                  }
               }
            } else if (this.edoing[var1] == 13) {
               this.bosstairyoku = 300.0F;
               this.bosstimelim = 2700;
               this.spelbonus = 15000;
               if (this.etime[var1] == 1) {
                  this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
                  this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
                  effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
                  effectIn(0.0F, 0.0F, 27, 180, 0, 0);
                  effectIn(900.0F, 900.0F, 9, 6, 0, 0);
                  effectIn(900.0F, 900.0F, 6, 0, 0, 0);
                  if (this.stagelevel == 0) {
                     this.spelname = "爆符「メガ夢想」";
                  }

                  if (this.stagelevel == 1) {
                     this.spelname = "霊烏「夢想封印　空」";
                  }

                  this.etairyoku[var1] = 10000.0F;
               } else if (this.etime[var1] == 31) {
                  effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               } else if (this.etime[var1] == 70) {
                  this.etime[var1] = 0;
                  this.edoing[var1]++;
               }
            } else if (this.edoing[var1] == 14) {
               if (this.stagelevel == 0) {
                  if (this.etime[var1] % 60 == 1) {
                     if (this.sevolume != 0) {
                        AudioPresenter var10001 = this.seplayer[0];
                        this.seplayer[0].setAttribute(4, this.sevolume);
                     }

                     if (this.sevolume != 0) {
                        this.seplayer[0].play();
                     }

                     this.sh(60 + (this.rand.nextInt() >>> 1) % 60, 30 + (this.rand.nextInt() >>> 1) % 50, 17, 3.0F, 90.0F, 0, 40, 0, 9, 1);
                  } else if (this.etime[var1] % 60 == 21) {
                     if (this.sevolume != 0) {
                        AudioPresenter var6 = this.seplayer[0];
                        this.seplayer[0].setAttribute(4, this.sevolume);
                     }

                     if (this.sevolume != 0) {
                        this.seplayer[0].play();
                     }

                     this.sh((this.rand.nextInt() >>> 1) % 60, 30 + (this.rand.nextInt() >>> 1) % 50, 17, 3.0F, 90.0F, 0, 40, 0, 9, 1);
                  } else if (this.etime[var1] % 60 == 41) {
                     if (this.sevolume != 0) {
                        AudioPresenter var7 = this.seplayer[0];
                        this.seplayer[0].setAttribute(4, this.sevolume);
                     }

                     if (this.sevolume != 0) {
                        this.seplayer[0].play();
                     }

                     this.sh(this.migi - (this.rand.nextInt() >>> 1) % 60, 30 + (this.rand.nextInt() >>> 1) % 50, 17, 3.0F, 90.0F, 0, 40, 0, 9, 1);
                  }
               } else if (this.stagelevel == 1) {
                  if (this.etime[var1] % 30 == 1) {
                     if (this.sevolume != 0) {
                        AudioPresenter var8 = this.seplayer[0];
                        this.seplayer[0].setAttribute(4, this.sevolume);
                     }

                     if (this.sevolume != 0) {
                        this.seplayer[0].play();
                     }

                     this.sh(60 + (this.rand.nextInt() >>> 1) % 60, 30 + (this.rand.nextInt() >>> 1) % 50, 17, 3.0F, 90.0F, 0, 40, 0, 9, 1);
                  } else if (this.etime[var1] % 30 == 11) {
                     if (this.sevolume != 0) {
                        AudioPresenter var9 = this.seplayer[0];
                        this.seplayer[0].setAttribute(4, this.sevolume);
                     }

                     if (this.sevolume != 0) {
                        this.seplayer[0].play();
                     }

                     this.sh((this.rand.nextInt() >>> 1) % 60, 30 + (this.rand.nextInt() >>> 1) % 50, 17, 3.0F, 90.0F, 0, 40, 0, 9, 1);
                  } else if (this.etime[var1] % 30 == 21) {
                     if (this.sevolume != 0) {
                        AudioPresenter var10 = this.seplayer[0];
                        this.seplayer[0].setAttribute(4, this.sevolume);
                     }

                     if (this.sevolume != 0) {
                        this.seplayer[0].play();
                     }

                     this.sh(this.migi - (this.rand.nextInt() >>> 1) % 60, 30 + (this.rand.nextInt() >>> 1) % 50, 17, 3.0F, 90.0F, 0, 40, 0, 9, 1);
                  }
               }
            } else if (this.edoing[var1] == 15) {
               this.bosstairyoku = 250.0F;
               this.bosstimelim = 1200;
               this.spelbonus = 15000;
               if (this.etime[var1] == 1) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               } else if (this.etime[var1] == 41) {
                  effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
               } else if (this.etime[var1] == 91) {
                  this.bossspel = 1;
                  this.eXmove[var1] = (5.0F - this.eX[var1]) / 30.0F;
                  this.eYmove[var1] = (40.0F - this.eY[var1]) / 30.0F;
                  effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
                  effectIn(0.0F, 0.0F, 27, 180, 0, 0);
                  effectIn(900.0F, 900.0F, 9, 6, 0, 0);
                  effectIn(900.0F, 900.0F, 6, 0, 0, 0);
                  this.spelname = "「八方天覇風神脚」";
                  this.etairyoku[var1] = 10000.0F;
               } else if (this.etime[var1] == 121) {
                  effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               } else if (this.etime[var1] == 160) {
                  this.etime[var1] = 0;
                  this.edoing[var1]++;
                  this.eholdnumber[var1] = 0;
               }
            } else if (this.edoing[var1] == 16) {
               if (this.etime[var1] % 60 == 1) {
                  if (this.eholdnumber[var1] == 0) {
                     this.eXmove[var1] = 10.0F;
                  }

                  if (this.eholdnumber[var1] == 1) {
                     this.eXmove[var1] = -10.0F;
                  }
               }

               if (this.etime[var1] % 60 == 21) {
                  this.eXmove[var1] = 0.0F;
               }

               if (this.etime[var1] % 60 == 41) {
                  effectIn(this.eX[var1], this.eY[var1], 777, 0, 0, 0);
               }

               if (this.etime[var1] % 60 == 0) {
                  this.eholdnumber[var1] = (this.eholdnumber[var1] + 1) % 2;
                  if (this.etime[var1] % 120 == 0) {
                     this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 2;
                  }

                  if (this.eholdnumber[var1] == 0) {
                     this.eX[var1] = 2.0F;
                  }

                  if (this.eholdnumber[var1] == 1) {
                     this.eX[var1] = this.migi;
                  }

                  if (this.eholdnumber[var1] == 0) {
                     this.eY[var1] = 30.0F;
                  }

                  if (this.eholdnumber[var1] == 1) {
                     this.eY[var1] = 210.0F;
                  }
               }

               if (this.stagelevel == 0) {
                  if (this.etime[var1] % 60 < 22 && this.etime[var1] % 2 == 0) {
                     this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

                     for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                        this.sh(this.eX[var1], this.eY[var1], 8, (float)(1.5 + 0.3 * this.cyc), this.ehnum[var1], 0, 0, 20, 3, 4);
                     }
                  }

                  if (this.etime[var1] % 15 == 0) {
                     this.sh((this.rand.nextInt() >>> 1) % 200, 0.0F, 1, 1.5F, 90.0F, 0, 40, 0, 3, 2);
                  }

                  if (this.etime[var1] % 20 == 0) {
                     this.sh((this.rand.nextInt() >>> 1) % 200, 240.0F, 1, 1.5F, -90.0F, 0, 40, 0, 3, 2);
                  }
               } else if (this.stagelevel == 1) {
                  if (this.etime[var1] % 60 < 22 && this.etime[var1] % 1 == 0) {
                     this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

                     for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                        this.sh(this.eX[var1], this.eY[var1], 8, (float)(2.0 + 0.6 * this.cyc), this.ehnum[var1], 0, 0, 20, 3, 4);
                     }
                  }

                  if (this.etime[var1] % 10 == 0) {
                     this.sh((this.rand.nextInt() >>> 1) % 200, 0.0F, 1, 1.5F, 90.0F, 0, 40, 0, 3, 2);
                  }

                  if (this.etime[var1] % 10 == 0) {
                     this.sh((this.rand.nextInt() >>> 1) % 200, 240.0F, 1, 1.5F, -90.0F, 0, 40, 0, 3, 2);
                  }
               }

               if (this.etime[var1] == 240) {
                  this.edoing[var1]++;
               }
            } else if (this.edoing[var1] == 17) {
               if (this.etime[var1] % 40 == 1) {
                  if (this.eholdnumber[var1] == 0) {
                     this.eXmove[var1] = 10.0F;
                  }

                  if (this.eholdnumber[var1] == 1) {
                     this.eXmove[var1] = -10.0F;
                  }
               }

               if (this.etime[var1] % 40 == 21) {
                  effectIn(this.eX[var1], this.eY[var1], 777, 0, 0, 0);
                  this.eXmove[var1] = 0.0F;
               }

               if (this.etime[var1] % 40 == 0) {
                  this.eholdnumber[var1] = (this.eholdnumber[var1] + 1) % 2;
                  if (this.etime[var1] % 120 == 0) {
                     this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 2;
                  }

                  if (this.eholdnumber[var1] == 0) {
                     this.eX[var1] = 2.0F;
                  }

                  if (this.eholdnumber[var1] == 1) {
                     this.eX[var1] = this.migi;
                  }

                  if (this.eholdnumber[var1] == 0) {
                     this.eY[var1] = 30.0F;
                  }

                  if (this.eholdnumber[var1] == 1) {
                     this.eY[var1] = 210.0F;
                  }
               }

               if (this.stagelevel == 0) {
                  if (this.etime[var1] % 40 < 22 && this.etime[var1] % 2 == 0) {
                     this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

                     for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                        this.sh(this.eX[var1], this.eY[var1], 8, (float)(1.5 + 0.3 * this.cyc), this.ehnum[var1], 0, 0, 20, 3, 4);
                     }
                  }

                  if (this.etime[var1] % 15 == 0) {
                     this.sh((this.rand.nextInt() >>> 1) % 200, 0.0F, 1, 1.5F, 90.0F, 0, 40, 0, 3, 2);
                  }

                  if (this.etime[var1] % 20 == 0) {
                     this.sh((this.rand.nextInt() >>> 1) % 200, 240.0F, 1, 1.5F, -90.0F, 0, 40, 0, 3, 2);
                  }
               } else if (this.stagelevel == 1) {
                  if (this.etime[var1] % 40 < 22 && this.etime[var1] % 1 == 0) {
                     this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

                     for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                        this.sh(this.eX[var1], this.eY[var1], 8, (float)(2.0 + 0.6 * this.cyc), this.ehnum[var1], 0, 0, 20, 3, 4);
                     }
                  }

                  if (this.etime[var1] % 10 == 0) {
                     this.sh((this.rand.nextInt() >>> 1) % 200, 0.0F, 1, 1.5F, 90.0F, 0, 40, 0, 3, 2);
                  }

                  if (this.etime[var1] % 10 == 0) {
                     this.sh((this.rand.nextInt() >>> 1) % 200, 240.0F, 1, 1.5F, -90.0F, 0, 40, 0, 3, 2);
                  }
               }
            } else if (this.edoing[var1] == 18) {
               if (this.etime[var1] == 1) {
                  this.eXmove[var1] = (120.0F - this.eX[var1]) / 30.0F;
                  this.bossmode = 0;
                  effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
                  this.stagetime = 50000;
                  this.bossmahoujinn = 0;
               }

               if (this.etime[var1] == 30) {
                  for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                     this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
                  }

                  for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                     this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
                  }

                  this.bossmahoujinn = 0;
                  this.emode[var1] = 0;
               }
            }
         }
      }
   }

   void stage5move(int var1) {
      if (this.emode[var1] == 1) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = this.emuki[var1] * 2;
            this.eYmove[var1] = -0.25F;
            this.etairyoku[var1] = 1.0F;
            this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 20;
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] % 20 == this.eholdnumber[var1]) {
               this.eholdnumber2[var1] = (this.rand.nextInt() >>> 1) % 21 - 10;
               this.sh(this.eX[var1], this.eY[var1], 2, 2.0F, this.eholdnumber2[var1], this.peopleX, this.peopleY, 0, 0, 0);
            }
         } else if (this.stagelevel == 1 && this.etime[var1] % 20 == this.eholdnumber[var1]) {
            this.eholdnumber2[var1] = (this.rand.nextInt() >>> 1) % 21 - 10;

            for (this.cyc = -1; this.cyc < 2; this.cyc++) {
               this.sh(this.eX[var1], this.eY[var1], 2, 3.0F, this.cyc * 40 + this.eholdnumber2[var1], this.peopleX, this.peopleY, 0, 0, 0);
            }
         }
      } else if (this.emode[var1] == 2) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = this.emuki[var1];
            this.eYmove[var1] = 0.0F;
            this.etairyoku[var1] = 15.0F;
            this.eshape[var1] = 3;
         } else if (this.etime[var1] < 40) {
            this.eXmove[var1] = (float)(this.eXmove[var1] - this.emuki[var1] * 0.025);
            this.eYmove[var1] = (float)(this.eYmove[var1] - 0.05);
         } else if (this.etime[var1] == 40) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
            this.eholdnumber2[var1] = 30;
         } else if (this.etime[var1] == 120) {
            this.eYmove[var1] = -2.0F;
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] > 40 && this.etime[var1] < 120 && this.etime[var1] % 3 == 0) {
               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.sh(
                     (float)(this.eX[var1] + this.eholdnumber2[var1] * Math.cos((this.cyc * 72 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     (float)(this.eY[var1] + this.eholdnumber2[var1] * Math.sin((this.cyc * 72 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     3,
                     2.0F,
                     this.cyc * 72 + this.eholdnumber[var1] - 90 + this.cyc2 * 5,
                     0,
                     2,
                     20,
                     2,
                     1
                  );
               }

               this.eholdnumber[var1] = this.eholdnumber[var1] + 13;
               this.eholdnumber2[var1] = this.eholdnumber2[var1] - 2;
            }

            if (this.etime[var1] > 40 && this.etime[var1] < 120 && this.etime[var1] % 20 == 0) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 3.0F, this.ehnum[var1] + this.cyc * 72, 0, 20, 50, 5, 1);
               }
            }
         } else if (this.stagelevel == 1) {
            if (this.etime[var1] > 40 && this.etime[var1] < 120 && this.etime[var1] % 2 == 0) {
               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.sh(
                     (float)(this.eX[var1] + this.eholdnumber2[var1] * Math.cos((this.cyc * 72 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     (float)(this.eY[var1] + this.eholdnumber2[var1] * Math.sin((this.cyc * 72 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     3,
                     2.5F,
                     this.cyc * 72 + this.eholdnumber[var1] - 90 + this.cyc2 * 5,
                     0,
                     2,
                     20,
                     2,
                     1
                  );
               }

               this.eholdnumber[var1] = this.eholdnumber[var1] + 13;
               this.eholdnumber2[var1] = this.eholdnumber2[var1] - 2;
            }

            if (this.etime[var1] > 40 && this.etime[var1] < 120 && this.etime[var1] % 10 == 0) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 3.0F, this.ehnum[var1] + this.cyc * 72, 0, 20, 50, 5, 1);
               }
            }
         }
      } else if (this.emode[var1] == 3) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 4 * this.emuki[var1];
            this.etairyoku[var1] = 10.0F;
            this.eshape[var1] = 1;
            this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 360;
         } else if (this.etime[var1] == 15) {
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] > 31) {
            this.eYmove[var1] = (float)(this.eYmove[var1] + 0.15 * this.emuki[var1]);
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] > 15 && this.etime[var1] % 2 == 0) {
               for (this.cyc = 0; this.cyc < 1; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 8, 2.0F, this.eholdnumber[var1] + this.cyc * 90, 0, 2, 20, 0, 5);
               }

               if (this.eX[var1] < 120.0F) {
                  this.eholdnumber[var1] = this.eholdnumber[var1] + 17;
               }

               if (this.eX[var1] > 120.0F) {
                  this.eholdnumber[var1] = this.eholdnumber[var1] - 17;
               }
            }
         } else if (this.stagelevel == 1 && this.etime[var1] > 15 && this.etime[var1] % 2 == 0) {
            for (this.cyc = 0; this.cyc < 1; this.cyc++) {
               this.sh(this.eX[var1], this.eY[var1], 8, 1.5F, this.eholdnumber[var1] + this.cyc * 90, 0, 2, 20, 0, 5);
            }

            for (this.cyc = 0; this.cyc < 1; this.cyc++) {
               this.sh(this.eX[var1], this.eY[var1], 8, 2.0F, this.eholdnumber[var1] + this.cyc * 90, 0, 2, 20, 0, 5);
            }

            if (this.eX[var1] < 120.0F) {
               this.eholdnumber[var1] = this.eholdnumber[var1] + 17;
            }

            if (this.eX[var1] > 120.0F) {
               this.eholdnumber[var1] = this.eholdnumber[var1] - 17;
            }
         }
      } else if (this.emode[var1] == 4) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 4.0F;
            this.etairyoku[var1] = 1.0F;
            this.eshape[var1] = 1;
         }

         if (this.etime[var1] < 20) {
            this.etairyoku[var1] = 1.0F;
         }

         this.eYmove[var1] = (float)(this.eYmove[var1] - 0.1);
         if (this.stagelevel == 0) {
            if (this.etime[var1] % 8 == 0) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 45;

               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 3.0F, this.cyc * 90 + this.eholdnumber[var1], 0, 30, 60, 0, 3);
               }
            }

            if (this.etime[var1] % 8 == 4) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 45;

               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 3.0F, 45 + this.cyc * 90 + this.eholdnumber[var1], 0, 30, 60, 0, 0);
               }
            }
         } else if (this.stagelevel == 1) {
            if (this.etime[var1] % 6 == 0) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 45;

               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 3.0F, this.cyc * 90 + this.eholdnumber[var1], 0, 30, 60, 0, 3);
               }
            }

            if (this.etime[var1] % 6 == 3) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 45;

               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 3.0F, 45 + this.cyc * 90 + this.eholdnumber[var1], 0, 30, 60, 0, 0);
               }
            }
         }
      } else if (this.emode[var1] == 5) {
         if (this.etime[var1] == 1) {
            this.etairyoku[var1] = 100000.0F;
         }

         this.eXmove[var1] = (float)(-1.0 * Math.sin(this.emuki[var1] * 3.1415 / 180.0));
         this.eYmove[var1] = (float)(1.0 + 1.0 * Math.cos(this.emuki[var1] * 3.1415 / 180.0));
         this.emuki[var1] = this.emuki[var1] + 7;
         if (this.stagelevel == 0) {
            if (this.etime[var1] < 120 && this.etime[var1] % 3 == 0) {
               this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, 180 + this.emuki[var1], 0, 20, 60, 2, 3);
            }
         } else if (this.stagelevel == 1 && this.etime[var1] % 3 == 0) {
            this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, 180 + this.emuki[var1], 0, 20, 60, 2, 3);
         }

         if (this.edoing[this.bossnum] != 3) {
            this.etairyoku[var1] = -10.0F;
         }
      } else if (this.emode[var1] == 6) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = (float)(2.0 * Math.cos(this.emuki[var1] * 3.1415 / 180.0));
            this.eYmove[var1] = (float)(2.0 * Math.sin(this.emuki[var1] * 3.1415 / 180.0));
            this.etairyoku[var1] = 10000.0F;
         }

         if (this.etime[var1] > 30) {
            this.eXmove[var1] = (float)(-Math.sin(this.emuki[var1] * 3.1415 / 180.0));
            this.eYmove[var1] = (float)Math.cos(this.emuki[var1] * 3.1415 / 180.0);
            this.etairyoku[var1] = 10000.0F;
            this.emuki[var1]++;
            this.emuki[var1]++;
         }

         if (this.etime[var1] == 60) {
            this.ehnum[var1] = this.getkakudo(this.eX[this.bossnum], this.eY[this.bossnum], this.peopleX, this.peopleY);

            for (this.cyc = 0; this.cyc < 6; this.cyc++) {
               this.laserIn(this.eX[var1], this.eY[var1], 1, 3.0F, this.cyc * 60 + this.ehnum[var1], 3.0F, 100, 0, 0, 5);
            }
         }

         if (this.etime[var1] == 61) {
            for (this.cyc = 0; this.cyc < 24; this.cyc++) {
               this.sh(
                  this.eX[var1], this.eY[var1], 8, (float)(3.0 + (this.rand.nextInt() >>> 1) % 24 * 0.25), this.ehnum[var1] + this.cyc * 15, 0, 10, 0, 2, 2
               );
            }

            this.etairyoku[var1] = -10.0F;
         }

         if (this.edoing[this.bossnum] != 6) {
            this.etairyoku[var1] = -10.0F;
         }
      } else if (this.emode[var1] == 7) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 5.0F;
            this.etairyoku[var1] = 20.0F;
         }

         if (this.etime[var1] == 20) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         }

         if (this.etime[var1] == 40) {
            this.eXmove[var1] = 4 * this.emuki[var1];
            this.eYmove[var1] = 0.0F;
         }

         if (this.etime[var1] == 30) {
            this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 10;

            for (this.cyc = 0; this.cyc < 24; this.cyc++) {
               this.sh(this.eX[var1], this.eY[var1], 3, 3.0F, this.eholdnumber[var1] + this.cyc * 15, 0, 20, 50, 0, 1);
            }
         }
      } else if (this.emode[var1] == 1000) {
         if (this.edoing[var1] == 0) {
            this.bosstairyoku = 100.0F;
            this.bosstimelim = 900;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 50.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 50.0F;
               this.bossmahoujinn = 1;
               effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               this.etairyoku[var1] = 10000.0F;
               this.bossmode = 1;
               this.eboss[var1] = 1;
               this.bossnum = var1;
               this.bossnokori = 5;
            } else if (this.etime[var1] == 51) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 60) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
               this.eholdnumber[var1] = -90;
               this.eholdnumber2[var1] = 50;
            }
         } else if (this.edoing[var1] == 1) {
            if (this.etime[var1] % 100 == 70) {
               this.getemove(var1, 20, 1);
            }

            if (this.etime[var1] % 100 == 90) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] % 100 == 0) {
               this.eholdnumber[var1] = -90;
               this.eholdnumber2[var1] = 50;
               this.eholdnumber3[var1]++;
            }

            if (this.etime[var1] % 100 == 30) {
               this.eholdnumber[var1] = -90;
               this.eholdnumber2[var1] = 50;
               this.eholdnumber3[var1]++;
            }

            if (this.stagelevel == 0) {
               if (this.etime[var1] % 100 < 16) {
                  if (this.etime[var1] % 1 == 0) {
                     for (this.cyc = 0; this.cyc < 1; this.cyc++) {
                        this.tmX[this.cyc] = (float)(this.eX[var1] + this.eholdnumber2[var1] * Math.cos(this.eholdnumber[var1] * 3.1415 / 180.0));
                        this.tmY[this.cyc] = (float)(this.eY[var1] + this.eholdnumber2[var1] * Math.sin(this.eholdnumber[var1] * 3.1415 / 180.0));
                     }

                     for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                        this.sh(this.tmX[0], this.tmY[0], 3, 2.0F, this.eholdnumber[var1] + this.cyc * 90, 0, 20, 40, 2, this.eholdnumber3[var1] % 4);
                     }

                     for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                        this.sh(this.tmX[0], this.tmY[0], 1, 2.0F, this.eholdnumber[var1] + this.cyc * 90, 0, 20, 50, 2, this.eholdnumber3[var1] % 4);
                     }

                     this.eholdnumber[var1] = this.eholdnumber[var1] - 23;
                     this.eholdnumber2[var1] = this.eholdnumber2[var1] - 3;
                  }
               } else if (this.etime[var1] % 100 < 62 && this.etime[var1] % 100 > 45 && this.etime[var1] % 1 == 0) {
                  for (this.cyc = 0; this.cyc < 1; this.cyc++) {
                     this.tmX[this.cyc] = (float)(this.eX[var1] + this.eholdnumber2[var1] * Math.cos(this.eholdnumber[var1] * 3.1415 / 180.0));
                     this.tmY[this.cyc] = (float)(this.eY[var1] + this.eholdnumber2[var1] * Math.sin(this.eholdnumber[var1] * 3.1415 / 180.0));
                  }

                  for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                     this.sh(this.tmX[0], this.tmY[0], 3, 2.0F, this.eholdnumber[var1] + this.cyc * 90, 0, 20, 40, 2, this.eholdnumber3[var1] % 4);
                  }

                  for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                     this.sh(this.tmX[0], this.tmY[0], 1, 2.0F, this.eholdnumber[var1] + this.cyc * 90, 0, 20, 50, 2, this.eholdnumber3[var1] % 4);
                  }

                  this.eholdnumber[var1] = this.eholdnumber[var1] + 23;
                  this.eholdnumber2[var1] = this.eholdnumber2[var1] - 3;
               }
            } else if (this.stagelevel == 1) {
               if (this.etime[var1] % 100 < 16) {
                  if (this.etime[var1] % 1 == 0) {
                     for (this.cyc = 0; this.cyc < 1; this.cyc++) {
                        this.tmX[this.cyc] = (float)(this.eX[var1] + this.eholdnumber2[var1] * Math.cos(this.eholdnumber[var1] * 3.1415 / 180.0));
                        this.tmY[this.cyc] = (float)(this.eY[var1] + this.eholdnumber2[var1] * Math.sin(this.eholdnumber[var1] * 3.1415 / 180.0));
                     }

                     for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                        this.sh(this.tmX[0], this.tmY[0], 3, 2.5F, this.eholdnumber[var1] + this.cyc * 60, 0, 20, 40, 2, this.eholdnumber3[var1] % 4);
                     }

                     for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                        this.sh(this.tmX[0], this.tmY[0], 1, 2.5F, this.eholdnumber[var1] + this.cyc * 60, 0, 20, 50, 2, this.eholdnumber3[var1] % 4);
                     }

                     this.eholdnumber[var1] = this.eholdnumber[var1] - 23;
                     this.eholdnumber2[var1] = this.eholdnumber2[var1] - 3;
                  }
               } else if (this.etime[var1] % 100 < 62 && this.etime[var1] % 100 > 45 && this.etime[var1] % 1 == 0) {
                  for (this.cyc = 0; this.cyc < 1; this.cyc++) {
                     this.tmX[this.cyc] = (float)(this.eX[var1] + this.eholdnumber2[var1] * Math.cos(this.eholdnumber[var1] * 3.1415 / 180.0));
                     this.tmY[this.cyc] = (float)(this.eY[var1] + this.eholdnumber2[var1] * Math.sin(this.eholdnumber[var1] * 3.1415 / 180.0));
                  }

                  for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                     this.sh(this.tmX[0], this.tmY[0], 3, 2.5F, this.eholdnumber[var1] + this.cyc * 60, 0, 20, 40, 2, this.eholdnumber3[var1] % 4);
                  }

                  for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                     this.sh(this.tmX[0], this.tmY[0], 1, 2.5F, this.eholdnumber[var1] + this.cyc * 60, 0, 20, 50, 2, this.eholdnumber3[var1] % 4);
                  }

                  this.eholdnumber[var1] = this.eholdnumber[var1] + 23;
                  this.eholdnumber2[var1] = this.eholdnumber2[var1] - 3;
               }
            }
         } else if (this.edoing[var1] == 2) {
            this.bosstairyoku = 150.0F;
            this.bosstimelim = 600;
            this.spelbonus = 8000;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (80.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 4, 0, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "廻呪「踊る恐怖の藁人形」";
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 60) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 3) {
            if (this.etime[var1] % 150 == 90) {
               this.getemove(var1, 30, 1);
            }

            if (this.etime[var1] % 150 == 120) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] % 150 == 1) {
               this.eIn((int)(this.eX[var1] + 25.0F), (int)this.eY[var1], 5, 0, 1);
               this.eIn((int)(this.eX[var1] - 25.0F), (int)this.eY[var1], 5, 180, 1);
            }
         } else if (this.edoing[var1] == 4) {
            if (this.etime[var1] == 1) {
               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
               }

               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
               }

               this.bossmahoujinn = 0;
               this.bossmode = 0;
               this.bossmahoujinn = 0;
               effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 4, 0, 0, 0);
               this.stagetime = 20000;
            }

            if (this.etime[var1] == 50) {
               this.eXmove[var1] = 2.0F;
               this.eYmove[var1] = -3.0F;
            }
         }
      } else if (this.emode[var1] == 1001) {
         if (this.edoing[var1] == 0) {
            this.bossmahoujinn = 0;
            this.bossnum = var1;
            this.bossnokori = 4;
            this.eX[var1] = this.migi + 15;
            this.eY[var1] = -10.0F;
            this.etairyoku[var1] = 10000.0F;
         } else if (this.edoing[var1] == 1) {
            this.etime[var1] = 0;
            this.edoing[var1]++;
         } else if (this.edoing[var1] == 2) {
            if (this.etime[var1] == 1) {
               this.bossmahoujinn = 1;
               effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
            } else if (this.etime[var1] == 31) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }
         } else if (this.edoing[var1] == 3) {
            this.bosstairyoku = 200.0F;
            this.bosstimelim = 900;
            if (this.etime[var1] == 1) {
               this.player.stop();

               try {
                  MediaSound var2 = MediaManager.getSound("resource:///11.mld");
                  var2.use();
                  this.player = AudioPresenter.getAudioPresenter();
                  this.player.setSound(var2);
                  this.player.setMediaListener(this);
               } catch (Exception var3) {
               }

               this.player.setAttribute(4, this.volume);
               this.player.play();
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 10.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 10.0F;
            } else if (this.etime[var1] == 11) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] == 30) {
               this.bossmode = 1;
               this.eboss[var1] = 1;
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 4) {
            if (this.etime[var1] % 120 == 60) {
               this.getemove(var1, 30, 1);
            }

            if (this.etime[var1] % 120 == 90) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] % 240 == 1) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 90;
            }

            if (this.stagelevel == 0) {
               if (this.etime[var1] % 240 == 1) {
                  for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                     for (this.cyc2 = 0; this.cyc2 < 8; this.cyc2++) {
                        this.sh(
                           this.eX[var1],
                           this.eY[var1],
                           3,
                           (float)(1.8 + this.cyc2 * 0.16),
                           this.cyc * 36 + this.eholdnumber[var1] + this.cyc2 * 13,
                           180,
                           30,
                           40,
                           2,
                           2
                        );
                     }

                     for (this.cyc2 = 0; this.cyc2 < 8; this.cyc2++) {
                        this.sh(
                           this.eX[var1],
                           this.eY[var1],
                           1,
                           (float)(1.8 + this.cyc2 * 0.16),
                           this.cyc * 36 + this.eholdnumber[var1] + this.cyc2 * 13 + 18,
                           1,
                           6,
                           30,
                           2,
                           2
                        );
                     }
                  }
               }

               if (this.etime[var1] % 240 == 121) {
                  for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                     for (this.cyc2 = 0; this.cyc2 < 8; this.cyc2++) {
                        this.sh(
                           this.eX[var1],
                           this.eY[var1],
                           3,
                           (float)(1.8 + this.cyc2 * 0.16),
                           this.cyc * 36 + this.eholdnumber[var1] - this.cyc2 * 13,
                           180,
                           30,
                           40,
                           2,
                           2
                        );
                     }

                     for (this.cyc2 = 0; this.cyc2 < 8; this.cyc2++) {
                        this.sh(
                           this.eX[var1],
                           this.eY[var1],
                           1,
                           (float)(1.8 + this.cyc2 * 0.16),
                           this.cyc * 36 + this.eholdnumber[var1] - this.cyc2 * 13 + 18,
                           1,
                           6,
                           30,
                           2,
                           2
                        );
                     }
                  }
               }
            } else if (this.stagelevel == 1) {
               if (this.etime[var1] % 240 == 1) {
                  for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                     for (this.cyc2 = 0; this.cyc2 < 10; this.cyc2++) {
                        this.sh(
                           this.eX[var1],
                           this.eY[var1],
                           3,
                           (float)(2.0 + this.cyc2 * 0.15),
                           this.cyc * 30 + this.eholdnumber[var1] + this.cyc2 * 13,
                           180,
                           30,
                           40,
                           2,
                           2
                        );
                     }

                     for (this.cyc2 = 0; this.cyc2 < 10; this.cyc2++) {
                        this.sh(
                           this.eX[var1],
                           this.eY[var1],
                           1,
                           (float)(2.0 + this.cyc2 * 0.15),
                           this.cyc * 30 + this.eholdnumber[var1] + this.cyc2 * 13 + 15,
                           1,
                           6,
                           30,
                           2,
                           2
                        );
                     }
                  }
               }

               if (this.etime[var1] % 240 == 121) {
                  for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                     for (this.cyc2 = 0; this.cyc2 < 10; this.cyc2++) {
                        this.sh(
                           this.eX[var1],
                           this.eY[var1],
                           3,
                           (float)(2.0 + this.cyc2 * 0.15),
                           this.cyc * 30 + this.eholdnumber[var1] - this.cyc2 * 13,
                           180,
                           30,
                           40,
                           2,
                           2
                        );
                     }

                     for (this.cyc2 = 0; this.cyc2 < 10; this.cyc2++) {
                        this.sh(
                           this.eX[var1],
                           this.eY[var1],
                           1,
                           (float)(2.0 + this.cyc2 * 0.15),
                           this.cyc * 30 + this.eholdnumber[var1] - this.cyc2 * 13 + 15,
                           1,
                           6,
                           30,
                           2,
                           2
                        );
                     }
                  }
               }
            }
         } else if (this.edoing[var1] == 5) {
            this.bosstairyoku = 150.0F;
            this.bosstimelim = 1200;
            this.spelbonus = 12000;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (80.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 6, 0, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "破滅「ルーインマリオネット」";
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 60) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 6) {
            if (this.etime[var1] % 15 == 1) {
               if (this.stagelevel == 0) {
                  for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 36 + this.eholdnumber[var1] * 7, 1, 6, 30, 0, 1);
                  }

                  this.eholdnumber[var1]++;
               }

               if (this.stagelevel == 1) {
                  for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 1, 2.5F, this.cyc * 36 + this.eholdnumber[var1] * 11, 1, 6, 30, 0, 1);
                  }

                  this.eholdnumber[var1]++;
               }
            }

            if (this.etime[var1] % 150 == 1) {
               if (this.stagelevel == 0) {
                  for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                     this.eIn((int)this.eX[var1], (int)this.eY[var1], 6, this.cyc * 120, 1);
                  }
               }

               if (this.stagelevel == 1) {
                  for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                     this.eIn((int)this.eX[var1], (int)this.eY[var1], 6, this.cyc * 60, 1);
                  }
               }
            }
         } else if (this.edoing[var1] == 7) {
            this.bosstairyoku = 150.0F;
            this.bosstimelim = 600;
            if (this.etime[var1] == 1) {
               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
               }

               for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
               }

               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 30) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 60) {
               this.eholdnumber[var1] = -90;
               this.eholdnumber2[var1] = 50;
               this.eholdnumber3[var1]++;
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 8) {
            if (this.etime[var1] % 120 == 0) {
               this.eholdnumber[var1] = -90;
               this.eholdnumber2[var1] = 50;
               this.eholdnumber3[var1]++;
            }

            if (this.etime[var1] % 120 == 60) {
               this.eholdnumber[var1] = -90;
               this.eholdnumber2[var1] = 50;
               this.eholdnumber3[var1]++;
            }

            if (this.stagelevel == 0) {
               if (this.etime[var1] % 180 == 1) {
                  this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 18;

                  for (this.cyc = 0; this.cyc < 20; this.cyc++) {
                     this.sh(30.0F, this.eX[var1], this.eY[var1], 3, 1.2F, this.cyc * 18 + this.eholdnumber[var1], 90, 30, 60, 2, 0);
                  }

                  for (this.cyc = 0; this.cyc < 20; this.cyc++) {
                     this.sh(30.0F, this.eX[var1], this.eY[var1], 3, 1.2F, this.cyc * 18 + this.eholdnumber[var1] + 9, -90, 30, 60, 2, 0);
                  }

                  for (this.cyc = 0; this.cyc < 20; this.cyc++) {
                     this.sh(30.0F, this.eX[var1], this.eY[var1], 3, 1.5F, this.cyc * 18 + this.eholdnumber[var1], 90, 30, 60, 2, 0);
                  }

                  for (this.cyc = 0; this.cyc < 20; this.cyc++) {
                     this.sh(30.0F, this.eX[var1], this.eY[var1], 3, 1.5F, this.cyc * 18 + this.eholdnumber[var1] + 9, -90, 30, 60, 2, 0);
                  }
               } else if (this.etime[var1] % 180 == 31) {
                  this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 18;

                  for (this.cyc = 0; this.cyc < 20; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 3, 3.5F, this.cyc * 18 + this.eholdnumber[var1], 150, 30, 90, 0, 1);
                  }

                  for (this.cyc = 0; this.cyc < 20; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 3, 3.5F, this.cyc * 18 + this.eholdnumber[var1] + 9, -150, 30, 90, 0, 1);
                  }
               } else if (this.etime[var1] % 180 == 61) {
                  this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 18;

                  for (this.cyc = 0; this.cyc < 15; this.cyc++) {
                     this.sh(10.0F, this.eX[var1], this.eY[var1], 4, 2.5F, this.cyc * 24 + this.eholdnumber[var1], 4, 20, 60, 0, 2);
                  }

                  for (this.cyc = 0; this.cyc < 15; this.cyc++) {
                     this.sh(10.0F, this.eX[var1], this.eY[var1], 4, 2.5F, this.cyc * 24 + this.eholdnumber[var1] + 12, -4, 20, 60, 0, 2);
                  }
               }
            } else if (this.stagelevel == 1) {
               if (this.etime[var1] % 180 == 1) {
                  this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 18;

                  for (this.cyc = 0; this.cyc < 20; this.cyc++) {
                     this.sh(30.0F, this.eX[var1], this.eY[var1], 3, 1.2F, this.cyc * 18 + this.eholdnumber[var1], 100, 30, 60, 2, 0);
                  }

                  for (this.cyc = 0; this.cyc < 20; this.cyc++) {
                     this.sh(30.0F, this.eX[var1], this.eY[var1], 3, 1.2F, this.cyc * 18 + this.eholdnumber[var1] + 4, -100, 40, 60, 2, 0);
                  }

                  for (this.cyc = 0; this.cyc < 20; this.cyc++) {
                     this.sh(30.0F, this.eX[var1], this.eY[var1], 3, 1.5F, this.cyc * 18 + this.eholdnumber[var1] + 9, 100, 30, 60, 2, 0);
                  }

                  for (this.cyc = 0; this.cyc < 20; this.cyc++) {
                     this.sh(30.0F, this.eX[var1], this.eY[var1], 3, 1.5F, this.cyc * 18 + this.eholdnumber[var1] + 13, -100, 40, 60, 2, 0);
                  }
               } else if (this.etime[var1] % 180 == 31) {
                  this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 18;

                  for (this.cyc = 0; this.cyc < 20; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 3, 3.5F, this.cyc * 18 + this.eholdnumber[var1], 150, 30, 90, 0, 1);
                  }

                  for (this.cyc = 0; this.cyc < 20; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 3, 3.5F, this.cyc * 18 + this.eholdnumber[var1] + 9, -150, 30, 90, 0, 1);
                  }
               } else if (this.etime[var1] % 180 == 61) {
                  this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 18;

                  for (this.cyc = 0; this.cyc < 20; this.cyc++) {
                     this.sh(10.0F, this.eX[var1], this.eY[var1], 4, 2.5F, this.cyc * 18 + this.eholdnumber[var1], 4, 20, 60, 0, 2);
                  }

                  for (this.cyc = 0; this.cyc < 20; this.cyc++) {
                     this.sh(10.0F, this.eX[var1], this.eY[var1], 4, 2.5F, this.cyc * 18 + this.eholdnumber[var1] + 9, -4, 20, 60, 0, 2);
                  }
               } else if (this.etime[var1] % 180 == 91) {
                  this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

                  for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                     this.sh(10.0F, this.eX[var1], this.eY[var1], 1, 3.0F, this.cyc * 30 + this.ehnum[var1], 0, 0, 0, 5, 3);
                  }
               }
            }
         } else if (this.edoing[var1] == 9) {
            this.bosstairyoku = 250.0F;
            this.bosstimelim = 1200;
            this.spelbonus = 12000;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (90.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 6, 0, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "「アルティメット京人形」";
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 60) {
               for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                  this.tmmode[this.cyc] = 4;
                  this.tmX[this.cyc] = 900.0F;
                  this.tmY[this.cyc] = 900.0F;
               }

               this.etime[var1] = 0;
               this.edoing[var1]++;
               this.eholdnumber[var1] = 0;
               this.eholdnumber2[var1] = 0;
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
            }
         } else if (this.edoing[var1] == 10) {
            if (this.etime[var1] % 90 == 60) {
               this.getemove(var1, 20, 2);
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] % 90 == 80) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.stagelevel == 0) {
               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.tmX[this.cyc] = (float)(this.eX[var1] + 40.0 * Math.cos((this.eholdnumber[var1] + 72 * this.cyc) * 3.1415 / 180.0));
                  this.tmY[this.cyc] = (float)(this.eY[var1] + 40.0 * Math.sin((this.eholdnumber[var1] + 72 * this.cyc) * 3.1415 / 180.0));
               }

               if (this.etime[var1] % 450 < 150) {
                  this.eholdnumber[var1] = this.eholdnumber[var1] + 7;
                  this.eholdnumber2[var1] = this.eholdnumber2[var1] - 13;
                  if (this.etime[var1] > 60 && this.etime[var1] % 2 == 0) {
                     for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                        this.sh(
                           this.tmX[this.cyc], this.tmY[this.cyc], 1, 2.0F, this.cyc * 72 - this.eholdnumber[var1] + this.eholdnumber2[var1], 1, 6, 30, 2, 0
                        );
                     }
                  }
               } else if (this.etime[var1] % 450 < 300) {
                  this.eholdnumber[var1] = this.eholdnumber[var1] - 7;
                  this.eholdnumber2[var1] = this.eholdnumber2[var1] + 13;
                  if (this.etime[var1] > 60 && this.etime[var1] % 2 == 0) {
                     for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                        this.sh(this.tmX[this.cyc], this.tmY[this.cyc], 1, 2.0F, -this.eholdnumber2[var1], 1, 6, 30, 2, 3);
                     }
                  }
               } else {
                  this.eholdnumber[var1] = this.eholdnumber[var1] + 23;
                  this.eholdnumber2[var1] = this.eholdnumber2[var1] - 13;
                  if (this.etime[var1] > 60 && this.etime[var1] % 3 == 0) {
                     for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                        this.sh(
                           this.tmX[this.cyc], this.tmY[this.cyc], 1, 2.0F, this.cyc * 72 - this.eholdnumber[var1] + this.eholdnumber2[var1], 1, 6, 30, 2, 1
                        );
                     }
                  }
               }
            } else if (this.stagelevel == 1) {
               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.tmX[this.cyc] = (float)(this.eX[var1] + 40.0 * Math.cos((this.eholdnumber[var1] + 72 * this.cyc) * 3.1415 / 180.0));
                  this.tmY[this.cyc] = (float)(this.eY[var1] + 40.0 * Math.sin((this.eholdnumber[var1] + 72 * this.cyc) * 3.1415 / 180.0));
               }

               if (this.etime[var1] % 450 < 150) {
                  this.eholdnumber[var1] = this.eholdnumber[var1] + 7;
                  this.eholdnumber2[var1] = this.eholdnumber2[var1] - 13;
                  if (this.etime[var1] > 60 && this.etime[var1] % 1 == 0) {
                     for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                        this.sh(
                           this.tmX[this.cyc], this.tmY[this.cyc], 8, 6.0F, this.cyc * 72 - this.eholdnumber[var1] + this.eholdnumber2[var1], 1, 10, 0, 2, 0
                        );
                     }
                  }
               } else if (this.etime[var1] % 450 < 300) {
                  this.eholdnumber[var1] = this.eholdnumber[var1] - 7;
                  this.eholdnumber2[var1] = this.eholdnumber2[var1] + 13;
                  if (this.etime[var1] > 60 && this.etime[var1] % 1 == 0) {
                     for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                        this.sh(this.tmX[this.cyc], this.tmY[this.cyc], 8, 6.0F, -this.eholdnumber2[var1], 1, 10, 0, 2, 3);
                     }
                  }
               } else {
                  this.eholdnumber[var1] = this.eholdnumber[var1] + 23;
                  this.eholdnumber2[var1] = this.eholdnumber2[var1] - 13;
                  if (this.etime[var1] > 60 && this.etime[var1] % 2 == 0) {
                     for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                        this.sh(
                           this.tmX[this.cyc], this.tmY[this.cyc], 8, 9.0F, this.cyc * 72 - this.eholdnumber[var1] + this.eholdnumber2[var1], 1, 10, 0, 2, 1
                        );
                     }
                  }
               }
            }
         } else if (this.edoing[var1] == 11) {
            this.bosstairyoku = 150.0F;
            this.bosstimelim = 600;
            if (this.etime[var1] == 1) {
               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.tmmode[this.cyc] = 0;
               }

               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
               }

               for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
               }

               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 60) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 12) {
            if (this.etime[var1] % 120 == 60) {
               this.getemove(var1, 10, 2);
            }

            if (this.etime[var1] % 120 == 70) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.stagelevel == 0) {
               if (this.etime[var1] % 150 == 1) {
                  this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 10;

                  for (this.cyc = 0; this.cyc < 24; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 3, 2.5F, this.eholdnumber[var1] + this.cyc * 15, -90, 40, 60, 2, 2);
                  }

                  for (this.cyc = 0; this.cyc < 24; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 3, 2.5F, this.eholdnumber[var1] + this.cyc * 15, 90, 35, 65, 2, 3);
                  }

                  for (this.cyc = 0; this.cyc < 24; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 3, 2.5F, this.eholdnumber[var1] + this.cyc * 15, -90, 30, 70, 2, 0);
                  }

                  for (this.cyc = 0; this.cyc < 24; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 3, 2.5F, this.eholdnumber[var1] + this.cyc * 15, 90, 25, 75, 2, 1);
                  }

                  for (this.cyc = 0; this.cyc < 24; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 3, 2.5F, this.eholdnumber[var1] + this.cyc * 15, -90, 20, 80, 2, 4);
                  }
               }
            } else if (this.stagelevel == 1 && this.etime[var1] % 150 == 1) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 10;

               for (this.cyc = 0; this.cyc < 30; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 3, 2.5F, this.eholdnumber[var1] + this.cyc * 12, -90, 40, 60, 2, 2);
               }

               for (this.cyc = 0; this.cyc < 30; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 3, 2.5F, this.eholdnumber[var1] + this.cyc * 12, 90, 35, 65, 2, 3);
               }

               for (this.cyc = 0; this.cyc < 30; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 3, 2.5F, this.eholdnumber[var1] + this.cyc * 12, -90, 30, 70, 2, 0);
               }

               for (this.cyc = 0; this.cyc < 30; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 3, 2.5F, this.eholdnumber[var1] + this.cyc * 12, 90, 25, 75, 2, 1);
               }

               for (this.cyc = 0; this.cyc < 30; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 3, 2.5F, this.eholdnumber[var1] + this.cyc * 12, -90, 20, 80, 2, 4);
               }
            }
         } else if (this.edoing[var1] == 13) {
            this.bosstairyoku = 400.0F;
            this.bosstimelim = 2700;
            this.spelbonus = 15000;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 6, 0, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "眩暈「アリスインカオス」";
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 70) {
               this.etime[var1] = 0;
               this.edoing[var1]++;

               for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                  this.tmmode[this.cyc] = 4;
                  this.tmX[this.cyc] = 900.0F;
                  this.tmY[this.cyc] = 900.0F;
               }
            }
         } else if (this.edoing[var1] == 14) {
            if (this.stagelevel == 0) {
               for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                  this.tmX[this.cyc] = this.eX[var1] + (float)(this.eholdnumber[var1] * Math.cos((this.eholdnumber2[var1] + this.cyc * 60) * 3.1415 / 180.0));
                  this.tmY[this.cyc] = this.eY[var1] + (float)(this.eholdnumber[var1] * Math.sin((this.eholdnumber2[var1] + this.cyc * 60) * 3.1415 / 180.0));
               }

               this.eholdnumber[var1] = this.eholdnumber[var1] + 2;
               if (this.etime[var1] % 120 == 0) {
                  this.eholdnumber[var1] = 0;
               }

               this.eholdnumber2[var1] = this.eholdnumber2[var1] + 4;
               if (this.etime[var1] % 120 > 20) {
                  this.eholdnumber2[var1] = this.eholdnumber2[var1] + 3;
               }

               if (this.etime[var1] % 4 == 0) {
                  for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                     this.sh(this.tmX[this.cyc], this.tmY[this.cyc], 3, 1.0F, this.cyc * 60, 0, 2, 30, 1, 4);
                  }
               }
            } else if (this.stagelevel == 1) {
               for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                  this.tmX[this.cyc] = this.eX[var1] + (float)(this.eholdnumber[var1] * Math.cos((this.eholdnumber2[var1] + this.cyc * 60) * 3.1415 / 180.0));
                  this.tmY[this.cyc] = this.eY[var1] + (float)(this.eholdnumber[var1] * Math.sin((this.eholdnumber2[var1] + this.cyc * 60) * 3.1415 / 180.0));
               }

               this.eholdnumber[var1] = this.eholdnumber[var1] + 2;
               if (this.etime[var1] % 120 == 0) {
                  this.eholdnumber[var1] = 0;
               }

               this.eholdnumber2[var1] = this.eholdnumber2[var1] + 4;
               if (this.etime[var1] % 120 > 20) {
                  this.eholdnumber2[var1] = this.eholdnumber2[var1] + 3;
               }

               if (this.etime[var1] % 2 == 0) {
                  for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                     this.sh(this.tmX[this.cyc], this.tmY[this.cyc], 3, 1.0F, this.cyc * 60, 1, 5, 10, 1, 4);
                  }
               }
            }
         } else if (this.edoing[var1] == 15) {
            this.bosstairyoku = 250.0F;
            this.bosstimelim = 2700;
            this.spelbonus = 15000;

            for (this.cyc = 0; this.cyc < 4; this.cyc++) {
               this.tmX[this.cyc] = this.eX[var1] + (float)(this.eholdnumber[var1] * Math.cos((this.eholdnumber2[var1] + this.cyc * 90) * 3.1415 / 180.0));
               this.tmY[this.cyc] = this.eY[var1] + (float)(this.eholdnumber[var1] * Math.sin((this.eholdnumber2[var1] + this.cyc * 90) * 3.1415 / 180.0));
            }

            this.eholdnumber2[var1] = this.eholdnumber2[var1] + 6;
            if (this.etime[var1] == 1) {
               this.eholdnumber[var1] = 60;

               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.tmmode[this.cyc] = 0;
               }

               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.tmmode[this.cyc] = 4;
                  this.tmX[this.cyc] = 900.0F;
                  this.tmY[this.cyc] = 900.0F;
               }

               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 60) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
               this.bossspel = 1;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 6, 0, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "「魔界印の上海人形」";
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 91) {
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] > 100 && this.etime[var1] < 131) {
               this.eholdnumber[var1]--;
            } else if (this.etime[var1] == 131) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
               this.eholdnumber[var1] = 30;
               this.eholdnumber2[var1] = this.eholdnumber2[var1] + 4;
            }
         } else if (this.edoing[var1] == 16) {
            for (this.cyc = 0; this.cyc < 4; this.cyc++) {
               this.tmX[this.cyc] = this.eX[var1] + (float)(this.eholdnumber[var1] * Math.cos((this.eholdnumber2[var1] + this.cyc * 90) * 3.1415 / 180.0));
               this.tmY[this.cyc] = this.eY[var1] + (float)(this.eholdnumber[var1] * Math.sin((this.eholdnumber2[var1] + this.cyc * 90) * 3.1415 / 180.0));
            }

            this.eholdnumber[var1] = 30;
            if (this.etime[var1] % 150 == 1) {
               this.eholdnumber2[var1] = this.eholdnumber2[var1] + 2;
            } else if (this.etime[var1] % 150 < 50) {
               this.eholdnumber2[var1] = this.eholdnumber2[var1] + 3;
            } else if (this.etime[var1] % 150 < 100) {
               this.eholdnumber2[var1] = this.eholdnumber2[var1] - 7;
            } else {
               this.eholdnumber2[var1] = this.eholdnumber2[var1] - 3;
            }

            if (this.stagelevel == 0) {
               if (this.etime[var1] % 150 == 100) {
                  for (this.cyc = 0; this.cyc < 24; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 15, 180, 20, 45 - this.etime[var1] % 150, 2, 1);
                  }

                  for (this.cyc = 0; this.cyc < 24; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 1, 1.5F, this.cyc * 15, 180, 20, 45 - this.etime[var1] % 150, 2, 1);
                  }
               }

               if (this.etime[var1] % 150 >= 30) {
                  if (this.etime[var1] % 150 < 40) {
                     if (this.etime[var1] % 2 == 0) {
                        for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                           this.sh(
                              this.tmX[this.cyc],
                              this.tmY[this.cyc],
                              3,
                              2.5F,
                              this.cyc * 90 + this.eholdnumber2[var1] - 90 + this.etime[var1] % 150 * 4,
                              180,
                              20,
                              65 - this.etime[var1] % 150,
                              2,
                              3
                           );
                        }
                     }
                  } else if (this.etime[var1] % 150 < 80) {
                     if (this.etime[var1] % 3 == 0) {
                        for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                           this.sh(
                              this.tmX[this.cyc],
                              this.tmY[this.cyc],
                              3,
                              1.5F,
                              this.cyc * 90 + 90 + this.etime[var1] % 150 * 13 + this.eholdnumber2[var1],
                              180,
                              20,
                              155 - this.etime[var1] % 150,
                              2,
                              0
                           );
                        }
                     }
                  } else if (this.etime[var1] % 150 < 130) {
                     if (this.etime[var1] % 3 == 0) {
                        for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                           this.sh(
                              this.tmX[this.cyc],
                              this.tmY[this.cyc],
                              3,
                              1.5F,
                              this.cyc * 90 + 180 + this.etime[var1] % 150 * 7 + this.eholdnumber2[var1],
                              180,
                              20,
                              195 - this.etime[var1] % 150,
                              2,
                              5
                           );
                        }
                     }
                  } else if (this.etime[var1] % 150 == 130) {
                     for (this.cyc = 0; this.cyc < 18; this.cyc++) {
                        this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 20, 180, 20, 45 - this.etime[var1] % 150, 2, 4);
                     }

                     this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

                     for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                        this.sh(40.0F, this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 45 + this.ehnum[var1], 0, 0, 0, 6, 1);
                     }

                     if (this.sevolume != 0) {
                        AudioPresenter var10001 = this.seplayer[0];
                        this.seplayer[0].setAttribute(4, this.sevolume);
                     }

                     if (this.sevolume != 0) {
                        this.seplayer[0].play();
                     }
                  }
               }

               if (this.etime[var1] % 150 == 60) {
                  this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

                  for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                     this.sh(40.0F, this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 45 + this.ehnum[var1], 0, 0, 0, 6, 2);
                  }

                  if (this.sevolume != 0) {
                     AudioPresenter var4 = this.seplayer[0];
                     this.seplayer[0].setAttribute(4, this.sevolume);
                  }

                  if (this.sevolume != 0) {
                     this.seplayer[0].play();
                  }
               }
            } else if (this.stagelevel == 1) {
               if (this.etime[var1] % 150 == 100) {
                  for (this.cyc = 0; this.cyc < 24; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 15, 180, 20, 45 - this.etime[var1] % 150, 2, 1);
                  }

                  for (this.cyc = 0; this.cyc < 24; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 1, 1.5F, this.cyc * 15, 180, 20, 45 - this.etime[var1] % 150, 2, 1);
                  }
               }

               if (this.etime[var1] % 150 >= 30) {
                  if (this.etime[var1] % 150 < 40) {
                     if (this.etime[var1] % 2 == 0) {
                        for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                           this.sh(
                              this.tmX[this.cyc],
                              this.tmY[this.cyc],
                              3,
                              2.1F,
                              this.cyc * 90 + this.eholdnumber2[var1] - 90 + this.etime[var1] % 150 * 4,
                              180,
                              20,
                              65 - this.etime[var1] % 150,
                              2,
                              3
                           );
                        }

                        for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                           this.sh(
                              this.tmX[this.cyc],
                              this.tmY[this.cyc],
                              3,
                              2.5F,
                              this.cyc * 90 + this.eholdnumber2[var1] - 90 + this.etime[var1] % 150 * 4,
                              180,
                              20,
                              65 - this.etime[var1] % 150,
                              2,
                              3
                           );
                        }
                     }
                  } else if (this.etime[var1] % 150 < 80) {
                     if (this.etime[var1] % 2 == 0) {
                        for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                           this.sh(
                              this.tmX[this.cyc],
                              this.tmY[this.cyc],
                              3,
                              1.5F,
                              this.cyc * 90 + 90 + this.etime[var1] % 150 * 13 + this.eholdnumber2[var1],
                              180,
                              20,
                              155 - this.etime[var1] % 150,
                              2,
                              0
                           );
                        }
                     }
                  } else if (this.etime[var1] % 150 < 130) {
                     if (this.etime[var1] % 2 == 0) {
                        for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                           this.sh(
                              this.tmX[this.cyc],
                              this.tmY[this.cyc],
                              3,
                              1.5F,
                              this.cyc * 90 + 180 + this.etime[var1] % 150 * 7 + this.eholdnumber2[var1],
                              180,
                              20,
                              195 - this.etime[var1] % 150,
                              2,
                              5
                           );
                        }
                     }
                  } else if (this.etime[var1] % 150 == 130) {
                     for (this.cyc = 0; this.cyc < 24; this.cyc++) {
                        this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 15, 180, 20, 45 - this.etime[var1] % 150, 2, 4);
                     }

                     this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

                     for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                        this.sh(40.0F, this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 45 + this.ehnum[var1], 0, 0, 0, 6, 1);
                     }

                     if (this.sevolume != 0) {
                        AudioPresenter var5 = this.seplayer[0];
                        this.seplayer[0].setAttribute(4, this.sevolume);
                     }

                     if (this.sevolume != 0) {
                        this.seplayer[0].play();
                     }
                  }
               }

               if (this.etime[var1] % 150 == 60) {
                  this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

                  for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                     this.sh(40.0F, this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 45 + this.ehnum[var1], 0, 0, 0, 6, 2);
                  }

                  if (this.sevolume != 0) {
                     AudioPresenter var6 = this.seplayer[0];
                     this.seplayer[0].setAttribute(4, this.sevolume);
                  }

                  if (this.sevolume != 0) {
                     this.seplayer[0].play();
                  }
               }
            }
         } else if (this.edoing[var1] == 17) {
            if (this.etime[var1] == 1) {
               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.tmmode[this.cyc] = 0;
                  this.tmX[this.cyc] = 900.0F;
                  this.tmY[this.cyc] = 900.0F;
               }

               this.bossmode = 0;
               effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 777, 0, 0, 0);
               this.stagetime = 50000;
               this.bossmahoujinn = 0;
            }

            if (this.etime[var1] == 30) {
               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
               }

               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
               }

               this.bossmahoujinn = 0;
               this.emode[var1] = 0;
            }
         }
      }
   }

   void stage6move(int var1) {
      if (this.emode[var1] == 1) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = this.emuki[var1] * 1;
            this.eYmove[var1] = -0.25F;
            this.etairyoku[var1] = 10.0F;
            this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 30;
         }

         if (this.etime[var1] % 30 == this.eholdnumber[var1]) {
            if (this.stagelevel == 1) {
               this.sh(this.eX[var1], this.eY[var1], 1, 1.5F, 110.0F, this.peopleX, this.peopleY, 0, 1, 3);
               this.sh(this.eX[var1], this.eY[var1], 1, 1.5F, 70.0F, this.peopleX, this.peopleY, 0, 1, 3);
            } else if (this.stagelevel == 0) {
               this.sh(this.eX[var1], this.eY[var1], 1, 1.5F, 90.0F, this.peopleX, this.peopleY, 0, 1, 3);
            }
         }
      } else if (this.emode[var1] == 2) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = this.emuki[var1] * 1;
            this.eYmove[var1] = -0.25F;
            this.etairyoku[var1] = 10.0F;
            this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 50;
         }

         if (this.etime[var1] % 50 == this.eholdnumber[var1]) {
            this.sh(this.eX[var1], this.eY[var1], 2, 1.5F, 0.0F, this.peopleX, this.peopleY, 0, 0, 4);
         }
      } else if (this.emode[var1] == 3) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = this.emuki[var1] * 2;
            this.eYmove[var1] = 2.0F;
            this.etairyoku[var1] = 6.0F;
            this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 50;
            if (this.stagelevel == 1) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 30;
            }
         } else if (this.etime[var1] == 29) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] > 29) {
            if (this.etime[var1] % 30 == 0) {
               this.emuki[var1] = -this.emuki[var1];
               this.eXmove[var1] = this.emuki[var1] * 2;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] % 30 == 20) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 1.6F;
            }
         }

         if (this.stagelevel == 0 && this.etime[var1] % 60 == this.eholdnumber[var1]) {
            this.sh(this.eX[var1], this.eY[var1], 1, 2.5F, 90.0F, 0, 0, 0, 1, 3);
         }

         if (this.stagelevel == 1 && this.etime[var1] % 40 == this.eholdnumber[var1]) {
            this.sh(this.eX[var1], this.eY[var1], 1, 3.0F, 90.0F, 0, 0, 0, 1, 3);
         }
      } else if (this.emode[var1] == 8) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = (float)(1.5 * Math.cos(this.emuki[var1] * 3.1415 / 180.0));
            this.eYmove[var1] = (float)(1.5 * Math.sin(this.emuki[var1] * 3.1415 / 180.0));
            this.etairyoku[var1] = 4.0F;
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] < 11 && this.etime[var1] % 3 == 0) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 18, 2.0F, this.emuki[var1] - this.cyc * 90 - 30, 0, 20, 50, 1, 1);
               }
            }

            if (this.etime[var1] > 29 && this.etime[var1] < 41 && this.etime[var1] % 3 == 0) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 18, 2.0F, this.emuki[var1] - this.cyc * 90 - 30, 0, 20, 50, 1, 1);
               }
            }
         } else if (this.stagelevel == 1) {
            if (this.etime[var1] < 11 && this.etime[var1] % 2 == 0) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 18, 3.5F, this.emuki[var1] - this.cyc * 90 - 30, 0, 20, 50, 1, 1);
               }
            }

            if (this.etime[var1] > 29 && this.etime[var1] < 41 && this.etime[var1] % 2 == 0) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 18, 3.5F, this.emuki[var1] - this.cyc * 90 - 30, 0, 20, 50, 1, 1);
               }
            }
         }
      } else if (this.emode[var1] == 9) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = (float)(1.5 * Math.cos(this.emuki[var1] * 3.1415 / 180.0));
            this.eYmove[var1] = (float)(1.5 * Math.sin(this.emuki[var1] * 3.1415 / 180.0));
            this.etairyoku[var1] = 4.0F;
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] < 11 && this.etime[var1] % 3 == 0) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 18, 2.0F, this.emuki[var1] + this.cyc * 90 + 90 + 30, 0, 20, 50, 1, 2);
               }
            }

            if (this.etime[var1] > 29 && this.etime[var1] < 41 && this.etime[var1] % 3 == 0) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 18, 2.0F, this.emuki[var1] + this.cyc * 90 + 90 + 30, 0, 20, 50, 1, 2);
               }
            }
         } else if (this.stagelevel == 1) {
            if (this.etime[var1] < 11 && this.etime[var1] % 2 == 0) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 18, 3.5F, this.emuki[var1] + this.cyc * 90 + 90 + 30, 0, 20, 50, 1, 2);
               }
            }

            if (this.etime[var1] > 29 && this.etime[var1] < 41 && this.etime[var1] % 2 == 0) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 18, 3.5F, this.emuki[var1] + this.cyc * 90 + 90 + 30, 0, 20, 50, 1, 2);
               }
            }
         }
      } else if (this.emode[var1] == 10) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = (float)(1.5 * Math.cos(this.emuki[var1] * 3.1415 / 180.0));
            this.eYmove[var1] = (float)(1.5 * Math.sin(this.emuki[var1] * 3.1415 / 180.0));
            this.etairyoku[var1] = 4.0F;
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] < 11 && this.etime[var1] % 3 == 0) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 18, 2.5F, this.emuki[var1] - this.cyc * 90 - 30, 0, 20, 50, 1, 1);
               }
            }

            if (this.etime[var1] > 29 && this.etime[var1] < 41 && this.etime[var1] % 3 == 0) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 18, 2.5F, this.emuki[var1] - this.cyc * 90 - 30, 0, 20, 50, 1, 1);
               }
            }
         } else if (this.stagelevel == 1) {
            if (this.etime[var1] < 11 && this.etime[var1] % 2 == 0) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 18, 4.0F, this.emuki[var1] - this.cyc * 90 - 30, 0, 20, 50, 1, 1);
               }
            }

            if (this.etime[var1] > 29 && this.etime[var1] < 41 && this.etime[var1] % 2 == 0) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 18, 4.0F, this.emuki[var1] - this.cyc * 90 - 30, 0, 20, 50, 1, 1);
               }
            }
         }
      } else if (this.emode[var1] == 11) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = (float)(1.5 * Math.cos(this.emuki[var1] * 3.1415 / 180.0));
            this.eYmove[var1] = (float)(1.5 * Math.sin(this.emuki[var1] * 3.1415 / 180.0));
            this.etairyoku[var1] = 4.0F;
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] < 11 && this.etime[var1] % 3 == 0) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 18, 3.5F, this.emuki[var1] + this.cyc * 90 + 30, 0, 20, 50, 1, 2);
               }
            }

            if (this.etime[var1] > 29 && this.etime[var1] < 41 && this.etime[var1] % 3 == 0) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 18, 3.5F, this.emuki[var1] + this.cyc * 90 + 30, 0, 20, 50, 1, 2);
               }
            }
         } else if (this.stagelevel == 1) {
            if (this.etime[var1] < 11 && this.etime[var1] % 2 == 0) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 18, 4.5F, this.emuki[var1] + this.cyc * 90 + 30, 0, 20, 50, 1, 2);
               }
            }

            if (this.etime[var1] > 29 && this.etime[var1] < 41 && this.etime[var1] % 2 == 0) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 18, 4.5F, this.emuki[var1] + this.cyc * 90 + 30, 0, 20, 50, 1, 2);
               }
            }
         }
      } else if (this.emode[var1] == 12) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 4.5F;
            this.etairyoku[var1] = 80.0F;
            this.eshape[var1] = 3;
         } else if (this.etime[var1] == 21) {
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 301) {
            this.eYmove[var1] = -1.5F;
         }

         if (this.stagelevel == 0) {
            if (this.etime[var1] % 30 == 0) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 15;

               for (this.cyc = 0; this.cyc < 30; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 8, 4.5F, this.cyc * 12 + this.eholdnumber[var1], this.peopleX, 20, 0, 2, 4);
               }
            }
         } else if (this.stagelevel == 1 && this.etime[var1] % 30 == 0) {
            this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 15;

            for (this.cyc = 0; this.cyc < 36; this.cyc++) {
               this.sh(this.eX[var1], this.eY[var1], 8, 4.5F, this.cyc * 10 + this.eholdnumber[var1], this.peopleX, 20, 0, 2, 4);
            }
         }
      } else if (this.emode[var1] == 13) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 5 * this.emuki[var1];
            this.eYmove[var1] = 1.0F;
            this.etairyoku[var1] = 40.0F;
         } else if (this.etime[var1] == 31) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 301) {
            this.eYmove[var1] = -1.5F;
         }

         if (this.etime[var1] > 30 && this.etime[var1] % 30 == 15) {
            if (this.stagelevel == 0) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 40;

               for (this.cyc = 0; this.cyc < 9; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 8, 4.5F, this.cyc * 40 + this.eholdnumber[var1], this.peopleX, 20, 0, 1, 3);
               }
            } else if (this.stagelevel == 1) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 20;

               for (this.cyc = 0; this.cyc < 18; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 8, 4.5F, this.cyc * 20 + this.eholdnumber[var1], this.peopleX, 20, 0, 1, 3);
               }
            }
         }
      } else if (this.emode[var1] == 1000) {
         if (this.edoing[var1] == 0) {
            if (this.etime[var1] > 30 && this.etime[var1] < 61) {
               this.eXmove[var1] = (float)(this.eXmove[var1] + 0.2);
            }

            if (this.etime[var1] == 1) {
               for (this.cyc = 0; this.cyc < this.e_max; this.cyc++) {
                  if (this.emode[this.cyc] != 0 && this.cyc != var1) {
                     this.emode[this.cyc] = 0;
                     effectIn(this.eX[this.cyc], this.eY[this.cyc], 1, 0, 0, 0);
                  }
               }

               for (this.cyc = 0; this.cyc < this.tama_max; this.cyc++) {
                  if (this.tamamode[this.cyc] != 0) {
                     this.tamamode[this.cyc] = 0;
                     effectIn(this.tamaX[this.cyc], this.tamaY[this.cyc], 5, this.tamairo[this.cyc], this.tamashape[this.cyc], 0);
                  }
               }

               this.eX[var1] = this.migi + 20;
               this.eY[var1] = 140.0F;
               this.eXmove[var1] = -4.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 60.0F;
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 61) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
            } else if (this.etime[var1] == 91) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 120) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
               this.eholdnumber[var1] = 250;
            }
         } else if (this.edoing[var1] == 1) {
            this.etairyoku[var1] = 10000.0F;
            if (this.etime[var1] % 4 == 1 && this.etime[var1] < 60) {
               this.eIn(
                  (int)(this.eX[var1] + 20.0 * Math.cos(this.eholdnumber[var1] * 3.1415 / 180.0)),
                  (int)(this.eY[var1] + 20.0 * Math.sin(this.eholdnumber[var1] * 3.1415 / 180.0)),
                  8,
                  this.eholdnumber[var1] - 90,
                  1
               );
               this.eholdnumber[var1] = this.eholdnumber[var1] - 27;
            }

            if (this.etime[var1] == 120) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
               this.eholdnumber[var1] = -70;
            }
         } else if (this.edoing[var1] == 2) {
            this.etairyoku[var1] = 10000.0F;
            if (this.etime[var1] % 4 == 1 && this.etime[var1] < 60) {
               this.eIn(
                  (int)(this.eX[var1] + 20.0 * Math.cos(this.eholdnumber[var1] * 3.1415 / 180.0)),
                  (int)(this.eY[var1] + 20.0 * Math.sin(this.eholdnumber[var1] * 3.1415 / 180.0)),
                  9,
                  this.eholdnumber[var1] + 90,
                  2
               );
               this.eholdnumber[var1] = this.eholdnumber[var1] + 27;
            }

            if (this.etime[var1] == 120) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 3) {
            this.etairyoku[var1] = 10000.0F;
            if (this.etime[var1] % 4 == 1 && this.etime[var1] < 60) {
               this.eIn(
                  (int)(this.eX[var1] + 20.0 * Math.cos(this.eholdnumber[var1] * 3.1415 / 180.0)),
                  (int)(this.eY[var1] + 20.0 * Math.sin(this.eholdnumber[var1] * 3.1415 / 180.0)),
                  10,
                  this.eholdnumber[var1] - 90,
                  1
               );
               this.eholdnumber[var1] = this.eholdnumber[var1] - 27;
            }

            if (this.etime[var1] == 120) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
               this.eholdnumber[var1] = -70;
            }
         } else if (this.edoing[var1] == 4) {
            this.etairyoku[var1] = 10000.0F;
            if (this.etime[var1] % 3 == 1 && this.etime[var1] < 45) {
               this.eIn(
                  (int)(this.eX[var1] + 20.0 * Math.cos(this.eholdnumber[var1] * 3.1415 / 180.0)),
                  (int)(this.eY[var1] + 20.0 * Math.sin(this.eholdnumber[var1] * 3.1415 / 180.0)),
                  11,
                  this.eholdnumber[var1] + 90,
                  2
               );
               this.eholdnumber[var1] = this.eholdnumber[var1] + 27;
            }

            if (this.etime[var1] == 200) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
               this.eholdnumber[var1] = 250;
            }
         } else if (this.edoing[var1] == 5) {
            if (this.etime[var1] == 1) {
               this.stagetime = 20000;
               this.eXmove[var1] = -6.0F;
               this.eYmove[var1] = -0.5F;
            }

            this.eXmove[var1] = (float)(this.eXmove[var1] + 0.2);
            this.itemIn(this.eX[var1] - 15.0F + (this.rand.nextInt() >>> 1) % 30, this.eY[var1] - 15.0F + (this.rand.nextInt() >>> 1) % 30, 1, 0);
            if (this.etime[var1] == 70) {
               this.itemIn(this.eX[var1], this.eY[var1], 99, 0);
            }
         }
      } else if (this.emode[var1] == 1001) {
         if (this.edoing[var1] == 0) {
            this.bossmahoujinn = 0;
            this.bossnum = var1;
            this.bossnokori = 6;
            this.eX[var1] = this.migi + 15;
            this.eY[var1] = -10.0F;
            this.etairyoku[var1] = 10000.0F;
         } else if (this.edoing[var1] == 1) {
            this.etime[var1] = 0;
            this.edoing[var1]++;
         } else if (this.edoing[var1] == 2) {
            if (this.etime[var1] == 1) {
               this.bossmahoujinn = 1;
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
            } else if (this.etime[var1] == 31) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }
         } else if (this.edoing[var1] == 3) {
            this.bosstairyoku = 200.0F;
            this.bosstimelim = 900;
            if (this.etime[var1] == 1) {
               this.player.stop();

               try {
                  MediaSound var2 = MediaManager.getSound("resource:///13.mld");
                  var2.use();
                  this.player = AudioPresenter.getAudioPresenter();
                  this.player.setSound(var2);
                  this.player.setMediaListener(this);
               } catch (Exception var3) {
               }

               this.player.setAttribute(4, this.volume);
               this.player.play();
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 10.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 10.0F;
            } else if (this.etime[var1] == 11) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] == 30) {
               this.bossmode = 1;
               this.eboss[var1] = 1;
               this.etime[var1] = 0;
               this.edoing[var1]++;
               this.eholdnumber2[var1] = 50;
            }
         } else if (this.edoing[var1] == 4) {
            if (this.etime[var1] % 150 == 110) {
               this.getemove(var1, 20, 1);
            }

            if (this.etime[var1] % 150 == 130) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.stagelevel == 0) {
               if (this.etime[var1] % 150 == 0) {
                  this.eholdnumber2[var1] = 50;
               }

               if (this.etime[var1] % 150 < 90) {
                  for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                     this.tmX[this.cyc] = (float)(
                        this.eX[var1] + this.eholdnumber2[var1] * Math.cos((this.eholdnumber[var1] + 180 * this.cyc) * 3.1415 / 180.0)
                     );
                     this.tmY[this.cyc] = (float)(
                        this.eY[var1] + this.eholdnumber2[var1] * Math.sin((this.eholdnumber[var1] + 180 * this.cyc) * 3.1415 / 180.0)
                     );
                  }

                  for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                     this.sh(this.tmX[this.cyc], this.tmY[this.cyc], 1, 2.0F, this.cyc * 180 + this.eholdnumber[var1] + 120, 1, 6, 30, 0, 2);
                  }

                  this.eholdnumber[var1] = this.eholdnumber[var1] + 21;
                  this.eholdnumber2[var1]--;
               }

               if (this.etime[var1] % 3 == 0 && this.etime[var1] % 150 < 100) {
                  for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 1, 3.0F, this.cyc * 90 - this.eholdnumber3[var1], 1, 6, 30, 2, 2);
                  }

                  for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 1, 2.5F, this.cyc * 90 - this.eholdnumber3[var1], 1, 6, 30, 2, 2);
                  }

                  this.eholdnumber3[var1] = this.eholdnumber3[var1] + 13;
               }
            } else if (this.stagelevel == 1) {
               if (this.etime[var1] % 150 == 0) {
                  this.eholdnumber2[var1] = 50;
               }

               if (this.etime[var1] % 150 < 90) {
                  for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                     this.tmX[this.cyc] = (float)(
                        this.eX[var1] + this.eholdnumber2[var1] * Math.cos((this.eholdnumber[var1] + 180 * this.cyc) * 3.1415 / 180.0)
                     );
                     this.tmY[this.cyc] = (float)(
                        this.eY[var1] + this.eholdnumber2[var1] * Math.sin((this.eholdnumber[var1] + 180 * this.cyc) * 3.1415 / 180.0)
                     );
                  }

                  for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                     this.sh(this.tmX[this.cyc], this.tmY[this.cyc], 1, 2.3F, this.cyc * 180 + this.eholdnumber[var1] + 110, 1, 6, 30, 0, 2);
                  }

                  this.eholdnumber[var1] = this.eholdnumber[var1] + 23;
                  this.eholdnumber2[var1]--;
               }

               if (this.etime[var1] % 3 == 0 && this.etime[var1] % 150 < 100) {
                  for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 1, 3.0F, this.cyc * 90 - this.eholdnumber3[var1], 1, 6, 30, 2, 2);
                  }

                  for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 1, 2.6F, this.cyc * 90 - this.eholdnumber3[var1], 1, 6, 30, 2, 2);
                  }

                  for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 1, 2.2F, this.cyc * 90 - this.eholdnumber3[var1], 1, 6, 30, 2, 2);
                  }

                  this.eholdnumber3[var1] = this.eholdnumber3[var1] + 13;
               }
            }
         } else if (this.edoing[var1] == 5) {
            this.bosstairyoku = 350.0F;
            this.bosstimelim = 1200;
            this.spelbonus = 12000;
            if (this.etime[var1] == 1) {
               for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                  this.tmmode[this.cyc] = 0;
               }

               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 6, 2, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "魔陣「インフィニティの護法」";
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 60) {
               this.eholdnumber2[var1] = 0;
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 6) {
            if (this.stagelevel == 0) {
               if (this.etime[var1] % 90 == 75) {
                  this.getemove(var1, 10, 1);
                  this.eYmove[var1] = 0.0F;
               }

               if (this.etime[var1] % 90 == 85) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               }

               if (this.etime[var1] % 30 == 0) {
                  this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

                  for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 8, 3.9F, this.cyc * 60 + this.ehnum[var1], 0, 20, 0, 6, 5);
                  }
               }

               if (this.etime[var1] % 180 < 30) {
                  if (this.etime[var1] % 15 == 0) {
                     this.eholdnumber2[var1] = 0;
                  }

                  if (this.etime[var1] % 30 < 15) {
                     for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                        this.sh(this.eholdnumber2[var1], this.eX[var1], this.eY[var1], 1, 1.0F, this.cyc * 60 - this.eholdnumber[var1], 0, 0, 0, 2, 2);
                     }

                     this.eholdnumber[var1] = this.eholdnumber[var1] + 15 - this.etime[var1] % 15;
                     this.eholdnumber2[var1] = this.eholdnumber2[var1] + 6;
                  } else {
                     for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                        this.sh(this.eholdnumber2[var1], this.eX[var1], this.eY[var1], 1, 1.0F, this.cyc * 60 + this.eholdnumber[var1], 0, 0, 0, 2, 4);
                     }

                     this.eholdnumber[var1] = this.eholdnumber[var1] + 15 - this.etime[var1] % 15;
                     this.eholdnumber2[var1] = this.eholdnumber2[var1] + 6;
                  }
               } else if (this.etime[var1] % 180 == 75) {
                  effectIn(this.eX[var1], this.eY[var1], 777, 0, 0, 0);
               } else if (this.etime[var1] % 180 > 89 && this.etime[var1] % 180 < 120) {
                  if (this.etime[var1] % 15 == 0) {
                     this.eholdnumber2[var1] = 0;
                  }

                  if (this.etime[var1] % 30 < 15) {
                     for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                        this.sh(this.eholdnumber2[var1], this.eX[var1], this.eY[var1], 1, 1.0F, this.cyc * 60 - this.eholdnumber[var1], 0, 0, 0, 2, 0);
                     }

                     this.eholdnumber[var1] = this.eholdnumber[var1] + 15 - this.etime[var1] % 15;
                     this.eholdnumber2[var1] = this.eholdnumber2[var1] + 6;
                  } else {
                     for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                        this.sh(this.eholdnumber2[var1], this.eX[var1], this.eY[var1], 1, 1.0F, this.cyc * 60 + this.eholdnumber[var1], 0, 0, 0, 2, 3);
                     }

                     this.eholdnumber[var1] = this.eholdnumber[var1] + 15 - this.etime[var1] % 15;
                     this.eholdnumber2[var1] = this.eholdnumber2[var1] + 6;
                  }
               } else if (this.etime[var1] % 180 == 165) {
                  effectIn(this.eX[var1], this.eY[var1], 777, 0, 0, 0);
               }
            } else if (this.stagelevel == 1) {
               if (this.etime[var1] % 90 == 75) {
                  this.getemove(var1, 10, 1);
                  this.eYmove[var1] = 0.0F;
               }

               if (this.etime[var1] % 90 == 85) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               }

               if (this.etime[var1] % 20 == 0) {
                  this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

                  for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 8, 4.2F, this.cyc * 60 + this.ehnum[var1], 0, 20, 0, 6, 5);
                  }
               }

               if (this.etime[var1] % 180 < 30) {
                  if (this.etime[var1] % 15 == 0) {
                     this.eholdnumber2[var1] = 0;
                  }

                  if (this.etime[var1] % 30 < 15) {
                     for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                        this.sh(this.eholdnumber2[var1], this.eX[var1], this.eY[var1], 1, 1.0F, this.cyc * 60 - this.eholdnumber[var1], 0, 0, 0, 2, 2);
                     }

                     this.eholdnumber[var1] = this.eholdnumber[var1] + 15 - this.etime[var1] % 15;
                     this.eholdnumber2[var1] = this.eholdnumber2[var1] + 6;
                  } else {
                     for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                        this.sh(this.eholdnumber2[var1], this.eX[var1], this.eY[var1], 1, 1.0F, this.cyc * 60 + this.eholdnumber[var1], 0, 0, 0, 2, 4);
                     }

                     this.eholdnumber[var1] = this.eholdnumber[var1] + 15 - this.etime[var1] % 15;
                     this.eholdnumber2[var1] = this.eholdnumber2[var1] + 6;
                  }
               } else if (this.etime[var1] % 180 == 75) {
                  effectIn(this.eX[var1], this.eY[var1], 777, 0, 0, 0);
               } else if (this.etime[var1] % 180 > 89 && this.etime[var1] % 180 < 120) {
                  if (this.etime[var1] % 15 == 0) {
                     this.eholdnumber2[var1] = 0;
                  }

                  if (this.etime[var1] % 30 < 15) {
                     for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                        this.sh(this.eholdnumber2[var1], this.eX[var1], this.eY[var1], 1, 1.0F, this.cyc * 60 - this.eholdnumber[var1], 0, 0, 0, 2, 0);
                     }

                     this.eholdnumber[var1] = this.eholdnumber[var1] + 15 - this.etime[var1] % 15;
                     this.eholdnumber2[var1] = this.eholdnumber2[var1] + 6;
                  } else {
                     for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                        this.sh(this.eholdnumber2[var1], this.eX[var1], this.eY[var1], 1, 1.0F, this.cyc * 60 + this.eholdnumber[var1], 0, 0, 0, 2, 3);
                     }

                     this.eholdnumber[var1] = this.eholdnumber[var1] + 15 - this.etime[var1] % 15;
                     this.eholdnumber2[var1] = this.eholdnumber2[var1] + 6;
                  }
               } else if (this.etime[var1] % 180 == 165) {
                  effectIn(this.eX[var1], this.eY[var1], 777, 0, 0, 0);
               }
            }
         } else if (this.edoing[var1] == 7) {
            this.bosstairyoku = 150.0F;
            this.bosstimelim = 600;
            if (this.etime[var1] == 1) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.tmmode[this.cyc] = 0;
               }

               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
               }

               for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
               }

               this.eXmove[var1] = (95.0F - this.eX[var1]) / 50.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 50.0F;
               this.etairyoku[var1] = 10000.0F;
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
               this.haneflag = 1;
            } else if (this.etime[var1] == 50) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
               effectIn(this.eX[var1], this.eY[var1], 25, 0, 0, 0);
            } else if (this.etime[var1] == 100) {
               effectIn(this.eX[var1], this.eY[var1], 12, 10, 0, 0);
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = -1.5F;
            } else if (this.etime[var1] == 120) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 130) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.tmmode[this.cyc] = 1;
               }

               this.eholdnumber[var1] = -90;
               this.eholdnumber2[var1] = 50;
               this.eholdnumber3[var1]++;
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 8) {
            if (this.stagelevel == 0) {
               if (this.etime[var1] % 40 == 1) {
                  this.ehnum[var1] = this.getkakudo(this.tmX[1], this.tmY[1], this.peopleX, this.peopleY);

                  for (this.cyc = -3; this.cyc < 4; this.cyc++) {
                     this.sh(this.tmX[1], this.tmY[1], 1, 2.5F, this.ehnum[var1] + this.cyc * 20, 1, 6, 30, 0, 2);
                  }

                  this.sh(this.tmX[1], this.tmY[1], 1, 3.0F, this.ehnum[var1], 1, 6, 30, 5, 2);
               }

               if (this.etime[var1] % 40 == 11) {
                  this.ehnum[var1] = this.getkakudo(this.tmX[3], this.tmY[3], this.peopleX, this.peopleY);

                  for (this.cyc = -3; this.cyc < 4; this.cyc++) {
                     this.sh(this.tmX[3], this.tmY[3], 1, 2.5F, this.ehnum[var1] + this.cyc * 20, 1, 6, 30, 0, 2);
                  }

                  this.sh(this.tmX[3], this.tmY[3], 1, 3.0F, this.ehnum[var1], 1, 6, 30, 5, 2);
               }

               if (this.etime[var1] % 40 == 21) {
                  this.ehnum[var1] = this.getkakudo(this.tmX[0], this.tmY[0], this.peopleX, this.peopleY);

                  for (this.cyc = -3; this.cyc < 4; this.cyc++) {
                     this.sh(this.tmX[0], this.tmY[0], 1, 2.5F, this.ehnum[var1] + this.cyc * 20, 1, 6, 30, 0, 2);
                  }

                  this.sh(this.tmX[0], this.tmY[0], 1, 3.0F, this.ehnum[var1], 1, 6, 30, 5, 2);
               }

               if (this.etime[var1] % 40 == 31) {
                  this.ehnum[var1] = this.getkakudo(this.tmX[2], this.tmY[2], this.peopleX, this.peopleY);

                  for (this.cyc = -3; this.cyc < 4; this.cyc++) {
                     this.sh(this.tmX[2], this.tmY[2], 1, 2.5F, this.ehnum[var1] + this.cyc * 20, 1, 6, 30, 0, 2);
                  }

                  this.sh(this.tmX[2], this.tmY[2], 1, 3.0F, this.ehnum[var1], 1, 6, 30, 5, 2);
               }
            } else if (this.stagelevel == 1) {
               if (this.etime[var1] % 40 == 1) {
                  this.ehnum[var1] = this.getkakudo(this.tmX[1], this.tmY[1], this.peopleX, this.peopleY);

                  for (this.cyc = -3; this.cyc < 4; this.cyc++) {
                     this.sh(this.tmX[1], this.tmY[1], 1, 2.5F, this.ehnum[var1] + this.cyc * 20, 1, 6, 30, 0, 2);
                  }

                  this.sh(this.tmX[1], this.tmY[1], 1, 3.0F, this.ehnum[var1], 1, 6, 30, 6, 2);
               }

               if (this.etime[var1] % 40 == 11) {
                  this.ehnum[var1] = this.getkakudo(this.tmX[3], this.tmY[3], this.peopleX, this.peopleY);

                  for (this.cyc = -3; this.cyc < 4; this.cyc++) {
                     this.sh(this.tmX[3], this.tmY[3], 1, 2.5F, this.ehnum[var1] + this.cyc * 20, 1, 6, 30, 0, 2);
                  }

                  this.sh(this.tmX[3], this.tmY[3], 1, 3.0F, this.ehnum[var1], 1, 6, 30, 6, 2);
               }

               if (this.etime[var1] % 40 == 21) {
                  this.ehnum[var1] = this.getkakudo(this.tmX[0], this.tmY[0], this.peopleX, this.peopleY);

                  for (this.cyc = -3; this.cyc < 4; this.cyc++) {
                     this.sh(this.tmX[0], this.tmY[0], 1, 2.5F, this.ehnum[var1] + this.cyc * 20, 1, 6, 30, 0, 2);
                  }

                  this.sh(this.tmX[0], this.tmY[0], 1, 3.0F, this.ehnum[var1], 1, 6, 30, 6, 2);
               }

               if (this.etime[var1] % 40 == 31) {
                  this.ehnum[var1] = this.getkakudo(this.tmX[2], this.tmY[2], this.peopleX, this.peopleY);

                  for (this.cyc = -3; this.cyc < 4; this.cyc++) {
                     this.sh(this.tmX[2], this.tmY[2], 1, 2.5F, this.ehnum[var1] + this.cyc * 20, 1, 6, 30, 0, 2);
                  }

                  this.sh(this.tmX[2], this.tmY[2], 1, 3.0F, this.ehnum[var1], 1, 6, 30, 6, 2);
               }
            }
         } else if (this.edoing[var1] == 9) {
            this.bosstairyoku = 450.0F;
            this.bosstimelim = 1200;
            this.spelbonus = 12000;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (80.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 6, 2, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               if (this.stagelevel == 0) {
                  this.spelname = "災厄「オーバーラプトワールド」";
               }

               if (this.stagelevel == 1) {
                  this.spelname = "神業「デウスエクスマキナ」";
               }

               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 60) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
               this.eholdnumber[var1] = 1;
               this.eholdnumber2[var1] = 4;
            }
         } else if (this.edoing[var1] == 10) {
            if (this.stagelevel == 0) {
               if (this.etime[var1] % 7 == 0) {
                  this.sh(this.tmX[0], this.tmY[0], 42, 3.0F, (this.rand.nextInt() >>> 1) % 60 - 120, 1, 30, 0, 0, 1);
                  this.sh(this.tmX[2], this.tmY[2], 42, 3.0F, (this.rand.nextInt() >>> 1) % 60 - 120, 1, 30, 0, 0, 1);
                  this.sh(this.tmX[0], this.tmY[0], 42, 9.0F, -((this.rand.nextInt() >>> 1) % 60) + 120, -3, 0, 0, 0, 5);
                  this.sh(this.tmX[2], this.tmY[2], 42, 9.0F, -((this.rand.nextInt() >>> 1) % 60) + 120, -3, 0, 0, 0, 5);
               }

               if (this.etime[var1] % 40 == 0) {
                  this.ehnum[var1] = this.getkakudo(this.tmX[1], this.tmY[1], this.peopleX, this.peopleY);

                  for (this.cyc = -6; this.cyc < 7; this.cyc++) {
                     this.sh(this.tmX[1], this.tmY[1], 8, 4.0F, this.ehnum[var1] + this.cyc * 8, 1, 30, 0, 2, 4);
                  }
               } else if (this.etime[var1] % 40 == 20) {
                  this.ehnum[var1] = this.getkakudo(this.tmX[3], this.tmY[3], this.peopleX, this.peopleY);

                  for (this.cyc = -6; this.cyc < 7; this.cyc++) {
                     this.sh(this.tmX[3], this.tmY[3], 8, 4.0F, this.ehnum[var1] + this.cyc * 8, 1, 30, 0, 2, 4);
                  }
               }
            } else if (this.stagelevel == 1) {
               if (this.etime[var1] % 5 == 0) {
                  this.sh(this.tmX[0], this.tmY[0], 42, 3.0F, (this.rand.nextInt() >>> 1) % 60 - 120, 1, 30, 0, 0, 1);
                  this.sh(this.tmX[2], this.tmY[2], 42, 3.0F, (this.rand.nextInt() >>> 1) % 60 - 120, 1, 30, 0, 0, 1);
                  this.sh(this.tmX[0], this.tmY[0], 42, 9.0F, -((this.rand.nextInt() >>> 1) % 60) + 120, -3, 0, 0, 0, 5);
                  this.sh(this.tmX[2], this.tmY[2], 42, 9.0F, -((this.rand.nextInt() >>> 1) % 60) + 120, -3, 0, 0, 0, 5);
               }

               if (this.etime[var1] % 30 == 0) {
                  this.ehnum[var1] = this.getkakudo(this.tmX[1], this.tmY[1], this.peopleX, this.peopleY);

                  for (this.cyc = -6; this.cyc < 7; this.cyc++) {
                     this.sh(this.tmX[1], this.tmY[1], 8, 4.0F, this.ehnum[var1] + this.cyc * 8, 1, 30, 0, 2, 4);
                  }
               } else if (this.etime[var1] % 30 == 15) {
                  this.ehnum[var1] = this.getkakudo(this.tmX[3], this.tmY[3], this.peopleX, this.peopleY);

                  for (this.cyc = -6; this.cyc < 7; this.cyc++) {
                     this.sh(this.tmX[3], this.tmY[3], 8, 4.0F, this.ehnum[var1] + this.cyc * 8, 1, 30, 0, 2, 4);
                  }
               }
            }
         } else if (this.edoing[var1] == 11) {
            this.bosstairyoku = 300.0F;
            this.bosstimelim = 1800;
            if (this.etime[var1] == 1) {
               this.haneflag = 0;

               for (this.cyc2 = 0; this.cyc2 < 4; this.cyc2++) {
                  for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                     this.itemIn(
                        this.tmX[this.cyc2] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.tmY[this.cyc2] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0
                     );
                  }
               }

               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
               }

               for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
               }

               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 2.0F;
               this.etairyoku[var1] = 10000.0F;
               this.haneflag = 0;
            } else if (this.etime[var1] == 20) {
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 50) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
               effectIn(this.eX[var1], this.eY[var1], 25, 0, 0, 0);
               this.haneflag = 1;
            } else if (this.etime[var1] == 100) {
               effectIn(this.eX[var1], this.eY[var1], 12, 10, 0, 0);
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = -1.0F;
            } else if (this.etime[var1] == 120) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 130) {
               this.eholdnumber[var1] = -90;
               this.eholdnumber2[var1] = 50;
               this.eholdnumber3[var1]++;
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 12) {
            if (this.etime[var1] % 60 == 50) {
               this.getemove(var1, 10, 1);
            }

            if (this.etime[var1] % 60 == 0) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.stagelevel == 0) {
               if (this.etime[var1] % 8 == 1) {
                  for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                     this.sh(this.tmX[1], this.tmY[1], 1, (float)(1.5 + 0.2 * this.cyc), -90 - this.eholdnumber[var1], 1, 6, 30, 2, 1);
                  }

                  for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                     this.sh(this.tmX[3], this.tmY[3], 1, (float)(1.5 + 0.2 * this.cyc), -90 + this.eholdnumber[var1] + 13, 1, 6, 30, 2, 1);
                  }

                  for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                     this.sh(this.tmX[0], this.tmY[0], 1, (float)(1.5 + 0.2 * this.cyc), -90 + this.eholdnumber[var1] + 49, 1, 6, 30, 2, 4);
                  }

                  for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                     this.sh(this.tmX[2], this.tmY[2], 1, (float)(1.5 + 0.2 * this.cyc), -90 - this.eholdnumber[var1], 1, 6, 30, 2, 4);
                  }

                  for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                     this.sh(this.tmX[1], this.tmY[1], 1, (float)(1.5 + 0.2 * this.cyc), 90 - this.eholdnumber[var1], 1, 6, 30, 2, 1);
                  }

                  for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                     this.sh(this.tmX[3], this.tmY[3], 1, (float)(1.5 + 0.2 * this.cyc), 90 + this.eholdnumber[var1] + 13, 1, 6, 30, 2, 1);
                  }

                  for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                     this.sh(this.tmX[0], this.tmY[0], 1, (float)(1.5 + 0.2 * this.cyc), 90 + this.eholdnumber[var1] + 49, 1, 6, 30, 2, 4);
                  }

                  for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                     this.sh(this.tmX[2], this.tmY[2], 1, (float)(1.5 + 0.2 * this.cyc), 90 - this.eholdnumber[var1], 1, 6, 30, 2, 4);
                  }

                  this.eholdnumber[var1] = this.eholdnumber[var1] + 19;
               }
            } else if (this.stagelevel == 1 && this.etime[var1] % 8 == 1) {
               for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                  this.sh(this.tmX[1], this.tmY[1], 1, (float)(1.5 + 0.3 * this.cyc), -90 - this.eholdnumber[var1], 1, 6, 30, 2, 1);
               }

               for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                  this.sh(this.tmX[3], this.tmY[3], 1, (float)(1.5 + 0.3 * this.cyc), -90 + this.eholdnumber[var1] + 13, 1, 6, 30, 2, 1);
               }

               for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                  this.sh(this.tmX[0], this.tmY[0], 1, (float)(1.5 + 0.3 * this.cyc), -90 + this.eholdnumber[var1] + 49, 1, 6, 30, 2, 4);
               }

               for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                  this.sh(this.tmX[2], this.tmY[2], 1, (float)(1.5 + 0.3 * this.cyc), -90 - this.eholdnumber[var1], 1, 6, 30, 2, 4);
               }

               for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                  this.sh(this.tmX[1], this.tmY[1], 1, (float)(1.5 + 0.3 * this.cyc), 90 - this.eholdnumber[var1], 1, 6, 30, 2, 1);
               }

               for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                  this.sh(this.tmX[3], this.tmY[3], 1, (float)(1.5 + 0.3 * this.cyc), 90 + this.eholdnumber[var1] + 13, 1, 6, 30, 2, 1);
               }

               for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                  this.sh(this.tmX[0], this.tmY[0], 1, (float)(1.5 + 0.3 * this.cyc), 90 + this.eholdnumber[var1] + 49, 1, 6, 30, 2, 4);
               }

               for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                  this.sh(this.tmX[2], this.tmY[2], 1, (float)(1.5 + 0.3 * this.cyc), 90 - this.eholdnumber[var1], 1, 6, 30, 2, 4);
               }

               this.eholdnumber[var1] = this.eholdnumber[var1] + 19;
            }
         } else if (this.edoing[var1] == 13) {
            this.bosstairyoku = 250.0F;
            this.bosstimelim = 2700;
            this.spelbonus = 15000;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 6, 2, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               if (this.stagelevel == 0) {
                  this.spelname = "光輝「空間と質量のオーラ」";
               }

               if (this.stagelevel == 1) {
                  this.spelname = "光輝「魔界銀河系」";
               }

               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 70) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 14) {
            if (this.stagelevel == 0) {
               if (this.etime[var1] % 100 == 1) {
                  for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                     this.laserIn(this.eX[var1], this.eY[var1], 4, 1.0F, this.cyc * 45, 3.0F, 50, 1, 1, 5);
                  }
               }

               if (this.etime[var1] % 100 == 51) {
                  for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                     this.laserIn(this.eX[var1], this.eY[var1], 4, 1.0F, this.cyc * 45, 3.0F, 50, -1, -1, 3);
                  }
               }

               if (this.etime[var1] % 120 == 119) {
                  for (this.cyc2 = 0; this.cyc2 < 4; this.cyc2++) {
                     this.ehnum[var1] = this.getkakudo(this.tmX[this.cyc2], this.tmY[this.cyc2], this.peopleX, this.peopleY);
                     this.sh(this.tmX[this.cyc2], this.tmY[this.cyc2], 1, 1.5F, this.ehnum[var1], 1, 6, 30, 8, 3);
                  }
               }
            } else if (this.stagelevel == 1) {
               if (this.etime[var1] % 100 == 1) {
                  for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                     this.laserIn(this.eX[var1], this.eY[var1], 4, 1.0F, this.cyc * 30, 3.0F, 50, 1, 1, 5);
                  }
               }

               if (this.etime[var1] % 100 == 51) {
                  for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                     this.laserIn(this.eX[var1], this.eY[var1], 4, 1.0F, this.cyc * 30, 3.0F, 50, -1, -1, 3);
                  }
               }

               if (this.etime[var1] % 120 == 119) {
                  for (this.cyc2 = 0; this.cyc2 < 4; this.cyc2++) {
                     this.ehnum[var1] = this.getkakudo(this.tmX[this.cyc2], this.tmY[this.cyc2], this.peopleX, this.peopleY);
                     this.sh(this.tmX[this.cyc2], this.tmY[this.cyc2], 1, 1.5F, this.ehnum[var1], 1, 6, 30, 8, 3);
                  }
               }
            }
         } else if (this.edoing[var1] == 15) {
            this.bosstairyoku = 300.0F;
            this.bosstimelim = 1800;
            if (this.etime[var1] == 1) {
               this.haneflag = 0;

               for (this.cyc2 = 0; this.cyc2 < 4; this.cyc2++) {
                  for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                     this.itemIn(
                        this.tmX[this.cyc2] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.tmY[this.cyc2] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0
                     );
                  }
               }

               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
               }

               for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
               }

               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 1.0F;
               this.etairyoku[var1] = 10000.0F;
               this.haneflag = 0;
            } else if (this.etime[var1] == 20) {
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 50) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
               effectIn(this.eX[var1], this.eY[var1], 25, 0, 0, 0);
               this.haneflag = 1;
            } else if (this.etime[var1] == 100) {
               effectIn(this.eX[var1], this.eY[var1], 12, 10, 0, 0);
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = -1.0F;
            } else if (this.etime[var1] == 120) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 130) {
               this.eholdnumber[var1] = -90;
               this.eholdnumber2[var1] = 50;
               this.eholdnumber3[var1]++;
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 16) {
            if (this.etime[var1] % 60 == 50) {
               this.getemove(var1, 10, 1);
            }

            if (this.etime[var1] % 60 == 0) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.stagelevel == 0) {
               if (this.etime[var1] % 4 == 1) {
                  for (this.cyc = 1; this.cyc < 2; this.cyc++) {
                     this.sh(30.0F, this.tmX[1], this.tmY[1], 1, (float)(1.5 + 0.2 * this.cyc), -90 - this.eholdnumber[var1], 1, 6, 30, 2, 1);
                  }

                  for (this.cyc = 1; this.cyc < 2; this.cyc++) {
                     this.sh(30.0F, this.tmX[3], this.tmY[3], 1, (float)(1.5 + 0.2 * this.cyc), -90 + this.eholdnumber[var1] + 13, 1, 6, 30, 2, 1);
                  }

                  for (this.cyc = 1; this.cyc < 2; this.cyc++) {
                     this.sh(30.0F, this.tmX[0], this.tmY[0], 1, (float)(1.5 + 0.2 * this.cyc), -90 + this.eholdnumber[var1] + 49, 1, 6, 30, 2, 4);
                  }

                  for (this.cyc = 1; this.cyc < 2; this.cyc++) {
                     this.sh(30.0F, this.tmX[2], this.tmY[2], 1, (float)(1.5 + 0.2 * this.cyc), -90 - this.eholdnumber[var1], 1, 6, 30, 2, 4);
                  }

                  for (this.cyc = 1; this.cyc < 2; this.cyc++) {
                     this.sh(30.0F, this.tmX[1], this.tmY[1], 1, (float)(1.5 + 0.2 * this.cyc), 90 - this.eholdnumber[var1], 1, 6, 30, 2, 1);
                  }

                  for (this.cyc = 1; this.cyc < 2; this.cyc++) {
                     this.sh(30.0F, this.tmX[3], this.tmY[3], 1, (float)(1.5 + 0.2 * this.cyc), 90 + this.eholdnumber[var1] + 13, 1, 6, 30, 2, 1);
                  }

                  for (this.cyc = 1; this.cyc < 2; this.cyc++) {
                     this.sh(30.0F, this.tmX[0], this.tmY[0], 1, (float)(1.5 + 0.2 * this.cyc), 90 + this.eholdnumber[var1] + 49, 1, 6, 30, 2, 4);
                  }

                  for (this.cyc = 1; this.cyc < 2; this.cyc++) {
                     this.sh(30.0F, this.tmX[2], this.tmY[2], 1, (float)(1.5 + 0.2 * this.cyc), 90 - this.eholdnumber[var1], 1, 6, 30, 2, 4);
                  }

                  this.eholdnumber[var1] = this.eholdnumber[var1] + 19;
               }
            } else if (this.stagelevel == 1) {
               this.cyc = 0;
               if (this.etime[var1] % 2 == 1) {
                  this.sh(30.0F, this.tmX[1], this.tmY[1], 1, (float)(1.5 + 0.2 * this.cyc), -90 - this.eholdnumber[var1], 1, 6, 30, 2, 1);
                  this.sh(30.0F, this.tmX[3], this.tmY[3], 1, (float)(1.5 + 0.2 * this.cyc), -90 + this.eholdnumber[var1] + 13, 1, 6, 30, 2, 1);
                  this.sh(30.0F, this.tmX[0], this.tmY[0], 1, (float)(1.5 + 0.2 * this.cyc), -90 + this.eholdnumber[var1] + 49, 1, 6, 30, 2, 4);
                  this.sh(30.0F, this.tmX[2], this.tmY[2], 1, (float)(1.5 + 0.2 * this.cyc), -90 - this.eholdnumber[var1], 1, 6, 30, 2, 4);
                  this.sh(30.0F, this.tmX[1], this.tmY[1], 1, (float)(1.5 + 0.2 * this.cyc), 90 - this.eholdnumber[var1], 1, 6, 30, 2, 1);
                  this.sh(30.0F, this.tmX[3], this.tmY[3], 1, (float)(1.5 + 0.2 * this.cyc), 90 + this.eholdnumber[var1] + 13, 1, 6, 30, 2, 1);
                  this.sh(30.0F, this.tmX[0], this.tmY[0], 1, (float)(1.5 + 0.2 * this.cyc), 90 + this.eholdnumber[var1] + 49, 1, 6, 30, 2, 4);
                  this.sh(30.0F, this.tmX[2], this.tmY[2], 1, (float)(1.5 + 0.2 * this.cyc), 90 - this.eholdnumber[var1], 1, 6, 30, 2, 4);
                  this.eholdnumber[var1] = this.eholdnumber[var1] + 19;
               }
            }
         } else if (this.edoing[var1] == 17) {
            this.bosstairyoku = 600.0F;
            this.bosstimelim = 2700;
            this.spelbonus = 15000;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (120.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 6, 2, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               if (this.stagelevel == 0) {
                  this.spelname = "「魔神復活」";
               }

               if (this.stagelevel == 1) {
                  this.spelname = "「女神転生」";
               }

               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 50) {
               effectIn(this.eX[var1], this.eY[var1], 120, 60, 0, 0);
               this.eholdnumber[var1] = 0;
            } else if (this.etime[var1] == 110) {
               effectIn(this.eX[var1], this.eY[var1], 12, 10, 0, 0);
               this.eYmove[var1] = (80.0F - this.eY[var1]) / 20.0F;
               this.etime[var1] = 0;
               this.edoing[var1]++;
               if (this.sevolume != 0) {
                  AudioPresenter var10001 = this.seplayer[4];
                  this.seplayer[4].setAttribute(4, this.sevolume);
               }

               if (this.sevolume != 0) {
                  this.seplayer[4].play();
               }
            }
         } else if (this.edoing[var1] == 18) {
            this.bosstairyoku = 600.0F;
            if (this.etime[var1] % 3 == 0) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.tmX[this.cyc], this.tmY[this.cyc], 1, 5.0F, -90 - this.eholdnumber[var1], 1, 6, 30, 2, 2);
                  this.sh(this.tmX[this.cyc], this.tmY[this.cyc], 1, 5.0F, -90 + this.eholdnumber[var1], 1, 6, 30, 2, 2);
               }
            }

            this.eholdnumber[var1]++;
            this.eholdnumber[var1]++;
            if (this.etime[var1] == 20) {
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] == 55) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
               this.eholdnumber[var1] = 0;
               this.eholdnumber2[var1] = 1;
            }
         } else if (this.edoing[var1] == 19) {
            if (this.etime[var1] % 3 == 0) {
               this.sh(this.tmX[0], this.tmY[0], 1, 5.0F, 20.0F + (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[0], this.tmY[0], 1, 5.0F, 160.0F + (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[0], this.tmY[0], 1, 5.0F, 90.0F + (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[2], this.tmY[2], 1, 5.0F, 20.0F - (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[2], this.tmY[2], 1, 5.0F, 160.0F - (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[2], this.tmY[2], 1, 5.0F, 90.0F - (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[1], this.tmY[1], 1, 5.0F, 20.0F - (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[1], this.tmY[1], 1, 5.0F, 160.0F - (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[1], this.tmY[1], 1, 5.0F, 90.0F - (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[3], this.tmY[3], 1, 5.0F, 20.0F + (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[3], this.tmY[3], 1, 5.0F, 160.0F + (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[3], this.tmY[3], 1, 5.0F, 90.0F + (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
            }

            this.eholdnumber[var1] = this.eholdnumber[var1] + this.eholdnumber2[var1];
            if (this.eholdnumber[var1] > 35) {
               this.eholdnumber2[var1] = -2;
            }

            if (this.eholdnumber[var1] < -60) {
               this.eholdnumber2[var1] = 2;
            }

            if (this.stagelevel == 0) {
               if (this.etime[var1] % 90 == 0) {
                  this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
                  this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.ehnum[var1], 1, 6, 30, 6, 2);
               }

               if ((this.bosstairyoku < 400.0F || this.bosstimelim < 900) && this.etime[var1] % 4 == 0) {
                  this.sh(10.0F, this.tmX[0], this.tmY[0], 1, 1.5F, -90 + this.etime[var1] * 7 % 360, 1, 6, 30, 0, 4);
                  this.sh(10.0F, this.tmX[2], this.tmY[2], 1, 1.5F, 90 + this.etime[var1] * 7 % 360, 1, 6, 30, 0, 4);
                  this.sh(10.0F, this.tmX[1], this.tmY[1], 1, 1.5F, 90 - this.etime[var1] * 7 % 360, 1, 6, 30, 0, 4);
                  this.sh(10.0F, this.tmX[3], this.tmY[3], 1, 1.5F, -90 - this.etime[var1] * 7 % 360, 1, 6, 30, 0, 4);
               }
            } else if (this.stagelevel == 1) {
               if (this.etime[var1] % 90 == 0) {
                  this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

                  for (this.cyc = -1; this.cyc < 2; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 1, 2.5F, this.ehnum[var1] + this.cyc * 45, 1, 6, 30, 6, 2);
                  }
               }

               if ((this.bosstairyoku < 400.0F || this.bosstimelim < 900) && this.etime[var1] % 2 == 0) {
                  this.sh(10.0F, this.tmX[0], this.tmY[0], 1, 2.5F, -90 + this.etime[var1] * 7 % 360, 1, 6, 30, 0, 4);
                  this.sh(10.0F, this.tmX[2], this.tmY[2], 1, 2.5F, 90 + this.etime[var1] * 7 % 360, 1, 6, 30, 0, 4);
                  this.sh(10.0F, this.tmX[1], this.tmY[1], 1, 2.5F, 90 - this.etime[var1] * 7 % 360, 1, 6, 30, 0, 4);
                  this.sh(10.0F, this.tmX[3], this.tmY[3], 1, 2.5F, -90 - this.etime[var1] * 7 % 360, 1, 6, 30, 0, 4);
               }
            }

            if (this.bosstairyoku < 200.0F || this.bosstimelim < 900) {
               this.eholdnumber3[var1] = 0;
               this.edoing[var1]++;
               if (this.sevolume != 0) {
                  AudioPresenter var4 = this.seplayer[0];
                  this.seplayer[0].setAttribute(4, this.sevolume);
               }

               if (this.sevolume != 0) {
                  this.seplayer[0].play();
               }

               this.laserIn(this.tmX[0], this.tmY[0], 5, 30.0F, this.cyc * 60, 4.0F, 40, 270, 2, 2);
               this.laserIn(this.tmX[2], this.tmY[2], 5, 30.0F, this.cyc * 60, 4.0F, 40, 90, 2, 2);
               this.laserIn(this.tmX[1], this.tmY[1], 5, 30.0F, this.cyc * 60, 4.0F, 40, 90, 2, 2);
               this.laserIn(this.tmX[3], this.tmY[3], 5, 30.0F, this.cyc * 60, 4.0F, 40, 270, 2, 2);
            }

            if (this.peopleY < 50) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
               if (this.etime[var1] % 3 == 0) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 4.0F, this.ehnum[var1], 1, 6, 30, 5, 3);
               }
            }
         } else if (this.edoing[var1] == 20) {
            if (this.peopleY < 50) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
               if (this.etime[var1] % 3 == 0) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 4.0F, this.ehnum[var1], 1, 6, 30, 5, 3);
               }
            }

            if (this.etime[var1] % 3 == 0) {
               this.sh(this.tmX[0], this.tmY[0], 1, 5.0F, 20.0F + (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[0], this.tmY[0], 1, 5.0F, 160.0F + (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[0], this.tmY[0], 1, 5.0F, 90.0F + (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[2], this.tmY[2], 1, 5.0F, 20.0F - (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[2], this.tmY[2], 1, 5.0F, 160.0F - (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[2], this.tmY[2], 1, 5.0F, 90.0F - (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[1], this.tmY[1], 1, 5.0F, 20.0F - (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[1], this.tmY[1], 1, 5.0F, 160.0F - (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[1], this.tmY[1], 1, 5.0F, 90.0F - (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[3], this.tmY[3], 1, 5.0F, 20.0F + (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[3], this.tmY[3], 1, 5.0F, 160.0F + (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
               this.sh(this.tmX[3], this.tmY[3], 1, 5.0F, 90.0F + (float)(this.eholdnumber[var1] * 0.25), 1, 6, 30, 2, 2);
            }

            this.eholdnumber[var1] = this.eholdnumber[var1] + this.eholdnumber2[var1];
            if (this.eholdnumber[var1] > 35) {
               this.eholdnumber2[var1] = -2;
            }

            if (this.eholdnumber[var1] < -60) {
               this.eholdnumber2[var1] = 2;
            }

            if (this.stagelevel == 0) {
               if (this.etime[var1] % 90 == 0) {
                  this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
                  this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.ehnum[var1], 1, 6, 30, 6, 2);
               }

               if (this.bosstairyoku < 400.0F && this.etime[var1] % 4 == 0) {
                  this.sh(10.0F, this.tmX[0], this.tmY[0], 1, 1.5F, -90 + this.etime[var1] * 7 % 360, 1, 6, 30, 0, 4);
                  this.sh(10.0F, this.tmX[2], this.tmY[2], 1, 1.5F, 90 + this.etime[var1] * 7 % 360, 1, 6, 30, 0, 4);
                  this.sh(10.0F, this.tmX[1], this.tmY[1], 1, 1.5F, 90 - this.etime[var1] * 7 % 360, 1, 6, 30, 0, 4);
                  this.sh(10.0F, this.tmX[3], this.tmY[3], 1, 1.5F, -90 - this.etime[var1] * 7 % 360, 1, 6, 30, 0, 4);
               }

               if (this.bosstairyoku < 100.0F && this.etime[var1] % 4 == 2) {
                  this.sh(30.0F, this.tmX[0], this.tmY[0], 1, 1.5F, 90 - this.etime[var1] * 7 % 360, 1, 6, 30, 0, 5);
                  this.sh(30.0F, this.tmX[2], this.tmY[2], 1, 1.5F, -90 - this.etime[var1] * 7 % 360, 1, 6, 30, 0, 5);
                  this.sh(30.0F, this.tmX[1], this.tmY[1], 1, 1.5F, -90 + this.etime[var1] * 7 % 360, 1, 6, 30, 0, 5);
                  this.sh(30.0F, this.tmX[3], this.tmY[3], 1, 1.5F, 90 + this.etime[var1] * 7 % 360, 1, 6, 30, 0, 5);
               }
            } else if (this.stagelevel == 1) {
               if (this.etime[var1] % 90 == 0) {
                  this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

                  for (this.cyc = -1; this.cyc < 2; this.cyc++) {
                     this.sh(this.eX[var1], this.eY[var1], 1, 2.5F, this.ehnum[var1] + this.cyc * 45, 1, 6, 30, 6, 2);
                  }
               }

               if (this.etime[var1] % 2 == 0) {
                  this.sh(10.0F, this.tmX[0], this.tmY[0], 1, 2.5F, -90 + this.etime[var1] * 7 % 360, 1, 6, 30, 0, 4);
                  this.sh(10.0F, this.tmX[2], this.tmY[2], 1, 2.5F, 90 + this.etime[var1] * 7 % 360, 1, 6, 30, 0, 4);
                  this.sh(10.0F, this.tmX[1], this.tmY[1], 1, 2.5F, 90 - this.etime[var1] * 7 % 360, 1, 6, 30, 0, 4);
                  this.sh(10.0F, this.tmX[3], this.tmY[3], 1, 2.5F, -90 - this.etime[var1] * 7 % 360, 1, 6, 30, 0, 4);
               }

               if (this.bosstairyoku < 100.0F && this.etime[var1] % 2 == 1) {
                  this.sh(30.0F, this.tmX[0], this.tmY[0], 1, 2.5F, 90 - this.etime[var1] * 7 % 360, 1, 6, 30, 0, 5);
                  this.sh(30.0F, this.tmX[2], this.tmY[2], 1, 2.5F, -90 - this.etime[var1] * 7 % 360, 1, 6, 30, 0, 5);
                  this.sh(30.0F, this.tmX[1], this.tmY[1], 1, 2.5F, -90 + this.etime[var1] * 7 % 360, 1, 6, 30, 0, 5);
                  this.sh(30.0F, this.tmX[3], this.tmY[3], 1, 2.5F, 90 + this.etime[var1] * 7 % 360, 1, 6, 30, 0, 5);
               }
            }
         } else if (this.edoing[var1] == 21) {
            this.bosstairyoku = 300.0F;
            this.bosstimelim = 2700;
            this.spelbonus = 15000;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
               this.haneflag = 0;
            } else if (this.etime[var1] == 60) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
               this.bossspel = 1;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 6, 2, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "超神「魔界曼荼羅絵巻」";
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 91) {
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 131) {
               this.etime[var1] = 770;
               this.edoing[var1]++;
               this.eholdnumber[var1] = 50;
            }
         } else if (this.edoing[var1] == 22) {
            if (this.etime[var1] % 200 == 0) {
               this.eholdnumber[var1] = 50;
               this.eholdnumber3[var1] = 0;
            }

            if (this.etime[var1] % 200 == 150) {
               effectIn(this.eX[var1], this.eY[var1], 777, 0, 0, 0);
            }

            if (this.etime[var1] % 200 == 0) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] % 800 == 770) {
               this.eXmove[var1] = (this.migi - 40 - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (60.0F - this.eY[var1]) / 30.0F;
            } else if (this.etime[var1] % 800 == 171) {
               this.eXmove[var1] = (this.migi - 40 - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (200.0F - this.eY[var1]) / 30.0F;
            } else if (this.etime[var1] % 800 == 371) {
               this.eXmove[var1] = (40.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (200.0F - this.eY[var1]) / 30.0F;
            } else if (this.etime[var1] % 800 == 571) {
               this.eXmove[var1] = (40.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (60.0F - this.eY[var1]) / 30.0F;
            }

            if (this.stagelevel == 0) {
               if (this.etime[var1] % 800 < 16) {
                  for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                     this.laserIn(
                        6 + this.eholdnumber3[var1],
                        (float)(120.0 + 10.0 * Math.sin(this.eholdnumber2[var1] * 0.5 * 3.1415 / 180.0)),
                        6,
                        0.0F,
                        -90.0F,
                        3.0F,
                        40,
                        this.eholdnumber2[var1],
                        this.eholdnumber[var1],
                        5
                     );
                     this.eholdnumber[var1]--;
                     this.eholdnumber2[var1] = this.eholdnumber2[var1] + 37;
                     this.eholdnumber3[var1] = this.eholdnumber3[var1] + 6;
                  }
               } else if (this.etime[var1] % 800 > 199 && this.etime[var1] % 800 < 220) {
                  for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                     this.laserIn(
                        (float)(this.migi - 40 - 40 + 10.0 * Math.sin(this.eholdnumber2[var1] * 0.5 * 3.1415 / 180.0)),
                        6 + this.eholdnumber3[var1],
                        6,
                        0.0F,
                        0.0F,
                        3.0F,
                        40,
                        this.eholdnumber2[var1],
                        this.eholdnumber[var1],
                        5
                     );
                     this.eholdnumber[var1]--;
                     this.eholdnumber2[var1] = this.eholdnumber2[var1] + 37;
                     this.eholdnumber3[var1] = this.eholdnumber3[var1] + 6;
                  }
               } else if (this.etime[var1] % 800 > 399 && this.etime[var1] % 800 < 416) {
                  for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                     this.laserIn(
                        this.migi - 6 - this.eholdnumber3[var1],
                        (float)(160.0 + 10.0 * Math.sin(this.eholdnumber2[var1] * 0.5 * 3.1415 / 180.0)),
                        6,
                        0.0F,
                        90.0F,
                        3.0F,
                        40,
                        this.eholdnumber2[var1],
                        this.eholdnumber[var1],
                        5
                     );
                     this.eholdnumber[var1]--;
                     this.eholdnumber2[var1] = this.eholdnumber2[var1] + 37;
                     this.eholdnumber3[var1] = this.eholdnumber3[var1] + 6;
                  }
               } else if (this.etime[var1] % 800 > 599 && this.etime[var1] % 800 < 620) {
                  for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                     this.laserIn(
                        (float)(10.0 + 10.0 * Math.sin(this.eholdnumber2[var1] * 0.5 * 3.1415 / 180.0)),
                        234 - this.eholdnumber3[var1],
                        6,
                        0.0F,
                        0.0F,
                        3.0F,
                        40,
                        this.eholdnumber2[var1],
                        this.eholdnumber[var1],
                        5
                     );
                     this.eholdnumber[var1]--;
                     this.eholdnumber2[var1] = this.eholdnumber2[var1] + 37;
                     this.eholdnumber3[var1] = this.eholdnumber3[var1] + 6;
                  }
               }
            } else if (this.stagelevel == 1) {
               if (this.etime[var1] % 800 < 16) {
                  for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                     this.laserIn(
                        6 + this.eholdnumber3[var1],
                        (float)(120.0 + 10.0 * Math.sin(this.eholdnumber2[var1] * 0.5 * 3.1415 / 180.0)),
                        6,
                        0.0F,
                        -90.0F,
                        3.0F,
                        80,
                        this.eholdnumber2[var1],
                        this.eholdnumber[var1],
                        5
                     );
                     this.eholdnumber[var1]--;
                     this.eholdnumber2[var1] = this.eholdnumber2[var1] + 37;
                     this.eholdnumber3[var1] = this.eholdnumber3[var1] + 6;
                  }
               } else if (this.etime[var1] % 800 > 199 && this.etime[var1] % 800 < 220) {
                  for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                     this.laserIn(
                        (float)(this.migi - 40 - 40 + 10.0 * Math.sin(this.eholdnumber2[var1] * 0.5 * 3.1415 / 180.0)),
                        6 + this.eholdnumber3[var1],
                        6,
                        0.0F,
                        0.0F,
                        3.0F,
                        80,
                        this.eholdnumber2[var1],
                        this.eholdnumber[var1],
                        5
                     );
                     this.eholdnumber[var1]--;
                     this.eholdnumber2[var1] = this.eholdnumber2[var1] + 37;
                     this.eholdnumber3[var1] = this.eholdnumber3[var1] + 6;
                  }
               } else if (this.etime[var1] % 800 > 399 && this.etime[var1] % 800 < 416) {
                  for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                     this.laserIn(
                        this.migi - 6 - this.eholdnumber3[var1],
                        (float)(160.0 + 10.0 * Math.sin(this.eholdnumber2[var1] * 0.5 * 3.1415 / 180.0)),
                        6,
                        0.0F,
                        90.0F,
                        3.0F,
                        80,
                        this.eholdnumber2[var1],
                        this.eholdnumber[var1],
                        5
                     );
                     this.eholdnumber[var1]--;
                     this.eholdnumber2[var1] = this.eholdnumber2[var1] + 37;
                     this.eholdnumber3[var1] = this.eholdnumber3[var1] + 6;
                  }
               } else if (this.etime[var1] % 800 > 599 && this.etime[var1] % 800 < 620) {
                  for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                     this.laserIn(
                        (float)(10.0 + 10.0 * Math.sin(this.eholdnumber2[var1] * 0.5 * 3.1415 / 180.0)),
                        234 - this.eholdnumber3[var1],
                        6,
                        0.0F,
                        0.0F,
                        3.0F,
                        80,
                        this.eholdnumber2[var1],
                        this.eholdnumber[var1],
                        5
                     );
                     this.eholdnumber[var1]--;
                     this.eholdnumber2[var1] = this.eholdnumber2[var1] + 37;
                     this.eholdnumber3[var1] = this.eholdnumber3[var1] + 6;
                  }
               }
            }
         } else if (this.edoing[var1] == 23) {
            this.bosstairyoku = 800.0F;
            this.bosstimelim = 2700;
            this.spelbonus = 15000;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (120.0F - this.eY[var1]) / 30.0F;
               this.haneflag = 0;
            } else if (this.etime[var1] == 30) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 50) {
               effectIn(this.eX[var1], this.eY[var1], 25, 0, 0, 0);
               this.haneflag = 1;
            } else if (this.etime[var1] == 100) {
               effectIn(this.eX[var1], this.eY[var1], 12, 10, 0, 0);
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = -0.8F;
            } else if (this.etime[var1] == 120) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 130) {
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
            } else if (this.etime[var1] == 180) {
               this.bossspel = 1;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 6, 2, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "「ビギニングオブザコスモス」";
               if (this.stagelevel == 1) {
                  this.spelname = "「天地創造の神魔談」";
               }

               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 270) {
               this.eholdnumber2[var1] = 3;

               for (this.cyc2 = 0; this.cyc2 < 6; this.cyc2++) {
                  for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                     this.sh(
                        this.tmX[0],
                        this.tmY[0],
                        3,
                        2.0F,
                        this.cyc2 * 60 + this.cyc * 3 + this.eholdnumber[var1],
                        90 - this.cyc * 17,
                        20,
                        60 + this.cyc * 2,
                        2,
                        this.eholdnumber2[var1]
                     );
                     this.sh(
                        this.tmX[2],
                        this.tmY[0],
                        3,
                        2.0F,
                        -(this.cyc2 * 60 + this.cyc * 3 + this.eholdnumber[var1]),
                        -(90 - this.cyc * 17),
                        20,
                        60 + this.cyc * 2,
                        2,
                        this.eholdnumber2[var1]
                     );
                  }
               }

               if (this.eholdnumber2[var1] == 3) {
                  this.eholdnumber2[var1] = 8;
               } else if (this.eholdnumber2[var1] == 8) {
                  this.eholdnumber2[var1] = 9;
               } else if (this.eholdnumber2[var1] == 9) {
                  this.eholdnumber2[var1] = 10;
               } else if (this.eholdnumber2[var1] == 10) {
                  this.eholdnumber2[var1] = 11;
               } else if (this.eholdnumber2[var1] == 11) {
                  this.eholdnumber2[var1] = 12;
               } else if (this.eholdnumber2[var1] == 12) {
                  this.eholdnumber2[var1] = 3;
               }
            } else if (this.etime[var1] == 360) {
               this.etime[var1] = 1;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 24) {
            if (this.stagelevel == 0) {
               if (this.bosstairyoku > 300.0F) {
                  if (this.etime[var1] % 80 == 1) {
                     this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 60;

                     for (this.cyc2 = 0; this.cyc2 < 6; this.cyc2++) {
                        for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                           this.sh(
                              this.tmX[0],
                              this.tmY[0],
                              3,
                              1.7F,
                              this.cyc2 * 60 + this.cyc * 3 + this.eholdnumber[var1],
                              90 - this.cyc * 17,
                              20,
                              30 + this.cyc * 3,
                              2,
                              this.eholdnumber2[var1]
                           );
                           this.sh(
                              this.tmX[2],
                              this.tmY[0],
                              3,
                              1.7F,
                              -(this.cyc2 * 60 + this.cyc * 3 + this.eholdnumber[var1]),
                              -(90 - this.cyc * 17),
                              20,
                              30 + this.cyc * 3,
                              2,
                              this.eholdnumber2[var1]
                           );
                        }
                     }

                     if (this.eholdnumber2[var1] == 3) {
                        this.eholdnumber2[var1] = 8;
                     } else if (this.eholdnumber2[var1] == 8) {
                        this.eholdnumber2[var1] = 9;
                     } else if (this.eholdnumber2[var1] == 9) {
                        this.eholdnumber2[var1] = 10;
                     } else if (this.eholdnumber2[var1] == 10) {
                        this.eholdnumber2[var1] = 11;
                     } else if (this.eholdnumber2[var1] == 11) {
                        this.eholdnumber2[var1] = 12;
                     } else if (this.eholdnumber2[var1] == 12) {
                        this.eholdnumber2[var1] = 3;
                     }
                  }

                  if (this.etime[var1] % 80 == 40) {
                     this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 60;

                     for (this.cyc2 = 0; this.cyc2 < 6; this.cyc2++) {
                        for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                           this.sh(
                              this.tmX[1],
                              this.tmY[1],
                              3,
                              1.7F,
                              this.cyc2 * 60 + this.cyc * 3 + this.eholdnumber[var1],
                              90 - this.cyc * 19,
                              17,
                              30 + this.cyc * 3,
                              2,
                              this.eholdnumber2[var1]
                           );
                           this.sh(
                              this.tmX[3],
                              this.tmY[3],
                              3,
                              1.7F,
                              -(this.cyc2 * 60 + this.cyc * 3 + this.eholdnumber[var1]),
                              -(90 - this.cyc * 19),
                              17,
                              30 + this.cyc * 3,
                              2,
                              this.eholdnumber2[var1]
                           );
                        }
                     }

                     if (this.eholdnumber2[var1] == 3) {
                        this.eholdnumber2[var1] = 8;
                     } else if (this.eholdnumber2[var1] == 8) {
                        this.eholdnumber2[var1] = 9;
                     } else if (this.eholdnumber2[var1] == 9) {
                        this.eholdnumber2[var1] = 10;
                     } else if (this.eholdnumber2[var1] == 10) {
                        this.eholdnumber2[var1] = 11;
                     } else if (this.eholdnumber2[var1] == 11) {
                        this.eholdnumber2[var1] = 12;
                     } else if (this.eholdnumber2[var1] == 12) {
                        this.eholdnumber2[var1] = 3;
                     }
                  }

                  if (this.etime[var1] % 80 == 20) {
                     this.sh(this.eX[var1], this.eY[var1], 2, 1.7F, 0.0F, this.peopleX, this.peopleY, 30, 5, this.eholdnumber2[var1] % 6);
                  }
               } else {
                  if (this.etime[var1] % 60 == 15) {
                     this.sh(this.eX[var1], this.eY[var1], 2, 1.7F, 0.0F, this.peopleX, this.peopleY, 30, 5, this.eholdnumber2[var1] % 6);
                  }

                  if (this.etime[var1] % 60 == 1) {
                     this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 60;

                     for (this.cyc2 = 0; this.cyc2 < 6; this.cyc2++) {
                        for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                           this.sh(
                              this.tmX[0],
                              this.tmY[0],
                              3,
                              1.9F,
                              this.cyc2 * 60 + this.cyc * 3 + this.eholdnumber[var1],
                              90 - this.cyc * 17,
                              20,
                              30 + this.cyc * 3,
                              2,
                              this.eholdnumber2[var1]
                           );
                           this.sh(
                              this.tmX[2],
                              this.tmY[0],
                              3,
                              1.9F,
                              -this.cyc2 * 60 - this.cyc * 3 - this.eholdnumber[var1],
                              -90 + this.cyc * 17,
                              20,
                              30 + this.cyc * 3,
                              2,
                              this.eholdnumber2[var1]
                           );
                        }
                     }

                     if (this.eholdnumber2[var1] == 3) {
                        this.eholdnumber2[var1] = 8;
                     } else if (this.eholdnumber2[var1] == 8) {
                        this.eholdnumber2[var1] = 9;
                     } else if (this.eholdnumber2[var1] == 9) {
                        this.eholdnumber2[var1] = 10;
                     } else if (this.eholdnumber2[var1] == 10) {
                        this.eholdnumber2[var1] = 11;
                     } else if (this.eholdnumber2[var1] == 11) {
                        this.eholdnumber2[var1] = 12;
                     } else if (this.eholdnumber2[var1] == 12) {
                        this.eholdnumber2[var1] = 3;
                     }
                  }

                  if (this.etime[var1] % 60 == 30) {
                     this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 60;

                     for (this.cyc2 = 0; this.cyc2 < 6; this.cyc2++) {
                        for (this.cyc = 0; this.cyc < 6; this.cyc++) {
                           this.sh(
                              this.tmX[1],
                              this.tmY[1],
                              3,
                              1.9F,
                              this.cyc2 * 60 + this.cyc * 3 + this.eholdnumber[var1],
                              90 - this.cyc * 19,
                              17,
                              30 + this.cyc * 3,
                              2,
                              this.eholdnumber2[var1]
                           );
                           this.sh(
                              this.tmX[3],
                              this.tmY[3],
                              3,
                              1.9F,
                              -this.cyc2 * 60 - this.cyc * 3 - this.eholdnumber[var1],
                              -90 + this.cyc * 19,
                              17,
                              30 + this.cyc * 3,
                              2,
                              this.eholdnumber2[var1]
                           );
                        }
                     }

                     if (this.eholdnumber2[var1] == 3) {
                        this.eholdnumber2[var1] = 8;
                     } else if (this.eholdnumber2[var1] == 8) {
                        this.eholdnumber2[var1] = 9;
                     } else if (this.eholdnumber2[var1] == 9) {
                        this.eholdnumber2[var1] = 10;
                     } else if (this.eholdnumber2[var1] == 10) {
                        this.eholdnumber2[var1] = 11;
                     } else if (this.eholdnumber2[var1] == 11) {
                        this.eholdnumber2[var1] = 12;
                     } else if (this.eholdnumber2[var1] == 12) {
                        this.eholdnumber2[var1] = 3;
                     }
                  }
               }
            } else if (this.stagelevel == 1) {
               if (this.bosstairyoku > 300.0F) {
                  if (this.etime[var1] % 80 == 1) {
                     this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 60;

                     for (this.cyc2 = 0; this.cyc2 < 6; this.cyc2++) {
                        for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                           this.sh(
                              this.tmX[0],
                              this.tmY[0],
                              3,
                              2.0F,
                              this.cyc2 * 60 + this.cyc * 3 + this.eholdnumber[var1],
                              90 - this.cyc * 17,
                              19,
                              20 + this.cyc * 3,
                              2,
                              this.eholdnumber2[var1]
                           );
                           this.sh(
                              this.tmX[2],
                              this.tmY[0],
                              3,
                              2.0F,
                              -(this.cyc2 * 60 + this.cyc * 3 + this.eholdnumber[var1]),
                              -(90 - this.cyc * 17),
                              19,
                              20 + this.cyc * 3,
                              2,
                              this.eholdnumber2[var1]
                           );
                        }
                     }

                     if (this.eholdnumber2[var1] == 3) {
                        this.eholdnumber2[var1] = 8;
                     } else if (this.eholdnumber2[var1] == 8) {
                        this.eholdnumber2[var1] = 9;
                     } else if (this.eholdnumber2[var1] == 9) {
                        this.eholdnumber2[var1] = 10;
                     } else if (this.eholdnumber2[var1] == 10) {
                        this.eholdnumber2[var1] = 11;
                     } else if (this.eholdnumber2[var1] == 11) {
                        this.eholdnumber2[var1] = 12;
                     } else if (this.eholdnumber2[var1] == 12) {
                        this.eholdnumber2[var1] = 3;
                     }
                  }

                  if (this.etime[var1] % 80 == 40) {
                     this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 60;

                     for (this.cyc2 = 0; this.cyc2 < 6; this.cyc2++) {
                        for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                           this.sh(
                              this.tmX[1],
                              this.tmY[1],
                              3,
                              2.0F,
                              this.cyc2 * 60 + this.cyc * 3 + this.eholdnumber[var1],
                              90 - this.cyc * 19,
                              17,
                              20 + this.cyc * 3,
                              2,
                              this.eholdnumber2[var1]
                           );
                           this.sh(
                              this.tmX[3],
                              this.tmY[3],
                              3,
                              2.0F,
                              -(this.cyc2 * 60 + this.cyc * 3 + this.eholdnumber[var1]),
                              -(90 - this.cyc * 19),
                              17,
                              20 + this.cyc * 3,
                              2,
                              this.eholdnumber2[var1]
                           );
                        }
                     }

                     if (this.eholdnumber2[var1] == 3) {
                        this.eholdnumber2[var1] = 8;
                     } else if (this.eholdnumber2[var1] == 8) {
                        this.eholdnumber2[var1] = 9;
                     } else if (this.eholdnumber2[var1] == 9) {
                        this.eholdnumber2[var1] = 10;
                     } else if (this.eholdnumber2[var1] == 10) {
                        this.eholdnumber2[var1] = 11;
                     } else if (this.eholdnumber2[var1] == 11) {
                        this.eholdnumber2[var1] = 12;
                     } else if (this.eholdnumber2[var1] == 12) {
                        this.eholdnumber2[var1] = 3;
                     }
                  }

                  if (this.etime[var1] % 80 == 20) {
                     this.sh(this.eX[var1], this.eY[var1], 2, 2.0F, 0.0F, this.peopleX, this.peopleY, 30, 5, this.eholdnumber2[var1] % 6);
                  }
               } else {
                  if (this.etime[var1] % 60 == 15) {
                     this.sh(this.eX[var1], this.eY[var1], 2, 2.0F, 0.0F, this.peopleX, this.peopleY, 30, 5, this.eholdnumber2[var1] % 6);
                  }

                  if (this.etime[var1] % 60 == 1) {
                     this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 60;

                     for (this.cyc2 = 0; this.cyc2 < 6; this.cyc2++) {
                        for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                           this.sh(
                              this.tmX[0],
                              this.tmY[0],
                              3,
                              2.2F,
                              this.cyc2 * 60 + this.cyc * 3 + this.eholdnumber[var1],
                              90 - this.cyc * 17,
                              19,
                              20 + this.cyc * 3,
                              2,
                              this.eholdnumber2[var1]
                           );
                           this.sh(
                              this.tmX[2],
                              this.tmY[0],
                              3,
                              2.2F,
                              -this.cyc2 * 60 - this.cyc * 3 - this.eholdnumber[var1],
                              -90 + this.cyc * 17,
                              19,
                              20 + this.cyc * 3,
                              2,
                              this.eholdnumber2[var1]
                           );
                        }
                     }

                     if (this.eholdnumber2[var1] == 3) {
                        this.eholdnumber2[var1] = 8;
                     } else if (this.eholdnumber2[var1] == 8) {
                        this.eholdnumber2[var1] = 9;
                     } else if (this.eholdnumber2[var1] == 9) {
                        this.eholdnumber2[var1] = 10;
                     } else if (this.eholdnumber2[var1] == 10) {
                        this.eholdnumber2[var1] = 11;
                     } else if (this.eholdnumber2[var1] == 11) {
                        this.eholdnumber2[var1] = 12;
                     } else if (this.eholdnumber2[var1] == 12) {
                        this.eholdnumber2[var1] = 3;
                     }
                  }

                  if (this.etime[var1] % 60 == 30) {
                     this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 60;

                     for (this.cyc2 = 0; this.cyc2 < 6; this.cyc2++) {
                        for (this.cyc = 0; this.cyc < 12; this.cyc++) {
                           this.sh(
                              this.tmX[1],
                              this.tmY[1],
                              3,
                              2.2F,
                              this.cyc2 * 60 + this.cyc * 3 + this.eholdnumber[var1],
                              90 - this.cyc * 19,
                              17,
                              20 + this.cyc * 3,
                              2,
                              this.eholdnumber2[var1]
                           );
                           this.sh(
                              this.tmX[3],
                              this.tmY[3],
                              3,
                              2.2F,
                              -this.cyc2 * 60 - this.cyc * 3 - this.eholdnumber[var1],
                              -90 + this.cyc * 19,
                              17,
                              20 + this.cyc * 3,
                              2,
                              this.eholdnumber2[var1]
                           );
                        }
                     }

                     if (this.eholdnumber2[var1] == 3) {
                        this.eholdnumber2[var1] = 8;
                     } else if (this.eholdnumber2[var1] == 8) {
                        this.eholdnumber2[var1] = 9;
                     } else if (this.eholdnumber2[var1] == 9) {
                        this.eholdnumber2[var1] = 10;
                     } else if (this.eholdnumber2[var1] == 10) {
                        this.eholdnumber2[var1] = 11;
                     } else if (this.eholdnumber2[var1] == 11) {
                        this.eholdnumber2[var1] = 12;
                     } else if (this.eholdnumber2[var1] == 12) {
                        this.eholdnumber2[var1] = 3;
                     }
                  }
               }
            }
         } else if (this.edoing[var1] == 25) {
            if (this.etime[var1] == 1) {
               this.bossmode = 0;
               effectIn(this.eX[var1], this.eY[var1], 1, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 26, 0, 0, 0);
               this.bossmahoujinn = 0;
               this.stagetime = 80000;
            }

            if (this.etime[var1] == 20) {
               effectIn(this.eX[var1], this.eY[var1], 1, 0, 0, 0);
               this.haneflag = 0;
               this.bossmahoujinn = 0;
               this.emode[var1] = 0;
            }
         }
      }
   }

   void stageEXmove(int var1) {
      if (this.emode[var1] == 1) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = (float)(this.emuki[var1] * 0.5);
            this.eYmove[var1] = -5.0F;
            this.etairyoku[var1] = 1.0F;
            this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 20;
         }

         if (this.etime[var1] < 25) {
            this.eYmove[var1] = (float)(this.eYmove[var1] + 0.2);
         }

         if (this.etime[var1] == 25) {
            this.eYmove[var1] = 0.0F;
            this.eXmove[var1] = (float)(this.emuki[var1] * 0.5);
         }

         if (this.etime[var1] == 60) {
            this.eXmove[var1] = (float)(this.emuki[var1] * 1.5);
         }

         if (this.etime[var1] > 30 && this.etime[var1] < 60 && this.etime[var1] % 4 == 0) {
            this.eholdnumber2[var1] = (this.rand.nextInt() >>> 1) % 21 - 10;
            this.sh(this.eX[var1], this.eY[var1], 2, 2.0F, this.eholdnumber2[var1], this.peopleX, this.peopleY, 0, 3, 1);
            this.sh(this.eX[var1], this.eY[var1], 2, 3.5F, this.eholdnumber2[var1], this.peopleX, this.peopleY, 0, 3, 2);
         }
      } else if (this.emode[var1] == 2) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 2.0F;
            this.etairyoku[var1] = 25.0F;
            this.eshape[var1] = 3;
         } else if (this.etime[var1] < 20) {
            this.etairyoku[var1] = 25.0F;
         } else if (this.etime[var1] == 40) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
            this.eholdnumber[var1] = 0;
         } else if (this.etime[var1] == 120) {
            this.eYmove[var1] = -2.0F;
         }

         if (this.etime[var1] == 40) {
            this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
         }

         if (this.etime[var1] > 39 && this.etime[var1] < 65 && this.etime[var1] % 2 == 0) {
            for (this.cyc = -this.eholdnumber[var1]; this.cyc < this.eholdnumber[var1] + 1; this.cyc++) {
               this.sh(this.eX[var1], this.eY[var1], 8, 5.0F, this.ehnum[var1] + this.cyc * 10, 0, 20, 31, 3, 1);
            }
         }

         if (this.etime[var1] > 39 && this.etime[var1] < 65 && this.etime[var1] % 2 == 1) {
            for (this.cyc = 0; this.cyc < this.eholdnumber[var1] + 1; this.cyc++) {
               this.sh(this.eX[var1], this.eY[var1], 8, 5.0F, this.ehnum[var1] + 5.0F + this.cyc * 10, 0, 15, 25, 3, 1);
               this.sh(this.eX[var1], this.eY[var1], 8, 5.0F, this.ehnum[var1] - 5.0F - this.cyc * 10, 0, 15, 25, 3, 1);
            }

            this.eholdnumber[var1]++;
         }
      } else if (this.emode[var1] == 3) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = this.emuki[var1] * 3;
            this.eYmove[var1] = 0.0F;
            this.etairyoku[var1] = 10.0F;
         }

         if (this.etime[var1] % 4 == 0 && this.etime[var1] < 40) {
            this.sh(this.eX[var1], this.eY[var1], 8, 6.0F, 90.0F, 0, 2, 40, 3, 3);
            this.sh(this.eX[var1], this.eY[var1], 8, 6.0F, -90.0F, 0, 2, 40, 3, 3);
         }
      } else if (this.emode[var1] == 4) {
         if (this.etime[var1] == 1) {
            this.etairyoku[var1] = 3.0F;
            this.eshape[var1] = 1;
         }

         this.eXmove[var1] = (float)(-1.0 * Math.sin(this.emuki[var1] * 3.1415 / 180.0));
         this.eYmove[var1] = (float)(-1.0 + 1.0 * Math.cos(this.emuki[var1] * 3.1415 / 180.0));
         this.emuki[var1] = this.emuki[var1] + 7;
         if (this.etime[var1] % 40 == 1) {
            this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

            for (this.cyc = 0; this.cyc < 18; this.cyc++) {
               this.sh(this.eX[var1], this.eY[var1], 8, 4.0F, this.ehnum[var1] + this.cyc * 20, 0, 20, 0, 0, 0);
            }
         }

         if (this.etime[var1] % 40 == 21) {
            for (this.cyc = 0; this.cyc < 18; this.cyc++) {
               this.sh(this.eX[var1], this.eY[var1], 8, 4.0F, this.cyc * 20, 0, 20, 0, 0, 1);
            }
         }
      } else if (this.emode[var1] == 5) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = this.emuki[var1] * 2;
            this.eYmove[var1] = 2.0F;
            this.etairyoku[var1] = 30.0F;
            this.eshape[var1] = 3;
         } else if (this.etime[var1] == 40) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
            this.eholdnumber[var1] = 0;
         } else if (this.etime[var1] == 150) {
            this.eYmove[var1] = -4.0F;
         }

         if (this.etime[var1] > 40 && this.etime[var1] < 130 && this.etime[var1] % 25 == 1) {
            this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

            for (this.cyc = 0; this.cyc < 10; this.cyc++) {
               this.sh(this.eX[var1], this.eY[var1], 1, 2.5F, this.cyc * 36 + this.ehnum[var1], 0, 20, 0, 5, 2);
            }
         }

         if (this.etime[var1] > 40 && this.etime[var1] < 130 && this.etime[var1] % 2 == 0) {
            for (this.cyc = 0; this.cyc < 6; this.cyc++) {
               this.sh(this.eX[var1], this.eY[var1], 8, 4.0F, this.cyc * 60 + this.eholdnumber[var1] * 13, 0, 20, 0, 0, 1);
            }

            this.eholdnumber[var1]++;
         }
      } else if (this.emode[var1] == 6) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = this.emuki[var1] * 3;
            this.eYmove[var1] = 0.0F;
            this.etairyoku[var1] = 10.0F;
         }

         if (this.etime[var1] % 4 == var1 % 4 && this.etime[var1] < 50) {
            this.sh(this.eX[var1], this.eY[var1], 8, 7.0F, 90.0F, 0, 2, 40, 3, 5);
            this.sh(this.eX[var1], this.eY[var1], 8, 7.0F, -90.0F, 0, 2, 40, 3, 5);
         }
      } else if (this.emode[var1] == 7) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = this.emuki[var1] * 2;
            this.eYmove[var1] = 2.0F;
            this.etairyoku[var1] = 30.0F;
            this.eshape[var1] = 3;
         } else if (this.etime[var1] == 40) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
            this.eholdnumber[var1] = 0;
         } else if (this.etime[var1] == 150) {
            this.eYmove[var1] = -4.0F;
         }

         if (this.etime[var1] % 40 == 21) {
            this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
         }

         if (this.etime[var1] > 40 && this.etime[var1] % 5 == 0) {
            for (this.cyc = 0; this.cyc < 6; this.cyc++) {
               this.sh(this.eX[var1], this.eY[var1], 8, 4.0F, this.cyc * 60 + this.eholdnumber[var1] * 13, 0, 20, 0, 0, 2);
            }

            this.eholdnumber[var1]++;
         }
      } else if (this.emode[var1] == 8) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = -2.0F;
            this.etairyoku[var1] = 10030.0F;
            this.eshape[var1] = 0;
         } else if (this.etime[var1] > 10 && this.etime[var1] < 30) {
            this.eYmove[var1] = (float)(this.eYmove[var1] + 0.05);
         } else if (this.etime[var1] > 30 && this.etime[var1] < 50) {
            this.eXmove[var1] = (float)(this.eXmove[var1] + this.emuki[var1] * 0.04);
            this.eYmove[var1] = (float)(this.eYmove[var1] + 0.04);
         } else if (this.etime[var1] > 50 && this.etime[var1] < 70) {
            this.eXmove[var1] = (float)(this.eXmove[var1] - this.emuki[var1] * 0.04);
            this.eYmove[var1] = (float)(this.eYmove[var1] + 0.02);
         } else if (this.etime[var1] == 70) {
            this.eYmove[var1] = 2.0F;
            this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 4 * 2;
         }

         if (this.etime[var1] > 70 && this.etime[var1] % 8 == this.eholdnumber[var1]) {
            if (this.emuki[var1] > 0) {
               this.sh(this.eX[var1] + (this.rand.nextInt() >>> 1) % 40 - 20.0F, this.eY[var1], 3, 2.0F, -90.0F, -90, 2, 30, 1, 2);
            }

            if (this.emuki[var1] < 0) {
               this.sh(this.eX[var1] + (this.rand.nextInt() >>> 1) % 40 - 20.0F, this.eY[var1], 3, 2.0F, -90.0F, 90, 2, 30, 1, 4);
            }
         }

         if (this.etime[var1] == 60) {
            this.sh(this.eX[var1] + (this.rand.nextInt() >>> 1) % 40 - 20.0F, this.eY[var1], 1, 2.0F, 90.0F, 0, 20, 0, 3, 2);
            this.sh(this.eX[var1] + (this.rand.nextInt() >>> 1) % 40 - 20.0F, this.eY[var1], 1, 2.0F, 90.0F, 0, 20, 0, 3, 2);
            this.sh(this.eX[var1] + (this.rand.nextInt() >>> 1) % 40 - 20.0F, this.eY[var1], 1, 2.0F, 90.0F, 0, 20, 0, 3, 2);
            this.sh(this.eX[var1], this.eY[var1] + (this.rand.nextInt() >>> 1) % 40 - 20.0F, 1, 5.0F, 0.0F, 0, 20, 0, 3, 2);
            this.sh(this.eX[var1], this.eY[var1] + (this.rand.nextInt() >>> 1) % 40 - 20.0F, 1, 5.0F, 180.0F, 0, 20, 0, 3, 2);
         }

         if (this.etairyoku[var1] < 10000.0F) {
            this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

            for (this.cyc = 0; this.cyc < 6; this.cyc++) {
               this.sh(this.eX[var1], this.eY[var1], 8, 4.0F, this.cyc * 60 + this.ehnum[var1], 0, 20, 0, 5, 2);
            }

            this.etairyoku[var1] = -10.0F;
         }
      } else if (this.emode[var1] == 9) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
            this.etairyoku[var1] = 20000.0F;
            this.eshape[var1] = -1000;
         } else if (this.etime[var1] == 60) {
            effectIn(this.eX[var1], this.eY[var1], 777, 0, 0, 0);
         } else if (this.etime[var1] < 80) {
            if (this.etime[var1] % 15 == 1) {
               this.getemove2(var1, 15, 3);
            }
         } else if (this.etime[var1] == 80) {
            this.eXmove[var1] = (this.peopleX - this.eX[var1]) / 30.0F;
            this.eYmove[var1] = (this.peopleY - this.eY[var1]) / 30.0F;
            if (this.peopleY > 240) {
               this.eYmove[var1] = (240.0F - this.eY[var1]) / 30.0F;
            }
         } else if (this.etime[var1] == 110) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
         } else if (this.etime[var1] == 140) {
            this.etairyoku[var1] = -100.0F;
            this.eIn((int)this.eX[var1], (int)this.eY[var1], 9, 0, 0);
         }

         if (this.etime[var1] % 3 == 0) {
            this.eholdnumber[var1]++;
            this.sh(this.eX[var1], this.eY[var1], 3, 1.0F, this.eholdnumber[var1] * 13, -90, 2, 110, 0, 1);
         }

         if (this.etime[var1] % 2 == 0) {
            this.sh(this.eX[var1], this.eY[var1], 32, 0.0F, this.eholdnumber[var1] * 13, -90, 2, 110, 6, 2);
         }

         if (this.etime[var1] > 110 && this.etime[var1] % 3 == 0) {
            this.eholdnumber[var1]++;

            for (this.cyc = 0; this.cyc < 3; this.cyc++) {
               this.sh(this.eX[var1], this.eY[var1], 32, 4.0F, -90 + this.eholdnumber[var1] * 13 + 120 * this.cyc, -90, 2, 30, 2, 2);
               this.sh(this.eX[var1], this.eY[var1], 32, 4.0F, -90 - this.eholdnumber[var1] * 13 + this.cyc * 120, -90, 2, 30, 2, 2);
            }
         }
      } else if (this.emode[var1] == 10) {
         if (this.etime[var1] == 1) {
            this.eX[var1] = (float)(this.peopleX + 30.0 * Math.cos(this.emuki[var1] * 3.1415 / 180.0));
            this.eY[var1] = (float)(this.peopleY + 30.0 * Math.sin(this.emuki[var1] * 3.1415 / 180.0));
            this.eXmove[var1] = (float)(-30.0 * Math.sin(this.emuki[var1] * 3.1415 / 180.0));
            this.eYmove[var1] = (float)(30.0 * Math.cos(this.emuki[var1] * 3.1415 / 180.0));
            this.etairyoku[var1] = 10030.0F;
            this.eshape[var1] = 0;
            this.esuruu[var1] = 1;
            this.emuki[var1] = this.emuki[var1] + 7;
         }

         if (this.etime[var1] < 61) {
            this.eXmove[var1] = (float)(-4.8867777777777786 * Math.sin(this.emuki[var1] * 3.1415 / 180.0));
            this.eYmove[var1] = (float)(4.8867777777777786 * Math.cos(this.emuki[var1] * 3.1415 / 180.0));
            this.etairyoku[var1] = 10030.0F;
            this.eshape[var1] = 0;
            this.emuki[var1] = this.emuki[var1] + 7;
         }

         if (this.etime[var1] == 61) {
            this.eXmove[var1] = (float)(-1.0 * Math.sin(this.emuki[var1] * 3.1415 / 180.0));
            this.eYmove[var1] = (float)(1.0 * Math.cos(this.emuki[var1] * 3.1415 / 180.0));
         }

         if (this.etime[var1] % 4 == 0 && this.etime[var1] > 61) {
            this.sh(this.eX[var1], this.eY[var1], 1, 1.5F, this.emuki[var1] + this.eholdnumber[var1], 0, 2, 30, 0, 0);
            this.eholdnumber[var1] = this.eholdnumber[var1] + 23;
         }
      } else if (this.emode[var1] == 11) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = this.emuki[var1] * 3;
            this.eYmove[var1] = 0.0F;
            this.etairyoku[var1] = 1.0F;
            this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 20;
         }

         if (this.etime[var1] > 25 && this.etime[var1] < 55) {
            this.eYmove[var1] = (float)(this.eYmove[var1] + 0.2);
            this.eXmove[var1] = (float)(this.eXmove[var1] - this.emuki[var1] * 0.1);
         }

         if (this.etime[var1] % 4 == 1) {
            this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

            for (this.cyc = 0; this.cyc < 4; this.cyc++) {
               this.sh(this.eX[var1], this.eY[var1], 1, 4.0F, this.cyc * 90 + this.ehnum[var1], this.peopleX, this.peopleY, 0, 0, 2);
            }
         }

         if (this.etime[var1] == 10) {
            this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

            for (this.cyc = -1; this.cyc < 2; this.cyc++) {
               this.sh(
                  this.eX[var1],
                  this.eY[var1],
                  1,
                  2.0F,
                  this.cyc * 40 + this.ehnum[var1] + (this.rand.nextInt() >>> 1) % 20 - 10.0F,
                  this.peopleX,
                  this.peopleY,
                  0,
                  0,
                  1
               );
            }
         }
      } else if (this.emode[var1] == 12) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 4.0F;
            this.etairyoku[var1] = 4.0F;
            this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 20;
         }

         if (this.etime[var1] % 4 == 1) {
            this.sh(this.eX[var1], this.eY[var1], 8, 2.0F, (this.rand.nextInt() >>> 1) % 360, 0, 1, 15, 0, 3);
         }

         if (this.etime[var1] % 4 == 3) {
            this.sh(this.eX[var1], this.eY[var1], 8, 2.0F, (this.rand.nextInt() >>> 1) % 360, 0, 1, 15, 0, 2);
         }
      } else if (this.emode[var1] == 13) {
         if (this.etime[var1] == 1) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 2.0F;
            this.etairyoku[var1] = 25.0F;
            this.eshape[var1] = 3;
         } else if (this.etime[var1] == 40) {
            this.eXmove[var1] = 0.0F;
            this.eYmove[var1] = 0.0F;
            this.eholdnumber[var1] = 0;
         } else if (this.etime[var1] == 120) {
            this.eYmove[var1] = -2.0F;
         }

         if (this.etime[var1] == 40) {
            this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
         }

         if (this.etime[var1] == 40) {
            for (this.cyc = -1; this.cyc < 2; this.cyc++) {
               this.sh(5.0F, this.eX[var1], this.eY[var1], 8, 5.0F, this.ehnum[var1] + this.cyc * 10, 0, 20, 31, 6, 2);
            }
         }

         if (this.etime[var1] > 39 && this.etime[var1] < 65 && this.etime[var1] % 2 == 0) {
            for (this.cyc = -this.eholdnumber[var1]; this.cyc < this.eholdnumber[var1] + 1; this.cyc++) {
               this.sh(this.eX[var1], this.eY[var1], 8, 5.0F, this.ehnum[var1] + this.cyc * 10, 0, 20, 31, 3, 4);
            }
         }

         if (this.etime[var1] > 39 && this.etime[var1] < 65 && this.etime[var1] % 2 == 1) {
            for (this.cyc = 0; this.cyc < this.eholdnumber[var1] + 1; this.cyc++) {
               this.sh(this.eX[var1], this.eY[var1], 8, 5.0F, this.ehnum[var1] + 5.0F + this.cyc * 10, 0, 15, 25, 3, 4);
               this.sh(this.eX[var1], this.eY[var1], 8, 5.0F, this.ehnum[var1] - 5.0F - this.cyc * 10, 0, 15, 25, 3, 4);
            }

            this.eholdnumber[var1]++;
         }
      } else if (this.emode[var1] == 1000) {
         if (this.edoing[var1] == 0) {
            this.bossmahoujinn = 0;
            this.bossnum = var1;
            this.bossnokori = 2;
            this.eX[var1] = this.migi + 15;
            this.eY[var1] = -10.0F;
            this.etairyoku[var1] = 10000.0F;
         } else if (this.edoing[var1] == 1) {
            this.etime[var1] = 0;
            this.edoing[var1]++;
         } else if (this.edoing[var1] == 2) {
            if (this.etime[var1] == 1) {
               this.bossmahoujinn = 1;
               effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 10.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 10.0F;
            } else if (this.etime[var1] == 11) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }
         } else if (this.edoing[var1] == 3) {
            this.bosstairyoku = 250.0F;
            this.bosstimelim = 900;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 10.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 10.0F;
            } else if (this.etime[var1] == 11) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] == 30) {
               this.bossmode = 1;
               this.eboss[var1] = 1;
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 4) {
            if (this.etime[var1] % 100 == 70) {
               this.getemove(var1, 20, 1);
            }

            if (this.etime[var1] % 100 == 90) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] % 100 == 0) {
               this.eholdnumber[var1] = 0;
            }

            if (this.etime[var1] % 100 < 40 && this.etime[var1] % 1 == 0) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(
                     (float)(this.eX[var1] + (55 - this.etime[var1] % 100) * 0.5 * Math.cos((this.cyc * 90 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     (float)(this.eY[var1] + (55 - this.etime[var1] % 100) * 0.5 * Math.sin((this.cyc * 90 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     8,
                     2.5F,
                     -90 + this.cyc * 90 + this.eholdnumber[var1],
                     this.peopleX,
                     15,
                     40,
                     0,
                     4
                  );
               }

               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(
                     (float)(this.eX[var1] + (55 - this.etime[var1] % 100) * 0.5 * Math.cos((this.cyc * 90 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     (float)(this.eY[var1] + (55 - this.etime[var1] % 100) * 0.5 * Math.sin((this.cyc * 90 + this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     8,
                     2.5F,
                     90 + this.cyc * 90 + this.eholdnumber[var1],
                     this.peopleX,
                     15,
                     40,
                     0,
                     2
                  );
               }

               this.eholdnumber[var1] = this.eholdnumber[var1] + 13;
            }
         } else if (this.edoing[var1] == 5) {
            this.bosstairyoku = 350.0F;
            this.bosstimelim = 900;
            this.spelbonus = 12000;
            if (this.etime[var1] == 1) {
               this.bossspel = 1;
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (110.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 6, 0, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "驚雨「唐傘水飛沫アタック」";
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 61) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 6) {
            if (this.etime[var1] % 30 == 1) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 360;
            }

            if (this.etime[var1] % 60 == 1) {
               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  for (this.cyc2 = 0; this.cyc2 < 10; this.cyc2++) {
                     this.sh(
                        this.eX[var1],
                        this.eY[var1],
                        38,
                        (float)(0.5 + this.cyc2 * 0.4),
                        this.cyc * 36 + this.cyc2 * 7 + this.eholdnumber[var1],
                        0,
                        40 - this.cyc2 * 3,
                        35,
                        0,
                        1
                     );
                  }
               }
            }

            if (this.etime[var1] % 60 == 31) {
               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  for (this.cyc2 = 0; this.cyc2 < 10; this.cyc2++) {
                     this.sh(
                        this.eX[var1],
                        this.eY[var1],
                        38,
                        (float)(0.5 + this.cyc2 * 0.4),
                        -this.cyc * 36 - this.cyc2 * 7 + this.eholdnumber[var1],
                        0,
                        40 - this.cyc2 * 3,
                        35,
                        0,
                        1
                     );
                  }
               }
            }
         } else if (this.edoing[var1] == 7) {
            this.bosstairyoku = 350.0F;
            this.bosstimelim = 900;
            this.spelbonus = 12000;
            if (this.etime[var1] != 1) {
               if (this.etime[var1] == 31) {
                  effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
               } else if (this.etime[var1] == 71) {
                  this.bossspel = 1;
                  this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
                  this.eYmove[var1] = (90.0F - this.eY[var1]) / 30.0F;
                  effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
                  effectIn(0.0F, 0.0F, 27, 180, 0, 0);
                  effectIn(900.0F, 900.0F, 9, 6, 0, 0);
                  effectIn(900.0F, 900.0F, 6, 0, 0, 0);
                  this.spelname = "「タイフーンアイ」";
                  this.etairyoku[var1] = 10000.0F;
               } else if (this.etime[var1] == 101) {
                  this.eXmove[var1] = 0.0F;
                  this.eYmove[var1] = 0.0F;
               } else if (this.etime[var1] == 130) {
                  this.etime[var1] = 0;
                  this.edoing[var1]++;
               }
            }
         } else if (this.edoing[var1] == 8) {
            if (this.etime[var1] % 140 < 40) {
               if (this.etime[var1] % 2 == 1) {
                  for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                     this.sh(
                        (float)(this.eX[var1] + (80 - this.etime[var1] % 140 * 2) * Math.cos((this.cyc * 45 - this.eholdnumber[var1]) * 3.1415 / 180.0)),
                        (float)(this.eY[var1] + (80 - this.etime[var1] % 140 * 2) * Math.sin((this.cyc * 45 - this.eholdnumber[var1]) * 3.1415 / 180.0)),
                        3,
                        2.0F,
                        this.cyc * 45 + this.eholdnumber[var1],
                        0,
                        2,
                        91 - this.etime[var1] % 140,
                        0,
                        5
                     );
                  }

                  this.eholdnumber[var1] = this.eholdnumber[var1] + 13;
               }
            } else if (this.etime[var1] % 140 < 80 && this.etime[var1] % 2 == 1) {
               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  this.sh(
                     (float)(this.eX[var1] + (80 - this.etime[var1] % 140 * 2) * Math.cos((this.cyc * 45 - this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     (float)(this.eY[var1] + (80 - this.etime[var1] % 140 * 2) * Math.sin((this.cyc * 45 - this.eholdnumber[var1]) * 3.1415 / 180.0)),
                     3,
                     2.0F,
                     this.cyc * 45 + this.eholdnumber[var1],
                     0,
                     2,
                     91 - this.etime[var1] % 140,
                     0,
                     2
                  );
               }

               this.eholdnumber[var1] = this.eholdnumber[var1] + 11;
            }

            if (this.etime[var1] % 140 == 81) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  this.sh(
                     (float)(this.eX[var1] + 40.0 * Math.cos((this.cyc * 45 + this.ehnum[var1]) * 3.1415 / 180.0)),
                     (float)(this.eY[var1] + 40.0 * Math.sin((this.cyc * 45 + this.ehnum[var1]) * 3.1415 / 180.0)),
                     3,
                     2.0F,
                     180 + this.cyc * 45 + this.ehnum[var1],
                     180,
                     2,
                     30,
                     6,
                     2
                  );
               }
            }
         } else if (this.edoing[var1] == 9) {
            if (this.etime[var1] == 1) {
               this.bossmode = 0;
               effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
               this.itemIn(this.eX[var1] + 20.0F, this.eY[var1], 99, 0);
               this.itemIn(this.eX[var1] - 20.0F, this.eY[var1], 99, 0);
               this.stagetime = 20000;
               this.bossmahoujinn = 0;
            }

            if (this.etime[var1] == 30) {
               for (this.cyc = 0; this.cyc < 40; this.cyc++) {
                  this.itemIn(
                     this.eX[var1] + (40 - this.cyc) * this.cos[this.cyc * 377 % 3600], this.eY[var1] + (40 - this.cyc) * this.sin[this.cyc * 377 % 3600], 1, 0
                  );
               }

               for (this.cyc = 0; this.cyc < 40; this.cyc++) {
                  this.itemIn(
                     this.eX[var1] + (40 - this.cyc) * this.cos[this.cyc * 377 % 3600], this.eY[var1] + (40 - this.cyc) * this.sin[this.cyc * 377 % 3600], 2, 0
                  );
               }

               this.bossmahoujinn = 0;
               this.emode[var1] = 0;
            }
         }
      } else if (this.emode[var1] == 1001) {
         for (this.cyc = 0; this.cyc < 2; this.cyc++) {
            this.tmX[this.cyc * 2] = this.eX[var1]
               + (40.0F + 20.0F * this.sin[this.stagetime % 120 * 30]) * this.cos[(this.stagetime2 * 70 + this.cyc * 1800) % 3600];
            this.tmY[this.cyc * 2] = this.eY[var1]
               + (40.0F + 20.0F * this.sin[this.stagetime % 120 * 30]) * this.sin[(this.stagetime2 * 70 + this.cyc * 1800) % 3600];
         }

         for (this.cyc = 0; this.cyc < 2; this.cyc++) {
            this.tmX[1 + this.cyc * 2] = this.eX[var1]
               + (40.0F + 20.0F * this.sin[(this.stagetime + 60) % 120 * 30]) * this.cos[((900 - this.stagetime2 * 70 + this.cyc * 1800) % 3600 + 3600) % 3600];
            this.tmY[1 + this.cyc * 2] = this.eY[var1]
               + (40.0F + 20.0F * this.sin[(this.stagetime + 60) % 120 * 30]) * this.sin[((900 - this.stagetime2 * 70 + this.cyc * 1800) % 3600 + 3600) % 3600];
         }

         if (this.edoing[var1] == 0) {
            this.bossmahoujinn = 0;
            this.bossnum = var1;
            this.bossnokori = 10;
            this.eX[var1] = this.migi + 15;
            this.eY[var1] = -10.0F;
            this.etairyoku[var1] = 10000.0F;
         } else if (this.edoing[var1] == 1) {
            this.etime[var1] = 0;
            this.edoing[var1]++;
         } else if (this.edoing[var1] == 2) {
            if (this.etime[var1] == 1) {
               this.bossmahoujinn = 1;
               effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;

               for (this.cyc = 0; this.cyc < 4; this.tmiro[this.cyc] = this.cyc++) {
                  this.tmmode[this.cyc] = 3;
               }
            } else if (this.etime[var1] == 31) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }
         } else if (this.edoing[var1] == 3) {
            this.bosstairyoku = 200.0F;
            this.bosstimelim = 900;
            if (this.etime[var1] == 1) {
               this.player.stop();

               try {
                  MediaSound var2 = MediaManager.getSound("resource:///15.mld");
                  var2.use();
                  this.player = AudioPresenter.getAudioPresenter();
                  this.player.setSound(var2);
                  this.player.setMediaListener(this);
               } catch (Exception var3) {
               }

               this.player.setAttribute(4, this.volume);
               this.player.play();
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 10.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 10.0F;
            } else if (this.etime[var1] == 11) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] == 30) {
               this.bossmode = 1;
               this.eboss[var1] = 1;
               this.etime[var1] = 0;
               this.edoing[var1]++;

               for (this.cyc = 0; this.cyc < 4; this.tmiro[this.cyc] = this.cyc++) {
                  this.tmmode[this.cyc] = 3;
               }
            }
         } else if (this.edoing[var1] == 4) {
            if (this.etime[var1] % 90 == 80) {
               this.getemove(var1, 10, 1);
            }

            if (this.etime[var1] % 90 == 0) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] % 90 == 31) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 90;
            }

            if (this.etime[var1] % 90 == 31) {
               for (this.cyc = 0; this.cyc < 36; this.cyc++) {
                  this.sh(this.eX[var1] - 10.0F, this.eY[var1], 3, 2.5F, this.cyc * 10 + this.eholdnumber[var1], 30, 30, 50, 3, 4);
                  this.sh(this.eX[var1] + 10.0F, this.eY[var1], 3, 2.5F, 5 + this.cyc * 10 + this.eholdnumber[var1], -30, 30, 50, 3, 4);
               }
            }

            if (this.etime[var1] % 90 == 1) {
               for (this.cyc = 0; this.cyc < 36; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 3, 2.5F, 5 + this.cyc * 10 + this.eholdnumber[var1], 180, 20, 40, 0, 5);
               }
            }
         } else if (this.edoing[var1] == 5) {
            this.bosstairyoku = 350.0F;
            this.bosstimelim = 1200;
            this.spelbonus = 12000;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (80.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 6, 0, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "降臨「博麗神社守護霊復活の光」";
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 60) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 6) {
            if (this.peoplemuteki == 3) {
               this.emuteki[var1] = 1;
            }

            if (this.peoplemuteki != 3) {
               this.emuteki[var1] = 0;
            }

            if (this.etime[var1] % 100 == 1) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
               this.eholdnumber[var1] = 100;
            }

            if (this.etime[var1] % 10 == 1) {
               this.eholdnumber[var1] = this.eholdnumber[var1] - 10;
               this.laserIn(this.eX[var1], this.eY[var1], 3, 3.0F, this.ehnum[var1] + this.eholdnumber[var1], 3.0F, 40, 0, 0, 5);
               this.laserIn(this.eX[var1], this.eY[var1], 3, 3.0F, this.ehnum[var1] - this.eholdnumber[var1], 3.0F, 40, 0, 0, 5);
            }

            if (this.etime[var1] % 30 == 1 || this.etime[var1] % 30 == 9 || this.etime[var1] % 30 == 17) {
               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 2, 2.7F, this.cyc * 36, this.peopleX, this.peopleY, 40, 5, 5);
               }
            }
         } else if (this.edoing[var1] == 7) {
            this.bosstairyoku = 150.0F;
            this.bosstimelim = 600;
            if (this.etime[var1] == 1) {
               this.bossmahoujinn = 0;
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
               effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
            } else if (this.etime[var1] == 30) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.tmmode[this.cyc] = 0;
                  this.tmiro[this.cyc] = this.cyc;
                  effectIn(this.tmX[this.cyc], this.tmY[this.cyc], 1, 0, 0, 0);
               }

               effectIn(this.eX[var1], this.eY[var1], 1, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 12, 10, 0, 0);

               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
               }

               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
               }

               this.eX[var1] = -20.0F;
               this.eY[var1] = -20.0F;
               this.bossmahoujinn = 0;
               this.esuruu[var1] = 1;
               this.emuteki[var1] = 1;
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 90) {
               effectIn(95.0F, 100.0F, 77, 0, 0, 0);
            } else if (this.etime[var1] == 140) {
               this.eX[var1] = 95.0F;
               this.eY[var1] = 100.0F;

               for (this.cyc = 0; this.cyc < 4; this.tmiro[this.cyc] = this.cyc++) {
                  this.tmmode[this.cyc] = 3;
               }

               effectIn(900.0F, 900.0F, 66, 0, 0, 0);
               this.bossmahoujinn = 1;
               effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
               this.esuruu[var1] = 0;
               this.emuteki[var1] = 0;
            } else if (this.etime[var1] == 170) {
               this.eholdnumber[var1] = -90;
               this.eholdnumber2[var1] = 50;
               this.eholdnumber3[var1]++;
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 8) {
            if (this.etime[var1] % 90 == 80) {
               this.getemove(var1, 10, 1);
            }

            if (this.etime[var1] % 90 == 0) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] % 2 == 1) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 2.0F, this.cyc * 90 + this.eholdnumber[var1] * 11 + 2, 0, 10, 0, 3, 5);
                  this.sh(this.eX[var1], this.eY[var1], 1, 2.2F, this.cyc * 90 + this.eholdnumber[var1] * 11, 0, 10, 0, 0, 5);
                  this.eholdnumber[var1]++;
               }
            }
         } else if (this.edoing[var1] == 9) {
            this.bosstairyoku = 400.0F;
            this.bosstimelim = 1200;
            this.spelbonus = 12000;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (80.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 6, 0, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "悪霊「憤怒のレッド悪霊襲来」";
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 60) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
               this.eholdnumber[var1] = 0;
               this.eholdnumber2[var1] = 0;
            }
         } else if (this.edoing[var1] == 10) {
            if (this.peoplemuteki == 3) {
               this.emuteki[var1] = 1;
            }

            if (this.peoplemuteki != 3) {
               this.emuteki[var1] = 0;
            }

            if (this.etime[var1] % 80 == 1) {
               for (this.cyc = 1; this.cyc < 5; this.cyc++) {
                  this.eIn((int)this.eX[var1] + 30, (int)this.eY[var1], 8, this.cyc, 2);
               }
            }

            if (this.etime[var1] % 80 == 41) {
               for (this.cyc = 1; this.cyc < 5; this.cyc++) {
                  this.eIn((int)this.eX[var1] - 30, (int)this.eY[var1], 8, -this.cyc, 2);
               }
            }
         } else if (this.edoing[var1] == 11) {
            this.bosstairyoku = 150.0F;
            this.bosstimelim = 600;
            if (this.etime[var1] == 1) {
               for (this.cyc = 0; this.cyc < this.e_max; this.cyc++) {
                  if (this.emode[this.cyc] != 0 && this.cyc != var1) {
                     this.emode[this.cyc] = 0;
                     effectIn(this.eX[this.cyc], this.eY[this.cyc], 1, 0, 0, 0);
                  }
               }

               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
               this.bossmahoujinn = 0;
               effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
            } else if (this.etime[var1] == 30) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.tmmode[this.cyc] = 0;
                  this.tmiro[this.cyc] = this.cyc;
                  effectIn(this.tmX[this.cyc], this.tmY[this.cyc], 1, 0, 0, 0);
               }

               effectIn(this.eX[var1], this.eY[var1], 1, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 12, 10, 0, 0);

               for (this.cyc = 0; this.cyc < 40; this.cyc++) {
                  this.itemIn(
                     this.eX[var1] + (40 - this.cyc) * this.cos[this.cyc * 377 % 3600], this.eY[var1] + (40 - this.cyc) * this.sin[this.cyc * 377 % 3600], 1, 0
                  );
               }

               for (this.cyc = 0; this.cyc < 40; this.cyc++) {
                  this.itemIn(
                     this.eX[var1] + (40 - this.cyc) * this.cos[this.cyc * 377 % 3600], this.eY[var1] + (40 - this.cyc) * this.sin[this.cyc * 377 % 3600], 2, 0
                  );
               }

               this.eX[var1] = -20.0F;
               this.eY[var1] = -20.0F;
               this.bossmahoujinn = 0;
               this.esuruu[var1] = 1;
               this.emuteki[var1] = 1;
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 90) {
               effectIn(95.0F, 100.0F, 77, 0, 0, 0);
            } else if (this.etime[var1] == 140) {
               this.eX[var1] = 95.0F;
               this.eY[var1] = 100.0F;

               for (this.cyc = 0; this.cyc < 4; this.tmiro[this.cyc] = this.cyc++) {
                  this.tmmode[this.cyc] = 3;
               }

               effectIn(900.0F, 900.0F, 66, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
               this.bossmahoujinn = 1;
               this.esuruu[var1] = 0;
               this.emuteki[var1] = 0;
            } else if (this.etime[var1] == 170) {
               this.eholdnumber[var1] = -90;
               this.eholdnumber2[var1] = 50;
               this.eholdnumber3[var1]++;
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 12) {
            if (this.etime[var1] % 90 == 80) {
               this.getemove(var1, 10, 1);
            }

            if (this.etime[var1] % 90 == 0) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] % 30 == 1) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

               for (this.cyc = 0; this.cyc < 36; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 8, 4.5F, this.cyc * 10 + this.ehnum[var1], 0, 10, 0, 0, 2);
                  this.sh(this.eX[var1], this.eY[var1], 8, 6.0F, this.cyc * 10 + this.ehnum[var1], 0, 10, 0, 3, 4);
               }
            }
         } else if (this.edoing[var1] == 13) {
            this.bosstairyoku = 350.0F;
            this.bosstimelim = 2700;
            this.spelbonus = 15000;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (115.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 6, 0, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "悪霊「雷の祟り疫病の祟り」";
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 50) {
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
            } else if (this.etime[var1] == 80) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 14) {
            if (this.peoplemuteki == 3) {
               this.emuteki[var1] = 1;
            }

            if (this.peoplemuteki != 3) {
               this.emuteki[var1] = 0;
            }

            this.eXmove[var1] = (float)(-1.0471973333333335 * Math.sin(3 * this.etime[var1] * 3.141592 / 180.0));
            if (this.etime[var1] % 10 == 1) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 30 - 15;
               if (this.eholdnumber[var1] == 0) {
                  this.eholdnumber[var1] = 1;
               }

               this.sh(this.eX[var1], this.eY[var1], 28, 3.5F, -90 + this.eholdnumber[var1], 0, 0, 0, -99, 0);
               this.laserIn(this.eX[var1], this.eY[var1], 1, 3.5F, -90 + this.eholdnumber[var1], 3.0F, 80, 0, 0, 3);
            }

            if (this.etime[var1] % 15 == 1) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

               for (this.cyc = -2; this.cyc < 3; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 8, 1.5F, this.cyc * 19 + this.ehnum[var1], 10, 0, 0, 0, 4);
               }
            }
         } else if (this.edoing[var1] == 15) {
            this.bosstairyoku = 150.0F;
            this.bosstimelim = 600;
            if (this.etime[var1] == 1) {
               for (this.cyc = 0; this.cyc < this.e_max; this.cyc++) {
                  if (this.emode[this.cyc] != 0 && this.cyc != var1) {
                     this.emode[this.cyc] = 0;
                     effectIn(this.eX[this.cyc], this.eY[this.cyc], 1, 0, 0, 0);
                  }
               }

               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
               this.bossmahoujinn = 0;
               effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
            } else if (this.etime[var1] == 30) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.tmmode[this.cyc] = 0;
                  this.tmiro[this.cyc] = this.cyc;
                  effectIn(this.tmX[this.cyc], this.tmY[this.cyc], 1, 0, 0, 0);
               }

               effectIn(this.eX[var1], this.eY[var1], 1, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 12, 10, 0, 0);

               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
               }

               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
               }

               this.eX[var1] = -20.0F;
               this.eY[var1] = -20.0F;
               this.bossmahoujinn = 0;
               this.esuruu[var1] = 1;
               this.emuteki[var1] = 1;
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 90) {
               effectIn(95.0F, 100.0F, 77, 0, 0, 0);
            } else if (this.etime[var1] == 140) {
               this.eX[var1] = 95.0F;
               this.eY[var1] = 100.0F;

               for (this.cyc = 0; this.cyc < 4; this.tmiro[this.cyc] = this.cyc++) {
                  this.tmmode[this.cyc] = 3;
               }

               effectIn(900.0F, 900.0F, 66, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
               this.bossmahoujinn = 1;
               this.esuruu[var1] = 0;
               this.emuteki[var1] = 0;
            } else if (this.etime[var1] == 170) {
               this.eholdnumber[var1] = -90;
               this.eholdnumber2[var1] = 50;
               this.eholdnumber3[var1]++;
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 16) {
            if (this.etime[var1] % 90 == 80) {
               this.getemove(var1, 10, 1);
            }

            if (this.etime[var1] % 90 == 0) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] % 40 == 1) {
               this.eholdnumber[var1]++;

               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  for (this.cyc2 = 0; this.cyc2 < 5; this.cyc2++) {
                     this.sh(
                        this.eX[var1], this.eY[var1], 3, 1.5F, this.cyc * 45 + this.eholdnumber[var1] * 11, 90 - this.cyc2 * 11, 0, 30 + this.cyc2 * 4, 3, 5
                     );
                  }
               }
            }

            if (this.etime[var1] % 40 == 21) {
               for (this.cyc = 0; this.cyc < 8; this.cyc++) {
                  for (this.cyc2 = 0; this.cyc2 < 5; this.cyc2++) {
                     this.sh(
                        this.eX[var1], this.eY[var1], 3, 1.5F, -this.cyc * 45 - this.eholdnumber[var1] * 11, -90 + this.cyc2 * 11, 0, 30 + this.cyc2 * 4, 3, 1
                     );
                  }
               }
            }
         } else if (this.edoing[var1] == 17) {
            this.bosstairyoku = 400.0F;
            this.bosstimelim = 2700;
            this.spelbonus = 15000;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 6, 0, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "幻輝「墓場のファイアダンス悪霊」";
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 70) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 18) {
            if (this.peoplemuteki == 3) {
               this.emuteki[var1] = 1;
            }

            if (this.peoplemuteki != 3) {
               this.emuteki[var1] = 0;
            }

            if (this.etime[var1] % 90 == 80) {
               this.getemove(var1, 10, 1);
            }

            if (this.etime[var1] % 90 == 0) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] % 30 == 1) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 60;

               for (this.cyc = 0; this.cyc < 20; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 26, 2.0F, this.cyc * 18 + this.eholdnumber[var1], 0, 10, 0, 5, 5);
               }
            }
         } else if (this.edoing[var1] == 19) {
            this.bosstairyoku = 150.0F;
            this.bosstimelim = 600;
            if (this.etime[var1] == 1) {
               for (this.cyc = 0; this.cyc < this.e_max; this.cyc++) {
                  if (this.emode[this.cyc] != 0 && this.cyc != var1) {
                     this.emode[this.cyc] = 0;
                     effectIn(this.eX[this.cyc], this.eY[this.cyc], 1, 0, 0, 0);
                  }
               }

               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
               effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
               this.bossmahoujinn = 0;
            } else if (this.etime[var1] == 30) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.tmmode[this.cyc] = 0;
                  this.tmiro[this.cyc] = this.cyc;
                  effectIn(this.tmX[this.cyc], this.tmY[this.cyc], 1, 0, 0, 0);
               }

               effectIn(this.eX[var1], this.eY[var1], 1, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 12, 10, 0, 0);

               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
               }

               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
               }

               this.eX[var1] = -20.0F;
               this.eY[var1] = -20.0F;
               this.bossmahoujinn = 0;
               this.esuruu[var1] = 1;
               this.emuteki[var1] = 1;
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 90) {
               effectIn(95.0F, 100.0F, 77, 0, 0, 0);
            } else if (this.etime[var1] == 140) {
               this.eX[var1] = 95.0F;
               this.eY[var1] = 100.0F;

               for (this.cyc = 0; this.cyc < 4; this.tmiro[this.cyc] = this.cyc++) {
                  this.tmmode[this.cyc] = 3;
               }

               effectIn(900.0F, 900.0F, 66, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
               this.bossmahoujinn = 1;
               this.esuruu[var1] = 0;
               this.emuteki[var1] = 0;
            } else if (this.etime[var1] == 170) {
               this.eholdnumber[var1] = -90;
               this.eholdnumber2[var1] = 50;
               this.eholdnumber3[var1]++;
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 20) {
            if (this.etime[var1] % 30 == 20) {
               this.getemove(var1, 10, 1);
            }

            if (this.etime[var1] % 30 == 0) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] % 2 == 1) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 72;

               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 8, 3.5F, this.cyc * 90 + this.eholdnumber[var1] * 11, 0, 10, 20, 3, 2);
               }
            }
         } else if (this.edoing[var1] == 21) {
            this.bosstairyoku = 400.0F;
            this.bosstimelim = 1800;
            this.spelbonus = 15000;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (75.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 6, 0, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "悪霊「浮遊霊魂」";
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
            } else if (this.etime[var1] == 60) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 22) {
            if (this.peoplemuteki == 3) {
               this.emuteki[var1] = 1;
            }

            if (this.peoplemuteki != 3) {
               this.emuteki[var1] = 0;
            }

            if (this.etime[var1] % 1 == 0) {
               this.eholdnumber[var1] = -60 - (this.rand.nextInt() >>> 1) % 60;
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
               this.sh(this.eX[var1], this.eY[var1], 43, 6.0F, this.eholdnumber[var1], 900, 0, 0, 0, 5);
               this.eholdnumber[var1] = -60 - (this.rand.nextInt() >>> 1) % 60;
               this.sh(this.eX[var1], this.eY[var1], 43, 6.0F, this.eholdnumber[var1], 900, 0, 0, 0, 5);
            }
         } else if (this.edoing[var1] == 23) {
            this.bosstairyoku = 150.0F;
            this.bosstimelim = 600;
            if (this.etime[var1] % 30 == 20) {
               this.getemove(var1, 10, 1);
            }

            if (this.etime[var1] % 30 == 0) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] == 1) {
               for (this.cyc = 0; this.cyc < this.e_max; this.cyc++) {
                  if (this.emode[this.cyc] != 0 && this.cyc != var1) {
                     this.emode[this.cyc] = 0;
                     effectIn(this.eX[this.cyc], this.eY[this.cyc], 1, 0, 0, 0);
                  }
               }

               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
               this.bossmahoujinn = 0;
               effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
            } else if (this.etime[var1] == 30) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.tmmode[this.cyc] = 0;
                  this.tmiro[this.cyc] = this.cyc;
                  effectIn(this.tmX[this.cyc], this.tmY[this.cyc], 1, 0, 0, 0);
               }

               effectIn(this.eX[var1], this.eY[var1], 1, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 12, 10, 0, 0);

               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
               }

               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
               }

               this.eX[var1] = -20.0F;
               this.eY[var1] = -20.0F;
               this.bossmahoujinn = 0;
               this.esuruu[var1] = 1;
               this.emuteki[var1] = 1;
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 90) {
               effectIn(95.0F, 100.0F, 77, 0, 0, 0);
            } else if (this.etime[var1] == 140) {
               this.eX[var1] = 95.0F;
               this.eY[var1] = 100.0F;

               for (this.cyc = 0; this.cyc < 4; this.tmiro[this.cyc] = this.cyc++) {
                  this.tmmode[this.cyc] = 3;
               }

               effectIn(900.0F, 900.0F, 66, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
               this.bossmahoujinn = 1;
               this.esuruu[var1] = 0;
               this.emuteki[var1] = 0;
            } else if (this.etime[var1] == 170) {
               this.eholdnumber[var1] = -90;
               this.eholdnumber2[var1] = 50;
               this.eholdnumber3[var1]++;
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 24) {
            if (this.etime[var1] % 30 == 20) {
               this.getemove(var1, 10, 1);
            }

            if (this.etime[var1] % 30 == 0) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] % 10 == 1) {
               this.eholdnumber[var1] = 20 + (this.rand.nextInt() >>> 1) % 3 * 10;
               this.eholdnumber2[var1] = (this.rand.nextInt() >>> 1) % 200 - 20;

               for (this.cyc = 0; this.cyc < this.eholdnumber[var1]; this.cyc += 10) {
                  this.sh(this.eholdnumber2[var1] + this.cyc, 0.0F, 1, 2.5F, 90.0F, 0, 10, 20, 3, 1);
                  this.sh(this.eholdnumber2[var1] + this.eholdnumber[var1], this.cyc, 1, 2.5F, 90.0F, 0, 10, 20, 3, 1);
                  this.sh(this.eholdnumber2[var1] + this.cyc, this.eholdnumber[var1], 1, 2.5F, 90.0F, 0, 10, 20, 3, 1);
                  this.sh(this.eholdnumber2[var1], this.cyc, 1, 2.5F, 90.0F, 0, 10, 20, 3, 1);
               }

               this.sh(this.eholdnumber2[var1] + this.eholdnumber[var1], this.eholdnumber[var1], 1, 2.5F, 90.0F, 0, 10, 20, 3, 1);
            }

            if (this.etime[var1] % 60 == 1) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

               for (this.cyc = -4; this.cyc < 5; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 2.5F, this.cyc * 14 + this.ehnum[var1], 0, 10, 0, 5, 5);
               }
            }
         } else if (this.edoing[var1] == 25) {
            this.bosstairyoku = 400.0F;
            this.bosstimelim = 2700;
            this.spelbonus = 15000;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (90.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 6, 0, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "不思議「トワイライトゾーン」";
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
            } else if (this.etime[var1] == 60) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
               this.eholdnumber[var1] = 0;
               this.eholdnumber2[var1] = 45;
            }
         } else if (this.edoing[var1] == 26) {
            if (this.peoplemuteki == 3) {
               this.emuteki[var1] = 1;
            }

            if (this.peoplemuteki != 3) {
               this.emuteki[var1] = 0;
            }

            this.eholdnumber[var1]++;
            if (this.etime[var1] % 90 == 1) {
               this.eholdnumber[var1] = 0;
            }

            if (this.etime[var1] % 3 == 1) {
               for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                  this.sh(
                     this.eX[var1] + 20.0F,
                     this.eY[var1],
                     1,
                     (float)(0.8 + this.eholdnumber[var1] * 0.05),
                     4 * this.eholdnumber[var1] + this.cyc * 13,
                     0,
                     1,
                     0,
                     0,
                     1
                  );
               }

               for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                  this.sh(
                     this.eX[var1] - 20.0F,
                     this.eY[var1],
                     1,
                     (float)(0.8 + this.eholdnumber[var1] * 0.05),
                     180 - 4 * this.eholdnumber[var1] - this.cyc * 13,
                     0,
                     1,
                     0,
                     0,
                     1
                  );
               }
            }

            this.eholdnumber2[var1]++;
            if (this.etime[var1] % 90 == 46) {
               this.eholdnumber2[var1] = 0;
            }

            if (this.etime[var1] % 3 == 1) {
               for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                  this.sh(
                     this.eX[var1] + 20.0F,
                     this.eY[var1],
                     1,
                     (float)(0.8 + this.eholdnumber2[var1] * 0.05),
                     4 * this.eholdnumber2[var1] + this.cyc * 13,
                     0,
                     1,
                     0,
                     0,
                     5
                  );
               }

               for (this.cyc = 0; this.cyc < 3; this.cyc++) {
                  this.sh(
                     this.eX[var1] - 20.0F,
                     this.eY[var1],
                     1,
                     (float)(0.8 + this.eholdnumber2[var1] * 0.05),
                     180 - 4 * this.eholdnumber2[var1] - this.cyc * 13,
                     0,
                     1,
                     0,
                     0,
                     5
                  );
               }
            }

            if (this.etime[var1] % 30 == 1) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);
               this.sh(this.eX[var1], this.eY[var1], 1, 2.5F, this.ehnum[var1], 0, 10, 0, 5, 5);
            }
         } else if (this.edoing[var1] == 27) {
            this.bosstairyoku = 150.0F;
            this.bosstimelim = 600;
            if (this.etime[var1] == 1) {
               for (this.cyc = 0; this.cyc < this.e_max; this.cyc++) {
                  if (this.emode[this.cyc] != 0 && this.cyc != var1) {
                     this.emode[this.cyc] = 0;
                     effectIn(this.eX[this.cyc], this.eY[this.cyc], 1, 0, 0, 0);
                  }
               }

               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
               effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
               this.bossmahoujinn = 0;
            } else if (this.etime[var1] == 30) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.tmmode[this.cyc] = 0;
                  this.tmiro[this.cyc] = this.cyc;
                  effectIn(this.tmX[this.cyc], this.tmY[this.cyc], 1, 0, 0, 0);
               }

               effectIn(this.eX[var1], this.eY[var1], 1, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 12, 10, 0, 0);

               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
               }

               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
               }

               this.eX[var1] = -20.0F;
               this.eY[var1] = -20.0F;
               this.bossmahoujinn = 0;
               this.esuruu[var1] = 1;
               this.emuteki[var1] = 1;
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 90) {
               effectIn(95.0F, 100.0F, 77, 0, 0, 0);
            } else if (this.etime[var1] == 140) {
               this.eX[var1] = 95.0F;
               this.eY[var1] = 100.0F;

               for (this.cyc = 0; this.cyc < 4; this.tmiro[this.cyc] = this.cyc++) {
                  this.tmmode[this.cyc] = 3;
               }

               effectIn(900.0F, 900.0F, 66, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
               this.bossmahoujinn = 1;
               this.esuruu[var1] = 0;
               this.emuteki[var1] = 0;
            } else if (this.etime[var1] == 170) {
               this.eholdnumber[var1] = -90;
               this.eholdnumber2[var1] = 50;
               this.eholdnumber3[var1]++;
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 28) {
            if (this.etime[var1] % 30 == 20) {
               this.getemove(var1, 10, 1);
            }

            if (this.etime[var1] % 30 == 0) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] % 10 == 1) {
               this.eholdnumber[var1] = 20 + (this.rand.nextInt() >>> 1) % 3 * 10;
               this.eholdnumber2[var1] = (this.rand.nextInt() >>> 1) % 200 - 20;

               for (this.cyc = 0; this.cyc < this.eholdnumber[var1]; this.cyc += 10) {
                  this.sh(this.eholdnumber2[var1] + this.cyc, 0.0F, 1, 3.0F, 90.0F, 0, 10, 20, 3, 0);
                  this.sh(this.eholdnumber2[var1] + this.eholdnumber[var1], this.cyc, 1, 3.0F, 90.0F, 0, 10, 20, 3, 0);
                  this.sh(this.eholdnumber2[var1] + this.cyc, this.eholdnumber[var1], 1, 3.0F, 90.0F, 0, 10, 20, 3, 0);
                  this.sh(this.eholdnumber2[var1], this.cyc, 1, 3.0F, 90.0F, 0, 10, 20, 3, 0);
               }

               this.sh(this.eholdnumber2[var1] + this.eholdnumber[var1], this.eholdnumber[var1], 1, 3.0F, 90.0F, 0, 10, 20, 3, 0);
            }

            if (this.etime[var1] % 60 == 1) {
               this.ehnum[var1] = this.getkakudo(this.eX[var1], this.eY[var1], this.peopleX, this.peopleY);

               for (this.cyc = -4; this.cyc < 5; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 2.5F, this.cyc * 14 + this.ehnum[var1], 0, 10, 0, 5, 1);
               }
            }
         } else if (this.edoing[var1] == 29) {
            this.bosstairyoku = 400.0F;
            this.bosstimelim = 2700;
            this.spelbonus = 15000;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (30.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 6, 0, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "悪霊「ミシカルスフィア」";
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
               effectIn(this.eX[var1], this.eY[var1], 777, 0, 0, 0);
            } else if (this.etime[var1] == 60) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 30) {
            if (this.peoplemuteki == 3) {
               this.emuteki[var1] = 1;
            }

            if (this.peoplemuteki != 3) {
               this.emuteki[var1] = 0;
            }

            if (this.etime[var1] % 60 == 1) {
               this.getemove(var1, 30, 1);
            }

            if (this.etime[var1] % 60 == 30) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] % 30 == 1) {
               this.sh(this.eX[var1] - 40.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 50 - 30.0F, 37, 0.0F, 0.0F, 16, 1, 0, 6, 4);
               this.sh(this.eX[var1] + 40.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 50 - 30.0F, 37, 0.0F, 0.0F, 1, -1, 0, 6, 3);

               for (this.cyc = 0; this.cyc < 36; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 1, 3.0F, this.cyc * 10, 30, -1, 0, 0, 5);
               }
            }
         } else if (this.edoing[var1] == 31) {
            this.bosstairyoku = 150.0F;
            this.bosstimelim = 600;
            if (this.etime[var1] == 1) {
               for (this.cyc = 0; this.cyc < this.e_max; this.cyc++) {
                  if (this.emode[this.cyc] != 0 && this.cyc != var1) {
                     this.emode[this.cyc] = 0;
                     effectIn(this.eX[this.cyc], this.eY[this.cyc], 1, 0, 0, 0);
                  }
               }

               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
               effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
               this.bossmahoujinn = 0;
            } else if (this.etime[var1] == 30) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.tmmode[this.cyc] = 0;
                  this.tmiro[this.cyc] = this.cyc;
                  effectIn(this.tmX[this.cyc], this.tmY[this.cyc], 1, 0, 0, 0);
               }

               effectIn(this.eX[var1], this.eY[var1], 1, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 12, 10, 0, 0);

               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
               }

               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
               }

               this.eX[var1] = -20.0F;
               this.eY[var1] = -20.0F;
               this.bossmahoujinn = 0;
               this.esuruu[var1] = 1;
               this.emuteki[var1] = 1;
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 90) {
               effectIn(95.0F, 100.0F, 77, 0, 0, 0);
            } else if (this.etime[var1] == 140) {
               this.eX[var1] = 95.0F;
               this.eY[var1] = 100.0F;
               effectIn(900.0F, 900.0F, 66, 0, 0, 0);

               for (this.cyc = 0; this.cyc < 4; this.tmiro[this.cyc] = this.cyc++) {
                  this.tmmode[this.cyc] = 3;
               }

               effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
               this.bossmahoujinn = 1;
               this.esuruu[var1] = 0;
               this.emuteki[var1] = 0;
            } else if (this.etime[var1] == 170) {
               this.eholdnumber[var1] = -90;
               this.eholdnumber2[var1] = 50;
               this.eholdnumber3[var1]++;
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 32) {
            if (this.etime[var1] % 30 == 0) {
               this.getemove(var1, 10, 2);
            }

            if (this.etime[var1] % 30 == 10) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] % 10 == 1) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.laserIn(this.eX[var1], this.eY[var1], 1, 3.5F, this.eholdnumber[var1] * 30 + this.cyc * 90, 2.0F, 80, 0, 0, 4);
               }

               this.eholdnumber[var1]++;
            }

            if (this.etime[var1] % 4 == 1) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 8, 6.0F, this.cyc * 90 - this.eholdnumber2[var1] * 23, 0, 10, 0, 8, 2);
               }

               this.eholdnumber2[var1]++;
            }
         } else if (this.edoing[var1] == 33) {
            this.bosstairyoku = 400.0F;
            this.bosstimelim = 900;
            this.spelbonus = 15000;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 6, 0, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "悪霊「テケテケ」";
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
            } else if (this.etime[var1] == 60) {
               this.eholdnumber[var1] = (this.rand.nextInt() >>> 1) % 60;
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 34) {
            if (this.peoplemuteki == 3) {
               this.emuteki[var1] = 1;
            }

            if (this.peoplemuteki != 3) {
               this.emuteki[var1] = 0;
            }

            if (this.etime[var1] % 30 == 0) {
               this.getemove(var1, 10, 2);
            }

            if (this.etime[var1] % 30 == 10) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] % 80 < 40) {
               this.eholdnumber[var1]++;
               this.eholdnumber[var1]++;
               this.sh(
                  20.0F + 30.0F * this.cos[this.eholdnumber[var1] % 36 * 100], this.etime[var1] % 80 * 6, 3, 1.5F, this.eholdnumber[var1] * 13, 0, 2, 30, 0, 2
               );
               this.sh(
                  this.migi - 20 + 30.0F * this.cos[this.eholdnumber[var1] % 36 * 100],
                  240 - this.etime[var1] % 80 * 6,
                  3,
                  1.5F,
                  -this.eholdnumber[var1] * 13,
                  0,
                  2,
                  30,
                  0,
                  4
               );
            } else {
               this.eholdnumber[var1]++;
               this.eholdnumber[var1]++;
               this.sh(
                  this.migi - 20 + 30.0F * this.cos[this.eholdnumber[var1] % 36 * 100],
                  this.etime[var1] % 80 * 6 - 240,
                  3,
                  1.5F,
                  this.eholdnumber[var1] * 13,
                  0,
                  2,
                  30,
                  0,
                  4
               );
               this.sh(
                  20.0F + 30.0F * this.cos[this.eholdnumber[var1] % 36 * 100],
                  240 - this.etime[var1] % 80 * 6 + 240,
                  3,
                  1.5F,
                  -this.eholdnumber[var1] * 13,
                  0,
                  2,
                  30,
                  0,
                  2
               );
            }
         } else if (this.edoing[var1] == 35) {
            this.bosstairyoku = 150.0F;
            this.bosstimelim = 600;
            if (this.etime[var1] == 1) {
               for (this.cyc = 0; this.cyc < this.e_max; this.cyc++) {
                  if (this.emode[this.cyc] != 0 && this.cyc != var1) {
                     this.emode[this.cyc] = 0;
                     effectIn(this.eX[this.cyc], this.eY[this.cyc], 1, 0, 0, 0);
                  }
               }

               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
               effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
               this.bossmahoujinn = 0;
            } else if (this.etime[var1] == 30) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.tmmode[this.cyc] = 0;
                  this.tmiro[this.cyc] = this.cyc;
                  effectIn(this.tmX[this.cyc], this.tmY[this.cyc], 1, 0, 0, 0);
               }

               effectIn(this.eX[var1], this.eY[var1], 1, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 12, 10, 0, 0);

               for (this.cyc = 0; this.cyc < 10; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 1, 0);
               }

               for (this.cyc = 0; this.cyc < 5; this.cyc++) {
                  this.itemIn(this.eX[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, this.eY[var1] + (this.rand.nextInt() >>> 1) % 60 - 30.0F, 2, 0);
               }

               this.eX[var1] = -20.0F;
               this.eY[var1] = -20.0F;
               this.bossmahoujinn = 0;
               this.esuruu[var1] = 1;
               this.emuteki[var1] = 1;
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 90) {
               effectIn(95.0F, 100.0F, 77, 0, 0, 0);
            } else if (this.etime[var1] == 140) {
               this.eX[var1] = 95.0F;
               this.eY[var1] = 100.0F;

               for (this.cyc = 0; this.cyc < 4; this.tmiro[this.cyc] = this.cyc++) {
                  this.tmmode[this.cyc] = 3;
               }

               effectIn(900.0F, 900.0F, 66, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
               this.bossmahoujinn = 1;
               this.esuruu[var1] = 0;
               this.emuteki[var1] = 0;
            } else if (this.etime[var1] == 170) {
               this.eholdnumber[var1] = -90;
               this.eholdnumber2[var1] = 50;
               this.eholdnumber3[var1]++;
               this.etime[var1] = 0;
               this.edoing[var1]++;
            }
         } else if (this.edoing[var1] == 36) {
            if (this.etime[var1] % 30 == 0) {
               this.getemove(var1, 10, 2);
            }

            if (this.etime[var1] % 30 == 10) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            }

            if (this.etime[var1] % 10 == 1) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.laserIn(this.eX[var1], this.eY[var1], 1, 3.5F, this.eholdnumber[var1] * 30 + this.cyc * 90, 2.0F, 80, 0, 0, 5);
               }

               this.eholdnumber[var1]++;
            }

            if (this.etime[var1] % 4 == 1) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.sh(this.eX[var1], this.eY[var1], 8, 6.0F, this.cyc * 90 - this.eholdnumber2[var1] * 13, 0, 10, 0, 8, 0);
               }

               this.eholdnumber2[var1]++;
            }
         } else if (this.edoing[var1] == 37) {
            this.bosstairyoku = 400.0F;
            this.bosstimelim = 1800;
            this.spelbonus = 15000;
            if (this.etime[var1] == 1) {
               this.eXmove[var1] = (95.0F - this.eX[var1]) / 30.0F;
               this.eYmove[var1] = (100.0F - this.eY[var1]) / 30.0F;
               effectIn(this.eX[var1], this.eY[var1], 3, 0, 0, 0);
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 6, 0, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "悪霊「メリーさんの電話」";
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 31) {
               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
            } else if (this.etime[var1] == 51) {
               effectIn(this.eX[var1], this.eY[var1], 77, 0, 0, 0);
            } else if (this.etime[var1] == 90) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.tmmode[this.cyc] = 0;
                  this.tmiro[this.cyc] = this.cyc;
                  effectIn(this.tmX[this.cyc], this.tmY[this.cyc], 1, 0, 0, 0);
               }

               this.bosshide = 1;
               this.esuruu[var1] = 1;
               this.emuteki[var1] = 1;
               this.etime[var1] = 0;
               this.edoing[var1]++;
               if (this.sevolume != 0) {
                  AudioPresenter var10001 = this.seplayer[0];
                  this.seplayer[0].setAttribute(4, this.sevolume);
               }

               if (this.sevolume != 0) {
                  this.seplayer[0].play();
               }
            }
         } else if (this.edoing[var1] == 38) {
            if (this.etime[var1] == 1) {
               this.eIn(95, 100, 9, 0, 0);
               if (this.sevolume != 0) {
                  AudioPresenter var4 = this.seplayer[0];
                  this.seplayer[0].setAttribute(4, this.sevolume);
               }

               if (this.sevolume != 0) {
                  this.seplayer[0].play();
               }
            } else if (this.etime[var1] == 901) {
               this.eIn(95, 20, 9, 0, 0);
               if (this.sevolume != 0) {
                  AudioPresenter var5 = this.seplayer[0];
                  this.seplayer[0].setAttribute(4, this.sevolume);
               }

               if (this.sevolume != 0) {
                  this.seplayer[0].play();
               }
            } else if (this.etime[var1] == 1501) {
               this.eIn(95, 20, 9, 0, 0);
               if (this.sevolume != 0) {
                  AudioPresenter var6 = this.seplayer[0];
                  this.seplayer[0].setAttribute(4, this.sevolume);
               }

               if (this.sevolume != 0) {
                  this.seplayer[0].play();
               }
            }
         } else if (this.edoing[var1] == 39) {
            this.bosstairyoku = 1200.0F;
            this.bosstimelim = 600;
            this.spelbonus = 15000;
            if (this.etime[var1] == 1) {
               this.stagetime2 = 0;

               for (this.cyc = 0; this.cyc < this.e_max; this.cyc++) {
                  if (this.emode[this.cyc] != 0 && this.cyc != var1) {
                     this.emode[this.cyc] = 0;
                     effectIn(this.eX[this.cyc], this.eY[this.cyc], 1, 0, 0, 0);
                  }
               }

               this.eXmove[var1] = 0.0F;
               this.eYmove[var1] = 0.0F;
               effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
               this.bossmahoujinn = 0;
            } else if (this.etime[var1] == 30) {
               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.tmmode[this.cyc] = 0;
                  this.tmiro[this.cyc] = this.cyc;
                  effectIn(this.tmX[this.cyc], this.tmY[this.cyc], 1, 0, 0, 0);
               }

               effectIn(this.eX[var1], this.eY[var1], 1, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 12, 10, 0, 0);

               for (this.cyc = 0; this.cyc < 40; this.cyc++) {
                  this.itemIn(
                     this.eX[var1] + (40 - this.cyc) * this.cos[this.cyc * 377 % 3600], this.eY[var1] + (40 - this.cyc) * this.sin[this.cyc * 377 % 3600], 1, 0
                  );
               }

               for (this.cyc = 0; this.cyc < 40; this.cyc++) {
                  this.itemIn(
                     this.eX[var1] + (40 - this.cyc) * this.cos[this.cyc * 377 % 3600], this.eY[var1] + (40 - this.cyc) * this.sin[this.cyc * 377 % 3600], 2, 0
                  );
               }

               this.eX[var1] = -20.0F;
               this.eY[var1] = -20.0F;
               this.bossmahoujinn = 0;
               this.esuruu[var1] = 1;
               this.emuteki[var1] = 1;
               this.etairyoku[var1] = 10000.0F;
            } else if (this.etime[var1] == 90) {
               effectIn(95.0F, 100.0F, 777, 0, 0, 0);
            } else if (this.etime[var1] == 110) {
               effectIn(95.0F, 100.0F, 777, 0, 0, 0);
            } else if (this.etime[var1] == 130) {
               effectIn(95.0F, 100.0F, 77, 0, 0, 0);
            } else if (this.etime[var1] == 180) {
               for (this.cyc = 0; this.cyc < 4; this.tmiro[this.cyc] = this.cyc++) {
                  this.tmmode[this.cyc] = 3;
               }

               this.bosshide = 0;
               this.esuruu[var1] = 0;
               this.emuteki[var1] = 0;
               this.eX[var1] = 95.0F;
               this.eY[var1] = 100.0F;
               effectIn(this.eX[var1], this.eY[var1], 30, 0, 0, 0);
               this.bossmahoujinn = 1;
               this.esuruu[var1] = 0;
               this.emuteki[var1] = 0;
               effectIn(0.0F, 0.0F, 27, 180, 0, 0);
               effectIn(900.0F, 900.0F, 9, 6, 0, 0);
               effectIn(900.0F, 900.0F, 6, 0, 0, 0);
               this.spelname = "「シールドファントム」";
               this.etairyoku[var1] = 10000.0F;
               this.bossspel = 1;
            } else if (this.etime[var1] == 240) {
               this.etime[var1] = 0;
               this.edoing[var1]++;
               this.bosstimelim = 2700;
            }
         } else if (this.edoing[var1] == 40) {
            if (this.etime[var1] < 2700) {
               this.bosstimelim = 2700;
            }

            if (this.peoplemuteki == 3) {
               this.emuteki[var1] = 1;
            }

            if (this.peoplemuteki != 3) {
               this.emuteki[var1] = 0;
            }

            if ((this.peopleX - this.eX[var1]) * (this.peopleX - this.eX[var1]) < 1600.0F
               && (this.peopleY - this.eY[var1]) * (this.peopleY - this.eY[var1]) < 1600.0F) {
               for (this.cyc = 0; this.cyc < 36; this.cyc++) {
                  if (this.etime[var1] % 3 == 0) {
                     this.sh(this.eX[var1], this.eY[var1], 3, 3.0F, this.cyc * 10, 180, 20, 40, 3, 0);
                  }
               }
            }

            if (this.etime[var1] % 2 == 0) {
               for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                  this.sh(this.tmX[this.cyc * 2], this.tmY[this.cyc * 2], 1, 2.0F, this.stagetime2 * 7 + this.cyc * 180, 0, 0, 0, 2, 5);
                  this.sh(this.tmX[this.cyc * 2 + 1], this.tmY[this.cyc * 2 + 1], 1, 2.5F, 90 - this.stagetime2 * 7 % 360 + this.cyc * 180, 0, 0, 0, 2, 1);
               }
            }

            if (this.bosstairyoku < 900.0F) {
               effectIn(this.eX[var1], this.eY[var1], 777, 10, 0, 0);
               effectIn(this.peopleX, this.peopleY, 3, 0, 0, 0);
               this.etime[var1] = 2;
               this.edoing[var1]++;
               if (this.sevolume != 0) {
                  AudioPresenter var7 = this.seplayer[0];
                  this.seplayer[0].setAttribute(4, this.sevolume);
               }

               if (this.sevolume != 0) {
                  this.seplayer[0].play();
               }
            }
         } else if (this.edoing[var1] == 41) {
            if (this.peoplemuteki == 3) {
               this.emuteki[var1] = 1;
            }

            if (this.peoplemuteki != 3) {
               this.emuteki[var1] = 0;
            }

            if (this.etime[var1] < 2700) {
               this.bosstimelim = 2700;
            }

            if ((this.peopleX - this.eX[var1]) * (this.peopleX - this.eX[var1]) < 1600.0F
               && (this.peopleY - this.eY[var1]) * (this.peopleY - this.eY[var1]) < 1600.0F) {
               for (this.cyc = 0; this.cyc < 36; this.cyc++) {
                  if (this.etime[var1] % 3 == 0) {
                     this.sh(this.eX[var1], this.eY[var1], 2, 3.0F, this.cyc * 10, 180, 20, 40, 3, 0);
                  }
               }
            }

            if (this.etime[var1] % 2 == 0) {
               for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                  this.sh(this.tmX[this.cyc * 2], this.tmY[this.cyc * 2], 1, 1.5F, 30 + this.stagetime2 * 7 + this.cyc * 180, 0, 10, 0, 2, 5);
                  this.sh(
                     this.tmX[this.cyc * 2 + 1], this.tmY[this.cyc * 2 + 1], 1, 2.0F, -30 + (90 - this.stagetime2 * 7 + this.cyc * 180) % 360, 0, 10, 0, 2, 1
                  );
               }
            }

            if (this.bosstairyoku < 600.0F) {
               effectIn(this.eX[var1], this.eY[var1], 777, 10, 0, 0);
               effectIn(this.peopleX, this.peopleY, 3, 0, 0, 0);
               this.etime[var1] = 2;
               this.edoing[var1]++;
               if (this.sevolume != 0) {
                  AudioPresenter var8 = this.seplayer[0];
                  this.seplayer[0].setAttribute(4, this.sevolume);
               }

               if (this.sevolume != 0) {
                  this.seplayer[0].play();
               }
            }
         } else if (this.edoing[var1] == 42) {
            if (this.peoplemuteki == 3) {
               this.emuteki[var1] = 1;
            }

            if (this.peoplemuteki != 3) {
               this.emuteki[var1] = 0;
            }

            if (this.etime[var1] < 2700) {
               this.bosstimelim = 2700;
            }

            if ((this.peopleX - this.eX[var1]) * (this.peopleX - this.eX[var1]) < 1600.0F
               && (this.peopleY - this.eY[var1]) * (this.peopleY - this.eY[var1]) < 1600.0F) {
               for (this.cyc = 0; this.cyc < 36; this.cyc++) {
                  if (this.etime[var1] % 3 == 0) {
                     this.sh(this.eX[var1], this.eY[var1], 2, 3.0F, this.cyc * 10, 180, 20, 40, 3, 0);
                  }
               }
            }

            if (this.etime[var1] % 2 == 0) {
               for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                  this.sh(this.tmX[this.cyc * 2], this.tmY[this.cyc * 2], 1, 2.0F, this.stagetime2 * 8 + this.cyc * 180, 0, 0, 0, 2, 5);
                  this.sh(this.tmX[this.cyc * 2 + 1], this.tmY[this.cyc * 2 + 1], 1, 2.5F, 90 - this.stagetime2 * 8 % 360 + this.cyc * 180, 0, 0, 0, 2, 1);
               }
            }

            if (this.bosstairyoku < 300.0F) {
               effectIn(this.eX[var1], this.eY[var1], 777, 10, 0, 0);
               effectIn(this.peopleX, this.peopleY, 3, 0, 0, 0);
               this.etime[var1] = 2;
               this.edoing[var1]++;
               if (this.sevolume != 0) {
                  AudioPresenter var9 = this.seplayer[0];
                  this.seplayer[0].setAttribute(4, this.sevolume);
               }

               if (this.sevolume != 0) {
                  this.seplayer[0].play();
               }
            }
         } else if (this.edoing[var1] == 43) {
            if (this.peoplemuteki == 3) {
               this.emuteki[var1] = 1;
            }

            if (this.peoplemuteki != 3) {
               this.emuteki[var1] = 0;
            }

            if (this.etime[var1] < 2700) {
               this.bosstimelim = 2700;
            }

            if ((this.peopleX - this.eX[var1]) * (this.peopleX - this.eX[var1]) < 1600.0F
               && (this.peopleY - this.eY[var1]) * (this.peopleY - this.eY[var1]) < 1600.0F) {
               for (this.cyc = 0; this.cyc < 36; this.cyc++) {
                  if (this.etime[var1] % 3 == 0) {
                     this.sh(this.eX[var1], this.eY[var1], 2, 3.0F, this.cyc * 10, 180, 20, 40, 3, 0);
                  }
               }
            }

            if (this.etime[var1] % 2 == 0) {
               for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                  this.sh(this.tmX[this.cyc * 2], this.tmY[this.cyc * 2], 1, 1.5F, this.stagetime2 * 13 + this.cyc * 180, 0, 0, 0, 2, 5);
                  this.sh(this.tmX[this.cyc * 2 + 1], this.tmY[this.cyc * 2 + 1], 1, 3.0F, 90 - this.stagetime2 * 13 % 360 + this.cyc * 180, 0, 0, 0, 2, 1);
               }
            }

            if (this.etime[var1] % 2 == 1) {
               for (this.cyc = 0; this.cyc < 2; this.cyc++) {
                  this.sh(this.tmX[this.cyc * 2 + 1], this.tmY[this.cyc * 2 + 1], 1, 3.0F, 90 - this.stagetime2 * 13 + this.cyc * 180, 0, 0, 0, 2, 1);
               }
            }
         } else if (this.edoing[var1] == 44) {
            if (this.etime[var1] == 1) {
               this.bossmahoujinn = 0;
               this.bossmode = 0;
               effectIn(this.eX[var1], this.eY[var1], 88, 0, 0, 0);
               effectIn(this.eX[var1], this.eY[var1], 12, 20, 0, 0);
               this.stagetime = 80000;
            }

            if (this.etime[var1] == 30) {
               effectIn(this.eX[var1], this.eY[var1], 12, 20, 0, 0);

               for (this.cyc = 0; this.cyc < 4; this.cyc++) {
                  this.tmmode[this.cyc] = 0;
                  this.tmiro[this.cyc] = this.cyc;
                  effectIn(this.tmX[this.cyc], this.tmY[this.cyc], 1, 0, 0, 0);
               }

               this.bossmahoujinn = 0;
               this.emode[var1] = 0;
            }
         }
      }
   }
}
