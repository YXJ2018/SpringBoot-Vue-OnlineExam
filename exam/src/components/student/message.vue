// 给我留言页面
<template>
  <div id="message">
    <div class="title">给我留言</div>
    <div class="wrapper">
      <div class="title1">
        <el-input
          placeholder="留言标题"
          v-model="title"
          clearable>
        </el-input>
      </div>
      <div class="content">
        <el-input
          type="textarea"
          :rows="3"
          placeholder="留言内容"
          v-model="content"
          clearable>
        </el-input>
      </div>
      <div class="btn">
        <el-button type="primary">提交留言</el-button>
      </div>
      <div class="all">
        <ul class="msglist">
          <li class="list">
            <p class="title"> <i class="iconfont icon-untitled33"></i>晚上加班,这感觉非常的nice</p>
            <p class="content">今天是星期一的晚上,下班后回到宿舍继续写我的毕业设计,看着项目功能日渐丰满好开心哦,你们也要元气满满哦！</p>
            <p class="date"><i class="iconfont icon-date"></i>2019-3-18</p>
          </li>
          <li class="list">
            <p class="title"> <i class="iconfont icon-untitled33"></i>晚上加班,这感觉非常的nice</p>
            <p class="content">今天是星期一的晚上,下班后回到宿舍继续写我的毕业设计,看着项目功能日渐丰满好开心哦,你们也要元气满满哦！</p>
            <p class="date"><i class="iconfont icon-date"></i>2019-3-18</p>
          </li>
          <li class="list">
            <p class="title"> <i class="iconfont icon-untitled33"></i>晚上加班,这感觉非常的nice</p>
            <p class="content">今天是星期一的晚上,下班后回到宿舍继续写我的毕业设计,看着项目功能日渐丰满好开心哦,你们也要元气满满哦！</p>
            <p class="date"><i class="iconfont icon-date"></i>2019-3-18</p>
          </li>
        </ul>
      </div>
      <div class="pagination">
        <el-pagination
          :current-page="currentPage"
          :page-sizes="[4,6,8,10]"
          :page-size="100"
          layout="total, sizes, prev, pager, next, jumper"
          :total="40">
        </el-pagination>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  // name: 'message'
  data() {
    return {
      title: null,
      content: null,
      currentPage: 2
    }
  },
  created() {
    
  },
  // watch: {
    
  // },
  methods: {
    
  }
}
</script>

<style lang="scss" scoped>
.pagination {
  display: flex;
  justify-content: center;
}
#message {
  width: 980px;
  margin: 0 auto;
}
.title {
  margin: 20px;
}
.content {
  padding: 20px 0px;
}
#message  {
  .btn {
   padding-bottom: 20px;
  }
  .all {
    .date {
      color: rgb(80, 157, 202);
      line-height: 45px;
      font-size: 13px;
    }
    .list {
      background-color: #eee;
      padding:10px;
      border-radius: 4px;
      margin: 10px 0px;
      .title {
        color: #5f5f5f;
        margin: 0px;
        font-size: 13px;
        line-height: 45px;
      }
      .content {
        padding: 0px;
      }
      .icon-untitled33 {
        font-size: 13px;
        margin-right: 4px;
      }
      .icon-date {
        font-size: 13px;
        margin-right: 4px;
        color: rgb(80, 157, 202);
      }
    }
  }
}
#message .wrapper {
  background-color: #fff;
  padding: 20px;

}
</style>
