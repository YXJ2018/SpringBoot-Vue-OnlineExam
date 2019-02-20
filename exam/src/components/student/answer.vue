<!--考生答题界面-->
<template>
  <div id="answer">
    <!--顶部信息栏-->
     <div class="top">
       <ul class="item">
         <li><i class="iconfont icon-menufold icon20"></i></li>
         <li>测试-公务员考试行测</li>
         <li @click="flag = !flag">
           <i class="iconfont icon-user icon20"></i>
           <div class="msg" v-if="flag">
             <p>姓名：小鱼</p>
             <p>准考证号:201558274084</p>
           </div>
         </li>
         <li><i class="iconfont icon-arrLeft icon20"></i></li>
       </ul>
     </div>
     <div class="flexarea">
        <!--左边题目编号区-->
        <div class="left">
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
        <!--右边选择答题区-->
        <div class="right">
          <div class="title">
            <p>常识判断</p>
            <i class="iconfont icon-right auto-right"></i>
            <span>全卷 已答0题/共35题  倒计时：59:59</span>
          </div>
        </div>
     </div> 
  </div>
</template>
<style scoped>
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
}
.right .title {
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
  background-color: #6bb851;
  width: 240px;
  margin: 20px 0px 20px 10px;
  border-radius: 4px;
  height: 30px;
  line-height: 30px;
  color: #fff;
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
  background-color: #6bb851;
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
      flag: false
    }
  },
  methods: {
    
  },
}
</script>
