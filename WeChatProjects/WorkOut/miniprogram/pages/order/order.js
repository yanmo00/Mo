Page({
  data: {
    coaches: [
      { image: '../../images/coach1.png', name: '牛教练' },
      { image: '../../images/coach2.png', name: '王教练' },
      { image: '../../images/coach3.png', name: '张教练' }
      // 更多教练数据...
    ],

    places: [
      {image: "../../images/place1.png", title:"室内健身房2", content: "健身房环境优雅整洁、空气流通、会员以高校学生居多。"},
      {image: "../../images/place2.png", title:"室内场地", content: "健身房环境优雅整洁、空气流通、会员以高校学生居多。"}
      
    ]


  },
  onLoad: function() {
    // 页面加载时执行的初始化代码
  }
});