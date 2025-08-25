import { defHttp } from '@/utils/http/axios';

enum Api {
  Model = '/model',
  Training = '/model/training',
  TrainingRecord = '/model/training_record',
  Inference = '/model/inference',
  Export = '/model/export',
}

const commonApi = (method: 'get' | 'post' | 'delete' | 'put', url, params = {}, headers = {}, isTransformResponse = true) => {
  // 设置认证头
  const authHeader = {'X-Authorization': 'Bearer ' + localStorage.getItem('jwt_token')};

  return defHttp[method](
    {
      url,
      headers: {
        ...authHeader,
        ...headers,
      },
      ...params,
    },
    {
      isTransformResponse: isTransformResponse,
    },
  );
};

// ================= 模型管理接口 =================
export const getModelPage = (params) => {
  return commonApi('get', `${Api.Model}/list`, { params }, {}, false);
};

export const createModel = (params) => {
  return commonApi('post', `${Api.Model}/create`, { data: params });
};

export const updateModel = (params) => {
  return commonApi('put', `${Api.Model}/${params["id"]}/update`, { data: params });
};

export const deleteModel = (modelId) => {
  return commonApi('post', `${Api.Model}/${modelId}/delete`);
};

export const getModelDetail = (modelId) => {
  return commonApi('get', `${Api.Model}/${modelId}`);
};

export const getModelTrainingRecords = (modelId, params) => {
  return commonApi('get', `${Api.Model}/${modelId}/training_records`, { params }, {}, false);
};

// 模型发布接口
export const publishModel = (modelId, params) => {
  return commonApi('post', `${Api.Model}/${modelId}/publish`, { data: params });
};

// 模型OTA检测接口
export const otaCheck = (params) => {
  return commonApi('get', `${Api.Model}/ota_check`, { params }, {}, false);
};

// 模型文件上传接口 (特殊处理)
export const uploadModelFile = (formData: FormData) => {
  return defHttp.post({
    url: `${Api.Model}/upload`,
    data: formData,
    headers: {
      'Content-Type': 'multipart/form-data',
      'X-Authorization': 'Bearer ' + localStorage.getItem('jwt_token')
    }
  });
};

// ================= 训练管理接口 =================
export const startTraining = (modelId, params) => {
  return commonApi('post', `${Api.Training}/${modelId}/train`, { data: params });
};

export const stopTraining = (modelId) => {
  return commonApi('post', `${Api.Training}/${modelId}/train/stop`);
};

export const getTrainingStatus = (modelId) => {
  return commonApi('get', `${Api.Training}/${modelId}/train/status`);
};

// ================= 训练记录管理接口 =================
export const getTrainingRecordPage = (params) => {
  return commonApi('get', `${Api.TrainingRecord}/list`, { params }, {}, false);
};

export const getTrainingDetail = (recordId) => {
  return commonApi('get', `${Api.TrainingRecord}/${recordId}`);
};

export const createTrainingRecord = (params) => {
  return commonApi('post', `${Api.TrainingRecord}/create`, { data: params });
};

export const updateTrainingRecord = (recordId, params) => {
  return commonApi('post', `${Api.TrainingRecord}/update/${recordId}`, { data: params });
};

export const deleteTrainingRecord = (recordId) => {
  return commonApi('delete', `${Api.TrainingRecord}/delete/${recordId}`);
};

// ================= 推理接口 =================
export const runInference = (modelId, formData: FormData) => {
  return defHttp.post({
    url: `${Api.Inference}/${modelId}/inference/run`,
    data: formData,
    headers: {
      'Content-Type': 'multipart/form-data',
      'X-Authorization': 'Bearer ' + localStorage.getItem('jwt_token')
    }
  });
};

// ================= 导出接口 =================
export const exportModel = (modelId, format, params) => {
  return commonApi('post', `${Api.Export}/model/${modelId}/export/${format}`, { data: params });
};

export const downloadExport = (exportId) => {
  return commonApi('get', `${Api.Export}/download/${exportId}`);
};
