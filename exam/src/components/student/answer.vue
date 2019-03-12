<!--考生答题界面-->
<template>
  <div id="answer">
    <!--顶部信息栏-->
     <div class="top">
       <ul class="item">
         <li><i class="iconfont icon-menufold icon20" ref="toggle" @click="slider_flag = !slider_flag"></i></li>
         <li>测试-公务员考试行测</li>
         <li @click="flag = !flag">
           <i class="iconfont icon-user icon20"></i>
           <div class="msg" v-show="flag">
             <p>姓名：小鱼</p>
             <p>准考证号:201558274084</p>
           </div>
         </li>
         <li><i class="iconfont icon-arrLeft icon20"></i></li>
       </ul>
     </div>
     <div class="flexarea">
        <!--左边题目编号区-->
        <transition name="slider-fade">
          <div class="left" v-if="slider_flag">
            <ul class="l-top">
              <li>
                <a href="javascript:;"></a>
                <span>当前</span>
              </li>
              <li>
                <a href="javascript:;"></a>
                <span>未答</span>
              </li>
              <li>
                <a href="javascript:;"></a>
                <span>已答</span>
              </li>
              <li>
                <a href="javascript:;"></a>
                <span>标记</span>
              </li>
            </ul>
            <div class="l-bottom">
              <div class="item">
                <p>常识判断</p>
                <ul>
                  <li><a href="javascript:;">1</a></li>
                  <li><a href="javascript:;">2</a></li>
                  <li><a href="javascript:;">3</a></li>
                  <li><a href="javascript:;">4</a></li>
                  <li><a href="javascript:;">5</a></li>
                </ul>
              </div>
              <div class="item">
                <p>言语理解与表达</p>
                <ul>
                  <li><a href="javascript:;">6</a></li>
                  <li><a href="javascript:;">7</a></li>
                  <li><a href="javascript:;">8</a></li>
                  <li><a href="javascript:;">9</a></li>
                  <li><a href="javascript:;">10</a></li>
                </ul>
              </div>
              <div class="item">
                <p>数量关系</p>
                <ul>
                  <li><a href="javascript:;">11</a></li>
                  <li><a href="javascript:;">12</a></li>
                  <li><a href="javascript:;">13</a></li>
                  <li><a href="javascript:;">14</a></li>
                  <li><a href="javascript:;">15</a></li>
                </ul>
              </div>
              <div class="item">
                <p>判断推理</p>
                <ul>
                  <li><a href="javascript:;">16</a></li>
                  <li><a href="javascript:;">17</a></li>
                  <li><a href="javascript:;">18</a></li>
                  <li><a href="javascript:;">19</a></li>
                  <li><a href="javascript:;">20</a></li>
                  <li><a href="javascript:;">21</a></li>
                  <li><a href="javascript:;">22</a></li>
                  <li><a href="javascript:;">23</a></li>
                  <li><a href="javascript:;">24</a></li>
                  <li><a href="javascript:;">25</a></li>
                </ul>
              </div>
              <div class="item">
                <p>资料分析</p>
                <ul>
                  <li><a href="javascript:;">26</a></li>
                  <li><a href="javascript:;">27</a></li>
                  <li><a href="javascript:;">28</a></li>
                  <li><a href="javascript:;">29</a></li>
                  <li><a href="javascript:;">30</a></li>
                  <li><a href="javascript:;">31</a></li>
                  <li><a href="javascript:;">32</a></li>
                  <li><a href="javascript:;">33</a></li>
                  <li><a href="javascript:;">34</a></li>
                  <li><a href="javascript:;">35</a></li>
                </ul>
              </div>
              <div class="final">结束考试</div>
            </div>
          </div>
        </transition>  
        <!--右边选择答题区-->
        <transition name="slider-fade">
        <div class="right">
          <div class="title">
            <p>常识判断</p>
            <i class="iconfont icon-right auto-right"></i>
            <span>全卷 已答0题/共35题  倒计时：<b>59:48</b></span>
          </div>
          <div class="content">
            <p class="topic"><span class="number">1</span>下列雕塑作品表现唐太宗生平战功的是：</p>
            <el-radio-group v-model="radio2">
              <el-radio :label="1">马踏匈奴</el-radio>
              <el-radio :label="2">击鼓说唱俑</el-radio>
              <el-radio :label="3">昭陵六骏</el-radio>
              <el-radio :label="4">乾陵石雕</el-radio>
            </el-radio-group>
          </div>
          <div class="operation">
            <ul class="end">
              <li><i class="iconfont icon-previous"></i><span>上一题</span></li>
              <li><i class="iconfont icon-mark-o"></i><span>标记</span></li>
              <li><span>下一题</span><i class="iconfont icon-next"></i></li>
            </ul>
          </div>
        </div>
        </transition>
     </div> 
  </div>
</template>
<style scoped>
/* slider过渡效果 */
.slider-fade-enter-active {
  transition: all .3s ease;
}
.slider-fade-leave-active {
  transition: all .3s cubic-bezier(1.0, 0.5, 0.8, 1.0);
}
.slider-fade-enter, .slider-fade-leave-to {
  transform: translateX(-100px);
  opacity: 0;
}

.operation .end li:nth-child(2) {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  background-color: rgb(39, 118, 223);
  border-radius: 50%;
  width: 50px;
  height: 50px;
  color: #fff;
}
.operation .end li {
  cursor: pointer;
  margin: 0 100px;
}
.operation {
  background-color: #fff;
  border-radius: 4px;
  padding: 10px 0px;
  margin-right: 10px;
}
.operation .end {
  display: flex;
  justify-content: center;
  align-items: center;
  color: rgb(39, 118, 223);
}
.content .number {
  display: inline-flex;
  justify-content: center;
  align-items: center;
  width: 20px;
  height: 20px;
  background-color: rgb(39, 118, 223);
  border-radius: 4px;
  margin-right: 4px;
}
.content {
  padding: 0px 20px;
}
.content .topic {
  padding: 20px 0px;
  padding-top: 30px; 
}
.right .content {
  background-color: #fff;
  margin: 10px;
  margin-left: 0px;
  padding-bottom: 294px;
}
.content .el-radio-group label {
  color: #000;
  margin: 5px 0px;
}
.content .el-radio-group {
  display: flex;
  flex-direction:column;
}
.right .title p {
  margin-left: 20px;
}
.flexarea {
  display: flex;
}
.flexarea .right {
  flex: 1;
}
.auto-right {
  margin-left: auto;
  color: #6bb851;
  margin-right: 10px;
}
.right .title {
  margin-right: 10px;
  padding-right: 30px;
  display: flex;
  margin-top: 10px;
  background-color: #fff;
  height: 50px;
  line-height: 50px;
}
.clearfix {
  clear: both;
}
.l-bottom .final {
  cursor: pointer;
  display: inline-block;
  text-align: center;
 background-color: rgb(39, 118, 223);
  width: 240px;
  margin: 20px 0px 20px 10px;
  border-radius: 4px;
  height: 30px;
  line-height: 30px;
  color: #fff;
  margin-top: 40px;
}
#answer .left .item {
  padding: 0px;
  font-size: 16px;
}
.l-bottom {
  border-radius: 4px;
  background-color: #fff;
}
.l-bottom .item p {
  margin-bottom: 5px;
  margin-top: 10px;
  color: #000;
  margin-left: 10px;
}
.l-bottom .item li {
  width: 15%;
  margin-left: 5px;
  margin-bottom: 10px;
}
.l-bottom .item {
  display: flex;
  flex-direction: column;
}
.l-bottom .item ul {
  width: 100%;
  margin-bottom: -8px;
  display: flex;
  justify-content: space-around;
  flex-wrap: wrap;
}
.l-bottom .item ul li a { 
  justify-content: center;
  display: inline-flex;
  align-items: center;
  width: 30px;
  height: 30px;
  border-radius: 50%;
  background-color: #fff;
  border: 1px solid #eee;
  text-align: center;
  color: #000;
  font-size: 16px;
}
.left .l-top {
  display: flex;
  justify-content: space-around;
  padding: 16px 0px;
  border: 1px solid #eee;
  border-radius: 4px;
  margin-bottom: 10px;
  background-color: #fff;
}
.left {
  width: 260px;
  height: 100%;
  margin: 10px 10px 0px 10px;
}
.left .l-top li:nth-child(2) a {
  border: 1px solid #eee;
}
.left .l-top li:nth-child(3) a {
  background-color: #5188b8;
}
.left .l-top li:nth-child(4) a {
  position: relative;
  border: 1px solid #eee;
}
.left .l-top li:nth-child(4) a::before {
  width: 4px;
  height: 4px;
  content: " ";
  position: absolute;
  background-color: red;
  border-radius: 50%;
  top: 0px;
  left: 16px;
}
.left .l-top li {
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
}
.left .l-top li a {
  display: inline-block;
  padding: 10px;
  border-radius: 50%;
  background-color: #fff;
  border: 1px solid #6bb851;
}
#answer .top {
  background-color: rgb(39, 118, 223);
}
#answer .item {
  color: #fff;
  display: flex;
  padding: 20px;
  font-size: 20px;
}
#answer .top .item li:nth-child(1) {
  margin-right: 10px;
}
#answer .top .item li:nth-child(3) {
  position: relative;
  margin-left: auto;
}
#answer {
  padding-bottom: 30px;
}
.icon20 {
  font-size: 20px;
  font-weight: bold;
}
.item .msg {
  padding: 10px 15px;
  border-radius: 4px;
  top: 47px;
  right: -30px;
  color: #6c757d;
  position: absolute;
  border: 1px solid rgba(0,0,0,.15);
  background-color: #fff;
}
.item .msg p {
  font-size: 16px;
  width: 200px;
  text-align: left;
}
</style>
<script>
export default {
  data() {
    return {
      slider_flag: true,
      flag: false,
      radio2: 3
    }
  },
  methods: {
    
  },
}
</script>
