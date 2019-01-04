import VUE from 'vue'
import VUEX from 'vuex'

VUE.use(VUEX)

const state = {
  count: 1,
  msg: "hello world",
  flag: false,
  menu: [{
      index: '1',
      title: '课程管理',
      item1: '修改课程',
      item2: "增加课程",
      item3: '删除课程'
    },
    {
      index: '2',
      title: '题库管理',
      item1: '修改题库',
      item2: "增加题库",
      item3: '删除题库'
    },
    {
      index: '3',
      title: '成绩查询',
      item1: '根据班级查询成绩',
      item2: "成绩统计"
    },
    {
      index: '4',
      title: '评分阅卷',
      item1: '开始阅卷',
      item2: "阅卷管理"
    },
    {
      index: '5',
      title: '角色管理',
      item1: '权限设置'
    },
    {
      index: '6',
      title: '用户管理',
      item1: '用户操作'
    },
    {
      index: '7',
      title: '模块管理',
      item1: '模块操作'
    }
  ]
}
const mutations = {
  add(state, n) {
    state.count += n
  },
  reduce(state) {
    state.count--
  },
  toggle(state) {
    state.flag = !state.flag
  }
}
const getters = {
  count() {
    return state.count += 100
  }
}
export default new VUEX.Store({
  state,
  mutations,
  getters
})
