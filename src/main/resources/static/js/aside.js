/* 
 *  Aside menu control
 */
$(document).ready(function() {      // 이벤트 등록
    $('#stateMsgBtn').click(function(e) {
        $('#stateMsgInput').attr({'class' : 'mt-2'});       // 입력창 표시
        $('#stateInput').val($('#stateMsg').text());        // 입력창에 stateMsg 내용 출력
    });
    $('#stateMsgSubmit').click(changeStateMsg);             // changeStateMsg 이벤트 등록
});

function changeStateMsg() {
    let stateInputVal = $('#stateInput').val();              // 입력창 안에 입력된 내용 저장
    $('#stateMsgInput').attr({'class' : 'mt-2 d-none'});    //입력창 감추기
    $.ajax({                                                // Asynchronous Javascript and XML : 화면의 일부분만 변경시 주로 사용
        type: 'GET', 
        url: '/abbs/aside/stateMsg',
        data: {stageMsg: stateInputVal},
        success: function(result) {
            console.log('state message:', stateInputVal, result);
            $('stateMsg').html(stateInputVal);
        }
    });
}