$wnd.showcase.runAsyncCallback21("function cEb(a){this.b=a}\nfunction fEb(a){this.b=a}\nfunction qCc(a){this.b=a}\nfunction wCc(a){this.d=a;this.c=a.b.c.b}\nfunction nCc(a){oCc.call(this,a,null,null)}\nfunction mCc(a){a.b.c=a.c;a.c.b=a.b;a.b=a.c=null}\nfunction lCc(a){var b;b=a.d.c.c;a.c=b;a.b=a.d.c;b.b=a.d.c.c=a}\nfunction oCc(a,b,c){this.d=a;hCc.call(this,b,c);this.b=this.c=null}\nfunction WBc(a,b){if(a.b){mCc(b);lCc(b)}}\nfunction TBc(a,b){return a.d.ve(b)}\nfunction vCc(a){if(a.c==a.d.b.c){throw new DCc}a.b=a.c;a.c=a.c.b;return a.b}\nfunction UBc(a,b){var c;c=sW(a.d.ye(b),156);if(c){WBc(a,c);return c.f}return null}\nfunction XBc(){ABc.call(this);this.c=new nCc(this);this.d=new ABc;this.c.c=this.c;this.c.b=this.c}\nfunction Ikb(a){var b,c;b=sW(a.b.ye(pOc),148);if(b==null){c=iW(Pfb,cEc,1,['Bonjour le monde',qOc,rOc]);a.b.Ae(pOc,c);return c}else{return b}}\nfunction VBc(a,b,c){var d,e,f;e=sW(a.d.ye(b),156);if(!e){d=new oCc(a,b,c);a.d.Ae(b,d);lCc(d);return null}else{f=e.f;gCc(e,c);WBc(a,e);return f}}\nfunction RDb(b){var c,d,e,f;e=fbc(b.e,ebc(b.e).selectedIndex);c=sW(UBc(b.g,e),119);try{f=mtc(Js(_i(b.f),FMc));d=mtc(Js(_i(b.d),FMc));f0b(b.b,c,d,f)}catch(a){a=Zfb(a);if(uW(a,144)){return}else throw Yfb(a)}}\nfunction PDb(a){var b,c,d,e;d=new l8b;a.f=new $dc;pj(a.f,sOc);Qdc(a.f,'100');a.d=new $dc;pj(a.d,sOc);Qdc(a.d,'60');a.e=new lbc;a8b(d,0,0,'<b>Points \\xE0 circuler:<\\/b>');d8b(d,0,1,a.e);a8b(d,1,0,'<b>Bord du dessus:<\\/b>');d8b(d,1,1,a.f);a8b(d,2,0,'<b>Bord gauche:<\\/b>');d8b(d,2,1,a.d);for(c=Dyc(WJ(a.g));c.b.Je();){b=sW(Jyc(c),1);gbc(a.e,b)}Ij(a.e,new cEb(a),(gz(),gz(),fz));e=new fEb(a);Ij(a.f,e,(Vz(),Vz(),Uz));Ij(a.d,e,Uz);return d}\nfunction QDb(a){var b,c,d,e,f,g,i,j;a.g=new XBc;a.b=new h0b;lj(a.b,tOc,tOc);ej(a.b,uOc);j=Ikb(a.c);i=new D5b('Hello World');a0b(a.b,i,10,20);VBc(a.g,j[0],i);c=new f1b('Cliquez-moi!');a0b(a.b,c,80,45);VBc(a.g,j[1],c);d=new P8b(2,3);Ws(d.p,uJc,GKc);for(e=0;e<3;e++){a8b(d,0,e,e+xGc);d8b(d,1,e,new sYb((Flb(),ulb)))}a0b(a.b,d,60,100);VBc(a.g,j[2],d);b=new O4b;hk(b,a.b);g=new O4b;hk(g,PDb(a));f=new eac;Vs(f.f,RKc,10);bac(f,g);bac(f,b);return f}\nvar sOc='3em',pOc='cwAbsolutePanelWidgetNames';Ugb(742,1,QEc);_.xc=function aEb(){yjb(this.c,QDb(this.b))};Ugb(743,1,OEc,cEb);_.Qc=function dEb(a){SDb(this.b)};Ugb(744,1,yEc,fEb);_.Tc=function gEb(a){RDb(this.b)};Ugb(1333,1331,BFc,XBc);_.Wh=function YBc(){this.d.Wh();this.c.c=this.c;this.c.b=this.c};_.ve=function ZBc(a){return TBc(this,a)};_.we=function $Bc(a){var b;b=this.c.b;while(b!=this.c){if(WDc(b.f,a)){return true}b=b.b}return false};_.xe=function _Bc(){return new qCc(this)};_.ye=function aCc(a){return UBc(this,a)};_.Ae=function bCc(a,b){return VBc(this,a,b)};_.Be=function cCc(a){var b;b=sW(this.d.Be(a),156);if(b){mCc(b);return b.f}return null};_.Ce=function dCc(){return this.d.Ce()};_.b=false;Ugb(1334,1335,{156:1,159:1},nCc,oCc);Ugb(1336,371,DEc,qCc);_.Fe=function rCc(a){var b,c,d;if(!uW(a,159)){return false}b=sW(a,159);c=b.Me();if(TBc(this.b,c)){d=UBc(this.b,c);return WDc(b.Zc(),d)}return false};_.gc=function sCc(){return new wCc(this)};_.Ce=function tCc(){return this.b.d.Ce()};Ugb(1337,1,{},wCc);_.Je=function xCc(){return this.c!=this.d.b.c};_.Ke=function yCc(){return vCc(this)};_.Le=function zCc(){if(!this.b){throw new stc('No current entry')}mCc(this.b);this.d.b.d.Be(this.b.e);this.b=null};var t5=_sc(HLc,'CwAbsolutePanel$3',743),u5=_sc(HLc,'CwAbsolutePanel$4',744),Reb=_sc(ULc,'LinkedHashMap',1333),Oeb=_sc(ULc,'LinkedHashMap$ChainEntry',1334),Qeb=_sc(ULc,'LinkedHashMap$EntrySet',1336),Peb=_sc(ULc,'LinkedHashMap$EntrySet$EntryIterator',1337);DFc(lo)(21);\n//# sourceURL=showcase-21.js\n")
