// FQN of Java class with _ separator
window.com_company_fullscreen_web_ext_GoFullScreenClickExtension = function() {
    var self = this;
    var btn = self.getElement(self.getParentId());

    self.init = function (elementId) {
        // listen for click on Button
        $(btn).click(function () {
            var ex = document.getElementById(elementId);

            if (ex.requestFullscreen) {
                ex.requestFullscreen();
            } else if (ex.msRequestFullscreen) {
                ex.msRequestFullscreen();
            } else if (ex.mozRequestFullScreen) {
                ex.mozRequestFullScreen();
            } else if (ex.webkitRequestFullscreen) {
                ex.webkitRequestFullscreen();
            }
        });
    };
};