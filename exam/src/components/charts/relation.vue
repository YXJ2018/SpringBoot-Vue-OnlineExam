<template>
  <div id="relation" ref="box">
    
  </div>
</template>

<style scoped>
#relation {
  width: 1000px;
  height: 400px;
}
</style>

 <script>
 export default {
   methods: {
     relation() {
       let boxDom = this.$refs['box']
       let relationCharts = this.$echarts.init(boxDom)
       let option = {
            title : {
                text: '测试样例',
                subtext: '线、节点样式'
            },
            tooltip : {
                trigger: 'item',
                formatter: "{b}: {c}"
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : false,

            series : [
                {
                    name:'树图',
                    type:'tree',
                    orient: 'TB',  // vertical horizontal
                    rootLocation: {x: 200, y: 100}, // 根节点位置  {x: 'center',y: 10}
                    nodePadding: 50,
                    symbolSize: 40,
                    expandAndCollapse: 'false',
                    smooth: 'false',
                    itemStyle: {
                        normal: {
                            label: {
                                show: true,
                                position: 'inside',
                                textStyle: {
                                    color: '#cc9999',
                                    fontSize: 15,
                                    fontWeight:  'bolder'
                                }
                            },
                            lineStyle: {
                                color: '#000',
                                width: 1,
                                type: 'solid' // 'curve'|'broken'|'solid'|'dotted'|'dashed'
                            }
                        },
                        emphasis: {
                            label: {
                                show: true
                            }
                        }
                    },
                    data: [
                        {
                            name: '手机',
                            value: 6,
                            symbolSize: [90, 70],
                            symbol: 'image:///static/img/c_b_router_firewall.svg',
                            itemStyle: {
                                normal: {
                                    label: {
                                        show: false
                                    }
                                }
                            },
                            children: [
                                {
                                    name: '小米',
                                    value: 4,
                                    symbol: 'image:///static/img/c_b_router_firewall.svg',
                                    itemStyle: {
                                        normal: {
                                            label: {
                                                show: false
                                            }
                                        }
                                    },
                                    symbolSize: [60, 60],
                                    children: [
                                        {
                                            name: '小米1',
                                            symbol: 'circle',
                                            symbolSize: 20,
                                            value: 4,
                                            itemStyle: {
                                                normal: {
                                                    color: '#fa6900',
                                                    label: {
                                                        show: true,
                                                        position: 'right'
                                                    },
                                                    
                                                },
                                                emphasis: {
                                                    label: {
                                                        show: false
                                                    },
                                                    borderWidth: 0
                                                }
                                            }
                                        },
                                        {
                                            name: '小米2',
                                            value: 4,
                                            symbol: 'circle',
                                            symbolSize: 20,
                                            itemStyle: {
                                                normal: {
                                                    label: {
                                                        show: true,
                                                        position: 'right',
                                                        formatter: "{b}"
                                                    },
                                                    color: '#fa6900',
                                                    borderWidth: 2,
                                                    borderColor: '#cc66ff'

                                                },
                                                emphasis: {
                                                    borderWidth: 0
                                                }
                                            }
                                        },
                                        {
                                            name: '小米3',
                                            value: 2,
                                            symbol: 'circle',
                                            symbolSize: 20,
                                            itemStyle: {
                                                normal: {
                                                    label: {
                                                        position: 'right'
                                                    },
                                                    color: '#fa6900',
                                                    brushType: 'stroke',
                                                    borderWidth: 1,
                                                    borderColor: '#999966',
                                                },
                                                emphasis: {
                                                    borderWidth: 0
                                                }
                                            }
                                        }
                                    ]
                                },
                                {
                                    name: '苹果',
                                    symbol: 'image:///static/img/c_b_router_firewall.svg',
                                    symbolSize: [60, 60],
                                    itemStyle: {
                                        normal: {
                                            label: {
                                                show: false
                                            }
                                            
                                        }
                                    },
                                    value: 4
                                },
                                {
                                    name: '华为',
                                    symbol: 'image:///static/img/c_b_router_firewall.svg',
                                    symbolSize: [60, 60],
                                    itemStyle: {
                                        normal: {
                                            label: {
                                                show: false
                                            }
                                            
                                        }
                                    },
                                    value: 2
                                },
                                {
                                    name: '联想',
                                    symbol: 'image:///static/img/c_b_router_firewall.svg',
                                    symbolSize: [60, 60],
                                    itemStyle: {
                                        normal: {
                                            label: {
                                                show: false
                                            }
                                            
                                        }
                                    },
                                    value: 2
                                }
                            ]
                        }
                    ]
                }
            ]
        };
       relationCharts.setOption(option)
     
     
     
     
     
     
     
     }
   },
   mounted() {
     this.relation()
   },
 }
 </script>