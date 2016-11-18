var api_key = 'key-13bc415257919ddaa5197a964611c86a';
var domain = 'saharasalt.com';
var mailgun = require('mailgun-js')({apiKey: api_key, domain: domain});

Parse.Cloud.afterSave("Orders", function (request) {
    var data = {
        from: 'SaharaSalt <postmaster@saharasalt.com>',
        to: 'ahmed <ahmedengu@gmail.com>, mohamed <mohamed.aboumalwa@gmail.com>',
        subject: 'New Order',
        text: JSON.stringify(request)
    };

    mailgun.messages().send(data, function (error, body) {
        console.log(body);
        console.log(error);
    });
    console.log(request);
});