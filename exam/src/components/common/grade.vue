// 成绩统计页面
<template>
  <div id="grade">
    <div ref="box" class="box"></div>
  </div>
</template>

<script>
export default {
  name: "grade",
  mounted() {
    this.score()  
  },
  methods: {
    score() {
      let boxDom = this.$refs["box"]
      let scoreCharts = this.$echarts.init(boxDom)
      let option = {
        xAxis: {
          type: 'category',
          data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
      },
      yAxis: {
        type: 'value'
      },
      series: [{
        data: [820, 932, 901, 934, 1290, 1330, 1320],
        type: 'line',
        itemStyle : { normal: {label : {show: true}}}
      }]
    };
    scoreCharts.setOption(option) 
    scoreCharts.on("mouseover",(params)=>{
      console.log(params.value)
    })
    }
  },
}
</script>

<style scoped>
#grade .box {
  width: 600px;
  height: 400px;
}
</style>
