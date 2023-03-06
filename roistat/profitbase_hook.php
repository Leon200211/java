<?php
$data = json_decode(file_get_contents('php://input'), true);




writeToLog($data,'Webhook profitbase',__DIR__.'/log/profitbase.log');
writeToLog($_REQUEST,'Webhook profitbase',__DIR__.'/log/profitbase2.log');
function writeToLog($val, $name, $fileName = null)
{
    $statusLog = 1;
    if ($statusLog > 0) {
        $file = $fileName != null ? $fileName : 'profitbase.log';
        if (@file_exists($file)) {
            $size = @filesize($file);
            if ($size > 2500 * 1024) {
                @unlink($file);
            }
        }
        $data   = date('Y-m-d H:i:s');
        $result = "\n[$name ($data)]\n".print_r($val, true);
        file_put_contents($file, $result."\n##########################################\n", FILE_APPEND);
    }
}

exit();


$name = '';
$phone = '';
$email = '';

foreach ($data['customer'] as $key => $val){
    switch ($data[$key]){
        case 'name':
            $name = $data[$val];
            break;
        case 'phone':
            $phone = $data[$val];
            break;
        case 'email':
            $email = $data[$val];
            break;
    }
}

if($email != '' || $phone != ''){
    $roistatData = array(
        'roistat' => $data['tracking']['roistat'] ?? 'nocookie',
        'key'     => '',
        'title'   => 'Заявка с виджета ProfitBase: '. $data['id'],
        'comment' => $data['comment'] ?? 'Комментарий отсутствует',
        'name'    => $name,
        'email'   => $email,
        'phone'   => $phone,
        'is_need_check_order_in_processing' => '1',
        'is_need_check_order_in_processing_append' => '1',
        'is_skip_sending' => '1',
        'fields'  => array(
            'roistat' => $data['tracking']['roistat'] ?? 'nocookie',
            'source' => '{source}',
            'sourceAliasLevel1' => '{sourceAliasLevel1}',
            'landingPage' => '{landingPage}',
            'city' => '{city}',
            '334235' => '{utmSource}',
            '334237' => '{utmMedium}',
            '334239' => '{utmCampaign}',
            '334241' => '{utmTerm}',
            '334243' => '{utmContent}'
        ),
    );

    file_get_contents("https://cloud.roistat.com/api/proxy/1.0/leads/add?" . http_build_query($roistatData));
}