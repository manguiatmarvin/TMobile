$wnd.showcase.runAsyncCallback11("function CWb(){}\nfunction GWb(){}\nfunction vWb(a,b){a.c=b}\nfunction wWb(a){if(a==lWb){return true}cG();return a==oWb}\nfunction xWb(a){if(a==kWb){return true}cG();return a==jWb}\nfunction EWb(a){this.c=(zYb(),uYb).b;this.e=(GYb(),FYb).b;this.b=a}\nfunction uWb(a,b){var c;c=TJ(a.fb,95);c.e=b.b;!!c.d&&rQb(c.d,b)}\nfunction tWb(a,b){var c;c=TJ(a.fb,95);c.c=b.b;!!c.d&&pQb(c.d,b)}\nfunction pWb(){pWb=arc;iWb=new CWb;lWb=new CWb;kWb=new CWb;jWb=new CWb;mWb=new CWb;nWb=new CWb;oWb=new CWb}\nfunction yWb(){pWb();tQb.call(this);this.c=(zYb(),uYb);this.d=(GYb(),FYb);Vs((pMb(),this.f),Sxc,0);Vs(this.f,Txc,0)}\nfunction qWb(a,b,c){var d;if(c==iWb){if(b==a.b){return}else if(a.b){throw new ugc('Only one CENTER widget may be added')}}Pj(b);C8b(a.k,b);c==iWb&&(a.b=b);d=new EWb(c);b.fb=d;tWb(b,a.c);uWb(b,a.d);sWb(a);Rj(b,a)}\nfunction rWb(a,b){var c,d,e,f,g,i,j;_7b((pMb(),a.hb),Dtc,b);i=new Foc;j=new N8b(a.k);while(j.c<j.d.d){c=L8b(j);g=TJ(c.fb,95).b;e=TJ(i.wd(g),142);d=!e?1:e.b;f=g==mWb?'north'+d:g==nWb?'south'+d:g==oWb?'west'+d:g==jWb?'east'+d:g==lWb?'linestart'+d:g==kWb?'lineend'+d:Ixc;_7b(ot(c.hb),b,f);i.yd(g,Kgc(d+1))}}\nfunction sWb(a){var b,c,d,e,f,g,i,j,k,n,o,p,q,r,s,t,u;b=(pMb(),a.e);while($Nb(b)>0){Bs(b,ZNb(b,0))}r=1;e=1;for(j=new N8b(a.k);j.c<j.d.d;){d=L8b(j);f=TJ(d.fb,95).b;f==mWb||f==nWb?++r:(f==jWb||f==oWb||f==lWb||f==kWb)&&++e}s=IJ(L2,grc,96,r,0);for(g=0;g<r;++g){s[g]=new GWb;s[g].c=$doc.createElement(Qxc);qMb(b,s[g].c)}n=0;o=e-1;p=0;t=r-1;c=null;for(i=new N8b(a.k);i.c<i.d.d;){d=L8b(i);k=TJ(d.fb,95);u=$doc.createElement(Rxc);k.d=u;Ws(k.d,zxc,k.c);du(k.d.style,Axc,k.e);Ws(k.d,duc,Dtc);Ws(k.d,cuc,Dtc);if(k.b==mWb){tMb(s[p].c,u,s[p].b);qMb(u,d.hb);Vs(u,Hzc,o-n+1);++p}else if(k.b==nWb){tMb(s[t].c,u,s[t].b);qMb(u,d.hb);Vs(u,Hzc,o-n+1);--t}else if(k.b==iWb){c=u}else if(wWb(k.b)){q=s[p];tMb(q.c,u,q.b++);qMb(u,d.hb);Vs(u,EAc,t-p+1);++n}else if(xWb(k.b)){q=s[p];tMb(q.c,u,q.b);qMb(u,d.hb);Vs(u,EAc,t-p+1);--o}}if(a.b){q=s[p];tMb(q.c,c,q.b);qMb(c,_i(a.b))}}\n_3(728,1,Wrc);_.xc=function Irb(){var a,b,c;F6(this.b,(a=new yWb,Ss((pMb(),a.hb),'cw-DockPanel'),Vs(a.f,Sxc,4),vWb(a,(zYb(),tYb)),qWb(a,new JUb(wAc),(pWb(),mWb)),qWb(a,new JUb(xAc),nWb),qWb(a,new JUb(yAc),jWb),qWb(a,new JUb(zAc),oWb),qWb(a,new JUb(AAc),mWb),qWb(a,new JUb(BAc),nWb),b=new JUb('\\u8FD9\\u4E2A\\u793A\\u4F8B\\u4E2D\\u5728<code>DockPanel<\\/code> \\u7684\\u4E2D\\u95F4\\u4F4D\\u7F6E\\u6709\\u4E00\\u4E2A<code>ScrollPanel<\\/code>\\u3002\\u5982\\u679C\\u5728\\u4E2D\\u95F4\\u653E\\u5165\\u5F88\\u591A\\u5185\\u5BB9\\uFF0C\\u5B83\\u5C31\\u4F1A\\u53D8\\u6210\\u9875\\u9762\\u5185\\u7684\\u53EF\\u6EDA\\u52A8\\u533A\\u57DF\\uFF0C\\u65E0\\u9700\\u4F7F\\u7528IFRAME\\u3002<br><br>\\u6B64\\u5904\\u4F7F\\u7528\\u4E86\\u76F8\\u5F53\\u591A\\u65E0\\u610F\\u4E49\\u7684\\u6587\\u5B57\\uFF0C\\u4E3B\\u8981\\u662F\\u4E3A\\u4E86\\u53EF\\u4EE5\\u6EDA\\u52A8\\u81F3\\u53EF\\u89C6\\u533A\\u57DF\\u7684\\u5E95\\u90E8\\u3002\\u5426\\u5219\\uFF0C\\u60A8\\u6050\\u6015\\u4E0D\\u5F97\\u4E0D\\u628A\\u5B83\\u7F29\\u5230\\u5F88\\u5C0F\\u624D\\u80FD\\u770B\\u5230\\u90A3\\u5C0F\\u5DE7\\u7684\\u6EDA\\u52A8\\u6761\\u3002'),c=new CRb(b),c.hb.style[duc]=CAc,c.hb.style[cuc]=DAc,qWb(a,c,iWb),rWb(a,'cwDockPanel'),a))};_3(1032,988,krc,yWb);_.Mb=function zWb(a){rWb(this,a)};_.dc=function AWb(a){var b;b=bPb(this,a);if(b){a==this.b&&(this.b=null);sWb(this)}return b};var iWb,jWb,kWb,lWb,mWb,nWb,oWb;_3(1033,1,{},CWb);_3(1034,1,{95:1},EWb);_3(1035,1,{96:1},GWb);_.b=0;var aZ=egc(Fyc,'DockPanel',1032),_Y=egc(Fyc,'DockPanel$TmpRow',1035),L2=dgc(Myc,'DockPanel$TmpRow;',1367,_Y),ZY=egc(Fyc,'DockPanel$DockLayoutConstant',1033),$Y=egc(Fyc,'DockPanel$LayoutData',1034);Jsc(lo)(11);\n//# sourceURL=showcase-11.js\n")
