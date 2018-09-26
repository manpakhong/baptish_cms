	var CommonFunction = {
		commonOverlayDiv: undefined,
		init: function(){
			console.debug('CommonFunction.init()');
            //Creating all jqxWindgets except the window
            this.createElements();
            //Attaching event listeners
            this.addEventListeners();
            //Adding jqxWindow
            this.createWindow();
		},
		addEventListeners: function(){
			
		},
		createElements: function(){
			console.debug('CommonFunction.createElements()');
			this.commonOverlayDiv = $('.commonOverlayDiv');
		},
		createWindow: function(){
			
		},
		turnOnOverlay: function(){
        	$(this.commonOverlayDiv).css("display", "block");
		},
		turnOffOverlay: function(){
        	$(this.commonOverlayDiv).css("display", "none");
		}
	};
	var commonFunction;
	function testOverLay(){
		commonFunction.turnOnOverlay();
	}
	$(document).ready(function () {
        try{
        	commonFunction = Object.create(CommonFunction);
        	commonFunction.init();
        }
        catch (error) {
        }

	});