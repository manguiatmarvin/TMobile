$wnd.showcase.runAsyncCallback24("function SCb(a){this.a=a}\nfunction VCb(a){this.a=a}\nfunction YCb(a){this.a=a}\nfunction dDb(a,b){this.a=a;this.b=b}\nfunction Dac(a,b){vac(a,b);ct((HYb(),a.gb),b)}\nfunction yYb(){var a;if(!vYb||AYb()){a=new QAc;zYb(a);vYb=a}return vYb}\nfunction AYb(){var a=$doc.cookie;if(a!=wYb){wYb=a;return true}else{return false}}\nfunction ct(b,c){try{b.remove(c)}catch(a){b.removeChild(b.childNodes[c])}}\nfunction BYb(a){a=encodeURIComponent(a);$doc.cookie=a+'=;expires=Fri, 02-Jan-1970 00:00:00 GMT'}\nfunction NCb(a,b){var c,d,e,f;Ls(yac(a.c));f=0;e=oJ(yYb());for(d=Txc(e);d.a.Be();){c=MV(Zxc(d),1);Aac(a.c,c);utc(c,b)&&(f=yac(a.c).options.length-1)}fp(($o(),Zo),new dDb(a,f))}\nfunction OCb(a){var b,c,d,e;if(yac(a.c).options.length<1){idc(a.a,LFc);idc(a.b,LFc);return}d=yac(a.c).selectedIndex;b=zac(a.c,d);c=(e=yYb(),MV(e.qe(b),1));idc(a.a,b);idc(a.b,c)}\nfunction zYb(b){var c=$doc.cookie;if(c&&c!=LFc){var d=c.split(cHc);for(var e=0;e<d.length;++e){var f,g;var i=d[e].indexOf(oHc);if(i==-1){f=d[e];g=LFc}else{f=d[e].substring(0,i);g=d[e].substring(i+1)}if(xYb){try{f=decodeURIComponent(f)}catch(a){}try{g=decodeURIComponent(g)}catch(a){}}b.se(f,g)}}}\nfunction MCb(a){var b,c,d;c=new g8b(3,3);a.c=new Fac;b=new A0b('Supprimer');pj((HYb(),b.gb),JMc,true);v7b(c,0,0,'<b><b>Cookies existants:<\\/b><\\/b>');y7b(c,0,1,a.c);y7b(c,0,2,b);a.a=new sdc;v7b(c,1,0,'<b><b>Nom:<\\/b><\\/b>');y7b(c,1,1,a.a);a.b=new sdc;d=new A0b('Sauvegarder Cookie');pj(d.gb,JMc,true);v7b(c,2,0,'<b><b>Valeur:<\\/b><\\/b>');y7b(c,2,1,a.b);y7b(c,2,2,d);wj(d,new SCb(a),(Jy(),Jy(),Iy));wj(a.c,new VCb(a),(zy(),zy(),yy));wj(b,new YCb(a),Iy);NCb(a,null);return c}\nggb(734,1,aEc,SCb);_.Jc=function TCb(a){var b,c,d;c=cs(Pi(this.a.a),ILc);d=cs(Pi(this.a.b),ILc);b=new cV(Efb(Ifb((new aV).p.getTime()),jEc));if(c.length<1){zZb('Vous devez indiquer un nom de cookie');return}CYb(c,d,b);NCb(this.a,c)};ggb(735,1,bEc,VCb);_.Ic=function WCb(a){OCb(this.a)};ggb(736,1,aEc,YCb);_.Jc=function ZCb(a){var b,c;c=yac(this.a.c).selectedIndex;if(c>-1&&c<yac(this.a.c).options.length){b=zac(this.a.c,c);BYb(b);Dac(this.a.c,c);OCb(this.a)}};ggb(737,1,dEc);_.sc=function bDb(){Rib(this.b,MCb(this.a))};ggb(738,1,{},dDb);_.uc=function eDb(){this.b<yac(this.a.c).options.length&&Eac(this.a.c,this.b);OCb(this.a)};_.b=0;var vYb=null,wYb,xYb=true;var B4=qsc(PKc,'CwCookies$1',734),C4=qsc(PKc,'CwCookies$2',735),D4=qsc(PKc,'CwCookies$3',736),F4=qsc(PKc,'CwCookies$5',738);SEc($n)(24);\n//# sourceURL=showcase-24.js\n")