$wnd.showcase.runAsyncCallback11("function cBc(){}\nfunction gBc(){}\nfunction XAc(a,b){a.b=b}\nfunction YAc(a){if(a==NAc){return true}LH();return a==QAc}\nfunction ZAc(a){if(a==MAc){return true}LH();return a==LAc}\nfunction eBc(a){this.b=($Cc(),VCc).a;this.d=(fDc(),eDc).a;this.a=a}\nfunction WAc(a,b){var c;c=Qmb(a.eb,96);c.d=b.a;!!c.c&&Tuc(c.c,b)}\nfunction VAc(a,b){var c;c=Qmb(a.eb,96);c.b=b.a;!!c.c&&Ruc(c.c,b)}\nfunction RAc(){RAc=x5c;KAc=new cBc;NAc=new cBc;MAc=new cBc;LAc=new cBc;OAc=new cBc;PAc=new cBc;QAc=new cBc}\nfunction $Ac(){RAc();Vuc.call(this);this.b=($Cc(),VCc);this.c=(fDc(),eDc);ms((Tqc(),this.e),Acd,0);ms(this.e,Bcd,0)}\nfunction SAc(a,b,c){var d;if(c==KAc){if(b==a.a){return}else if(a.a){throw new SWc('Only one CENTER widget may be added')}}Dj(b);gPc(a.j,b);c==KAc&&(a.a=b);d=new eBc(c);b.eb=d;VAc(b,a.b);WAc(b,a.c);UAc(a);Fj(b,a)}\nfunction TAc(a,b){var c,d,e,f,g,i,j;FOc((Tqc(),a.gb),X7c,b);i=new a3c;j=new rPc(a.j);while(j.b<j.c.c){c=pPc(j);g=Qmb(c.eb,96).a;e=Qmb(i.qe(g),143);d=!e?1:e.a;f=g==OAc?'north'+d:g==PAc?'south'+d:g==QAc?'west'+d:g==LAc?'east'+d:g==NAc?'linestart'+d:g==MAc?'lineend'+d:tcd;FOc(Hs(c.gb),b,f);i.se(g,gXc(d+1))}}\nfunction UAc(a){var b,c,d,e,f,g,i,j,k,n,o,p,q,r,s,t,u;b=(Tqc(),a.d);while(Esc(b)>0){Wr(b,Dsc(b,0))}r=1;e=1;for(i=new rPc(a.j);i.b<i.c.c;){d=pPc(i);f=Qmb(d.eb,96).a;f==OAc||f==PAc?++r:(f==LAc||f==QAc||f==NAc||f==MAc)&&++e}s=Fmb(dJb,C5c,97,r,0);for(g=0;g<r;++g){s[g]=new gBc;s[g].b=$doc.createElement(ycd);Uqc(b,s[g].b)}n=0;o=e-1;p=0;t=r-1;c=null;for(j=new rPc(a.j);j.b<j.c.c;){d=pPc(j);k=Qmb(d.eb,96);u=$doc.createElement(zcd);k.c=u;ns(k.c,kcd,k.b);vt(k.c.style,lcd,k.d);ns(k.c,x8c,X7c);ns(k.c,w8c,X7c);if(k.a==OAc){Xqc(s[p].b,u,s[p].a);Uqc(u,d.gb);ms(u,sed,o-n+1);++p}else if(k.a==PAc){Xqc(s[t].b,u,s[t].a);Uqc(u,d.gb);ms(u,sed,o-n+1);--t}else if(k.a==KAc){c=u}else if(YAc(k.a)){q=s[p];Xqc(q.b,u,q.a++);Uqc(u,d.gb);ms(u,lfd,t-p+1);++n}else if(ZAc(k.a)){q=s[p];Xqc(q.b,u,q.a);Uqc(u,d.gb);ms(u,lfd,t-p+1);--o}}if(a.a){q=s[p];Xqc(q.b,c,q.a);Uqc(c,Pi(a.a))}}\ntKb(811,1,p6c);_.sc=function g6b(){var a,b,c;cNb(this.a,(a=new $Ac,js((Tqc(),a.gb),'cw-DockPanel'),ms(a.e,Acd,4),XAc(a,($Cc(),UCc)),SAc(a,new jzc('This is the first north component'),(RAc(),OAc)),SAc(a,new jzc('This is the first south component'),PAc),SAc(a,new jzc('This is the east component'),LAc),SAc(a,new jzc('This is the west component'),QAc),SAc(a,new jzc('This is the second north component'),OAc),SAc(a,new jzc('This is the second south component'),PAc),b=new jzc(\"This is a <code>ScrollPanel<\\/code> contained at the center of a <code>DockPanel<\\/code>.  By putting some fairly large contents in the middle and setting its size explicitly, it becomes a scrollable area within the page, but without requiring the use of an IFRAME.<br><br>Here's quite a bit more meaningless text that will serve primarily to make this thing scroll off the bottom of its visible area.  Otherwise, you might have to make it really, really small in order to see the nifty scroll bars!\"),c=new cwc(b),c.gb.style[x8c]=jfd,c.gb.style[w8c]=kfd,SAc(a,c,KAc),TAc(a,'cwDockPanel'),a))};tKb(1117,1073,G5c,$Ac);_.Hb=function _Ac(a){TAc(this,a)};_.$b=function aBc(a){var b;b=Ftc(this,a);if(b){a==this.a&&(this.a=null);UAc(this)}return b};var KAc,LAc,MAc,NAc,OAc,PAc,QAc;tKb(1118,1,{},cBc);tKb(1119,1,{96:1},eBc);tKb(1120,1,{97:1},gBc);_.a=0;var wDb=CWc(odd,'DockPanel',1117),vDb=CWc(odd,'DockPanel$TmpRow',1120),dJb=BWc(vdd,'DockPanel$TmpRow;',1451,vDb),tDb=CWc(odd,'DockPanel$DockLayoutConstant',1118),uDb=CWc(odd,'DockPanel$LayoutData',1119);c7c($n)(11);\n//# sourceURL=showcase-11.js\n")
