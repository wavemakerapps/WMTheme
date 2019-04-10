/* perform any action on widgets/variables within this block */

Partial.onReady = function () {
    /*
     * variables can be accessed through 'Partial.Variables' property here
     * e.g. to get dataSet in a staticVariable named 'loggedInUser' use following script
     * Partial.Variables.loggedInUser.getData()
     *
     * widgets can be accessed through 'Partial.Widgets' property here
     * e.g. to get value of text widget named 'username' use following script
     * 'Partial.Widgets.username.datavalue'
     */

    var catData = (Partial.pageParams.category === "ui") ? Partial.Variables.userInterfaceCategory.dataSet : Partial.Variables.widgetCategory.dataSet;
    Partial.Variables.currentPageDetails.setData(_.find(catData, {
        'link': '#/' + App.activePageName
    }));
    Partial.Variables.Breadcrumb.setItem(1, {
        "pageName": Partial.Variables.currentPageDetails.dataSet.label,
        "link": "#/" + Partial.Variables.currentPageDetails.dataSet.link
    });

};

