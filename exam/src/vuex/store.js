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
      content:[{item1:'增加课程',path:''},{item2:'修改课程',path:''},{item3:'删除课程',path:''}],
    },
    {
      index: '2',
      title: '题库管理',
      content:[{item1:'增加题库',path:''},{item2:'修改题库',path:''},{item3:'删除题库',path:''}],
    },
    {
      index: '3',
      title: '成绩查询',
      content:[{item1:'根据班级查询',path:''},{item2:'成绩统计',path:'/grade'}],
    },
    {
      index: '4',
      title: '评分阅卷',
      content:[{item1:'开始阅卷',path:''},{item2:'阅卷管理',path:''}],
    },
    {
      index: '5',
      title: '角色管理',
      content:[{item1:'权限设置',path:''}],
    },
    {
      index: '6',
      title: '用户管理',
      content:[{item1:'用户操作',path:''}],
    },
    {
      index: '7',
      title: '模块管理',
      content:[{item1:'模块操作',path:''}],
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
