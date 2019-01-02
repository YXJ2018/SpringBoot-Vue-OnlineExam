import VUE from 'vue'
import VUEX from 'vuex'

VUE.use(VUEX)

const state = {
    count: 1,
    msg: "hello world"
}
const mutations = {
    add(state,n) {
        state.count += n
    },
    reduce(state) {
        state.count--
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