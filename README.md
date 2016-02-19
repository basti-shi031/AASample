# AASample
见缝插针Android版

纯自定义View实现

## Demo展示
![](http://7xpvut.com1.z0.glb.clouddn.com/1.gif)

![](http://7xpvut.com1.z0.glb.clouddn.com/2.gif)

![](http://7xpvut.com1.z0.glb.clouddn.com/3.gif)

## Api
```java
//设置初始时圆的个数
mAAView.setInitCount(3);
//设置需要添加圆的个数
mAAView.setRestCount(5);
//设置旋转速度
mAAView.setRotateSpeed((float) 1.5);
//设置发射速度
mAAView.setBiuSpeed(5f);
//设置底部动画速度
mAAView.setBottomSpeed(1f);
//设置关卡
mAAView.setLevel(1);
//其他涉及到Dimension设置的函数
//setXXX(float dimension),
//单位：字体大小：sp
//      半径、线的宽度等：dp

//游戏结束的回调函数
mAAView.setOnGameFinishedListener(new OnGameFinished() {
    @Override
    public void onSuccess() {
        
    }

    @Override
    public void onFail() {
        
    }
});

//每发射一个圆的回调函数
mAAView.setOnPointBiuFinishedListener(new OnPointBiuFinished() {
    @Override
    public void onPointFinished(int index) {
        
    }
});

//重新开始
mAAView.restart();

//暂停
mAAView.pause();

//暂停后继续
mAAView.resume();
```
