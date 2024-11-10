// pages/home.js
Page({

	/**
	 * 页面的初始数据
	 */
	data: {
    background: ['/miniprogram/images/image1.png', '../../images/image2.png', '../../images/image3.png'],
    indicatorDots: true,
    vertical: false,
    autoplay: true,
    interval: 2000,
    duration: 500,
    listData: [{content:"重要通知",image: "../../images/ImportantNotice.png",publishTime:"2023-12-04 20:14:24"}],
    index:0
	},

	/**
	 * 生命周期函数--监听页面加载
	 */
	onLoad(options) {

	},

	/**
	 * 生命周期函数--监听页面初次渲染完成
	 */
	onReady() {

	},

	/**
	 * 生命周期函数--监听页面显示
	 */
	onShow() {

	},

	/**
	 * 生命周期函数--监听页面隐藏
	 */
	onHide() {

	},

	/**
	 * 生命周期函数--监听页面卸载
	 */
	onUnload() {

	},

	/**
	 * 页面相关事件处理函数--监听用户下拉动作
	 */
	onPullDownRefresh() {

	},

	/**
	 * 页面上拉触底事件的处理函数
	 */
	onReachBottom() {

	},

	/**
	 * 用户点击右上角分享
	 */
	onShareAppMessage() {

  },
  
  navigateToCoachRank: function() {
    wx.navigateTo({
      url: '/pages/coach_rank/coach_rank' 
    });
  },
  navigateToPlaceRank: function() {
    wx.navigateTo({
      url: '/pages/place_rank/place_rank' 
    });
  },
  navigateToCourseRank: function() {
    wx.navigateTo({
      url: '/pages/course_rank/course_rank' 
    });
  }
});
