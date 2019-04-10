/* perform any action on widgets/variables within this block */

Page.onReady = function () {
    console.log(location);
    debugger;
    /*
     * variables can be accessed through 'Page.Variables' property here
     * e.g. to get dataSet in a staticVariable named 'loggedInUser' use following script
     * Page.Variables.loggedInUser.getData()
     *
     * widgets can be accessed through 'Page.Widgets' property here
     * e.g. to get value of text widget named 'username' use following script
     * 'Page.Widgets.username.datavalue'
     */

    //App.updateBread(Page.activePageName);
};

Page.columnChartThemeListClick = function ($event, widget) {
    Page.Widgets.columnChart.theme = widget.item.title;
    Page.Widgets.columnChart.redraw();
};

Page.areaChartThemeListClick = function ($event, widget) {
    Page.Widgets.areaChart.theme = widget.item.title;
    Page.Widgets.areaChart.redraw();
};

Page.barChartThemeListClick = function ($event, widget) {
    Page.Widgets.barChart.theme = widget.item.title;
    Page.Widgets.barChart.redraw();
};

Page.bubbleChartThemeListClick = function ($event, widget) {
    Page.Widgets.bubbleChart.theme = widget.item.title;
    Page.Widgets.bubbleChart.redraw();
};

Page.cumulativeChartThemeListClick = function ($event, widget) {
    Page.Widgets.cumulativeChart.theme = widget.item.title;
    Page.Widgets.cumulativeChart.redraw();
};

Page.donutChartThemeListClick = function ($event, widget) {
    Page.Widgets.donutChart.theme = widget.item.title;
    Page.Widgets.donutChart.redraw();
};

Page.lineChartThemeListClick = function ($event, widget) {
    Page.Widgets.lineChart.theme = widget.item.title;
    Page.Widgets.lineChart.redraw();
};

Page.pieChartThemeListClick = function ($event, widget) {
    Page.Widgets.pieChart.theme = widget.item.title;
    Page.Widgets.pieChart.redraw();
};

