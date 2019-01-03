// 成绩统计页面
<template>
  <div id="grade">
    这是成绩统计页面，接入eCharts....
  </div>
</template>

<script>
import store from '@/vuex/store'
import {mapState} from 'vuex'
export default {
  name: "grade",
  computed: mapState(["flag"]),
  created() {
    
  },
  store
}
</script>
