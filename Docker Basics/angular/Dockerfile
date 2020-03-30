FROM node:alpine as node
WORKDIR /app
COPY . .
RUN npm install && npm run build

FROM nginx:alpine
COPY --from=node /app/dist/angular /usr/share/nginx/html
CMD ["nginx", "-g", "daemon off;"]
