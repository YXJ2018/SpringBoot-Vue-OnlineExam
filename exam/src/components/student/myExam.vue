// 我的试卷页面
<template>
  <div id="myExam">
    <div class="title">我的试卷</div>
    <div class="wrapper">
      <ul class="top">
        <li class="order">从新到旧</li>
        <li class="order">从旧到新</li>
        <li class="search-li"><div class="icon"><input type="text" placeholder="试卷名称" class="search"><i class="el-icon-search"></i></div></li>
        <li><el-button type="primary">新建试卷</el-button></li>
      </ul>
      <ul class="paper">
        <li class="item">
          <h4><router-link to="examMsg">试卷示例</router-link></h4>
          <p class="name">考试样卷-公务员考试行测样题</p>
          <div class="info">
            <i class="el-icon-loading"></i><span>更新于2019-01-04</span>
            <i class="iconfont icon-icon-time"></i><span>限时60分钟</span>
            <i class="iconfont icon-fenshu"></i><span>满分100分</span>
          </div>
        </li>
        <li class="item">
          <h4>试卷示例</h4>
          <p class="name">考试样卷-公务员考试行测样题</p>
          <div class="info">
            <i class="el-icon-loading"></i><span>更新于2019-01-04</span>
            <i class="iconfont icon-icon-time"></i><span>限时60分钟</span>
            <i class="iconfont icon-fenshu"></i><span>满分100分</span>
          </div>
        </li>
        <li class="item">
          <h4>试卷示例</h4>
          <p class="name">考试样卷-公务员考试行测样题</p>
          <div class="info">
            <i class="el-icon-loading"></i><span>更新于2019-01-04</span>
            <i class="iconfont icon-icon-time"></i><span>限时60分钟</span>
            <i class="iconfont icon-fenshu"></i><span>满分100分</span>
          </div>
        </li>
        <li class="item">
          <h4>试卷示例</h4>
          <p class="name">考试样卷-公务员考试行测样题</p>
          <div class="info">
            <i class="el-icon-loading"></i><span>更新于2019-01-04</span>
            <i class="iconfont icon-icon-time"></i><span>限时60分钟</span>
            <i class="iconfont icon-fenshu"></i><span>满分100分</span>
          </div>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  // name: 'myExam'
}
</script>

<style scoped>
.paper .item a {
  color: #000;
}
.wrapper .top .order {
  cursor: pointer;
}
.wrapper .top .order:hover {
  color: #0195ff;
  border-bottom: 2px solid #0195ff;
}
.wrapper .top .order:visited {
  color: #0195ff;
  border-bottom: 2px solid #0195ff;
}
.item .info i {
  margin-right: 5px;
  color: #0195ff;
}
.item .info span {
  margin-right: 14px;
}
.paper .item {
  border-radius: 4px;
  padding: 20px 30px;
  border: 1px solid #eee;
  box-shadow: 0 0 4px 2px rgba(217,222,234,0.3);
  transition: all 0.6s ease;
}
.paper .item:hover {
  box-shadow: 0 0 4px 2px rgba(140, 193, 248, 0.45)
}
.paper .item .info {
  font-size: 14px;
  color: #88949b;
}
.paper .item .name {
  font-size: 14px;
  color: #88949b;
}
.paper * {
  margin: 20px 0;
}
.wrapper .paper {
  display: flex;
  justify-content: space-around;
  flex-wrap: wrap;
}
.top .el-icon-search {
  position: absolute;
  right: 10px;
  top: 10px;
}
.top .icon {
  position: relative;
}
.wrapper .top {
  border-bottom: 1px solid #eee;
}
#myExam .search-li {
  margin-left: auto;
}
.top .search-li {
  margin-left: auto;
}
.top li {
  display: flex;
  align-items: center;
}
.top .search {
  margin-left: auto;
  padding: 10px;
  border-radius: 4px;
  border: 1px solid #eee;
  box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
  transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;
}
.top .search:hover {
  color: #0195ff;
  border-color: #0195ff;
}
.wrapper .top {
  display: flex;
}
.wrapper .top li {
  margin: 20px;
}
#myExam {
  width: 980px;
  margin: 0 auto;
}
#myExam .title {
  margin: 20px;
}
#myExam .wrapper {
  background-color: #fff;
}
</style>
