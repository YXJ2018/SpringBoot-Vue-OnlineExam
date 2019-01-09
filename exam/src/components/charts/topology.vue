<template>
  <div id="box">
      
  </div>
</template>

<script>

export default {
  name: "topology",
  data() {
    return {
      nodes: [
        {id: 1, label: 'Node 1'},
        {id: 2, label: 'Node 2'},
        {id: 3, label: 'Node 3'},
        {id: 4, label: 'Node 4'},
        {id: 5, label: 'Node 5'}
      ],
      edges: [
        {from: 1, to: 3},
        {from: 1, to: 2},
        {from: 2, to: 4},
        {from: 2, to: 5},
        {from: 3, to: 3}
      ]
    }
  },
  created() {
    this.demo()
  },
  methods: {
    demo() {
      console.log("0-0000")
      // var nodes = new vis.DataSet(this.nodes)
      // // create an array with edges
      // var edges = new vis.DataSet(this.edges)
        

      // create a network
      var container = this.$refs.box
      var data = {
        nodes: this.nodes,
        edges: this.edges
      };
      var options = {};
      var network = new vis.Network(container, data, options);
    }
  },
}
</script>

<style scoped>
#box {
  width: 600px;
  height: 400px;
  border: 1px solid #ccc;
}
</style>
