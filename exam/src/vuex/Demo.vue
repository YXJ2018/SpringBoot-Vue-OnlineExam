<template>
    <div>
        <h2>{{msg}}</h2> <hr/>
        <h3>{{count}}</h3>
        <h3>{{flag}}</h3>
        <button @click="add(10)">+</button>
        <button @click="reduce">-</button>
    </div>
</template>

<script>
import store from '@/vuex/store'
import {mapState,mapMutations} from 'vuex'
export default {
    data() {
        return {

        }
    },
    // computed: {
    //     count() {
    //         return this.$store.state.count
    //     }
    // },
    // computed:mapState({
    //     count: state => state.count
    // }),
    computed: mapState(["count","msg","flag"]),
    methods: mapMutations(["add","reduce"]),
    store
}
</script>
