// 点击试卷后的缩略信息
<template>
  <div id="msg">
    <div class="title">
      <span>我的考试</span>
      <span>/试卷示例</span>
    </div>
    <div class="wrapper">
      <ul class="top">
        <li class="example">试卷示例</li>
        <li><i class="iconfont icon-pen-"></i></li>
        <li><i class="iconfont icon-icon_font_add"></i></li>
        <li><i class="iconfont icon-share"></i></li>
        <li><i class="iconfont icon-el-icon-delete"></i></li>
        <li class="right">
          <div>
            <span class="count">总分</span>
            <span class="score">100</span>
          </div>
        </li>
      </ul>
      <ul class="bottom">
        <li>更新于2019/01/07 14:40</li>
        <li>来自 ATA研发中心的分享</li>
        <li class="btn">试卷描述</li>
        <li class="btn">应用考试</li>
        <li class="right"><router-link to="/answer"><el-button>开始答题</el-button></router-link></li>
      </ul>
      <ul class="info">
        <li @click="dialogVisible = true"><a href="javascript:;"><i class="iconfont icon-info"></i>考生须知</a></li>
      </ul>
    </div>
    <div class="content">
      <el-collapse v-model="activeName" >
        <el-collapse-item class="header" name="0">
          <template slot="title" class="stitle" >
            <div class="title">
              <span>公务员考试行测</span><i class="header-icon el-icon-info"></i>
              <span class="time">100分 / 60分钟</span>
              <el-button type="primary" size="small">点击查看试题详情</el-button>
            </div>
          </template>
          <el-collapse class="inner">
            <el-collapse-item>
              <template slot="title" name="1">
                <div class="titlei">常识判断 (共5题 共计10分)</div>
              </template>
              <div class="contenti">
                <ul class="question">
                  <li>1. 【单选题】下列雕塑作品表现唐太宗李世民生平战功的是： 2分</li>
                  <li>2. 【单选题】目前我国正在大力推进文化体制改革，特别是对国... 2分</li>
                  <li>3. 【单选题】和平共处五项原则周年，下列其发表时间相同的历... 2分</li>
                  <li>4. 【单选题】下列关于社会主义核心价值观内容有误的是： 2分</li>
                  <li>5. 【单选题】江西参与“丝绸之路经济带”和“21世纪海上丝... 2分</li>
                </ul>
              </div>
            </el-collapse-item>
            <el-collapse-item>
              <template slot="title" name="2">
                <div class="titlei">言语理解与表达 (共5题  共计10分)</div>
              </template>
              <div class="contenti">
                <ul class="question">
                  <li>6. 【单选题】学者如果孜孜于衣食居住的安适，一定谈不上好学... 2分</li>
                  <li>7. 【单选题】一个国家的文学能在世界范围内引起关注，必然是... 2分</li>
                  <li>8. 【单选题】在如今浅阅读盛行的时代，一边是快餐式、碎片式... 2分</li>
                  <li>9. 【单选题】2013年5月，微博上_______着一份百... 2分</li>
                  <li>10. 【单选题】英国车，汽车工艺的代表，处处出_______... 2分</li>
                </ul>
              </div>
            </el-collapse-item>
            <el-collapse-item>
              <template slot="title" name="3">
                <div class="titlei">数量关系 (共5题 共计10分)</div>
              </template>
              <div class="contenti">
                <ul class="question">
                  <li>11. 【单选题】某单位共有四个科室，第一科室20人，第二科室... 2分</li>
                  <li>12. 【单选题】某超市销售“双层锅”和“三层锅”两种蒸锅套装... 2分</li>
                  <li>13. 【单选题】设有编号为1、2、3、……、10的10张背面... 2分</li>
                  <li>14. 【单选题】如图，某三角形展览馆由36个小三角形展室组成... 2分</li>
                  <li>15. 【单选题】野生动物保护机构考察某圈养动物的状态，在n（... 2分</li>
                </ul>
              </div>
            </el-collapse-item>
            <el-collapse-item>
              <template slot="title" name="4">
                <div class="titlei">判断推理 (共10题 共计20分)</div>
              </template>
              <div class="contenti">
                <ul class="question">
                  <li>16. 【单选题】把下面的六个图形分为两类，使每一类图形都有各... 2分</li>
                  <li>17. 【单选题】左边给定的是纸盒的外表面，下列哪一项能由它折... 2分</li>
                  <li>18. 【单选题】从所给四个选项中，选择最合适的一个填入问号处... 2分</li>
                  <li>19. 【单选题】行政不作为是行政机关对于公民、法人和其他组织... 2分</li>
                  <li>20. 【单选题】碳信用又称碳权，指在经过联合国或联合国认可的... 2分</li>
                  <li>21. 【单选题】“公众参与”是一种有计划的行动。它通过政府部... 2分</li>
                  <li>22. 【单选题】沉锚效应，指的是人们在对某事物做出判断时，易... 2分</li>
                  <li>23. 【单选题】隐形课程是指学校课程计划中未明确规定的、非正... 2分</li>
                  <li>24. 【单选题】符号是人们共同约定来指称一定对象的标志物，它... 2分</li>
                  <li>25. 【单选题】环境标志也称绿色标志、生态标志，是指由政府部... 2分</li>
                </ul>
              </div>
            </el-collapse-item>
            <el-collapse-item>
              <template slot="title" name="5">
                <div class="titlei">资料分析 (共10题  共计50分)</div>
              </template>
              <div class="contenti">
                <ul class="question">
                  <li>26-30. 【复合题】2013年二季度，我国税收月收入同比增速逐步... 25分</li>
                  <li>31-35. 【复合题】下列说法与资料相符合的有几个： ①2013年... 25分</li>
                </ul>
              </div>
            </el-collapse-item>
          </el-collapse>
        </el-collapse-item>
        
      </el-collapse>
    </div>
    <!--考生须知对话框-->
    <el-dialog
      title="考生须知"
      :visible.sync="dialogVisible"
      width="30%">
      <span>欢迎参加本次考试</span>
      <span slot="footer" class="dialog-footer">
        <el-button @click="dialogVisible = false">知道了</el-button>
      </span>
    </el-dialog>
  </div>
</template>

<script>
export default {
  data() {
    return {
      dialogVisible: false,
      activeName: '0'
    }
  },
}
</script>

<style scoped>
.right {
  margin-left: auto;
}
.inner .contenti .question {
  margin-left: 40px;
  color: #9a9a9a;
  font-size: 14px;
}
.content .inner .titlei {
  margin-left: 20px;
  font-size: 16px;
  color: #88949b;
  font-weight: bold;
}
.content .title .time {
  font-size: 16px;
  margin-left: 420px;
  color: #999;
}
.content .stitle {
  background-color: #0195ff;
}
.content .title span {
  margin-right: 10px;
}
#msg .content .title {
  font-size: 20px;
  margin: 0px;
  display: flex;
  align-items: center;
}
.content {
  margin-top: 20px;
  background-color: #fff;
}
.content .header {
  padding: 10px 30px;
}
.wrapper .info {
  margin: 20px 0px 0px 20px;
  border-top: 1px solid #eee;
  padding: 20px 0px 10px 0px;
}
.wrapper .info a {
  color: #88949b;
  font-size: 14px;
}
.wrapper .info a:hover {
  color: #0195ff;
}
.wrapper .bottom .btn {
  cursor: pointer;
  padding: 5px 10px;
  border: 1px solid #88949b;
  border-radius: 4px;
} 
.wrapper .bottom {
  display: flex;
  margin-left: 20px;
  color: #999;
  font-size: 14px;
  align-items: center;
}
.wrapper .bottom li {
  margin-right: 14px;
}
#msg {
  background-color: #eee;
  width: 980px;
  margin: 0 auto;
}
#msg .title {
  margin: 20px;
}
#msg .wrapper {
  background-color: #fff;
  padding: 10px;
}
.wrapper .top {
  display: flex;
  margin: 20px;
  align-items: center;
}
.wrapper .top .right {
  margin-left: auto;
}
.wrapper .top .example {
  color: #333;
  font-size: 22px;
  font-weight: 700;
}
.wrapper .top li i {
  margin-left: 20px;
  color: #88949b;
}
.wrapper .right .count {
  margin-right: 60px;
  color: #fff;
  padding: 4px 10px;
  background-color: #88949b;
  border-top-left-radius: 4px;
  border-bottom-left-radius: 4px;
  border: 1px solid #88949b;
}
.wrapper .right .score {
  position: absolute;
  left: 53px;
  top: -5px;
  padding: 1px 12px;
  font-size: 20px;
  color: #88949b;
  border: 1px dashed #88949b;
  border-left: none;
  border-top-right-radius: 4px;
  border-bottom-right-radius: 4px;
  font-weight: bold;
}
.wrapper .right div {
  position: relative;
}
</style>
