$wnd.showcase.runAsyncCallback21("function qqb(a){this.a=a}\nfunction tqb(a){this.a=a}\nfunction Boc(a){this.a=a}\nfunction Hoc(a){this.c=a;this.b=a.a.b.a}\nfunction yoc(a){zoc.call(this,a,null,null)}\nfunction coc(a,b){return a.c.qd(b)}\nfunction foc(a,b){if(a.a){xoc(b);woc(b)}}\nfunction xoc(a){a.a.b=a.b;a.b.a=a.a;a.a=a.b=null}\nfunction woc(a){var b;b=a.c.b.b;a.b=b;a.a=a.c.b;b.a=a.c.b.b=a}\nfunction Goc(a){if(a.b==a.c.a.b){throw new Ooc}a.a=a.b;a.b=a.b.a;return a.a}\nfunction doc(a,b){var c;c=fJ(a.c.td(b),156);if(c){foc(a,c);return c.e}return null}\nfunction zoc(a,b,c){this.c=a;soc.call(this,b,c);this.a=this.b=null}\nfunction goc(){Lnc.call(this);this.b=new yoc(this);this.c=new Lnc;this.b.b=this.b;this.b.a=this.b}\nfunction X6(a){var b,c;b=fJ(a.a.td(gAc),148);if(b==null){c=XI(Z1,mqc,1,[hAc,iAc,Avc]);a.a.vd(gAc,c);return c}else{return b}}\nfunction eoc(a,b,c){var d,e,f;e=fJ(a.c.td(b),156);if(!e){d=new zoc(a,b,c);a.c.vd(b,d);woc(d);return null}else{f=e.e;roc(e,c);foc(a,e);return f}}\nfunction dqb(b){var c,d,e,f;e=vZb(b.d,uZb(b.d).selectedIndex);c=fJ(doc(b.f,e),119);try{f=yfc(cs(Pi(b.e),Eyc));d=yfc(cs(Pi(b.c),Eyc));yOb(b.a,c,d,f)}catch(a){a=h2(a);if(hJ(a,144)){return}else throw g2(a)}}\nfunction bqb(a){var b,c,d,e;d=new CWb;a.e=new o0b;dj(a.e,jAc);e0b(a.e,'100');a.c=new o0b;dj(a.c,jAc);e0b(a.c,'60');a.d=new BZb;rWb(d,0,0,'<b>Items to move:<\\/b>');uWb(d,0,1,a.d);rWb(d,1,0,'<b>Top:<\\/b>');uWb(d,1,1,a.e);rWb(d,2,0,'<b>Left:<\\/b>');uWb(d,2,1,a.c);for(c=Okc(_F(a.f));c.a.Ed();){b=fJ(Ukc(c),1);wZb(a.d,b)}wj(a.d,new qqb(a),(zy(),zy(),yy));e=new tqb(a);wj(a.e,e,(mz(),mz(),lz));wj(a.c,e,lz);return d}\nfunction cqb(a){var b,c,d,e,f,g,i,j;a.f=new goc;a.a=new AOb;_i(a.a,kAc,kAc);Ui(a.a,lAc);j=X6(a.b);i=new UTb(hAc);tOb(a.a,i,10,20);eoc(a.f,j[0],i);c=new wPb('Click Me!');tOb(a.a,c,80,45);eoc(a.f,j[1],c);d=new cXb(2,3);ns(d.o,qvc,Ewc);for(e=0;e<3;e++){rWb(d,0,e,e+Hsc);uWb(d,1,e,new MKb((U7(),J7)))}tOb(a.a,d,60,100);eoc(a.f,j[2],d);b=new dTb;Xj(b,a.a);g=new dTb;Xj(g,bqb(a));f=new uYb;ms(f.e,Mwc,10);rYb(f,g);rYb(f,b);return f}\nvar jAc='3em',hAc='Hello World',gAc='cwAbsolutePanelWidgetNames';c3(716,1,$qc);_.sc=function oqb(){N5(this.b,cqb(this.a))};c3(717,1,Yqc,qqb);_.Ic=function rqb(a){eqb(this.a)};c3(718,1,Iqc,tqb);_.Lc=function uqb(a){dqb(this.a)};c3(1308,1306,Mrc,goc);_.Qg=function hoc(){this.c.Qg();this.b.b=this.b;this.b.a=this.b};_.qd=function ioc(a){return coc(this,a)};_.rd=function joc(a){var b;b=this.b.a;while(b!=this.b){if(fqc(b.e,a)){return true}b=b.a}return false};_.sd=function koc(){return new Boc(this)};_.td=function loc(a){return doc(this,a)};_.vd=function moc(a,b){return eoc(this,a,b)};_.wd=function noc(a){var b;b=fJ(this.c.wd(a),156);if(b){xoc(b);return b.e}return null};_.xd=function ooc(){return this.c.xd()};_.a=false;c3(1309,1310,{156:1,159:1},yoc,zoc);c3(1311,356,Nqc,Boc);_.Ad=function Coc(a){var b,c,d;if(!hJ(a,159)){return false}b=fJ(a,159);c=b.Hd();if(coc(this.a,c)){d=doc(this.a,c);return fqc(b.Rc(),d)}return false};_.bc=function Doc(){return new Hoc(this)};_.xd=function Eoc(){return this.a.c.xd()};c3(1312,1,{},Hoc);_.Ed=function Ioc(){return this.b!=this.c.a.b};_.Fd=function Joc(){return Goc(this)};_.Gd=function Koc(){if(!this.a){throw new Efc('No current entry')}xoc(this.a);this.c.a.c.wd(this.a.d);this.a=null};var FT=lfc(Cxc,'CwAbsolutePanel$3',717),GT=lfc(Cxc,'CwAbsolutePanel$4',718),_0=lfc(Pxc,'LinkedHashMap',1308),Y0=lfc(Pxc,'LinkedHashMap$ChainEntry',1309),$0=lfc(Pxc,'LinkedHashMap$EntrySet',1311),Z0=lfc(Pxc,'LinkedHashMap$EntrySet$EntryIterator',1312);Orc($n)(21);\n//# sourceURL=showcase-21.js\n")
