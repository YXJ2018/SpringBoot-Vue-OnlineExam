<!-- 题库管理功能介绍 -->
<template>
  <section class="description">
    <p class="title">题库管理功能介绍</p>
    <p class="content">题库表设计和普通数据表设计有所区别。
      分为了三张表,分别是选择题题库表,填空题题库表,判断题题库表,
      每个表保存相应类型的题库,通过一张中间表,将题库和试题关联起来。
      这样就组成了一张完整的试卷。
    </p>
  </section>
</template>

<style lang="less" scoped>
.description {
  margin-left: 40px;
  .title {
    font-size: 22px;
    font-weight: 400;
    color: rgb(31, 47, 61);
  }
  .content {
    width: 600px;
    background-color: #FAF5F2;
    padding: 16px 32px;
    border-radius: 4px;
    border-left: 5px solid #FDC8C8;
    margin: 20px 0px;
  }
}
</style>
