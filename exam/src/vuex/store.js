import VUE from 'vue'
import VUEX from 'vuex'
import persistedstate from "vuex-persistedstate"

VUE.use(VUEX)

const store = {
  plugins: [persistedstate()]
}

const state = {
  flag: false,
  userInfo: null,
  menu: [{
      index: '1',
      title: '课程管理',
      icon: 'icon-kechengbiao',
      content:[{item1:'增加课程',path:'/addCourse'},{item2:'修改课程',path:'/updateCourse'},{item3:'删除课程',path:'delCourse'}],
    },
    {
      index: '2',
      title: '题库管理',
      icon: 'icon-tiku',
      content:[{item1:'增加题库',path:'/addAnswer'},{item2:'修改题库',path:'/updateAnswer'},{item3:'删除题库',path:'/delCourse'}],
    },
    {
      index: '3',
      title: '成绩查询',
      icon: 'icon-performance',
      content:[{item1:'根据班级查询',path:'/classGrede'},{item2:'成绩统计',path:'/grade'}],
    },
    {
      index: '4',
      title: '评分阅卷',
      icon: 'icon-pingfen',
      content:[{item1:'开始阅卷',path:'/check'},{item2:'阅卷管理',path:'/checkManage'}],
    },
    {
      index: '5',
      title: '角色管理',
      icon: 'icon-role',
      content:[{item1:'权限设置',path:'/role'}],
    },
    {
      index: '6',
      title: '用户管理',
      icon: 'icon-Userselect',
      content:[{item1:'用户操作',path:'/user'}],
    },
    {
      index: '7',
      title: '模块管理',
      icon: 'icon-module4mokuai',
      content:[{item1:'模块操作',path:'/module'}],
    }
  ],
}
const mutations = {
  toggle(state) {
    state.flag = !state.flag
  },
  changeUserInfo(state,info) {
    state.userInfo = info
  }
}
const getters = {
 
}
const actions = {
  getUserInfo(context,info) {
    context.commit('changeUserInfo',info)
  }
}
export default new VUEX.Store({
  state,
  mutations,
  getters,
  actions,
  store
})
