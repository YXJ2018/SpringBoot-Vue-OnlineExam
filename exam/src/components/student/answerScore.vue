<template>
  <div class="score">
    <div class="title">
      <p class="name">计算机网络</p>
      <p class="description">(总分：100分,限时：100分钟)</p>
      <p class="description">学生：大咸鱼</p>
    </div>
    <div class="total">
      <div class="look">
        本次考试成绩
      </div>
      <div class="number" :class="{'border': isTransition}">
        <span>86</span>
        <span>分数</span>
      </div>
      <ul class="time">
        <li class="start"><span>开始时间</span> <span>2019-04-02 11:18:36</span></li>
        <li class="end"><span>结束时间</span> <span>2019-04-02 12:48:36</span></li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      isTransition: false, //是否渲染完成
    }
  },
  created() {
    this.transiton()
  },
  methods: {
    transiton() {
      setTimeout(() => {
        this.isTransition = true
      },1000)
    }
  }
}
</script>

<style lang="scss" scoped>
.time {
  padding: 0px 70px;
  li {
    display: flex;
    justify-content: space-around;
    padding: 10px;
    margin: 20px 0px;
  }
  li:nth-child(1) {
    background-color: #fcf8e3;
  }
  li:nth-child(2) {
    background-color: #e9f5e9;
  }
}
.border {
  border: 6px solid #36aafd !important;
  transition: all 2s ease;
  width: 160px !important;
  height: 160px !important;
  transform: rotate(360deg) !important;
  opacity: 1 !important;
}
.score {
  max-width: 800px;
  margin: 0 auto;
  .title {
    margin: 60px 0px 30px 0px;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    .name {
      font-size: 26px;
      color: inherit;
      font-weight: 500;
    }
    .description {
      font-size: 14px;
      color: #888;
    }
  }
  .total {
    border: 1px solid #dbdbdb;
    background-color: #fff;
    padding: 40px;
    .look {
      border-bottom: 1px solid #dbdbdb;
      padding: 0px 0px 14px 14px;
      color: #36aafd;
    }
    .number {
      opacity: 0;
      border: 6px solid #fff;
      transform: rotate(0deg);
      display: flex;
      justify-content: center;
      align-items: center;
      flex-direction: column;
      margin: 0 auto;
      width: 160px;
      height: 160px;
      border-radius: 50%;
      margin-top: 80px;
      margin-bottom: 20px;
      transition: all 1s ease;
      
      span:nth-child(1) {
        font-size: 36px;
        font-weight: 600;
      }
      span:nth-child(2) {
        font-size: 14px;
      }
    }
  }
}
</style>

